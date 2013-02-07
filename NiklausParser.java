// $ANTLR 3.4 C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g 2012-04-26 12:08:39

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class NiklausParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADDITION", "BEGIN", "BODY", "CLOSINGPARENTHESIS", "COLON", "COMMA", "COMMENT", "COMPARISON", "CONST", "COUNT", "DECIMALPOINT", "DECLARATIONS", "DEFINEDAS", "DIGIT", "DIVISION", "DO", "DOUBLEQUOTE", "ELSE", "END", "EQUALITY", "EXPONENT", "FLOAT", "FUNCTION", "GREATERTHAN", "GREATERTHANOREQUAL", "IDENTIFIER", "IF", "INTEGER", "LESSTHAN", "LESSTHANOREQUAL", "LETTER", "MODULE", "MULTIPLICATION", "NEGATE", "NONEQUALITY", "OPENINGPARENTHESIS", "OUTPUT", "PARAM", "POSITIVE", "PROCEDURE", "REPEAT", "SEMI", "SIGN", "STRINGLITERAL", "SUBTRACTION", "THEN", "TYPE", "UNTIL", "VAR", "WHILE", "WS"
    };

    public static final int EOF=-1;
    public static final int ADDITION=4;
    public static final int BEGIN=5;
    public static final int BODY=6;
    public static final int CLOSINGPARENTHESIS=7;
    public static final int COLON=8;
    public static final int COMMA=9;
    public static final int COMMENT=10;
    public static final int COMPARISON=11;
    public static final int CONST=12;
    public static final int COUNT=13;
    public static final int DECIMALPOINT=14;
    public static final int DECLARATIONS=15;
    public static final int DEFINEDAS=16;
    public static final int DIGIT=17;
    public static final int DIVISION=18;
    public static final int DO=19;
    public static final int DOUBLEQUOTE=20;
    public static final int ELSE=21;
    public static final int END=22;
    public static final int EQUALITY=23;
    public static final int EXPONENT=24;
    public static final int FLOAT=25;
    public static final int FUNCTION=26;
    public static final int GREATERTHAN=27;
    public static final int GREATERTHANOREQUAL=28;
    public static final int IDENTIFIER=29;
    public static final int IF=30;
    public static final int INTEGER=31;
    public static final int LESSTHAN=32;
    public static final int LESSTHANOREQUAL=33;
    public static final int LETTER=34;
    public static final int MODULE=35;
    public static final int MULTIPLICATION=36;
    public static final int NEGATE=37;
    public static final int NONEQUALITY=38;
    public static final int OPENINGPARENTHESIS=39;
    public static final int OUTPUT=40;
    public static final int PARAM=41;
    public static final int POSITIVE=42;
    public static final int PROCEDURE=43;
    public static final int REPEAT=44;
    public static final int SEMI=45;
    public static final int SIGN=46;
    public static final int STRINGLITERAL=47;
    public static final int SUBTRACTION=48;
    public static final int THEN=49;
    public static final int TYPE=50;
    public static final int UNTIL=51;
    public static final int VAR=52;
    public static final int WHILE=53;
    public static final int WS=54;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public NiklausParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public NiklausParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return NiklausParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g"; }



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


    public static class module_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "module"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:53:1: module : MODULE IDENTIFIER SEMI ( declaration ( SEMI declaration )* )? BEGIN ( statement ( SEMI statement )* )? END SEMI EOF -> ^( MODULE IDENTIFIER ^( DECLARATIONS ( declaration )* ) ^( BODY ( statement )* ) ) ;
    public final NiklausParser.module_return module() throws RecognitionException {
        NiklausParser.module_return retval = new NiklausParser.module_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token MODULE1=null;
        Token IDENTIFIER2=null;
        Token SEMI3=null;
        Token SEMI5=null;
        Token BEGIN7=null;
        Token SEMI9=null;
        Token END11=null;
        Token SEMI12=null;
        Token EOF13=null;
        NiklausParser.declaration_return declaration4 =null;

        NiklausParser.declaration_return declaration6 =null;

        NiklausParser.statement_return statement8 =null;

        NiklausParser.statement_return statement10 =null;


        CommonTree MODULE1_tree=null;
        CommonTree IDENTIFIER2_tree=null;
        CommonTree SEMI3_tree=null;
        CommonTree SEMI5_tree=null;
        CommonTree BEGIN7_tree=null;
        CommonTree SEMI9_tree=null;
        CommonTree END11_tree=null;
        CommonTree SEMI12_tree=null;
        CommonTree EOF13_tree=null;
        RewriteRuleTokenStream stream_MODULE=new RewriteRuleTokenStream(adaptor,"token MODULE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:53:7: ( MODULE IDENTIFIER SEMI ( declaration ( SEMI declaration )* )? BEGIN ( statement ( SEMI statement )* )? END SEMI EOF -> ^( MODULE IDENTIFIER ^( DECLARATIONS ( declaration )* ) ^( BODY ( statement )* ) ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:54:3: MODULE IDENTIFIER SEMI ( declaration ( SEMI declaration )* )? BEGIN ( statement ( SEMI statement )* )? END SEMI EOF
            {
            MODULE1=(Token)match(input,MODULE,FOLLOW_MODULE_in_module92);  
            stream_MODULE.add(MODULE1);


            IDENTIFIER2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_module94);  
            stream_IDENTIFIER.add(IDENTIFIER2);


            SEMI3=(Token)match(input,SEMI,FOLLOW_SEMI_in_module96);  
            stream_SEMI.add(SEMI3);


            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:54:26: ( declaration ( SEMI declaration )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==CONST||LA2_0==FUNCTION||LA2_0==PROCEDURE||LA2_0==VAR) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:54:27: declaration ( SEMI declaration )*
                    {
                    pushFollow(FOLLOW_declaration_in_module99);
                    declaration4=declaration();

                    state._fsp--;

                    stream_declaration.add(declaration4.getTree());

                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:54:39: ( SEMI declaration )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==SEMI) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:54:40: SEMI declaration
                    	    {
                    	    SEMI5=(Token)match(input,SEMI,FOLLOW_SEMI_in_module102);  
                    	    stream_SEMI.add(SEMI5);


                    	    pushFollow(FOLLOW_declaration_in_module104);
                    	    declaration6=declaration();

                    	    state._fsp--;

                    	    stream_declaration.add(declaration6.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }


            BEGIN7=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_module110);  
            stream_BEGIN.add(BEGIN7);


            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:54:67: ( statement ( SEMI statement )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==BEGIN||(LA4_0 >= IDENTIFIER && LA4_0 <= IF)||LA4_0==OUTPUT||LA4_0==REPEAT||LA4_0==WHILE) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:54:68: statement ( SEMI statement )*
                    {
                    pushFollow(FOLLOW_statement_in_module113);
                    statement8=statement();

                    state._fsp--;

                    stream_statement.add(statement8.getTree());

                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:54:78: ( SEMI statement )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==SEMI) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:54:79: SEMI statement
                    	    {
                    	    SEMI9=(Token)match(input,SEMI,FOLLOW_SEMI_in_module116);  
                    	    stream_SEMI.add(SEMI9);


                    	    pushFollow(FOLLOW_statement_in_module118);
                    	    statement10=statement();

                    	    state._fsp--;

                    	    stream_statement.add(statement10.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }


            END11=(Token)match(input,END,FOLLOW_END_in_module124);  
            stream_END.add(END11);


            SEMI12=(Token)match(input,SEMI,FOLLOW_SEMI_in_module126);  
            stream_SEMI.add(SEMI12);


            EOF13=(Token)match(input,EOF,FOLLOW_EOF_in_module128);  
            stream_EOF.add(EOF13);


            // AST REWRITE
            // elements: declaration, MODULE, IDENTIFIER, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 55:3: -> ^( MODULE IDENTIFIER ^( DECLARATIONS ( declaration )* ) ^( BODY ( statement )* ) )
            {
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:55:6: ^( MODULE IDENTIFIER ^( DECLARATIONS ( declaration )* ) ^( BODY ( statement )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_MODULE.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
                );

                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:55:26: ^( DECLARATIONS ( declaration )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DECLARATIONS, "DECLARATIONS")
                , root_2);

                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:55:41: ( declaration )*
                while ( stream_declaration.hasNext() ) {
                    adaptor.addChild(root_2, stream_declaration.nextTree());

                }
                stream_declaration.reset();

                adaptor.addChild(root_1, root_2);
                }

                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:55:55: ^( BODY ( statement )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(BODY, "BODY")
                , root_2);

                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:55:62: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_2, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "module"


    public static class declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:58:1: declaration : ( constantdeclaration | variabledeclaration | functiondeclaration | proceduredeclaration );
    public final NiklausParser.declaration_return declaration() throws RecognitionException {
        NiklausParser.declaration_return retval = new NiklausParser.declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        NiklausParser.constantdeclaration_return constantdeclaration14 =null;

        NiklausParser.variabledeclaration_return variabledeclaration15 =null;

        NiklausParser.functiondeclaration_return functiondeclaration16 =null;

        NiklausParser.proceduredeclaration_return proceduredeclaration17 =null;



        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:58:12: ( constantdeclaration | variabledeclaration | functiondeclaration | proceduredeclaration )
            int alt5=4;
            switch ( input.LA(1) ) {
            case CONST:
                {
                alt5=1;
                }
                break;
            case VAR:
                {
                alt5=2;
                }
                break;
            case FUNCTION:
                {
                alt5=3;
                }
                break;
            case PROCEDURE:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:59:3: constantdeclaration
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_constantdeclaration_in_declaration163);
                    constantdeclaration14=constantdeclaration();

                    state._fsp--;

                    adaptor.addChild(root_0, constantdeclaration14.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:60:5: variabledeclaration
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_variabledeclaration_in_declaration169);
                    variabledeclaration15=variabledeclaration();

                    state._fsp--;

                    adaptor.addChild(root_0, variabledeclaration15.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:61:5: functiondeclaration
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_functiondeclaration_in_declaration176);
                    functiondeclaration16=functiondeclaration();

                    state._fsp--;

                    adaptor.addChild(root_0, functiondeclaration16.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:62:5: proceduredeclaration
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_proceduredeclaration_in_declaration183);
                    proceduredeclaration17=proceduredeclaration();

                    state._fsp--;

                    adaptor.addChild(root_0, proceduredeclaration17.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declaration"


    public static class constantdeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constantdeclaration"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:65:1: constantdeclaration : CONST IDENTIFIER COLON TYPE DEFINEDAS expression -> ^( CONST ^( TYPE IDENTIFIER expression ) ) ;
    public final NiklausParser.constantdeclaration_return constantdeclaration() throws RecognitionException {
        NiklausParser.constantdeclaration_return retval = new NiklausParser.constantdeclaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token CONST18=null;
        Token IDENTIFIER19=null;
        Token COLON20=null;
        Token TYPE21=null;
        Token DEFINEDAS22=null;
        NiklausParser.expression_return expression23 =null;


        CommonTree CONST18_tree=null;
        CommonTree IDENTIFIER19_tree=null;
        CommonTree COLON20_tree=null;
        CommonTree TYPE21_tree=null;
        CommonTree DEFINEDAS22_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_DEFINEDAS=new RewriteRuleTokenStream(adaptor,"token DEFINEDAS");
        RewriteRuleTokenStream stream_CONST=new RewriteRuleTokenStream(adaptor,"token CONST");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:65:20: ( CONST IDENTIFIER COLON TYPE DEFINEDAS expression -> ^( CONST ^( TYPE IDENTIFIER expression ) ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:66:3: CONST IDENTIFIER COLON TYPE DEFINEDAS expression
            {
            CONST18=(Token)match(input,CONST,FOLLOW_CONST_in_constantdeclaration199);  
            stream_CONST.add(CONST18);


            IDENTIFIER19=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constantdeclaration201);  
            stream_IDENTIFIER.add(IDENTIFIER19);


            COLON20=(Token)match(input,COLON,FOLLOW_COLON_in_constantdeclaration203);  
            stream_COLON.add(COLON20);


            TYPE21=(Token)match(input,TYPE,FOLLOW_TYPE_in_constantdeclaration205);  
            stream_TYPE.add(TYPE21);


            DEFINEDAS22=(Token)match(input,DEFINEDAS,FOLLOW_DEFINEDAS_in_constantdeclaration207);  
            stream_DEFINEDAS.add(DEFINEDAS22);


            pushFollow(FOLLOW_expression_in_constantdeclaration209);
            expression23=expression();

            state._fsp--;

            stream_expression.add(expression23.getTree());

            // AST REWRITE
            // elements: TYPE, expression, CONST, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 67:3: -> ^( CONST ^( TYPE IDENTIFIER expression ) )
            {
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:67:6: ^( CONST ^( TYPE IDENTIFIER expression ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_CONST.nextNode()
                , root_1);

                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:67:14: ^( TYPE IDENTIFIER expression )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_TYPE.nextNode()
                , root_2);

                adaptor.addChild(root_2, 
                stream_IDENTIFIER.nextNode()
                );

                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constantdeclaration"


    public static class variabledeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variabledeclaration"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:70:1: variabledeclaration : VAR IDENTIFIER ( COMMA IDENTIFIER )* COLON TYPE -> ^( VAR ( ^( TYPE IDENTIFIER ) )+ ) ;
    public final NiklausParser.variabledeclaration_return variabledeclaration() throws RecognitionException {
        NiklausParser.variabledeclaration_return retval = new NiklausParser.variabledeclaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token VAR24=null;
        Token IDENTIFIER25=null;
        Token COMMA26=null;
        Token IDENTIFIER27=null;
        Token COLON28=null;
        Token TYPE29=null;

        CommonTree VAR24_tree=null;
        CommonTree IDENTIFIER25_tree=null;
        CommonTree COMMA26_tree=null;
        CommonTree IDENTIFIER27_tree=null;
        CommonTree COLON28_tree=null;
        CommonTree TYPE29_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");

        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:70:20: ( VAR IDENTIFIER ( COMMA IDENTIFIER )* COLON TYPE -> ^( VAR ( ^( TYPE IDENTIFIER ) )+ ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:71:3: VAR IDENTIFIER ( COMMA IDENTIFIER )* COLON TYPE
            {
            VAR24=(Token)match(input,VAR,FOLLOW_VAR_in_variabledeclaration240);  
            stream_VAR.add(VAR24);


            IDENTIFIER25=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variabledeclaration242);  
            stream_IDENTIFIER.add(IDENTIFIER25);


            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:71:18: ( COMMA IDENTIFIER )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==COMMA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:71:19: COMMA IDENTIFIER
            	    {
            	    COMMA26=(Token)match(input,COMMA,FOLLOW_COMMA_in_variabledeclaration245);  
            	    stream_COMMA.add(COMMA26);


            	    IDENTIFIER27=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variabledeclaration247);  
            	    stream_IDENTIFIER.add(IDENTIFIER27);


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            COLON28=(Token)match(input,COLON,FOLLOW_COLON_in_variabledeclaration251);  
            stream_COLON.add(COLON28);


            TYPE29=(Token)match(input,TYPE,FOLLOW_TYPE_in_variabledeclaration253);  
            stream_TYPE.add(TYPE29);


            // AST REWRITE
            // elements: TYPE, IDENTIFIER, VAR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 72:3: -> ^( VAR ( ^( TYPE IDENTIFIER ) )+ )
            {
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:72:6: ^( VAR ( ^( TYPE IDENTIFIER ) )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_VAR.nextNode()
                , root_1);

                if ( !(stream_TYPE.hasNext()||stream_IDENTIFIER.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_TYPE.hasNext()||stream_IDENTIFIER.hasNext() ) {
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:72:12: ^( TYPE IDENTIFIER )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot(
                    stream_TYPE.nextNode()
                    , root_2);

                    adaptor.addChild(root_2, 
                    stream_IDENTIFIER.nextNode()
                    );

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_TYPE.reset();
                stream_IDENTIFIER.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "variabledeclaration"


    public static class functiondeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functiondeclaration"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:75:1: functiondeclaration : FUNCTION IDENTIFIER parameterlist COLON TYPE DEFINEDAS ( variabledeclaration ( SEMI variabledeclaration )* )? BEGIN ( statement ( SEMI statement )* )? END -> ^( FUNCTION IDENTIFIER TYPE parameterlist ^( DECLARATIONS ( variabledeclaration )* ) ^( BODY ( statement )* ) ) ;
    public final NiklausParser.functiondeclaration_return functiondeclaration() throws RecognitionException {
        NiklausParser.functiondeclaration_return retval = new NiklausParser.functiondeclaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token FUNCTION30=null;
        Token IDENTIFIER31=null;
        Token COLON33=null;
        Token TYPE34=null;
        Token DEFINEDAS35=null;
        Token SEMI37=null;
        Token BEGIN39=null;
        Token SEMI41=null;
        Token END43=null;
        NiklausParser.parameterlist_return parameterlist32 =null;

        NiklausParser.variabledeclaration_return variabledeclaration36 =null;

        NiklausParser.variabledeclaration_return variabledeclaration38 =null;

        NiklausParser.statement_return statement40 =null;

        NiklausParser.statement_return statement42 =null;


        CommonTree FUNCTION30_tree=null;
        CommonTree IDENTIFIER31_tree=null;
        CommonTree COLON33_tree=null;
        CommonTree TYPE34_tree=null;
        CommonTree DEFINEDAS35_tree=null;
        CommonTree SEMI37_tree=null;
        CommonTree BEGIN39_tree=null;
        CommonTree SEMI41_tree=null;
        CommonTree END43_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_DEFINEDAS=new RewriteRuleTokenStream(adaptor,"token DEFINEDAS");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleSubtreeStream stream_parameterlist=new RewriteRuleSubtreeStream(adaptor,"rule parameterlist");
        RewriteRuleSubtreeStream stream_variabledeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variabledeclaration");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:75:20: ( FUNCTION IDENTIFIER parameterlist COLON TYPE DEFINEDAS ( variabledeclaration ( SEMI variabledeclaration )* )? BEGIN ( statement ( SEMI statement )* )? END -> ^( FUNCTION IDENTIFIER TYPE parameterlist ^( DECLARATIONS ( variabledeclaration )* ) ^( BODY ( statement )* ) ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:76:3: FUNCTION IDENTIFIER parameterlist COLON TYPE DEFINEDAS ( variabledeclaration ( SEMI variabledeclaration )* )? BEGIN ( statement ( SEMI statement )* )? END
            {
            FUNCTION30=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_functiondeclaration281);  
            stream_FUNCTION.add(FUNCTION30);


            IDENTIFIER31=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_functiondeclaration283);  
            stream_IDENTIFIER.add(IDENTIFIER31);


            pushFollow(FOLLOW_parameterlist_in_functiondeclaration285);
            parameterlist32=parameterlist();

            state._fsp--;

            stream_parameterlist.add(parameterlist32.getTree());

            COLON33=(Token)match(input,COLON,FOLLOW_COLON_in_functiondeclaration287);  
            stream_COLON.add(COLON33);


            TYPE34=(Token)match(input,TYPE,FOLLOW_TYPE_in_functiondeclaration289);  
            stream_TYPE.add(TYPE34);


            DEFINEDAS35=(Token)match(input,DEFINEDAS,FOLLOW_DEFINEDAS_in_functiondeclaration291);  
            stream_DEFINEDAS.add(DEFINEDAS35);


            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:77:3: ( variabledeclaration ( SEMI variabledeclaration )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==VAR) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:77:4: variabledeclaration ( SEMI variabledeclaration )*
                    {
                    pushFollow(FOLLOW_variabledeclaration_in_functiondeclaration297);
                    variabledeclaration36=variabledeclaration();

                    state._fsp--;

                    stream_variabledeclaration.add(variabledeclaration36.getTree());

                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:77:24: ( SEMI variabledeclaration )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==SEMI) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:77:25: SEMI variabledeclaration
                    	    {
                    	    SEMI37=(Token)match(input,SEMI,FOLLOW_SEMI_in_functiondeclaration300);  
                    	    stream_SEMI.add(SEMI37);


                    	    pushFollow(FOLLOW_variabledeclaration_in_functiondeclaration302);
                    	    variabledeclaration38=variabledeclaration();

                    	    state._fsp--;

                    	    stream_variabledeclaration.add(variabledeclaration38.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }


            BEGIN39=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_functiondeclaration308);  
            stream_BEGIN.add(BEGIN39);


            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:77:60: ( statement ( SEMI statement )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==BEGIN||(LA10_0 >= IDENTIFIER && LA10_0 <= IF)||LA10_0==OUTPUT||LA10_0==REPEAT||LA10_0==WHILE) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:77:61: statement ( SEMI statement )*
                    {
                    pushFollow(FOLLOW_statement_in_functiondeclaration311);
                    statement40=statement();

                    state._fsp--;

                    stream_statement.add(statement40.getTree());

                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:77:71: ( SEMI statement )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==SEMI) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:77:72: SEMI statement
                    	    {
                    	    SEMI41=(Token)match(input,SEMI,FOLLOW_SEMI_in_functiondeclaration314);  
                    	    stream_SEMI.add(SEMI41);


                    	    pushFollow(FOLLOW_statement_in_functiondeclaration316);
                    	    statement42=statement();

                    	    state._fsp--;

                    	    stream_statement.add(statement42.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }


            END43=(Token)match(input,END,FOLLOW_END_in_functiondeclaration322);  
            stream_END.add(END43);


            // AST REWRITE
            // elements: statement, IDENTIFIER, variabledeclaration, TYPE, FUNCTION, parameterlist
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 78:3: -> ^( FUNCTION IDENTIFIER TYPE parameterlist ^( DECLARATIONS ( variabledeclaration )* ) ^( BODY ( statement )* ) )
            {
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:78:6: ^( FUNCTION IDENTIFIER TYPE parameterlist ^( DECLARATIONS ( variabledeclaration )* ) ^( BODY ( statement )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_FUNCTION.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_TYPE.nextNode()
                );

                adaptor.addChild(root_1, stream_parameterlist.nextTree());

                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:79:3: ^( DECLARATIONS ( variabledeclaration )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DECLARATIONS, "DECLARATIONS")
                , root_2);

                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:79:18: ( variabledeclaration )*
                while ( stream_variabledeclaration.hasNext() ) {
                    adaptor.addChild(root_2, stream_variabledeclaration.nextTree());

                }
                stream_variabledeclaration.reset();

                adaptor.addChild(root_1, root_2);
                }

                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:79:40: ^( BODY ( statement )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(BODY, "BODY")
                , root_2);

                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:79:47: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_2, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "functiondeclaration"


    public static class proceduredeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "proceduredeclaration"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:82:1: proceduredeclaration : PROCEDURE IDENTIFIER parameterlist DEFINEDAS ( variabledeclaration ( SEMI variabledeclaration )* )? BEGIN ( statement ( SEMI statement )* )? END -> ^( FUNCTION IDENTIFIER parameterlist ^( DECLARATIONS ( variabledeclaration )* ) ^( BODY ( statement )* ) ) ;
    public final NiklausParser.proceduredeclaration_return proceduredeclaration() throws RecognitionException {
        NiklausParser.proceduredeclaration_return retval = new NiklausParser.proceduredeclaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PROCEDURE44=null;
        Token IDENTIFIER45=null;
        Token DEFINEDAS47=null;
        Token SEMI49=null;
        Token BEGIN51=null;
        Token SEMI53=null;
        Token END55=null;
        NiklausParser.parameterlist_return parameterlist46 =null;

        NiklausParser.variabledeclaration_return variabledeclaration48 =null;

        NiklausParser.variabledeclaration_return variabledeclaration50 =null;

        NiklausParser.statement_return statement52 =null;

        NiklausParser.statement_return statement54 =null;


        CommonTree PROCEDURE44_tree=null;
        CommonTree IDENTIFIER45_tree=null;
        CommonTree DEFINEDAS47_tree=null;
        CommonTree SEMI49_tree=null;
        CommonTree BEGIN51_tree=null;
        CommonTree SEMI53_tree=null;
        CommonTree END55_tree=null;
        RewriteRuleTokenStream stream_DEFINEDAS=new RewriteRuleTokenStream(adaptor,"token DEFINEDAS");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_PROCEDURE=new RewriteRuleTokenStream(adaptor,"token PROCEDURE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_parameterlist=new RewriteRuleSubtreeStream(adaptor,"rule parameterlist");
        RewriteRuleSubtreeStream stream_variabledeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variabledeclaration");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:82:21: ( PROCEDURE IDENTIFIER parameterlist DEFINEDAS ( variabledeclaration ( SEMI variabledeclaration )* )? BEGIN ( statement ( SEMI statement )* )? END -> ^( FUNCTION IDENTIFIER parameterlist ^( DECLARATIONS ( variabledeclaration )* ) ^( BODY ( statement )* ) ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:83:3: PROCEDURE IDENTIFIER parameterlist DEFINEDAS ( variabledeclaration ( SEMI variabledeclaration )* )? BEGIN ( statement ( SEMI statement )* )? END
            {
            PROCEDURE44=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_proceduredeclaration366);  
            stream_PROCEDURE.add(PROCEDURE44);


            IDENTIFIER45=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_proceduredeclaration368);  
            stream_IDENTIFIER.add(IDENTIFIER45);


            pushFollow(FOLLOW_parameterlist_in_proceduredeclaration370);
            parameterlist46=parameterlist();

            state._fsp--;

            stream_parameterlist.add(parameterlist46.getTree());

            DEFINEDAS47=(Token)match(input,DEFINEDAS,FOLLOW_DEFINEDAS_in_proceduredeclaration372);  
            stream_DEFINEDAS.add(DEFINEDAS47);


            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:84:3: ( variabledeclaration ( SEMI variabledeclaration )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==VAR) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:84:4: variabledeclaration ( SEMI variabledeclaration )*
                    {
                    pushFollow(FOLLOW_variabledeclaration_in_proceduredeclaration378);
                    variabledeclaration48=variabledeclaration();

                    state._fsp--;

                    stream_variabledeclaration.add(variabledeclaration48.getTree());

                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:84:24: ( SEMI variabledeclaration )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==SEMI) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:84:25: SEMI variabledeclaration
                    	    {
                    	    SEMI49=(Token)match(input,SEMI,FOLLOW_SEMI_in_proceduredeclaration381);  
                    	    stream_SEMI.add(SEMI49);


                    	    pushFollow(FOLLOW_variabledeclaration_in_proceduredeclaration383);
                    	    variabledeclaration50=variabledeclaration();

                    	    state._fsp--;

                    	    stream_variabledeclaration.add(variabledeclaration50.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }


            BEGIN51=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_proceduredeclaration389);  
            stream_BEGIN.add(BEGIN51);


            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:84:60: ( statement ( SEMI statement )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==BEGIN||(LA14_0 >= IDENTIFIER && LA14_0 <= IF)||LA14_0==OUTPUT||LA14_0==REPEAT||LA14_0==WHILE) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:84:61: statement ( SEMI statement )*
                    {
                    pushFollow(FOLLOW_statement_in_proceduredeclaration392);
                    statement52=statement();

                    state._fsp--;

                    stream_statement.add(statement52.getTree());

                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:84:71: ( SEMI statement )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==SEMI) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:84:72: SEMI statement
                    	    {
                    	    SEMI53=(Token)match(input,SEMI,FOLLOW_SEMI_in_proceduredeclaration395);  
                    	    stream_SEMI.add(SEMI53);


                    	    pushFollow(FOLLOW_statement_in_proceduredeclaration397);
                    	    statement54=statement();

                    	    state._fsp--;

                    	    stream_statement.add(statement54.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }


            END55=(Token)match(input,END,FOLLOW_END_in_proceduredeclaration403);  
            stream_END.add(END55);


            // AST REWRITE
            // elements: parameterlist, variabledeclaration, IDENTIFIER, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 85:3: -> ^( FUNCTION IDENTIFIER parameterlist ^( DECLARATIONS ( variabledeclaration )* ) ^( BODY ( statement )* ) )
            {
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:85:6: ^( FUNCTION IDENTIFIER parameterlist ^( DECLARATIONS ( variabledeclaration )* ) ^( BODY ( statement )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FUNCTION, "FUNCTION")
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
                );

                adaptor.addChild(root_1, stream_parameterlist.nextTree());

                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:86:3: ^( DECLARATIONS ( variabledeclaration )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DECLARATIONS, "DECLARATIONS")
                , root_2);

                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:86:18: ( variabledeclaration )*
                while ( stream_variabledeclaration.hasNext() ) {
                    adaptor.addChild(root_2, stream_variabledeclaration.nextTree());

                }
                stream_variabledeclaration.reset();

                adaptor.addChild(root_1, root_2);
                }

                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:86:40: ^( BODY ( statement )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(BODY, "BODY")
                , root_2);

                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:86:47: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_2, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "proceduredeclaration"


    public static class parameterlist_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameterlist"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:89:1: parameterlist : OPENINGPARENTHESIS ( parameters ( COMMA parameters )* )? CLOSINGPARENTHESIS -> ^( PARAM ( parameters )* ) ;
    public final NiklausParser.parameterlist_return parameterlist() throws RecognitionException {
        NiklausParser.parameterlist_return retval = new NiklausParser.parameterlist_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token OPENINGPARENTHESIS56=null;
        Token COMMA58=null;
        Token CLOSINGPARENTHESIS60=null;
        NiklausParser.parameters_return parameters57 =null;

        NiklausParser.parameters_return parameters59 =null;


        CommonTree OPENINGPARENTHESIS56_tree=null;
        CommonTree COMMA58_tree=null;
        CommonTree CLOSINGPARENTHESIS60_tree=null;
        RewriteRuleTokenStream stream_OPENINGPARENTHESIS=new RewriteRuleTokenStream(adaptor,"token OPENINGPARENTHESIS");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_CLOSINGPARENTHESIS=new RewriteRuleTokenStream(adaptor,"token CLOSINGPARENTHESIS");
        RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:89:14: ( OPENINGPARENTHESIS ( parameters ( COMMA parameters )* )? CLOSINGPARENTHESIS -> ^( PARAM ( parameters )* ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:90:3: OPENINGPARENTHESIS ( parameters ( COMMA parameters )* )? CLOSINGPARENTHESIS
            {
            OPENINGPARENTHESIS56=(Token)match(input,OPENINGPARENTHESIS,FOLLOW_OPENINGPARENTHESIS_in_parameterlist445);  
            stream_OPENINGPARENTHESIS.add(OPENINGPARENTHESIS56);


            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:90:22: ( parameters ( COMMA parameters )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==IDENTIFIER) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:90:23: parameters ( COMMA parameters )*
                    {
                    pushFollow(FOLLOW_parameters_in_parameterlist448);
                    parameters57=parameters();

                    state._fsp--;

                    stream_parameters.add(parameters57.getTree());

                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:90:34: ( COMMA parameters )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==COMMA) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:90:35: COMMA parameters
                    	    {
                    	    COMMA58=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameterlist451);  
                    	    stream_COMMA.add(COMMA58);


                    	    pushFollow(FOLLOW_parameters_in_parameterlist453);
                    	    parameters59=parameters();

                    	    state._fsp--;

                    	    stream_parameters.add(parameters59.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }


            CLOSINGPARENTHESIS60=(Token)match(input,CLOSINGPARENTHESIS,FOLLOW_CLOSINGPARENTHESIS_in_parameterlist459);  
            stream_CLOSINGPARENTHESIS.add(CLOSINGPARENTHESIS60);


            // AST REWRITE
            // elements: parameters
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 91:3: -> ^( PARAM ( parameters )* )
            {
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:91:6: ^( PARAM ( parameters )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PARAM, "PARAM")
                , root_1);

                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:91:14: ( parameters )*
                while ( stream_parameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameters.nextTree());

                }
                stream_parameters.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parameterlist"


    public static class parameters_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameters"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:94:1: parameters : IDENTIFIER ( COMMA IDENTIFIER )* COLON TYPE -> ( ^( TYPE IDENTIFIER ) )+ ;
    public final NiklausParser.parameters_return parameters() throws RecognitionException {
        NiklausParser.parameters_return retval = new NiklausParser.parameters_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENTIFIER61=null;
        Token COMMA62=null;
        Token IDENTIFIER63=null;
        Token COLON64=null;
        Token TYPE65=null;

        CommonTree IDENTIFIER61_tree=null;
        CommonTree COMMA62_tree=null;
        CommonTree IDENTIFIER63_tree=null;
        CommonTree COLON64_tree=null;
        CommonTree TYPE65_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");

        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:94:11: ( IDENTIFIER ( COMMA IDENTIFIER )* COLON TYPE -> ( ^( TYPE IDENTIFIER ) )+ )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:95:3: IDENTIFIER ( COMMA IDENTIFIER )* COLON TYPE
            {
            IDENTIFIER61=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameters482);  
            stream_IDENTIFIER.add(IDENTIFIER61);


            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:95:14: ( COMMA IDENTIFIER )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:95:15: COMMA IDENTIFIER
            	    {
            	    COMMA62=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameters485);  
            	    stream_COMMA.add(COMMA62);


            	    IDENTIFIER63=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameters487);  
            	    stream_IDENTIFIER.add(IDENTIFIER63);


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            COLON64=(Token)match(input,COLON,FOLLOW_COLON_in_parameters491);  
            stream_COLON.add(COLON64);


            TYPE65=(Token)match(input,TYPE,FOLLOW_TYPE_in_parameters493);  
            stream_TYPE.add(TYPE65);


            // AST REWRITE
            // elements: TYPE, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 96:3: -> ( ^( TYPE IDENTIFIER ) )+
            {
                if ( !(stream_TYPE.hasNext()||stream_IDENTIFIER.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_TYPE.hasNext()||stream_IDENTIFIER.hasNext() ) {
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:96:6: ^( TYPE IDENTIFIER )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(
                    stream_TYPE.nextNode()
                    , root_1);

                    adaptor.addChild(root_1, 
                    stream_IDENTIFIER.nextNode()
                    );

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_TYPE.reset();
                stream_IDENTIFIER.reset();

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parameters"


    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:99:1: statement : ( assignment | output | conditional | loop | procedurecall | BEGIN ( statement )? ( SEMI statement )* END -> ^( BODY ( statement )* ) );
    public final NiklausParser.statement_return statement() throws RecognitionException {
        NiklausParser.statement_return retval = new NiklausParser.statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token BEGIN71=null;
        Token SEMI73=null;
        Token END75=null;
        NiklausParser.assignment_return assignment66 =null;

        NiklausParser.output_return output67 =null;

        NiklausParser.conditional_return conditional68 =null;

        NiklausParser.loop_return loop69 =null;

        NiklausParser.procedurecall_return procedurecall70 =null;

        NiklausParser.statement_return statement72 =null;

        NiklausParser.statement_return statement74 =null;


        CommonTree BEGIN71_tree=null;
        CommonTree SEMI73_tree=null;
        CommonTree END75_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:99:10: ( assignment | output | conditional | loop | procedurecall | BEGIN ( statement )? ( SEMI statement )* END -> ^( BODY ( statement )* ) )
            int alt20=6;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==DEFINEDAS) ) {
                    alt20=1;
                }
                else if ( (LA20_1==OPENINGPARENTHESIS) ) {
                    alt20=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;

                }
                }
                break;
            case OUTPUT:
                {
                alt20=2;
                }
                break;
            case IF:
                {
                alt20=3;
                }
                break;
            case REPEAT:
            case WHILE:
                {
                alt20=4;
                }
                break;
            case BEGIN:
                {
                alt20=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }

            switch (alt20) {
                case 1 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:100:3: assignment
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_assignment_in_statement517);
                    assignment66=assignment();

                    state._fsp--;

                    adaptor.addChild(root_0, assignment66.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:101:5: output
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_output_in_statement523);
                    output67=output();

                    state._fsp--;

                    adaptor.addChild(root_0, output67.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:102:5: conditional
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_conditional_in_statement529);
                    conditional68=conditional();

                    state._fsp--;

                    adaptor.addChild(root_0, conditional68.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:103:5: loop
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_loop_in_statement535);
                    loop69=loop();

                    state._fsp--;

                    adaptor.addChild(root_0, loop69.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:104:5: procedurecall
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_procedurecall_in_statement541);
                    procedurecall70=procedurecall();

                    state._fsp--;

                    adaptor.addChild(root_0, procedurecall70.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:105:5: BEGIN ( statement )? ( SEMI statement )* END
                    {
                    BEGIN71=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_statement547);  
                    stream_BEGIN.add(BEGIN71);


                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:105:11: ( statement )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==BEGIN||(LA18_0 >= IDENTIFIER && LA18_0 <= IF)||LA18_0==OUTPUT||LA18_0==REPEAT||LA18_0==WHILE) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:105:11: statement
                            {
                            pushFollow(FOLLOW_statement_in_statement549);
                            statement72=statement();

                            state._fsp--;

                            stream_statement.add(statement72.getTree());

                            }
                            break;

                    }


                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:105:22: ( SEMI statement )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==SEMI) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:105:23: SEMI statement
                    	    {
                    	    SEMI73=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement553);  
                    	    stream_SEMI.add(SEMI73);


                    	    pushFollow(FOLLOW_statement_in_statement555);
                    	    statement74=statement();

                    	    state._fsp--;

                    	    stream_statement.add(statement74.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    END75=(Token)match(input,END,FOLLOW_END_in_statement559);  
                    stream_END.add(END75);


                    // AST REWRITE
                    // elements: statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 105:44: -> ^( BODY ( statement )* )
                    {
                        // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:105:47: ^( BODY ( statement )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(BODY, "BODY")
                        , root_1);

                        // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:105:54: ( statement )*
                        while ( stream_statement.hasNext() ) {
                            adaptor.addChild(root_1, stream_statement.nextTree());

                        }
                        stream_statement.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class assignment_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:108:1: assignment : IDENTIFIER DEFINEDAS ^ expression ;
    public final NiklausParser.assignment_return assignment() throws RecognitionException {
        NiklausParser.assignment_return retval = new NiklausParser.assignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENTIFIER76=null;
        Token DEFINEDAS77=null;
        NiklausParser.expression_return expression78 =null;


        CommonTree IDENTIFIER76_tree=null;
        CommonTree DEFINEDAS77_tree=null;

        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:108:11: ( IDENTIFIER DEFINEDAS ^ expression )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:109:3: IDENTIFIER DEFINEDAS ^ expression
            {
            root_0 = (CommonTree)adaptor.nil();


            IDENTIFIER76=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignment582); 
            IDENTIFIER76_tree = 
            (CommonTree)adaptor.create(IDENTIFIER76)
            ;
            adaptor.addChild(root_0, IDENTIFIER76_tree);


            DEFINEDAS77=(Token)match(input,DEFINEDAS,FOLLOW_DEFINEDAS_in_assignment584); 
            DEFINEDAS77_tree = 
            (CommonTree)adaptor.create(DEFINEDAS77)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(DEFINEDAS77_tree, root_0);


            pushFollow(FOLLOW_expression_in_assignment587);
            expression78=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression78.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignment"


    public static class output_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "output"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:112:1: output : OUTPUT ^ ( STRINGLITERAL | IDENTIFIER ) ;
    public final NiklausParser.output_return output() throws RecognitionException {
        NiklausParser.output_return retval = new NiklausParser.output_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token OUTPUT79=null;
        Token set80=null;

        CommonTree OUTPUT79_tree=null;
        CommonTree set80_tree=null;

        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:112:7: ( OUTPUT ^ ( STRINGLITERAL | IDENTIFIER ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:113:3: OUTPUT ^ ( STRINGLITERAL | IDENTIFIER )
            {
            root_0 = (CommonTree)adaptor.nil();


            OUTPUT79=(Token)match(input,OUTPUT,FOLLOW_OUTPUT_in_output601); 
            OUTPUT79_tree = 
            (CommonTree)adaptor.create(OUTPUT79)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(OUTPUT79_tree, root_0);


            set80=(Token)input.LT(1);

            if ( input.LA(1)==IDENTIFIER||input.LA(1)==STRINGLITERAL ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set80)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "output"


    public static class conditional_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditional"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:116:1: conditional : IF ^ expression THEN ! statement ( options {greedy=true; } : ELSE ! statement )? ;
    public final NiklausParser.conditional_return conditional() throws RecognitionException {
        NiklausParser.conditional_return retval = new NiklausParser.conditional_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IF81=null;
        Token THEN83=null;
        Token ELSE85=null;
        NiklausParser.expression_return expression82 =null;

        NiklausParser.statement_return statement84 =null;

        NiklausParser.statement_return statement86 =null;


        CommonTree IF81_tree=null;
        CommonTree THEN83_tree=null;
        CommonTree ELSE85_tree=null;

        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:116:12: ( IF ^ expression THEN ! statement ( options {greedy=true; } : ELSE ! statement )? )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:117:3: IF ^ expression THEN ! statement ( options {greedy=true; } : ELSE ! statement )?
            {
            root_0 = (CommonTree)adaptor.nil();


            IF81=(Token)match(input,IF,FOLLOW_IF_in_conditional624); 
            IF81_tree = 
            (CommonTree)adaptor.create(IF81)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(IF81_tree, root_0);


            pushFollow(FOLLOW_expression_in_conditional627);
            expression82=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression82.getTree());

            THEN83=(Token)match(input,THEN,FOLLOW_THEN_in_conditional629); 

            pushFollow(FOLLOW_statement_in_conditional632);
            statement84=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement84.getTree());

            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:118:3: ( options {greedy=true; } : ELSE ! statement )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ELSE) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:118:46: ELSE ! statement
                    {
                    ELSE85=(Token)match(input,ELSE,FOLLOW_ELSE_in_conditional648); 

                    pushFollow(FOLLOW_statement_in_conditional651);
                    statement86=statement();

                    state._fsp--;

                    adaptor.addChild(root_0, statement86.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "conditional"


    public static class loop_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "loop"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:121:1: loop : ( whileloop | repeatloop );
    public final NiklausParser.loop_return loop() throws RecognitionException {
        NiklausParser.loop_return retval = new NiklausParser.loop_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        NiklausParser.whileloop_return whileloop87 =null;

        NiklausParser.repeatloop_return repeatloop88 =null;



        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:121:5: ( whileloop | repeatloop )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==WHILE) ) {
                alt22=1;
            }
            else if ( (LA22_0==REPEAT) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:122:3: whileloop
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_whileloop_in_loop667);
                    whileloop87=whileloop();

                    state._fsp--;

                    adaptor.addChild(root_0, whileloop87.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:123:5: repeatloop
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_repeatloop_in_loop673);
                    repeatloop88=repeatloop();

                    state._fsp--;

                    adaptor.addChild(root_0, repeatloop88.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "loop"


    public static class whileloop_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whileloop"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:126:1: whileloop : WHILE ^ expression DO ! statement ;
    public final NiklausParser.whileloop_return whileloop() throws RecognitionException {
        NiklausParser.whileloop_return retval = new NiklausParser.whileloop_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token WHILE89=null;
        Token DO91=null;
        NiklausParser.expression_return expression90 =null;

        NiklausParser.statement_return statement92 =null;


        CommonTree WHILE89_tree=null;
        CommonTree DO91_tree=null;

        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:126:10: ( WHILE ^ expression DO ! statement )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:127:3: WHILE ^ expression DO ! statement
            {
            root_0 = (CommonTree)adaptor.nil();


            WHILE89=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileloop687); 
            WHILE89_tree = 
            (CommonTree)adaptor.create(WHILE89)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(WHILE89_tree, root_0);


            pushFollow(FOLLOW_expression_in_whileloop690);
            expression90=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression90.getTree());

            DO91=(Token)match(input,DO,FOLLOW_DO_in_whileloop692); 

            pushFollow(FOLLOW_statement_in_whileloop695);
            statement92=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement92.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "whileloop"


    public static class repeatloop_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "repeatloop"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:130:1: repeatloop : REPEAT ^ statement UNTIL ! expression ;
    public final NiklausParser.repeatloop_return repeatloop() throws RecognitionException {
        NiklausParser.repeatloop_return retval = new NiklausParser.repeatloop_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token REPEAT93=null;
        Token UNTIL95=null;
        NiklausParser.statement_return statement94 =null;

        NiklausParser.expression_return expression96 =null;


        CommonTree REPEAT93_tree=null;
        CommonTree UNTIL95_tree=null;

        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:130:11: ( REPEAT ^ statement UNTIL ! expression )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:131:3: REPEAT ^ statement UNTIL ! expression
            {
            root_0 = (CommonTree)adaptor.nil();


            REPEAT93=(Token)match(input,REPEAT,FOLLOW_REPEAT_in_repeatloop707); 
            REPEAT93_tree = 
            (CommonTree)adaptor.create(REPEAT93)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(REPEAT93_tree, root_0);


            pushFollow(FOLLOW_statement_in_repeatloop710);
            statement94=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement94.getTree());

            UNTIL95=(Token)match(input,UNTIL,FOLLOW_UNTIL_in_repeatloop712); 

            pushFollow(FOLLOW_expression_in_repeatloop715);
            expression96=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression96.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "repeatloop"


    public static class procedurecall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "procedurecall"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:134:1: procedurecall : IDENTIFIER OPENINGPARENTHESIS ( expression ( COMMA expression )* )? CLOSINGPARENTHESIS -> ^( IDENTIFIER ^( PARAM ( expression )* ) ) ;
    public final NiklausParser.procedurecall_return procedurecall() throws RecognitionException {
        NiklausParser.procedurecall_return retval = new NiklausParser.procedurecall_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENTIFIER97=null;
        Token OPENINGPARENTHESIS98=null;
        Token COMMA100=null;
        Token CLOSINGPARENTHESIS102=null;
        NiklausParser.expression_return expression99 =null;

        NiklausParser.expression_return expression101 =null;


        CommonTree IDENTIFIER97_tree=null;
        CommonTree OPENINGPARENTHESIS98_tree=null;
        CommonTree COMMA100_tree=null;
        CommonTree CLOSINGPARENTHESIS102_tree=null;
        RewriteRuleTokenStream stream_OPENINGPARENTHESIS=new RewriteRuleTokenStream(adaptor,"token OPENINGPARENTHESIS");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_CLOSINGPARENTHESIS=new RewriteRuleTokenStream(adaptor,"token CLOSINGPARENTHESIS");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:134:14: ( IDENTIFIER OPENINGPARENTHESIS ( expression ( COMMA expression )* )? CLOSINGPARENTHESIS -> ^( IDENTIFIER ^( PARAM ( expression )* ) ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:135:3: IDENTIFIER OPENINGPARENTHESIS ( expression ( COMMA expression )* )? CLOSINGPARENTHESIS
            {
            IDENTIFIER97=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_procedurecall729);  
            stream_IDENTIFIER.add(IDENTIFIER97);


            OPENINGPARENTHESIS98=(Token)match(input,OPENINGPARENTHESIS,FOLLOW_OPENINGPARENTHESIS_in_procedurecall731);  
            stream_OPENINGPARENTHESIS.add(OPENINGPARENTHESIS98);


            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:135:33: ( expression ( COMMA expression )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ADDITION||LA24_0==COUNT||LA24_0==FLOAT||LA24_0==IDENTIFIER||LA24_0==OPENINGPARENTHESIS||LA24_0==SUBTRACTION) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:135:34: expression ( COMMA expression )*
                    {
                    pushFollow(FOLLOW_expression_in_procedurecall734);
                    expression99=expression();

                    state._fsp--;

                    stream_expression.add(expression99.getTree());

                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:135:45: ( COMMA expression )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==COMMA) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:135:46: COMMA expression
                    	    {
                    	    COMMA100=(Token)match(input,COMMA,FOLLOW_COMMA_in_procedurecall737);  
                    	    stream_COMMA.add(COMMA100);


                    	    pushFollow(FOLLOW_expression_in_procedurecall739);
                    	    expression101=expression();

                    	    state._fsp--;

                    	    stream_expression.add(expression101.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }


            CLOSINGPARENTHESIS102=(Token)match(input,CLOSINGPARENTHESIS,FOLLOW_CLOSINGPARENTHESIS_in_procedurecall745);  
            stream_CLOSINGPARENTHESIS.add(CLOSINGPARENTHESIS102);


            // AST REWRITE
            // elements: IDENTIFIER, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 136:3: -> ^( IDENTIFIER ^( PARAM ( expression )* ) )
            {
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:136:6: ^( IDENTIFIER ^( PARAM ( expression )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_IDENTIFIER.nextNode()
                , root_1);

                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:136:19: ^( PARAM ( expression )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PARAM, "PARAM")
                , root_2);

                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:136:27: ( expression )*
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_2, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "procedurecall"


    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:139:1: expression : arithmeticexpression ( ( EQUALITY ^| NONEQUALITY ^| COMPARISON ^) arithmeticexpression )? ;
    public final NiklausParser.expression_return expression() throws RecognitionException {
        NiklausParser.expression_return retval = new NiklausParser.expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQUALITY104=null;
        Token NONEQUALITY105=null;
        Token COMPARISON106=null;
        NiklausParser.arithmeticexpression_return arithmeticexpression103 =null;

        NiklausParser.arithmeticexpression_return arithmeticexpression107 =null;


        CommonTree EQUALITY104_tree=null;
        CommonTree NONEQUALITY105_tree=null;
        CommonTree COMPARISON106_tree=null;

        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:139:11: ( arithmeticexpression ( ( EQUALITY ^| NONEQUALITY ^| COMPARISON ^) arithmeticexpression )? )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:140:3: arithmeticexpression ( ( EQUALITY ^| NONEQUALITY ^| COMPARISON ^) arithmeticexpression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_arithmeticexpression_in_expression775);
            arithmeticexpression103=arithmeticexpression();

            state._fsp--;

            adaptor.addChild(root_0, arithmeticexpression103.getTree());

            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:140:24: ( ( EQUALITY ^| NONEQUALITY ^| COMPARISON ^) arithmeticexpression )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==COMPARISON||LA26_0==EQUALITY||LA26_0==NONEQUALITY) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:140:25: ( EQUALITY ^| NONEQUALITY ^| COMPARISON ^) arithmeticexpression
                    {
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:140:25: ( EQUALITY ^| NONEQUALITY ^| COMPARISON ^)
                    int alt25=3;
                    switch ( input.LA(1) ) {
                    case EQUALITY:
                        {
                        alt25=1;
                        }
                        break;
                    case NONEQUALITY:
                        {
                        alt25=2;
                        }
                        break;
                    case COMPARISON:
                        {
                        alt25=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;

                    }

                    switch (alt25) {
                        case 1 :
                            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:140:26: EQUALITY ^
                            {
                            EQUALITY104=(Token)match(input,EQUALITY,FOLLOW_EQUALITY_in_expression779); 
                            EQUALITY104_tree = 
                            (CommonTree)adaptor.create(EQUALITY104)
                            ;
                            root_0 = (CommonTree)adaptor.becomeRoot(EQUALITY104_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:140:38: NONEQUALITY ^
                            {
                            NONEQUALITY105=(Token)match(input,NONEQUALITY,FOLLOW_NONEQUALITY_in_expression784); 
                            NONEQUALITY105_tree = 
                            (CommonTree)adaptor.create(NONEQUALITY105)
                            ;
                            root_0 = (CommonTree)adaptor.becomeRoot(NONEQUALITY105_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:140:53: COMPARISON ^
                            {
                            COMPARISON106=(Token)match(input,COMPARISON,FOLLOW_COMPARISON_in_expression789); 
                            COMPARISON106_tree = 
                            (CommonTree)adaptor.create(COMPARISON106)
                            ;
                            root_0 = (CommonTree)adaptor.becomeRoot(COMPARISON106_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_arithmeticexpression_in_expression793);
                    arithmeticexpression107=arithmeticexpression();

                    state._fsp--;

                    adaptor.addChild(root_0, arithmeticexpression107.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class arithmeticexpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arithmeticexpression"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:143:1: arithmeticexpression : multiplicationexpression ( ( ADDITION ^| SUBTRACTION ^) multiplicationexpression )* ;
    public final NiklausParser.arithmeticexpression_return arithmeticexpression() throws RecognitionException {
        NiklausParser.arithmeticexpression_return retval = new NiklausParser.arithmeticexpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ADDITION109=null;
        Token SUBTRACTION110=null;
        NiklausParser.multiplicationexpression_return multiplicationexpression108 =null;

        NiklausParser.multiplicationexpression_return multiplicationexpression111 =null;


        CommonTree ADDITION109_tree=null;
        CommonTree SUBTRACTION110_tree=null;

        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:143:21: ( multiplicationexpression ( ( ADDITION ^| SUBTRACTION ^) multiplicationexpression )* )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:144:3: multiplicationexpression ( ( ADDITION ^| SUBTRACTION ^) multiplicationexpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_multiplicationexpression_in_arithmeticexpression807);
            multiplicationexpression108=multiplicationexpression();

            state._fsp--;

            adaptor.addChild(root_0, multiplicationexpression108.getTree());

            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:145:3: ( ( ADDITION ^| SUBTRACTION ^) multiplicationexpression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==ADDITION||LA28_0==SUBTRACTION) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:145:4: ( ADDITION ^| SUBTRACTION ^) multiplicationexpression
            	    {
            	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:145:4: ( ADDITION ^| SUBTRACTION ^)
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==ADDITION) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==SUBTRACTION) ) {
            	        alt27=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:145:5: ADDITION ^
            	            {
            	            ADDITION109=(Token)match(input,ADDITION,FOLLOW_ADDITION_in_arithmeticexpression814); 
            	            ADDITION109_tree = 
            	            (CommonTree)adaptor.create(ADDITION109)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(ADDITION109_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:145:17: SUBTRACTION ^
            	            {
            	            SUBTRACTION110=(Token)match(input,SUBTRACTION,FOLLOW_SUBTRACTION_in_arithmeticexpression819); 
            	            SUBTRACTION110_tree = 
            	            (CommonTree)adaptor.create(SUBTRACTION110)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(SUBTRACTION110_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_multiplicationexpression_in_arithmeticexpression823);
            	    multiplicationexpression111=multiplicationexpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multiplicationexpression111.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arithmeticexpression"


    public static class multiplicationexpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multiplicationexpression"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:148:1: multiplicationexpression : negationexpression ( ( MULTIPLICATION ^ negationexpression )+ | DIVISION ^ negationexpression )? ;
    public final NiklausParser.multiplicationexpression_return multiplicationexpression() throws RecognitionException {
        NiklausParser.multiplicationexpression_return retval = new NiklausParser.multiplicationexpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token MULTIPLICATION113=null;
        Token DIVISION115=null;
        NiklausParser.negationexpression_return negationexpression112 =null;

        NiklausParser.negationexpression_return negationexpression114 =null;

        NiklausParser.negationexpression_return negationexpression116 =null;


        CommonTree MULTIPLICATION113_tree=null;
        CommonTree DIVISION115_tree=null;

        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:148:25: ( negationexpression ( ( MULTIPLICATION ^ negationexpression )+ | DIVISION ^ negationexpression )? )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:149:3: negationexpression ( ( MULTIPLICATION ^ negationexpression )+ | DIVISION ^ negationexpression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_negationexpression_in_multiplicationexpression837);
            negationexpression112=negationexpression();

            state._fsp--;

            adaptor.addChild(root_0, negationexpression112.getTree());

            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:149:22: ( ( MULTIPLICATION ^ negationexpression )+ | DIVISION ^ negationexpression )?
            int alt30=3;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==MULTIPLICATION) ) {
                alt30=1;
            }
            else if ( (LA30_0==DIVISION) ) {
                alt30=2;
            }
            switch (alt30) {
                case 1 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:149:23: ( MULTIPLICATION ^ negationexpression )+
                    {
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:149:23: ( MULTIPLICATION ^ negationexpression )+
                    int cnt29=0;
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==MULTIPLICATION) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:149:24: MULTIPLICATION ^ negationexpression
                    	    {
                    	    MULTIPLICATION113=(Token)match(input,MULTIPLICATION,FOLLOW_MULTIPLICATION_in_multiplicationexpression841); 
                    	    MULTIPLICATION113_tree = 
                    	    (CommonTree)adaptor.create(MULTIPLICATION113)
                    	    ;
                    	    root_0 = (CommonTree)adaptor.becomeRoot(MULTIPLICATION113_tree, root_0);


                    	    pushFollow(FOLLOW_negationexpression_in_multiplicationexpression844);
                    	    negationexpression114=negationexpression();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, negationexpression114.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt29 >= 1 ) break loop29;
                                EarlyExitException eee =
                                    new EarlyExitException(29, input);
                                throw eee;
                        }
                        cnt29++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:149:64: DIVISION ^ negationexpression
                    {
                    DIVISION115=(Token)match(input,DIVISION,FOLLOW_DIVISION_in_multiplicationexpression851); 
                    DIVISION115_tree = 
                    (CommonTree)adaptor.create(DIVISION115)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(DIVISION115_tree, root_0);


                    pushFollow(FOLLOW_negationexpression_in_multiplicationexpression854);
                    negationexpression116=negationexpression();

                    state._fsp--;

                    adaptor.addChild(root_0, negationexpression116.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "multiplicationexpression"


    public static class negationexpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "negationexpression"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:152:1: negationexpression : ( ( SUBTRACTION atom ) -> ^( NEGATE atom ) | ( ADDITION ( COUNT | FLOAT ) ) -> ^( ADDITION ( COUNT )? ( FLOAT )? ) | atom );
    public final NiklausParser.negationexpression_return negationexpression() throws RecognitionException {
        NiklausParser.negationexpression_return retval = new NiklausParser.negationexpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SUBTRACTION117=null;
        Token ADDITION119=null;
        Token COUNT120=null;
        Token FLOAT121=null;
        NiklausParser.atom_return atom118 =null;

        NiklausParser.atom_return atom122 =null;


        CommonTree SUBTRACTION117_tree=null;
        CommonTree ADDITION119_tree=null;
        CommonTree COUNT120_tree=null;
        CommonTree FLOAT121_tree=null;
        RewriteRuleTokenStream stream_COUNT=new RewriteRuleTokenStream(adaptor,"token COUNT");
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
        RewriteRuleTokenStream stream_ADDITION=new RewriteRuleTokenStream(adaptor,"token ADDITION");
        RewriteRuleTokenStream stream_SUBTRACTION=new RewriteRuleTokenStream(adaptor,"token SUBTRACTION");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:152:19: ( ( SUBTRACTION atom ) -> ^( NEGATE atom ) | ( ADDITION ( COUNT | FLOAT ) ) -> ^( ADDITION ( COUNT )? ( FLOAT )? ) | atom )
            int alt32=3;
            switch ( input.LA(1) ) {
            case SUBTRACTION:
                {
                alt32=1;
                }
                break;
            case ADDITION:
                {
                alt32=2;
                }
                break;
            case COUNT:
            case FLOAT:
            case IDENTIFIER:
            case OPENINGPARENTHESIS:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }

            switch (alt32) {
                case 1 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:153:4: ( SUBTRACTION atom )
                    {
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:153:4: ( SUBTRACTION atom )
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:153:5: SUBTRACTION atom
                    {
                    SUBTRACTION117=(Token)match(input,SUBTRACTION,FOLLOW_SUBTRACTION_in_negationexpression872);  
                    stream_SUBTRACTION.add(SUBTRACTION117);


                    pushFollow(FOLLOW_atom_in_negationexpression874);
                    atom118=atom();

                    state._fsp--;

                    stream_atom.add(atom118.getTree());

                    }


                    // AST REWRITE
                    // elements: atom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 153:23: -> ^( NEGATE atom )
                    {
                        // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:153:26: ^( NEGATE atom )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(NEGATE, "NEGATE")
                        , root_1);

                        adaptor.addChild(root_1, stream_atom.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:154:5: ( ADDITION ( COUNT | FLOAT ) )
                    {
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:154:5: ( ADDITION ( COUNT | FLOAT ) )
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:154:6: ADDITION ( COUNT | FLOAT )
                    {
                    ADDITION119=(Token)match(input,ADDITION,FOLLOW_ADDITION_in_negationexpression891);  
                    stream_ADDITION.add(ADDITION119);


                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:154:15: ( COUNT | FLOAT )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==COUNT) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==FLOAT) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;

                    }
                    switch (alt31) {
                        case 1 :
                            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:154:16: COUNT
                            {
                            COUNT120=(Token)match(input,COUNT,FOLLOW_COUNT_in_negationexpression894);  
                            stream_COUNT.add(COUNT120);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:154:24: FLOAT
                            {
                            FLOAT121=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_negationexpression898);  
                            stream_FLOAT.add(FLOAT121);


                            }
                            break;

                    }


                    }


                    // AST REWRITE
                    // elements: FLOAT, ADDITION, COUNT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 154:32: -> ^( ADDITION ( COUNT )? ( FLOAT )? )
                    {
                        // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:154:35: ^( ADDITION ( COUNT )? ( FLOAT )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_ADDITION.nextNode()
                        , root_1);

                        // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:154:46: ( COUNT )?
                        if ( stream_COUNT.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_COUNT.nextNode()
                            );

                        }
                        stream_COUNT.reset();

                        // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:154:53: ( FLOAT )?
                        if ( stream_FLOAT.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_FLOAT.nextNode()
                            );

                        }
                        stream_FLOAT.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:155:6: atom
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_atom_in_negationexpression921);
                    atom122=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom122.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "negationexpression"


    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:158:1: atom : ( COUNT | FLOAT | IDENTIFIER | procedurecall | OPENINGPARENTHESIS ! arithmeticexpression CLOSINGPARENTHESIS !);
    public final NiklausParser.atom_return atom() throws RecognitionException {
        NiklausParser.atom_return retval = new NiklausParser.atom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COUNT123=null;
        Token FLOAT124=null;
        Token IDENTIFIER125=null;
        Token OPENINGPARENTHESIS127=null;
        Token CLOSINGPARENTHESIS129=null;
        NiklausParser.procedurecall_return procedurecall126 =null;

        NiklausParser.arithmeticexpression_return arithmeticexpression128 =null;


        CommonTree COUNT123_tree=null;
        CommonTree FLOAT124_tree=null;
        CommonTree IDENTIFIER125_tree=null;
        CommonTree OPENINGPARENTHESIS127_tree=null;
        CommonTree CLOSINGPARENTHESIS129_tree=null;

        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:158:5: ( COUNT | FLOAT | IDENTIFIER | procedurecall | OPENINGPARENTHESIS ! arithmeticexpression CLOSINGPARENTHESIS !)
            int alt33=5;
            switch ( input.LA(1) ) {
            case COUNT:
                {
                alt33=1;
                }
                break;
            case FLOAT:
                {
                alt33=2;
                }
                break;
            case IDENTIFIER:
                {
                int LA33_3 = input.LA(2);

                if ( (LA33_3==OPENINGPARENTHESIS) ) {
                    alt33=4;
                }
                else if ( (LA33_3==EOF||(LA33_3 >= ADDITION && LA33_3 <= BEGIN)||LA33_3==CLOSINGPARENTHESIS||LA33_3==COMMA||LA33_3==COMPARISON||(LA33_3 >= DIVISION && LA33_3 <= DO)||(LA33_3 >= ELSE && LA33_3 <= EQUALITY)||LA33_3==MULTIPLICATION||LA33_3==NONEQUALITY||LA33_3==SEMI||(LA33_3 >= SUBTRACTION && LA33_3 <= THEN)||LA33_3==UNTIL) ) {
                    alt33=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 3, input);

                    throw nvae;

                }
                }
                break;
            case OPENINGPARENTHESIS:
                {
                alt33=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }

            switch (alt33) {
                case 1 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:159:3: COUNT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    COUNT123=(Token)match(input,COUNT,FOLLOW_COUNT_in_atom938); 
                    COUNT123_tree = 
                    (CommonTree)adaptor.create(COUNT123)
                    ;
                    adaptor.addChild(root_0, COUNT123_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:160:5: FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    FLOAT124=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_atom944); 
                    FLOAT124_tree = 
                    (CommonTree)adaptor.create(FLOAT124)
                    ;
                    adaptor.addChild(root_0, FLOAT124_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:161:5: IDENTIFIER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    IDENTIFIER125=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_atom950); 
                    IDENTIFIER125_tree = 
                    (CommonTree)adaptor.create(IDENTIFIER125)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER125_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:162:5: procedurecall
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_procedurecall_in_atom957);
                    procedurecall126=procedurecall();

                    state._fsp--;

                    adaptor.addChild(root_0, procedurecall126.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:163:5: OPENINGPARENTHESIS ! arithmeticexpression CLOSINGPARENTHESIS !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    OPENINGPARENTHESIS127=(Token)match(input,OPENINGPARENTHESIS,FOLLOW_OPENINGPARENTHESIS_in_atom963); 

                    pushFollow(FOLLOW_arithmeticexpression_in_atom966);
                    arithmeticexpression128=arithmeticexpression();

                    state._fsp--;

                    adaptor.addChild(root_0, arithmeticexpression128.getTree());

                    CLOSINGPARENTHESIS129=(Token)match(input,CLOSINGPARENTHESIS,FOLLOW_CLOSINGPARENTHESIS_in_atom968); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class booleanexpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "booleanexpression"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:166:1: booleanexpression : ( IDENTIFIER | arithmeticexpression ( EQUALITY ^| NONEQUALITY ^| COMPARISON ^) arithmeticexpression );
    public final NiklausParser.booleanexpression_return booleanexpression() throws RecognitionException {
        NiklausParser.booleanexpression_return retval = new NiklausParser.booleanexpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENTIFIER130=null;
        Token EQUALITY132=null;
        Token NONEQUALITY133=null;
        Token COMPARISON134=null;
        NiklausParser.arithmeticexpression_return arithmeticexpression131 =null;

        NiklausParser.arithmeticexpression_return arithmeticexpression135 =null;


        CommonTree IDENTIFIER130_tree=null;
        CommonTree EQUALITY132_tree=null;
        CommonTree NONEQUALITY133_tree=null;
        CommonTree COMPARISON134_tree=null;

        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:166:18: ( IDENTIFIER | arithmeticexpression ( EQUALITY ^| NONEQUALITY ^| COMPARISON ^) arithmeticexpression )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==IDENTIFIER) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==ADDITION||LA35_1==COMPARISON||LA35_1==DIVISION||LA35_1==EQUALITY||LA35_1==MULTIPLICATION||(LA35_1 >= NONEQUALITY && LA35_1 <= OPENINGPARENTHESIS)||LA35_1==SUBTRACTION) ) {
                    alt35=2;
                }
                else if ( (LA35_1==EOF) ) {
                    alt35=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA35_0==ADDITION||LA35_0==COUNT||LA35_0==FLOAT||LA35_0==OPENINGPARENTHESIS||LA35_0==SUBTRACTION) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }
            switch (alt35) {
                case 1 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:167:3: IDENTIFIER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    IDENTIFIER130=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_booleanexpression984); 
                    IDENTIFIER130_tree = 
                    (CommonTree)adaptor.create(IDENTIFIER130)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER130_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:168:5: arithmeticexpression ( EQUALITY ^| NONEQUALITY ^| COMPARISON ^) arithmeticexpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_arithmeticexpression_in_booleanexpression991);
                    arithmeticexpression131=arithmeticexpression();

                    state._fsp--;

                    adaptor.addChild(root_0, arithmeticexpression131.getTree());

                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:168:26: ( EQUALITY ^| NONEQUALITY ^| COMPARISON ^)
                    int alt34=3;
                    switch ( input.LA(1) ) {
                    case EQUALITY:
                        {
                        alt34=1;
                        }
                        break;
                    case NONEQUALITY:
                        {
                        alt34=2;
                        }
                        break;
                    case COMPARISON:
                        {
                        alt34=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;

                    }

                    switch (alt34) {
                        case 1 :
                            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:168:27: EQUALITY ^
                            {
                            EQUALITY132=(Token)match(input,EQUALITY,FOLLOW_EQUALITY_in_booleanexpression994); 
                            EQUALITY132_tree = 
                            (CommonTree)adaptor.create(EQUALITY132)
                            ;
                            root_0 = (CommonTree)adaptor.becomeRoot(EQUALITY132_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:168:39: NONEQUALITY ^
                            {
                            NONEQUALITY133=(Token)match(input,NONEQUALITY,FOLLOW_NONEQUALITY_in_booleanexpression999); 
                            NONEQUALITY133_tree = 
                            (CommonTree)adaptor.create(NONEQUALITY133)
                            ;
                            root_0 = (CommonTree)adaptor.becomeRoot(NONEQUALITY133_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:168:54: COMPARISON ^
                            {
                            COMPARISON134=(Token)match(input,COMPARISON,FOLLOW_COMPARISON_in_booleanexpression1004); 
                            COMPARISON134_tree = 
                            (CommonTree)adaptor.create(COMPARISON134)
                            ;
                            root_0 = (CommonTree)adaptor.becomeRoot(COMPARISON134_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_arithmeticexpression_in_booleanexpression1008);
                    arithmeticexpression135=arithmeticexpression();

                    state._fsp--;

                    adaptor.addChild(root_0, arithmeticexpression135.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "booleanexpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_MODULE_in_module92 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_module94 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SEMI_in_module96 = new BitSet(new long[]{0x0010080004001020L});
    public static final BitSet FOLLOW_declaration_in_module99 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_SEMI_in_module102 = new BitSet(new long[]{0x0010080004001000L});
    public static final BitSet FOLLOW_declaration_in_module104 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_BEGIN_in_module110 = new BitSet(new long[]{0x0020110060400020L});
    public static final BitSet FOLLOW_statement_in_module113 = new BitSet(new long[]{0x0000200000400000L});
    public static final BitSet FOLLOW_SEMI_in_module116 = new BitSet(new long[]{0x0020110060000020L});
    public static final BitSet FOLLOW_statement_in_module118 = new BitSet(new long[]{0x0000200000400000L});
    public static final BitSet FOLLOW_END_in_module124 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SEMI_in_module126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_module128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constantdeclaration_in_declaration163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variabledeclaration_in_declaration169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functiondeclaration_in_declaration176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_proceduredeclaration_in_declaration183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_constantdeclaration199 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_constantdeclaration201 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_in_constantdeclaration203 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_TYPE_in_constantdeclaration205 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DEFINEDAS_in_constantdeclaration207 = new BitSet(new long[]{0x0001008022002010L});
    public static final BitSet FOLLOW_expression_in_constantdeclaration209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_variabledeclaration240 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variabledeclaration242 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_COMMA_in_variabledeclaration245 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variabledeclaration247 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_COLON_in_variabledeclaration251 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_TYPE_in_variabledeclaration253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functiondeclaration281 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_functiondeclaration283 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_parameterlist_in_functiondeclaration285 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_in_functiondeclaration287 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_TYPE_in_functiondeclaration289 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DEFINEDAS_in_functiondeclaration291 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_variabledeclaration_in_functiondeclaration297 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_SEMI_in_functiondeclaration300 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_variabledeclaration_in_functiondeclaration302 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_BEGIN_in_functiondeclaration308 = new BitSet(new long[]{0x0020110060400020L});
    public static final BitSet FOLLOW_statement_in_functiondeclaration311 = new BitSet(new long[]{0x0000200000400000L});
    public static final BitSet FOLLOW_SEMI_in_functiondeclaration314 = new BitSet(new long[]{0x0020110060000020L});
    public static final BitSet FOLLOW_statement_in_functiondeclaration316 = new BitSet(new long[]{0x0000200000400000L});
    public static final BitSet FOLLOW_END_in_functiondeclaration322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_proceduredeclaration366 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_proceduredeclaration368 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_parameterlist_in_proceduredeclaration370 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DEFINEDAS_in_proceduredeclaration372 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_variabledeclaration_in_proceduredeclaration378 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_SEMI_in_proceduredeclaration381 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_variabledeclaration_in_proceduredeclaration383 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_BEGIN_in_proceduredeclaration389 = new BitSet(new long[]{0x0020110060400020L});
    public static final BitSet FOLLOW_statement_in_proceduredeclaration392 = new BitSet(new long[]{0x0000200000400000L});
    public static final BitSet FOLLOW_SEMI_in_proceduredeclaration395 = new BitSet(new long[]{0x0020110060000020L});
    public static final BitSet FOLLOW_statement_in_proceduredeclaration397 = new BitSet(new long[]{0x0000200000400000L});
    public static final BitSet FOLLOW_END_in_proceduredeclaration403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENINGPARENTHESIS_in_parameterlist445 = new BitSet(new long[]{0x0000000020000080L});
    public static final BitSet FOLLOW_parameters_in_parameterlist448 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_COMMA_in_parameterlist451 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_parameters_in_parameterlist453 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_CLOSINGPARENTHESIS_in_parameterlist459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parameters482 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_COMMA_in_parameters485 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parameters487 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_COLON_in_parameters491 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_TYPE_in_parameters493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_output_in_statement523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_in_statement529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loop_in_statement535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedurecall_in_statement541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_statement547 = new BitSet(new long[]{0x0020310060400020L});
    public static final BitSet FOLLOW_statement_in_statement549 = new BitSet(new long[]{0x0000200000400000L});
    public static final BitSet FOLLOW_SEMI_in_statement553 = new BitSet(new long[]{0x0020110060000020L});
    public static final BitSet FOLLOW_statement_in_statement555 = new BitSet(new long[]{0x0000200000400000L});
    public static final BitSet FOLLOW_END_in_statement559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_assignment582 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DEFINEDAS_in_assignment584 = new BitSet(new long[]{0x0001008022002010L});
    public static final BitSet FOLLOW_expression_in_assignment587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OUTPUT_in_output601 = new BitSet(new long[]{0x0000800020000000L});
    public static final BitSet FOLLOW_set_in_output604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_conditional624 = new BitSet(new long[]{0x0001008022002010L});
    public static final BitSet FOLLOW_expression_in_conditional627 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_THEN_in_conditional629 = new BitSet(new long[]{0x0020110060000020L});
    public static final BitSet FOLLOW_statement_in_conditional632 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ELSE_in_conditional648 = new BitSet(new long[]{0x0020110060000020L});
    public static final BitSet FOLLOW_statement_in_conditional651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileloop_in_loop667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repeatloop_in_loop673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileloop687 = new BitSet(new long[]{0x0001008022002010L});
    public static final BitSet FOLLOW_expression_in_whileloop690 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_DO_in_whileloop692 = new BitSet(new long[]{0x0020110060000020L});
    public static final BitSet FOLLOW_statement_in_whileloop695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPEAT_in_repeatloop707 = new BitSet(new long[]{0x0020110060000020L});
    public static final BitSet FOLLOW_statement_in_repeatloop710 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_UNTIL_in_repeatloop712 = new BitSet(new long[]{0x0001008022002010L});
    public static final BitSet FOLLOW_expression_in_repeatloop715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_procedurecall729 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_OPENINGPARENTHESIS_in_procedurecall731 = new BitSet(new long[]{0x0001008022002090L});
    public static final BitSet FOLLOW_expression_in_procedurecall734 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_COMMA_in_procedurecall737 = new BitSet(new long[]{0x0001008022002010L});
    public static final BitSet FOLLOW_expression_in_procedurecall739 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_CLOSINGPARENTHESIS_in_procedurecall745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arithmeticexpression_in_expression775 = new BitSet(new long[]{0x0000004000800802L});
    public static final BitSet FOLLOW_EQUALITY_in_expression779 = new BitSet(new long[]{0x0001008022002010L});
    public static final BitSet FOLLOW_NONEQUALITY_in_expression784 = new BitSet(new long[]{0x0001008022002010L});
    public static final BitSet FOLLOW_COMPARISON_in_expression789 = new BitSet(new long[]{0x0001008022002010L});
    public static final BitSet FOLLOW_arithmeticexpression_in_expression793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicationexpression_in_arithmeticexpression807 = new BitSet(new long[]{0x0001000000000012L});
    public static final BitSet FOLLOW_ADDITION_in_arithmeticexpression814 = new BitSet(new long[]{0x0001008022002010L});
    public static final BitSet FOLLOW_SUBTRACTION_in_arithmeticexpression819 = new BitSet(new long[]{0x0001008022002010L});
    public static final BitSet FOLLOW_multiplicationexpression_in_arithmeticexpression823 = new BitSet(new long[]{0x0001000000000012L});
    public static final BitSet FOLLOW_negationexpression_in_multiplicationexpression837 = new BitSet(new long[]{0x0000001000040002L});
    public static final BitSet FOLLOW_MULTIPLICATION_in_multiplicationexpression841 = new BitSet(new long[]{0x0001008022002010L});
    public static final BitSet FOLLOW_negationexpression_in_multiplicationexpression844 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_DIVISION_in_multiplicationexpression851 = new BitSet(new long[]{0x0001008022002010L});
    public static final BitSet FOLLOW_negationexpression_in_multiplicationexpression854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBTRACTION_in_negationexpression872 = new BitSet(new long[]{0x0000008022002000L});
    public static final BitSet FOLLOW_atom_in_negationexpression874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADDITION_in_negationexpression891 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_COUNT_in_negationexpression894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_negationexpression898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_negationexpression921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_atom938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_atom944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_atom950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedurecall_in_atom957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENINGPARENTHESIS_in_atom963 = new BitSet(new long[]{0x0001008022002010L});
    public static final BitSet FOLLOW_arithmeticexpression_in_atom966 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CLOSINGPARENTHESIS_in_atom968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_booleanexpression984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arithmeticexpression_in_booleanexpression991 = new BitSet(new long[]{0x0000004000800800L});
    public static final BitSet FOLLOW_EQUALITY_in_booleanexpression994 = new BitSet(new long[]{0x0001008022002010L});
    public static final BitSet FOLLOW_NONEQUALITY_in_booleanexpression999 = new BitSet(new long[]{0x0001008022002010L});
    public static final BitSet FOLLOW_COMPARISON_in_booleanexpression1004 = new BitSet(new long[]{0x0001008022002010L});
    public static final BitSet FOLLOW_arithmeticexpression_in_booleanexpression1008 = new BitSet(new long[]{0x0000000000000002L});

}