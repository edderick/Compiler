// $ANTLR 3.4 C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g 2012-04-26 15:29:25


import java.util.HashMap;
import java.util.Map;

import java.util.HashSet;
import java.util.Set;



import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class NiklausChecker extends TreeParser {
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
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public NiklausChecker(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public NiklausChecker(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return NiklausChecker.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g"; }


      public Error err = new Error(System.err);

      public void error(int line, int chr, String msg){
       err.error(line, chr, msg);
       Niklaus.fail = true; 
      }
        
      public static final boolean DEBUG = false;
      
      private enum Type { 
        COUNT, TRUTH, FLOAT 
      } 

      private String moduleName;
      private String functionName;
      
      public void setModuleName(String name){
        moduleName = name;   
      } 
      
      public void setFunctionName(String name){
        functionName = name;
      }

      private Set<String> procedures = new HashSet<String>();
      private Map<String, Type> functions = new HashMap<String, Type>();
      private Map<String, Type> globalVariables = new HashMap<String, Type>();
      private Map<String, Type> constants = new HashMap<String, Type>();
      private Map<String, Type> localVariables = new HashMap<String, Type>();
      private Map<String, Type> parameters = new HashMap<String, Type>();
      private Map<String, List<String>> orderedParameters = new HashMap<String, List<String>>();

      public void declareProcedure(String identifier){
        procedures.add(identifier);
      }

      public void declareFunction(String identifier, Type type){
        functions.put(identifier,type);
      } 

      public void declareGlobalVariable(String identifier, Type type){
        globalVariables.put(identifier,type);
      }

      public void declareConstant(String identifier, Type type){
        constants.put(identifier, type);
      } 

      public void declareLocalVariable(String identifier, Type type){
        localVariables.put(functionName + identifier, type);
      } 

      public void declareParameter(String identifier, Type type){
        parameters.put(functionName + identifier, type);
        if(!orderedParameters.containsKey(functionName)){
          orderedParameters.put(functionName, new ArrayList<String>());
        }
        orderedParameters.get(functionName).add(identifier);
        
      }

      public boolean isDeclaredGlobally(String identifier){
        if( (!identifier.equals(moduleName))
            && (!procedures.contains(identifier))
            && (!functions.containsKey(identifier))
            && (!globalVariables.containsKey(identifier))
            && (!constants.containsKey(identifier))){
          return false;
        }
        else return true;
      }
      
      public boolean isDeclaredLocally(String identifier){
        if( (!localVariables.containsKey(functionName + identifier))
            && (!parameters.containsKey(functionName + identifier))){
          return false;
        }
        else return true;
      }

      public Type getFunctionType(String identifier){
        return functions.get(identifier);
      }
      
      public Type getGlobalVariableType(String identifier){
        return globalVariables.get(identifier);
      }
      
      public Type getConstantType(String identifier){
        return constants.get(identifier);
      }
      
      public Type getLocalVariableType(String identifier){
        return localVariables.get(functionName + identifier);
      }
      
      public Type getParameterType(String functionName, String identifier){
        return parameters.get(functionName + identifier);
      }
      
      public Type getParameterType(String functionName, int number){
        if (orderedParameters.get(functionName) != null)
        return getParameterType(functionName, orderedParameters.get(functionName).get(number));
        else return null;
      }
      
      public int getNumberOfParameters(String functionName){
        if (orderedParameters.get(functionName) != null)
          return orderedParameters.get(functionName).size();
          else return 0;
      }
      
      public Type getType(String identifier){
        if (parameters.containsKey(functionName + identifier)) return parameters.get(functionName +  identifier);
        if (localVariables.containsKey(functionName + identifier)) return localVariables.get(functionName + identifier);
        if (moduleName == identifier) return null;
        if (procedures.contains(identifier)) return null;
        if (functions.containsKey(identifier)) return functions.get(identifier);
        if (globalVariables.containsKey(identifier)) return globalVariables.get(identifier);
        if (constants.containsKey(identifier)) return constants.get(identifier);
        if (functionName == identifier) return null;
        return null;
      }
      
      public Type stringToType(String string){
        if(string.equals("TRUTH")) return Type.TRUTH;
        else if(string.equals("COUNT")) return Type.COUNT;
        else if(string.equals("FLOAT")) return Type.FLOAT;
        else return null;
      }
      
      public boolean isVariable(String identifier){
        if (globalVariables.containsKey(identifier)) return true;
        if (localVariables.containsKey(functionName + identifier)) return true;
        if (parameters.containsKey(functionName + identifier)) return true;
        return false;
      }
      
      public boolean isFunction(String identifier){
        if (functions.containsKey(identifier)) return true;
        else return false;
      }
      
      public boolean isProcedure(String identifier){
        if (procedures.contains(identifier)) return true;
        else return false;
      }
      
      public String getFunctionName(){
        return functionName;
      }



    // $ANTLR start "module"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:173:1: module : ^( MODULE id= IDENTIFIER declarations body ) ;
    public final void module() throws RecognitionException {
        CommonTree id=null;

        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:173:7: ( ^( MODULE id= IDENTIFIER declarations body ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:174:3: ^( MODULE id= IDENTIFIER declarations body )
            {
            match(input,MODULE,FOLLOW_MODULE_in_module58); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_module62); 

            setModuleName(id.getText());

            pushFollow(FOLLOW_declarations_in_module66);
            declarations();

            state._fsp--;


            pushFollow(FOLLOW_body_in_module68);
            body();

            state._fsp--;


            match(input, Token.UP, null); 


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "module"



    // $ANTLR start "declarations"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:177:1: declarations : ^( DECLARATIONS ( declaration )* ) ;
    public final void declarations() throws RecognitionException {
        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:177:13: ( ^( DECLARATIONS ( declaration )* ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:178:3: ^( DECLARATIONS ( declaration )* )
            {
            match(input,DECLARATIONS,FOLLOW_DECLARATIONS_in_declarations84); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:178:18: ( declaration )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==CONST||LA1_0==FUNCTION||LA1_0==VAR) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:178:18: declaration
                	    {
                	    pushFollow(FOLLOW_declaration_in_declarations86);
                	    declaration();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "declarations"



    // $ANTLR start "body"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:181:1: body : ^( BODY ( statement )* ) ;
    public final void body() throws RecognitionException {
        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:181:5: ( ^( BODY ( statement )* ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:182:3: ^( BODY ( statement )* )
            {
            match(input,BODY,FOLLOW_BODY_in_body99); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:182:8: ( statement )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==BODY||LA2_0==DEFINEDAS||(LA2_0 >= IDENTIFIER && LA2_0 <= IF)||LA2_0==OUTPUT||LA2_0==REPEAT||LA2_0==WHILE) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:182:8: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_body101);
                	    statement();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop2;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "body"



    // $ANTLR start "declaration"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:185:1: declaration : ( constantdeclaration | globalvariabledeclaration | functiondeclaration | proceduredeclaration );
    public final void declaration() throws RecognitionException {
        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:185:12: ( constantdeclaration | globalvariabledeclaration | functiondeclaration | proceduredeclaration )
            int alt3=4;
            switch ( input.LA(1) ) {
            case CONST:
                {
                alt3=1;
                }
                break;
            case VAR:
                {
                alt3=2;
                }
                break;
            case FUNCTION:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==DOWN) ) {
                    int LA3_4 = input.LA(3);

                    if ( (LA3_4==IDENTIFIER) ) {
                        int LA3_5 = input.LA(4);

                        if ( (LA3_5==TYPE) ) {
                            alt3=3;
                        }
                        else if ( (LA3_5==PARAM) ) {
                            alt3=4;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 5, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 4, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:186:3: constantdeclaration
                    {
                    pushFollow(FOLLOW_constantdeclaration_in_declaration117);
                    constantdeclaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:187:5: globalvariabledeclaration
                    {
                    pushFollow(FOLLOW_globalvariabledeclaration_in_declaration123);
                    globalvariabledeclaration();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:188:5: functiondeclaration
                    {
                    pushFollow(FOLLOW_functiondeclaration_in_declaration130);
                    functiondeclaration();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:189:5: proceduredeclaration
                    {
                    pushFollow(FOLLOW_proceduredeclaration_in_declaration137);
                    proceduredeclaration();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "declaration"



    // $ANTLR start "constantdeclaration"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:192:1: constantdeclaration : ^( CONST ^(t= TYPE id= IDENTIFIER e= expression ) ) ;
    public final void constantdeclaration() throws RecognitionException {
        CommonTree t=null;
        CommonTree id=null;
        NiklausChecker.expression_return e =null;


        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:192:20: ( ^( CONST ^(t= TYPE id= IDENTIFIER e= expression ) ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:193:3: ^( CONST ^(t= TYPE id= IDENTIFIER e= expression ) )
            {
            match(input,CONST,FOLLOW_CONST_in_constantdeclaration152); 

            match(input, Token.DOWN, null); 
            t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_constantdeclaration157); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constantdeclaration161); 

            pushFollow(FOLLOW_expression_in_constantdeclaration165);
            e=expression();

            state._fsp--;


            match(input, Token.UP, null); 


            match(input, Token.UP, null); 


            Type type = stringToType(t.getText()); 
                                                             if(!isDeclaredGlobally(id.getText())){
                                                                 declareConstant(id.getText(), type);
                                                                 if(type == e.type){ 
                                                                     if(DEBUG) System.out.println("Constant declared"); 
                                                                 }
                                                                 else{
                                                                     if(DEBUG) System.out.println("Type Mismatch!");
                                                                     error(e.lineNumber, e.charPosition, "Type mismatch");
                                                                 }
                                                             }
                                                             else{ 
                                                                 if(DEBUG) System.out.println("Identifier in use!");
                                                                  error(id.getLine(), id.getCharPositionInLine(), "Identifier in use");
                                                             }
                                                             //System.out.println(id.getCharPositionInLine() + ", " +  id.getLine());
                                                           

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "constantdeclaration"



    // $ANTLR start "globalvariabledeclaration"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:212:1: globalvariabledeclaration : ^( VAR ( individualglobalvariabledeclaration )+ ) ;
    public final void globalvariabledeclaration() throws RecognitionException {
        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:212:26: ( ^( VAR ( individualglobalvariabledeclaration )+ ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:213:3: ^( VAR ( individualglobalvariabledeclaration )+ )
            {
            match(input,VAR,FOLLOW_VAR_in_globalvariabledeclaration184); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:213:9: ( individualglobalvariabledeclaration )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==TYPE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:213:9: individualglobalvariabledeclaration
            	    {
            	    pushFollow(FOLLOW_individualglobalvariabledeclaration_in_globalvariabledeclaration186);
            	    individualglobalvariabledeclaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            match(input, Token.UP, null); 


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "globalvariabledeclaration"



    // $ANTLR start "individualglobalvariabledeclaration"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:216:1: individualglobalvariabledeclaration : ^(t= TYPE id= IDENTIFIER ) ;
    public final void individualglobalvariabledeclaration() throws RecognitionException {
        CommonTree t=null;
        CommonTree id=null;

        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:216:36: ( ^(t= TYPE id= IDENTIFIER ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:217:3: ^(t= TYPE id= IDENTIFIER )
            {
            t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_individualglobalvariabledeclaration205); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_individualglobalvariabledeclaration209); 

            match(input, Token.UP, null); 


            Type type = stringToType(t.getText()); 
                                       if(!isDeclaredGlobally(id.getText())){
                                           declareGlobalVariable(id.getText(), type);
                                           if(DEBUG) System.out.println("Global Variable declared");
                                       }
                                       else{ 
                                           if(DEBUG) System.out.println("Identifier in use!");
                                           error(id.getLine(), id.getCharPositionInLine(), "Identifier in use");
                                       }
                                       

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "individualglobalvariabledeclaration"



    // $ANTLR start "localvariabledeclaration"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:229:1: localvariabledeclaration : ^( VAR ( individuallocalvariabledeclaration )+ ) ;
    public final void localvariabledeclaration() throws RecognitionException {
        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:229:25: ( ^( VAR ( individuallocalvariabledeclaration )+ ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:230:3: ^( VAR ( individuallocalvariabledeclaration )+ )
            {
            match(input,VAR,FOLLOW_VAR_in_localvariabledeclaration227); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:230:9: ( individuallocalvariabledeclaration )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==TYPE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:230:9: individuallocalvariabledeclaration
            	    {
            	    pushFollow(FOLLOW_individuallocalvariabledeclaration_in_localvariabledeclaration229);
            	    individuallocalvariabledeclaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            match(input, Token.UP, null); 


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "localvariabledeclaration"



    // $ANTLR start "individuallocalvariabledeclaration"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:233:1: individuallocalvariabledeclaration : ^(t= TYPE id= IDENTIFIER ) ;
    public final void individuallocalvariabledeclaration() throws RecognitionException {
        CommonTree t=null;
        CommonTree id=null;

        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:233:35: ( ^(t= TYPE id= IDENTIFIER ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:234:4: ^(t= TYPE id= IDENTIFIER )
            {
            t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_individuallocalvariabledeclaration249); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_individuallocalvariabledeclaration253); 

            match(input, Token.UP, null); 


            Type type = stringToType(t.getText()); 
                                        if(!isDeclaredLocally(id.getText())){
                                            declareLocalVariable(id.getText(), type);
                                            if(DEBUG) System.out.println("Local Variable declared");
                                        }
                                        else{ 
                                            if(DEBUG) System.out.println("Identifier in use!");
                                            error(id.getLine(), id.getCharPositionInLine(), "Identifier in use");
                                        }
                                       

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "individuallocalvariabledeclaration"



    // $ANTLR start "functiondeclaration"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:246:1: functiondeclaration : ^( FUNCTION id= IDENTIFIER t= TYPE parameterlist ^( DECLARATIONS ( localvariabledeclaration )* ) ^( BODY ( statement )* ) ) ;
    public final void functiondeclaration() throws RecognitionException {
        CommonTree id=null;
        CommonTree t=null;

        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:246:20: ( ^( FUNCTION id= IDENTIFIER t= TYPE parameterlist ^( DECLARATIONS ( localvariabledeclaration )* ) ^( BODY ( statement )* ) ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:247:3: ^( FUNCTION id= IDENTIFIER t= TYPE parameterlist ^( DECLARATIONS ( localvariabledeclaration )* ) ^( BODY ( statement )* ) )
            {
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functiondeclaration271); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_functiondeclaration275); 

            t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_functiondeclaration279); 

            Type type = stringToType(t.getText());
                                               if(!isDeclaredGlobally(id.getText())){
                                                   setFunctionName(id.getText());
                                                   declareFunction(id.getText(), type);
                                                   declareLocalVariable(id.getText(), type);
                                                   if(DEBUG) System.out.println("Function declared");
                                               }
                                               else{ 
                                                   if(DEBUG) System.out.println("Identifier In Use!");
                                                   error(id.getLine(), id.getCharPositionInLine(), "Identifier in use");
                                               }
                                              

            pushFollow(FOLLOW_parameterlist_in_functiondeclaration285);
            parameterlist();

            state._fsp--;


            match(input,DECLARATIONS,FOLLOW_DECLARATIONS_in_functiondeclaration288); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:259:32: ( localvariabledeclaration )*
                loop6:
                do {
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==VAR) ) {
                        alt6=1;
                    }


                    switch (alt6) {
                	case 1 :
                	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:259:32: localvariabledeclaration
                	    {
                	    pushFollow(FOLLOW_localvariabledeclaration_in_functiondeclaration290);
                	    localvariabledeclaration();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop6;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            match(input,BODY,FOLLOW_BODY_in_functiondeclaration295); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:259:66: ( statement )*
                loop7:
                do {
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==BODY||LA7_0==DEFINEDAS||(LA7_0 >= IDENTIFIER && LA7_0 <= IF)||LA7_0==OUTPUT||LA7_0==REPEAT||LA7_0==WHILE) ) {
                        alt7=1;
                    }


                    switch (alt7) {
                	case 1 :
                	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:259:66: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_functiondeclaration297);
                	    statement();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop7;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            match(input, Token.UP, null); 


            setFunctionName("null");

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "functiondeclaration"



    // $ANTLR start "proceduredeclaration"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:262:1: proceduredeclaration : ^( FUNCTION id= IDENTIFIER parameterlist ^( DECLARATIONS ( localvariabledeclaration )* ) ^( BODY ( statement )* ) ) ;
    public final void proceduredeclaration() throws RecognitionException {
        CommonTree id=null;

        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:262:21: ( ^( FUNCTION id= IDENTIFIER parameterlist ^( DECLARATIONS ( localvariabledeclaration )* ) ^( BODY ( statement )* ) ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:263:3: ^( FUNCTION id= IDENTIFIER parameterlist ^( DECLARATIONS ( localvariabledeclaration )* ) ^( BODY ( statement )* ) )
            {
            match(input,FUNCTION,FOLLOW_FUNCTION_in_proceduredeclaration317); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_proceduredeclaration321); 

            if(!isDeclaredGlobally(id.getText())){
                                             setFunctionName(id.getText());
                                             declareProcedure(id.getText());
                                             if(DEBUG) System.out.println("Procedure declared");
                                        }
                                        else{ 
                                            if(DEBUG) System.out.println("Identifier In Use!");
                                            error(id.getLine(), id.getCharPositionInLine(), "Identifier in use");
                                        }
                                       

            pushFollow(FOLLOW_parameterlist_in_proceduredeclaration327);
            parameterlist();

            state._fsp--;


            match(input,DECLARATIONS,FOLLOW_DECLARATIONS_in_proceduredeclaration330); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:273:32: ( localvariabledeclaration )*
                loop8:
                do {
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==VAR) ) {
                        alt8=1;
                    }


                    switch (alt8) {
                	case 1 :
                	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:273:32: localvariabledeclaration
                	    {
                	    pushFollow(FOLLOW_localvariabledeclaration_in_proceduredeclaration332);
                	    localvariabledeclaration();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop8;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            match(input,BODY,FOLLOW_BODY_in_proceduredeclaration337); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:273:66: ( statement )*
                loop9:
                do {
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==BODY||LA9_0==DEFINEDAS||(LA9_0 >= IDENTIFIER && LA9_0 <= IF)||LA9_0==OUTPUT||LA9_0==REPEAT||LA9_0==WHILE) ) {
                        alt9=1;
                    }


                    switch (alt9) {
                	case 1 :
                	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:273:66: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_proceduredeclaration339);
                	    statement();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop9;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            match(input, Token.UP, null); 


            setFunctionName("null");

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "proceduredeclaration"



    // $ANTLR start "parameterlist"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:276:1: parameterlist : ^( PARAM ( parameters )* ) ;
    public final void parameterlist() throws RecognitionException {
        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:276:14: ( ^( PARAM ( parameters )* ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:277:3: ^( PARAM ( parameters )* )
            {
            match(input,PARAM,FOLLOW_PARAM_in_parameterlist359); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:277:11: ( parameters )*
                loop10:
                do {
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==TYPE) ) {
                        alt10=1;
                    }


                    switch (alt10) {
                	case 1 :
                	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:277:11: parameters
                	    {
                	    pushFollow(FOLLOW_parameters_in_parameterlist361);
                	    parameters();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop10;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "parameterlist"



    // $ANTLR start "parameters"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:280:1: parameters : ^(t= TYPE id= IDENTIFIER ) ;
    public final void parameters() throws RecognitionException {
        CommonTree t=null;
        CommonTree id=null;

        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:280:11: ( ^(t= TYPE id= IDENTIFIER ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:281:2: ^(t= TYPE id= IDENTIFIER )
            {
            t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_parameters377); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameters381); 

            match(input, Token.UP, null); 


            Type type = stringToType(t.getText()); 
                                        if(!isDeclaredLocally(id.getText())){
                                            declareParameter(id.getText(), type);
                                            if(DEBUG) System.out.println("Parameter declared");
                                        }
                                        else{ 
                                            if(DEBUG) System.out.println("Identifier in use!");
                                            error(id.getLine(), id.getCharPositionInLine(), "Identifier in use");
                                        }
                               

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "parameters"



    // $ANTLR start "statement"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:293:1: statement : ( assignment | output | conditional | loop |p= procedurecall | ^( BODY ( statement )* ) );
    public final void statement() throws RecognitionException {
        NiklausChecker.procedurecall_return p =null;


        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:293:10: ( assignment | output | conditional | loop |p= procedurecall | ^( BODY ( statement )* ) )
            int alt12=6;
            switch ( input.LA(1) ) {
            case DEFINEDAS:
                {
                alt12=1;
                }
                break;
            case OUTPUT:
                {
                alt12=2;
                }
                break;
            case IF:
                {
                alt12=3;
                }
                break;
            case REPEAT:
            case WHILE:
                {
                alt12=4;
                }
                break;
            case IDENTIFIER:
                {
                alt12=5;
                }
                break;
            case BODY:
                {
                alt12=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:294:3: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement396);
                    assignment();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:295:5: output
                    {
                    pushFollow(FOLLOW_output_in_statement402);
                    output();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:296:5: conditional
                    {
                    pushFollow(FOLLOW_conditional_in_statement408);
                    conditional();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:297:5: loop
                    {
                    pushFollow(FOLLOW_loop_in_statement414);
                    loop();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:298:5: p= procedurecall
                    {
                    pushFollow(FOLLOW_procedurecall_in_statement422);
                    p=procedurecall();

                    state._fsp--;


                    if (p.type != null) error(p.lineNumber, p.charPosition, "Functions may only be called inside expressions");

                    }
                    break;
                case 6 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:299:5: ^( BODY ( statement )* )
                    {
                    match(input,BODY,FOLLOW_BODY_in_statement431); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:299:12: ( statement )*
                        loop11:
                        do {
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( (LA11_0==BODY||LA11_0==DEFINEDAS||(LA11_0 >= IDENTIFIER && LA11_0 <= IF)||LA11_0==OUTPUT||LA11_0==REPEAT||LA11_0==WHILE) ) {
                                alt11=1;
                            }


                            switch (alt11) {
                        	case 1 :
                        	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:299:12: statement
                        	    {
                        	    pushFollow(FOLLOW_statement_in_statement433);
                        	    statement();

                        	    state._fsp--;


                        	    }
                        	    break;

                        	default :
                        	    break loop11;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "statement"



    // $ANTLR start "assignment"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:302:1: assignment : ^( DEFINEDAS id= IDENTIFIER e= expression ) ;
    public final void assignment() throws RecognitionException {
        CommonTree id=null;
        NiklausChecker.expression_return e =null;


        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:302:11: ( ^( DEFINEDAS id= IDENTIFIER e= expression ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:303:3: ^( DEFINEDAS id= IDENTIFIER e= expression )
            {
            match(input,DEFINEDAS,FOLLOW_DEFINEDAS_in_assignment450); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignment454); 

            pushFollow(FOLLOW_expression_in_assignment458);
            e=expression();

            state._fsp--;


            match(input, Token.UP, null); 


            if(((isDeclaredGlobally(id.getText())) && !isFunction(getFunctionName())) || (isDeclaredLocally(id.getText()))){
                                                          if(isVariable(id.getText())){
                                                              if (getType(id.getText()) == e.type){ 
                                                                  if(DEBUG) System.out.println("Assigned"); 
                                                              }
                                                              else{ 
                                                                  if(DEBUG) System.out.println("Incompatible type!"); 
                                                                  error(e.lineNumber, e.charPosition, "Incompatible types");
                                                              }
                                                          }
                                                          else{ 
                                                              if(DEBUG) System.out.println("Not a variable!");
                                                              error(id.getLine(), id.getCharPositionInLine(), "Values cannot be assigned to this identifier");
                                                          }
                                                      }
                                                      else{ 
                                                          if(DEBUG) System.out.println("Unknown identifier!");
                                                          error(id.getLine(), id.getCharPositionInLine(), "Identifier has not been declared");
                                                      }
                                                     

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "assignment"



    // $ANTLR start "output"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:325:1: output : ^( OUTPUT ( STRINGLITERAL |id= IDENTIFIER ) ) ;
    public final void output() throws RecognitionException {
        CommonTree id=null;

        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:325:7: ( ^( OUTPUT ( STRINGLITERAL |id= IDENTIFIER ) ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:326:3: ^( OUTPUT ( STRINGLITERAL |id= IDENTIFIER ) )
            {
            match(input,OUTPUT,FOLLOW_OUTPUT_in_output475); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:326:12: ( STRINGLITERAL |id= IDENTIFIER )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==STRINGLITERAL) ) {
                alt13=1;
            }
            else if ( (LA13_0==IDENTIFIER) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:326:13: STRINGLITERAL
                    {
                    match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_output478); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:326:29: id= IDENTIFIER
                    {
                    id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_output485); 


                                      Type type;
                                      if(isDeclaredLocally(id.getText()) && getFunctionName() != null){
                                          type = getType(id.getText()); 
                                          if(type != null) if(DEBUG) System.out.println("Local Variable ok");
                                       }
                                       else if(!(isFunction(getFunctionName()) && isVariable(id.getText())) && isDeclaredGlobally(id.getText()) && !(isFunction(id.getText()) || isProcedure(id.getText()))){
                                            type = getType(id.getText()); 
                                            if(type != null) if(DEBUG) System.out.println("Global Variable ok");
                                       }
                                       else{ 
                                           if(DEBUG) System.out.println("Variable is not defined in this scope!");
                                           error(id.getLine(), id.getCharPositionInLine(), "Variable not defined in scope");
                                       }
                                      

                    }
                    break;

            }


            match(input, Token.UP, null); 


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "output"



    // $ANTLR start "conditional"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:343:1: conditional : ^( IF e= expression statement ( statement )? ) ;
    public final void conditional() throws RecognitionException {
        NiklausChecker.expression_return e =null;


        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:343:12: ( ^( IF e= expression statement ( statement )? ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:344:3: ^( IF e= expression statement ( statement )? )
            {
            match(input,IF,FOLLOW_IF_in_conditional505); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_conditional509);
            e=expression();

            state._fsp--;


            if (e.type != Type.TRUTH)  error(e.lineNumber, e.charPosition, "Variable not of type: TRUTH");

            pushFollow(FOLLOW_statement_in_conditional513);
            statement();

            state._fsp--;


            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:344:128: ( statement )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==BODY||LA14_0==DEFINEDAS||(LA14_0 >= IDENTIFIER && LA14_0 <= IF)||LA14_0==OUTPUT||LA14_0==REPEAT||LA14_0==WHILE) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:344:128: statement
                    {
                    pushFollow(FOLLOW_statement_in_conditional515);
                    statement();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "conditional"



    // $ANTLR start "loop"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:347:1: loop : ( whileloop | repeatloop );
    public final void loop() throws RecognitionException {
        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:347:5: ( whileloop | repeatloop )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==WHILE) ) {
                alt15=1;
            }
            else if ( (LA15_0==REPEAT) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:348:3: whileloop
                    {
                    pushFollow(FOLLOW_whileloop_in_loop531);
                    whileloop();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:349:5: repeatloop
                    {
                    pushFollow(FOLLOW_repeatloop_in_loop537);
                    repeatloop();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "loop"



    // $ANTLR start "whileloop"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:352:1: whileloop : ^( WHILE (e= expression ) statement ) ;
    public final void whileloop() throws RecognitionException {
        NiklausChecker.expression_return e =null;


        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:352:10: ( ^( WHILE (e= expression ) statement ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:353:3: ^( WHILE (e= expression ) statement )
            {
            match(input,WHILE,FOLLOW_WHILE_in_whileloop552); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:353:11: (e= expression )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:353:12: e= expression
            {
            pushFollow(FOLLOW_expression_in_whileloop557);
            e=expression();

            state._fsp--;


            }


            if (e.type != Type.TRUTH)  error(e.lineNumber, e.charPosition, "Variable not of type: TRUTH");

            pushFollow(FOLLOW_statement_in_whileloop562);
            statement();

            state._fsp--;


            match(input, Token.UP, null); 


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "whileloop"



    // $ANTLR start "repeatloop"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:356:1: repeatloop : ^( REPEAT statement (e= expression ) ) ;
    public final void repeatloop() throws RecognitionException {
        NiklausChecker.expression_return e =null;


        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:356:11: ( ^( REPEAT statement (e= expression ) ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:357:3: ^( REPEAT statement (e= expression ) )
            {
            match(input,REPEAT,FOLLOW_REPEAT_in_repeatloop576); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_statement_in_repeatloop578);
            statement();

            state._fsp--;


            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:357:22: (e= expression )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:357:23: e= expression
            {
            pushFollow(FOLLOW_expression_in_repeatloop583);
            e=expression();

            state._fsp--;


            }


            if (e.type != Type.TRUTH)  error(e.lineNumber, e.charPosition, "Variable not of type: TRUTH");

            match(input, Token.UP, null); 


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "repeatloop"


    public static class procedurecall_return extends TreeRuleReturnScope {
        public Type type;
        public int lineNumber;
        public int charPosition;
    };


    // $ANTLR start "procedurecall"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:360:1: procedurecall returns [Type type, int lineNumber, int charPosition] : ^(id= IDENTIFIER ^( PARAM (e= expression )* ) ) ;
    public final NiklausChecker.procedurecall_return procedurecall() throws RecognitionException {
        NiklausChecker.procedurecall_return retval = new NiklausChecker.procedurecall_return();
        retval.start = input.LT(1);


        CommonTree id=null;
        NiklausChecker.expression_return e =null;


        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:360:68: ( ^(id= IDENTIFIER ^( PARAM (e= expression )* ) ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:361:3: ^(id= IDENTIFIER ^( PARAM (e= expression )* ) )
            {
            id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_procedurecall608); 


                               int i = 0;
                               if((!isVariable(id.getText()) || getFunctionName().equals(id.getText()))&& (isFunction(id.getText()) || isProcedure(id.getText()))){
                                  retval.type = getType(id.getText()); 
                                  if(DEBUG) System.out.println("Function Exists");
                               }
                               else { 
                                  if(DEBUG) System.out.println("Function Doesn't exist!");
                                  error(id.getLine(), id.getCharPositionInLine(), "Function has not been declared");
                               }
                              

            match(input, Token.DOWN, null); 
            match(input,PARAM,FOLLOW_PARAM_in_procedurecall617); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:372:12: (e= expression )*
                loop16:
                do {
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==ADDITION||LA16_0==COMPARISON||LA16_0==COUNT||LA16_0==DIVISION||LA16_0==EQUALITY||LA16_0==FLOAT||LA16_0==IDENTIFIER||(LA16_0 >= MULTIPLICATION && LA16_0 <= NONEQUALITY)||LA16_0==SUBTRACTION) ) {
                        alt16=1;
                    }


                    switch (alt16) {
                	case 1 :
                	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:372:13: e= expression
                	    {
                	    pushFollow(FOLLOW_expression_in_procedurecall622);
                	    e=expression();

                	    state._fsp--;


                	    if(isFunction(id.getText()) || isProcedure(id.getText())){
                	                        if(i < getNumberOfParameters(id.getText())){ 
                	                            if(e.type == getParameterType(id.getText(), i)){
                	                                if(DEBUG) System.out.println("Parameter Seems OK"); 
                	                            }
                	                            else{ 
                	                                if(DEBUG) System.out.println("Type mismatch!"); 
                	                                error(e.lineNumber, e.charPosition, "Type mismatch");
                	                            }
                	                        }
                	                        else if(DEBUG) System.out.println("Parameter limit exeeded"); 
                	                      i++;
                	                      }
                	                     

                	    }
                	    break;

                	default :
                	    break loop16;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            match(input, Token.UP, null); 


            if(i == getNumberOfParameters(id.getText())){ 
                                        if(DEBUG) System.out.println("Correct number of Parameters"); 
                                     }
                                     else{ 
                                        if(DEBUG) System.out.println("Incorrect number of Parameters!");
                                        error(id.getLine(), id.getCharPositionInLine(), "Incorrect number of parameters");
                                    }
                                     retval.lineNumber = id.getLine(); 
                                     retval.charPosition = id.getCharPositionInLine();
                                   

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "procedurecall"


    public static class expression_return extends TreeRuleReturnScope {
        public Type type;
        public int lineNumber;
        public int charPosition;
    };


    // $ANTLR start "expression"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:397:1: expression returns [Type type, int lineNumber, int charPosition] : (a= arithmeticexpression | ^( ( EQUALITY | NONEQUALITY | COMPARISON ) a1= arithmeticexpression a2= arithmeticexpression ) );
    public final NiklausChecker.expression_return expression() throws RecognitionException {
        NiklausChecker.expression_return retval = new NiklausChecker.expression_return();
        retval.start = input.LT(1);


        NiklausChecker.arithmeticexpression_return a =null;

        NiklausChecker.arithmeticexpression_return a1 =null;

        NiklausChecker.arithmeticexpression_return a2 =null;


        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:397:65: (a= arithmeticexpression | ^( ( EQUALITY | NONEQUALITY | COMPARISON ) a1= arithmeticexpression a2= arithmeticexpression ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ADDITION||LA17_0==COUNT||LA17_0==DIVISION||LA17_0==FLOAT||LA17_0==IDENTIFIER||(LA17_0 >= MULTIPLICATION && LA17_0 <= NEGATE)||LA17_0==SUBTRACTION) ) {
                alt17=1;
            }
            else if ( (LA17_0==COMPARISON||LA17_0==EQUALITY||LA17_0==NONEQUALITY) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:398:4: a= arithmeticexpression
                    {
                    pushFollow(FOLLOW_arithmeticexpression_in_expression653);
                    a=arithmeticexpression();

                    state._fsp--;


                    retval.type = a.type; retval.lineNumber = a.lineNumber; retval.charPosition = a.charPosition;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:399:6: ^( ( EQUALITY | NONEQUALITY | COMPARISON ) a1= arithmeticexpression a2= arithmeticexpression )
                    {
                    if ( input.LA(1)==COMPARISON||input.LA(1)==EQUALITY||input.LA(1)==NONEQUALITY ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arithmeticexpression_in_expression677);
                    a1=arithmeticexpression();

                    state._fsp--;


                    pushFollow(FOLLOW_arithmeticexpression_in_expression681);
                    a2=arithmeticexpression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    if(a1.type == a2.type){ 
                                                                                                                      if(DEBUG) System.out.println("Boolean expression ok"); 
                                                                                                                  }
                                                                                                                  else {
                                                                                                                      if(DEBUG) System.out.println("Type Mismatch!");
                                                                                                                      error(a1.lineNumber, a1.charPosition, "Types do not match");
                                                                                                                  }
                                                                                                                  retval.type = Type.TRUTH; retval.lineNumber = a1.lineNumber; retval.charPosition = a1.charPosition;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class arithmeticexpression_return extends TreeRuleReturnScope {
        public Type type;
        public int lineNumber;
        public int charPosition;
    };


    // $ANTLR start "arithmeticexpression"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:409:1: arithmeticexpression returns [Type type, int lineNumber, int charPosition] : ( ^( ( ADDITION | SUBTRACTION | MULTIPLICATION | DIVISION ) a1= arithmeticexpression a2= arithmeticexpression ) |c= COUNT |f= FLOAT |id= IDENTIFIER | ^( NEGATE a1= arithmeticexpression ) | ^(a= ADDITION at= atom ) |p= procedurecall );
    public final NiklausChecker.arithmeticexpression_return arithmeticexpression() throws RecognitionException {
        NiklausChecker.arithmeticexpression_return retval = new NiklausChecker.arithmeticexpression_return();
        retval.start = input.LT(1);


        CommonTree c=null;
        CommonTree f=null;
        CommonTree id=null;
        CommonTree a=null;
        NiklausChecker.arithmeticexpression_return a1 =null;

        NiklausChecker.arithmeticexpression_return a2 =null;

        NiklausChecker.atom_return at =null;

        NiklausChecker.procedurecall_return p =null;


        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:409:75: ( ^( ( ADDITION | SUBTRACTION | MULTIPLICATION | DIVISION ) a1= arithmeticexpression a2= arithmeticexpression ) |c= COUNT |f= FLOAT |id= IDENTIFIER | ^( NEGATE a1= arithmeticexpression ) | ^(a= ADDITION at= atom ) |p= procedurecall )
            int alt18=7;
            switch ( input.LA(1) ) {
            case ADDITION:
                {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case ADDITION:
                    case DIVISION:
                    case IDENTIFIER:
                    case MULTIPLICATION:
                    case NEGATE:
                    case SUBTRACTION:
                        {
                        alt18=1;
                        }
                        break;
                    case COUNT:
                        {
                        int LA18_10 = input.LA(4);

                        if ( (LA18_10==ADDITION||LA18_10==COUNT||LA18_10==DIVISION||LA18_10==FLOAT||LA18_10==IDENTIFIER||(LA18_10 >= MULTIPLICATION && LA18_10 <= NEGATE)||LA18_10==SUBTRACTION) ) {
                            alt18=1;
                        }
                        else if ( (LA18_10==UP) ) {
                            alt18=6;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 10, input);

                            throw nvae;

                        }
                        }
                        break;
                    case FLOAT:
                        {
                        int LA18_11 = input.LA(4);

                        if ( (LA18_11==ADDITION||LA18_11==COUNT||LA18_11==DIVISION||LA18_11==FLOAT||LA18_11==IDENTIFIER||(LA18_11 >= MULTIPLICATION && LA18_11 <= NEGATE)||LA18_11==SUBTRACTION) ) {
                            alt18=1;
                        }
                        else if ( (LA18_11==UP) ) {
                            alt18=6;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 11, input);

                            throw nvae;

                        }
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 7, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;

                }
                }
                break;
            case COUNT:
                {
                alt18=2;
                }
                break;
            case FLOAT:
                {
                alt18=3;
                }
                break;
            case IDENTIFIER:
                {
                int LA18_4 = input.LA(2);

                if ( (LA18_4==DOWN) ) {
                    alt18=7;
                }
                else if ( ((LA18_4 >= UP && LA18_4 <= ADDITION)||LA18_4==BODY||LA18_4==COMPARISON||LA18_4==COUNT||LA18_4==DEFINEDAS||LA18_4==DIVISION||LA18_4==EQUALITY||LA18_4==FLOAT||(LA18_4 >= IDENTIFIER && LA18_4 <= IF)||(LA18_4 >= MULTIPLICATION && LA18_4 <= NONEQUALITY)||LA18_4==OUTPUT||LA18_4==REPEAT||LA18_4==SUBTRACTION||LA18_4==WHILE) ) {
                    alt18=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 4, input);

                    throw nvae;

                }
                }
                break;
            case NEGATE:
                {
                alt18=5;
                }
                break;
            case DIVISION:
            case MULTIPLICATION:
            case SUBTRACTION:
                {
                alt18=1;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:410:3: ^( ( ADDITION | SUBTRACTION | MULTIPLICATION | DIVISION ) a1= arithmeticexpression a2= arithmeticexpression )
                    {
                    if ( input.LA(1)==ADDITION||input.LA(1)==DIVISION||input.LA(1)==MULTIPLICATION||input.LA(1)==SUBTRACTION ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arithmeticexpression_in_arithmeticexpression719);
                    a1=arithmeticexpression();

                    state._fsp--;


                    pushFollow(FOLLOW_arithmeticexpression_in_arithmeticexpression723);
                    a2=arithmeticexpression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    if(a1.type == a2.type) {
                                                                                                                                   if (a1.type != Type.TRUTH){
                                                                                                                                       if(DEBUG) System.out.println("Expression ok"); 
                                                                                                                                   }
                                                                                                                                   else{ 
                                                                                                                                       if(DEBUG) System.out.println("Not an arithmetic type!"); 
                                                                                                                                       error(a1.lineNumber, a1.charPosition, "Invalid type");
                                                                                                                                   }
                                                                                                                               }
                                                                                                                               else{ 
                                                                                                                                   if(DEBUG) System.out.println("Types do not match!");  
                                                                                                                                   error(a1.lineNumber, a1.charPosition, "Types do not match");
                                                                                                                               }
                                                                                                                               retval.type = a1.type;
                                                                                                                               retval.lineNumber = a1.lineNumber; 
                                                                                                                               retval.charPosition = a1.charPosition;
                                                                                                                              

                    }
                    break;
                case 2 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:427:5: c= COUNT
                    {
                    c=(CommonTree)match(input,COUNT,FOLLOW_COUNT_in_arithmeticexpression734); 

                    retval.type = Type.COUNT; retval.lineNumber = c.getLine(); retval.charPosition = c.getCharPositionInLine();

                    }
                    break;
                case 3 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:428:5: f= FLOAT
                    {
                    f=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_arithmeticexpression744); 

                    retval.type = Type.FLOAT; retval.lineNumber = f.getLine(); retval.charPosition = f.getCharPositionInLine();

                    }
                    break;
                case 4 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:429:5: id= IDENTIFIER
                    {
                    id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_arithmeticexpression754); 

                       if(isDeclaredLocally(id.getText()) && getFunctionName() != null){
                                          retval.type = getType(id.getText()); 
                                          if(retval.type != null) if(DEBUG) System.out.println("Local Variable ok");
                                       }
                                       else if(!(isFunction(getFunctionName()) && isVariable(id.getText())) && isDeclaredGlobally(id.getText()) && !(isFunction(id.getText()) || isProcedure(id.getText()))){
                                            retval.type = getType(id.getText()); 
                                            if(retval.type != null) if(DEBUG) System.out.println("Global Variable ok");
                                       }
                                       else{ 
                                           if(DEBUG) System.out.println("Variable is not defined in this scope!");
                                           error(id.getLine(), id.getCharPositionInLine(), "Variable not defined in scope");
                                       }
                                       if(retval.type == Type.COUNT || retval.type== Type.FLOAT || retval.type == Type.TRUTH) {
                                           if(DEBUG) System.out.println("Arithmetic Type OK (VAR)");
                                       }
                                       else{ 
                                           if(DEBUG) System.out.println("Arithmetic Type invalid!");
                                           error(id.getLine(), id.getCharPositionInLine(), "Arithmetic type invalid");
                                       }
                                       retval.lineNumber = id.getLine(); 
                                       retval.charPosition = id.getCharPositionInLine();
                                      

                    }
                    break;
                case 5 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:451:5: ^( NEGATE a1= arithmeticexpression )
                    {
                    match(input,NEGATE,FOLLOW_NEGATE_in_arithmeticexpression763); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arithmeticexpression_in_arithmeticexpression767);
                    a1=arithmeticexpression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    if(DEBUG) System.out.println("Negate ok"); 
                                                           retval.type = a1.type; 
                                                           if(retval.type == Type.TRUTH) error(a1.lineNumber, a1.charPosition, "Negation cannot be applied to Type TRUTH"); 
                                                           

                    }
                    break;
                case 6 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:455:5: ^(a= ADDITION at= atom )
                    {
                    a=(CommonTree)match(input,ADDITION,FOLLOW_ADDITION_in_arithmeticexpression779); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_atom_in_arithmeticexpression783);
                    at=atom();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    if(DEBUG) System.out.println("Positive ok"); 
                                                             retval.type = at.type;
                                                                                                     
                                                             if(at.charPosition - a.getCharPositionInLine() > 1){
                                                                error(a.getLine(), a.getCharPositionInLine(), "There can be no spaces between an integer and it's sign");
                                                             }
                                                             
                                                            

                    }
                    break;
                case 7 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:463:5: p= procedurecall
                    {
                    pushFollow(FOLLOW_procedurecall_in_arithmeticexpression794);
                    p=procedurecall();

                    state._fsp--;


                    retval.type = p.type; 
                                         if(retval.type == Type.TRUTH || retval.type == Type.COUNT || retval.type== Type.FLOAT) {
                                             if(DEBUG) System.out.println("Arithmetic Type OK (FUNC)");
                                         }
                                         else{ 
                                             if(DEBUG) System.out.println("Arithmetic Type invalid!");
                                             error(p.lineNumber, p.charPosition, "Arithmetic type invalid");
                                         }
                                         retval.lineNumber = p.lineNumber; 
                                         retval.charPosition = p.charPosition;
                                        

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arithmeticexpression"


    public static class atom_return extends TreeRuleReturnScope {
        public Type type;
        public int lineNumber;
        public int charPosition;
    };


    // $ANTLR start "atom"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:476:1: atom returns [Type type, int lineNumber, int charPosition] : (c= COUNT |f= FLOAT );
    public final NiklausChecker.atom_return atom() throws RecognitionException {
        NiklausChecker.atom_return retval = new NiklausChecker.atom_return();
        retval.start = input.LT(1);


        CommonTree c=null;
        CommonTree f=null;

        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:476:60: (c= COUNT |f= FLOAT )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==COUNT) ) {
                alt19=1;
            }
            else if ( (LA19_0==FLOAT) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:477:5: c= COUNT
                    {
                    c=(CommonTree)match(input,COUNT,FOLLOW_COUNT_in_atom817); 

                    retval.type = Type.COUNT; retval.lineNumber = c.getLine(); retval.charPosition = c.getCharPositionInLine();

                    }
                    break;
                case 2 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:478:5: f= FLOAT
                    {
                    f=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_atom827); 

                    retval.type = Type.FLOAT; retval.lineNumber = f.getLine(); retval.charPosition = f.getCharPositionInLine();

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"



    // $ANTLR start "booleanexpression"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:482:1: booleanexpression : ^( ( EQUALITY | NONEQUALITY | COMPARISON ) a1= arithmeticexpression a2= arithmeticexpression ) ;
    public final void booleanexpression() throws RecognitionException {
        NiklausChecker.arithmeticexpression_return a1 =null;

        NiklausChecker.arithmeticexpression_return a2 =null;


        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:482:18: ( ^( ( EQUALITY | NONEQUALITY | COMPARISON ) a1= arithmeticexpression a2= arithmeticexpression ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausChecker.g:483:5: ^( ( EQUALITY | NONEQUALITY | COMPARISON ) a1= arithmeticexpression a2= arithmeticexpression )
            {
            if ( input.LA(1)==COMPARISON||input.LA(1)==EQUALITY||input.LA(1)==NONEQUALITY ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_arithmeticexpression_in_booleanexpression859);
            a1=arithmeticexpression();

            state._fsp--;


            pushFollow(FOLLOW_arithmeticexpression_in_booleanexpression863);
            a2=arithmeticexpression();

            state._fsp--;


            match(input, Token.UP, null); 


            if(a1.type == a2.type){ 
                                                                                                              if(DEBUG) System.out.println("Boolean expression ok"); 
                                                                                                          }
                                                                                                          else {
                                                                                                              if(DEBUG) System.out.println("Type Mismatch!");
                                                                                                              error(a1.lineNumber, a1.charPosition, "Types do not match");
                                                                                                          }
                                                                                                         

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "booleanexpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_MODULE_in_module58 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_module62 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_declarations_in_module66 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_body_in_module68 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLARATIONS_in_declarations84 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declaration_in_declarations86 = new BitSet(new long[]{0x0010000004001008L});
    public static final BitSet FOLLOW_BODY_in_body99 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_body101 = new BitSet(new long[]{0x0020110060010048L});
    public static final BitSet FOLLOW_constantdeclaration_in_declaration117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_globalvariabledeclaration_in_declaration123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functiondeclaration_in_declaration130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_proceduredeclaration_in_declaration137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_constantdeclaration152 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TYPE_in_constantdeclaration157 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_constantdeclaration161 = new BitSet(new long[]{0x0001007022842810L});
    public static final BitSet FOLLOW_expression_in_constantdeclaration165 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_in_globalvariabledeclaration184 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_individualglobalvariabledeclaration_in_globalvariabledeclaration186 = new BitSet(new long[]{0x0004000000000008L});
    public static final BitSet FOLLOW_TYPE_in_individualglobalvariabledeclaration205 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_individualglobalvariabledeclaration209 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_in_localvariabledeclaration227 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_individuallocalvariabledeclaration_in_localvariabledeclaration229 = new BitSet(new long[]{0x0004000000000008L});
    public static final BitSet FOLLOW_TYPE_in_individuallocalvariabledeclaration249 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_individuallocalvariabledeclaration253 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_in_functiondeclaration271 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_functiondeclaration275 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_TYPE_in_functiondeclaration279 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_parameterlist_in_functiondeclaration285 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DECLARATIONS_in_functiondeclaration288 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localvariabledeclaration_in_functiondeclaration290 = new BitSet(new long[]{0x0010000000000008L});
    public static final BitSet FOLLOW_BODY_in_functiondeclaration295 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_functiondeclaration297 = new BitSet(new long[]{0x0020110060010048L});
    public static final BitSet FOLLOW_FUNCTION_in_proceduredeclaration317 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_proceduredeclaration321 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_parameterlist_in_proceduredeclaration327 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DECLARATIONS_in_proceduredeclaration330 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localvariabledeclaration_in_proceduredeclaration332 = new BitSet(new long[]{0x0010000000000008L});
    public static final BitSet FOLLOW_BODY_in_proceduredeclaration337 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_proceduredeclaration339 = new BitSet(new long[]{0x0020110060010048L});
    public static final BitSet FOLLOW_PARAM_in_parameterlist359 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameters_in_parameterlist361 = new BitSet(new long[]{0x0004000000000008L});
    public static final BitSet FOLLOW_TYPE_in_parameters377 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parameters381 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_assignment_in_statement396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_output_in_statement402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_in_statement408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loop_in_statement414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedurecall_in_statement422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BODY_in_statement431 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statement433 = new BitSet(new long[]{0x0020110060010048L});
    public static final BitSet FOLLOW_DEFINEDAS_in_assignment450 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_assignment454 = new BitSet(new long[]{0x0001007022842810L});
    public static final BitSet FOLLOW_expression_in_assignment458 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OUTPUT_in_output475 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_output478 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_output485 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_conditional505 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_conditional509 = new BitSet(new long[]{0x0020110060010040L});
    public static final BitSet FOLLOW_statement_in_conditional513 = new BitSet(new long[]{0x0020110060010048L});
    public static final BitSet FOLLOW_statement_in_conditional515 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_whileloop_in_loop531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repeatloop_in_loop537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileloop552 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_whileloop557 = new BitSet(new long[]{0x0020110060010040L});
    public static final BitSet FOLLOW_statement_in_whileloop562 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REPEAT_in_repeatloop576 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_repeatloop578 = new BitSet(new long[]{0x0001007022842810L});
    public static final BitSet FOLLOW_expression_in_repeatloop583 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_procedurecall608 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PARAM_in_procedurecall617 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_procedurecall622 = new BitSet(new long[]{0x0001007022842818L});
    public static final BitSet FOLLOW_arithmeticexpression_in_expression653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_expression663 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arithmeticexpression_in_expression677 = new BitSet(new long[]{0x0001003022042010L});
    public static final BitSet FOLLOW_arithmeticexpression_in_expression681 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_arithmeticexpression701 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arithmeticexpression_in_arithmeticexpression719 = new BitSet(new long[]{0x0001003022042010L});
    public static final BitSet FOLLOW_arithmeticexpression_in_arithmeticexpression723 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COUNT_in_arithmeticexpression734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_arithmeticexpression744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_arithmeticexpression754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEGATE_in_arithmeticexpression763 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arithmeticexpression_in_arithmeticexpression767 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ADDITION_in_arithmeticexpression779 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atom_in_arithmeticexpression783 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_procedurecall_in_arithmeticexpression794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_atom817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_atom827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanexpression845 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arithmeticexpression_in_booleanexpression859 = new BitSet(new long[]{0x0001003022042010L});
    public static final BitSet FOLLOW_arithmeticexpression_in_booleanexpression863 = new BitSet(new long[]{0x0000000000000008L});

}