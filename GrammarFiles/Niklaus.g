grammar Niklaus;

options {
  language = Java;
  output = AST;
  ASTLabelType = CommonTree;
}

tokens{
  DECLARATIONS;
  PARAM;  
  BODY;
  NEGATE;
  POSITIVE;
}

@members{

public Error err = new Error(System.err);

public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
                    String msg = getErrorMessage(e, tokenNames);
                    err.error(e.line, e.charPositionInLine, msg);     
                    Niklaus.fail = true; 
 }
 
  //Stop after first error
 @Override
  protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
    throw new MismatchedTokenException(ttype, input);
  }

  @Override
  public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow) throws RecognitionException {
    throw e;
  }
  //stop after first error
}



@lexer::members {
  public Error err = new Error(System.err);

  @Override
  public void reportError(RecognitionException e) {
               
                    err.error(e.line, e.charPositionInLine, "Lexer Error near '" + this.emit().getText() + "'");     
                    Niklaus.fail = true; 
  }
}

module: 
  MODULE IDENTIFIER SEMI (declaration (SEMI declaration)*)? BEGIN (statement (SEMI statement)*)? END SEMI EOF
  -> ^(MODULE IDENTIFIER ^(DECLARATIONS declaration*) ^(BODY statement*))
;

declaration: 
  constantdeclaration
  | variabledeclaration 
  | functiondeclaration 
  | proceduredeclaration 
  ; 
  
constantdeclaration:
  CONST IDENTIFIER COLON TYPE DEFINEDAS expression
  -> ^(CONST ^(TYPE IDENTIFIER expression))
  ;
  
variabledeclaration: 
  VAR IDENTIFIER (COMMA IDENTIFIER)* COLON TYPE
  -> ^(VAR ^(TYPE IDENTIFIER)+)
  ;
 
functiondeclaration:
  FUNCTION IDENTIFIER parameterlist COLON TYPE DEFINEDAS 
  (variabledeclaration (SEMI variabledeclaration)*)? BEGIN (statement (SEMI statement)*)? END
  -> ^(FUNCTION IDENTIFIER TYPE parameterlist 
  ^(DECLARATIONS variabledeclaration*) ^(BODY statement*))
  ; 

proceduredeclaration:
  PROCEDURE IDENTIFIER parameterlist DEFINEDAS 
  (variabledeclaration (SEMI variabledeclaration)*)? BEGIN (statement (SEMI statement)*)? END
  -> ^(FUNCTION IDENTIFIER parameterlist 
  ^(DECLARATIONS variabledeclaration*) ^(BODY statement*))
  ; 

parameterlist:
  OPENINGPARENTHESIS (parameters (COMMA parameters)*)? CLOSINGPARENTHESIS
  -> ^(PARAM parameters*)
  ;

parameters:
  IDENTIFIER (COMMA IDENTIFIER)* COLON TYPE
  -> ^(TYPE IDENTIFIER)+
  ;
 
statement:
  assignment
  | output
  | conditional
  | loop
  | procedurecall
  | BEGIN statement? (SEMI statement)* END -> ^(BODY statement*)
  ;
  
assignment:
  IDENTIFIER DEFINEDAS^ expression
  ;
  
output:
  OUTPUT^ (STRINGLITERAL | IDENTIFIER)
  ;
  
conditional:
  IF^ expression THEN! statement 
  (/*DANGLING ELSE*/ options {greedy=true;}: ELSE! statement)?
  ;
  
loop:
  whileloop
  | repeatloop
  ;
  
whileloop:
  WHILE^ expression DO! statement
  ;

repeatloop:
  REPEAT^ statement UNTIL! expression
  ;
  
procedurecall:
  IDENTIFIER OPENINGPARENTHESIS (expression (COMMA expression)*)? CLOSINGPARENTHESIS
  -> ^(IDENTIFIER ^(PARAM expression*))
  ; 
  
expression:
  arithmeticexpression ((EQUALITY^ | NONEQUALITY^ | COMPARISON^) arithmeticexpression)?
  ;

arithmeticexpression:
  multiplicationexpression 
  ((ADDITION^ | SUBTRACTION^) multiplicationexpression)*
  ;

multiplicationexpression:
  negationexpression ((MULTIPLICATION^ negationexpression)+  | DIVISION^ negationexpression)? 
  ;
 
negationexpression:
   (SUBTRACTION atom) -> ^(NEGATE atom) 
   |(ADDITION (COUNT | FLOAT)) -> ^(ADDITION COUNT? FLOAT?)  
   | atom 
   ;
   
atom:
  COUNT
  | FLOAT
  | IDENTIFIER 
  | procedurecall
  | OPENINGPARENTHESIS! arithmeticexpression CLOSINGPARENTHESIS! // (DIVISION^ arithmeticexpression)?
  ;
  
booleanexpression:
  IDENTIFIER 
  | arithmeticexpression (EQUALITY^ | NONEQUALITY^ | COMPARISON^) arithmeticexpression
  ; 
  
  
  ////////###############LEXER########################//////
  
  
MODULE:
  'MODULE' 
  ;
  
BEGIN:
  'BEGIN'
  ;
  
END:
  'END'
  ;
  
SEMI: 
  ';'
  ;

COMMA:
  ','
    ;

STRINGLITERAL:
  DOUBLEQUOTE (~('\n' | DOUBLEQUOTE))* DOUBLEQUOTE
  //DOUBLEQUOTE STRING DOUBLEQUOTE
  ;
 
    
fragment DOUBLEQUOTE:
  '"' 
//  | '?' //Doesn't seem to work actually :/
  ;
    
OPENINGPARENTHESIS:
 '('
 ;

CLOSINGPARENTHESIS:
 ')'
 ;
    
COLON:
  ':'
  ;
  
DEFINEDAS:
  ':='
  ;
  
VAR:
  'VAR'
  ;
  
CONST:
  'CONST'
  ;
  
FUNCTION:
  'FUNCTION'
  ;
  
PROCEDURE:
  'PROCEDURE'
  ;
 
OUTPUT:
  'OUTPUT'
  ;
 
IF:
  'IF'
  ;
 
THEN:
 'THEN'
 ;
 
ELSE:
  'ELSE'
  ;

WHILE:
 'WHILE'
 ;

DO:
 'DO'
 ;
 
REPEAT:
 'REPEAT'
 ;
 
UNTIL:
 'UNTIL'
 ;

TYPE:
  'TRUTH'
  | 'COUNT'
  | 'FLOAT'
  ;
   
IDENTIFIER:
  LETTER (LETTER | DIGIT | '_')*
  ;

EQUALITY:
  '=='
  ;
  
NONEQUALITY:
  '!='
  ;
  
COMPARISON:
  GREATERTHAN 
  | GREATERTHANOREQUAL
  | LESSTHAN
  | LESSTHANOREQUAL
  ;
  
fragment GREATERTHAN:
  '>'
  ;
  
fragment GREATERTHANOREQUAL:
  '>='
  ;
  
fragment LESSTHAN:
  '<'
  ;
  
fragment LESSTHANOREQUAL:
  '<='
  ;

ADDITION:
  '+' 
  ;
  
SUBTRACTION:
  '-'
  ;
  
DIVISION:
  '/'
  ;

MULTIPLICATION:
  '*'
  ;


FLOAT:
  INTEGER? DECIMALPOINT DIGIT* (EXPONENT)?
  ;

fragment EXPONENT:
  ('e' | 'E') SIGN? INTEGER
  ; 

COUNT:
  INTEGER
  ;

fragment INTEGER:
   DIGIT+
  ;

fragment  SIGN:
  ('+' | '-')
  ;

fragment DECIMALPOINT:
  '.'
  ;

fragment LETTER:
  ('a'..'z' | 'A'..'Z')
  ;

fragment DIGIT:
 ('0'..'9')
 ;  

COMMENT: 
  '/*' .* '*/' {$channel = HIDDEN;}
  ;
  
WS:
  (' ' | '\t' | '\r' | '\n' | '\f')+ {$channel = HIDDEN;}
  ;
