// $ANTLR 3.4 C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g 2012-04-26 12:06:49

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.io.PrintStream;



import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class NiklausGenerator extends TreeParser {
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


    public NiklausGenerator(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public NiklausGenerator(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return NiklausGenerator.tokenNames; }
    public String getGrammarFileName() { return "GrammarFiles/NiklausGenerator.g"; }


      public PrintStream out = System.out;
      public StringTemplateGroup group =  new StringTemplateGroup("myGroup", "StringTemplates/", DefaultTemplateLexer.class);
      public StringTemplate module = group.getInstanceOf("module");
      
      public String niklausToJavaType(String type){
         switch(type){
         case "COUNT": return "int"; 
         case "FLOAT": return "double";
         case "TRUTH": return "boolean"; 
         }
         return null;
      }
      



    // $ANTLR start "module"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:32:1: module : ^( MODULE id= IDENTIFIER declarations body ) ;
    public final void module() throws RecognitionException {
        CommonTree id=null;

        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:32:7: ( ^( MODULE id= IDENTIFIER declarations body ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:33:3: ^( MODULE id= IDENTIFIER declarations body )
            {
            match(input,MODULE,FOLLOW_MODULE_in_module57); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_module61); 

            module.setAttribute("name", id.getText());

            pushFollow(FOLLOW_declarations_in_module67);
            declarations();

            state._fsp--;


            pushFollow(FOLLOW_body_in_module72);
            body();

            state._fsp--;


            match(input, Token.UP, null); 


            out.println(module.toString());

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
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:39:1: declarations : ^( DECLARATIONS (d= declaration )* ) ;
    public final void declarations() throws RecognitionException {
        String d =null;


        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:39:13: ( ^( DECLARATIONS (d= declaration )* ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:40:3: ^( DECLARATIONS (d= declaration )* )
            {
            match(input,DECLARATIONS,FOLLOW_DECLARATIONS_in_declarations135); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:40:18: (d= declaration )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==CONST||LA1_0==FUNCTION||LA1_0==VAR) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:40:19: d= declaration
                	    {
                	    pushFollow(FOLLOW_declaration_in_declarations140);
                	    d=declaration();

                	    state._fsp--;


                	    module.setAttribute("global_variables", d);

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
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:43:1: body : ^( BODY (s= statement )* ) ;
    public final void body() throws RecognitionException {
        String s =null;


        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:43:5: ( ^( BODY (s= statement )* ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:44:3: ^( BODY (s= statement )* )
            {
            match(input,BODY,FOLLOW_BODY_in_body156); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:44:8: (s= statement )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==BODY||LA2_0==DEFINEDAS||(LA2_0 >= IDENTIFIER && LA2_0 <= IF)||LA2_0==OUTPUT||LA2_0==REPEAT||LA2_0==WHILE) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:44:9: s= statement
                	    {
                	    pushFollow(FOLLOW_statement_in_body161);
                	    s=statement();

                	    state._fsp--;


                	    module.setAttribute("statements", s);

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
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:47:1: declaration returns [String string] : (c= constantdeclaration |v= variabledeclaration |f= functiondeclaration |p= proceduredeclaration );
    public final String declaration() throws RecognitionException {
        String string = null;


        String c =null;

        String v =null;

        String f =null;

        String p =null;


        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:47:36: (c= constantdeclaration |v= variabledeclaration |f= functiondeclaration |p= proceduredeclaration )
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
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:48:3: c= constantdeclaration
                    {
                    pushFollow(FOLLOW_constantdeclaration_in_declaration186);
                    c=constantdeclaration();

                    state._fsp--;


                    string = c;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:49:5: v= variabledeclaration
                    {
                    pushFollow(FOLLOW_variabledeclaration_in_declaration196);
                    v=variabledeclaration();

                    state._fsp--;


                    string = v;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:50:5: f= functiondeclaration
                    {
                    pushFollow(FOLLOW_functiondeclaration_in_declaration206);
                    f=functiondeclaration();

                    state._fsp--;


                    string = "\n" + f;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:51:5: p= proceduredeclaration
                    {
                    pushFollow(FOLLOW_proceduredeclaration_in_declaration216);
                    p=proceduredeclaration();

                    state._fsp--;


                    string = "\n" + p;

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
        return string;
    }
    // $ANTLR end "declaration"



    // $ANTLR start "constantdeclaration"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:54:1: constantdeclaration returns [String string] : ^( CONST ^(t= TYPE id= IDENTIFIER e= expression ) ) ;
    public final String constantdeclaration() throws RecognitionException {
        String string = null;


        CommonTree t=null;
        CommonTree id=null;
        String e =null;


        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:54:44: ( ^( CONST ^(t= TYPE id= IDENTIFIER e= expression ) ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:55:3: ^( CONST ^(t= TYPE id= IDENTIFIER e= expression ) )
            {
            match(input,CONST,FOLLOW_CONST_in_constantdeclaration237); 

            match(input, Token.DOWN, null); 
            t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_constantdeclaration242); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constantdeclaration246); 

            pushFollow(FOLLOW_expression_in_constantdeclaration250);
            e=expression();

            state._fsp--;


            match(input, Token.UP, null); 


            match(input, Token.UP, null); 


            StringTemplate constant = group.getInstanceOf("constant");
                                                             
                                                             constant.setAttribute("type", niklausToJavaType(t.getText()));                                        
                                                             constant.setAttribute("name", id.getText());
                                                             constant.setAttribute("value", e); 
                                                             
                                                             string = constant.toString();
                                                            

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return string;
    }
    // $ANTLR end "constantdeclaration"



    // $ANTLR start "variabledeclaration"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:65:1: variabledeclaration returns [String string] : ^( VAR (i= individualvariabledeclaration )+ ) ;
    public final String variabledeclaration() throws RecognitionException {
        String string = null;


        String i =null;


        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:65:44: ( ^( VAR (i= individualvariabledeclaration )+ ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:66:3: ^( VAR (i= individualvariabledeclaration )+ )
            {
            match(input,VAR,FOLLOW_VAR_in_variabledeclaration273); 

            StringTemplate variables = group.getInstanceOf("variables");

            match(input, Token.DOWN, null); 
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:67:4: (i= individualvariabledeclaration )+
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
            	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:67:5: i= individualvariabledeclaration
            	    {
            	    pushFollow(FOLLOW_individualvariabledeclaration_in_variabledeclaration283);
            	    i=individualvariabledeclaration();

            	    state._fsp--;


            	    variables.setAttribute("variable", i);

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



                                                                                           string= variables.toString();
                                                                                          

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return string;
    }
    // $ANTLR end "variabledeclaration"



    // $ANTLR start "individualvariabledeclaration"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:72:1: individualvariabledeclaration returns [String string] : ^(t= TYPE id= IDENTIFIER ) ;
    public final String individualvariabledeclaration() throws RecognitionException {
        String string = null;


        CommonTree t=null;
        CommonTree id=null;

        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:72:54: ( ^(t= TYPE id= IDENTIFIER ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:73:3: ^(t= TYPE id= IDENTIFIER )
            {
            t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_individualvariabledeclaration309); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_individualvariabledeclaration313); 

            match(input, Token.UP, null); 


            StringTemplate variable = group.getInstanceOf("variable");
                                       
                                       variable.setAttribute("type", niklausToJavaType(t.getText()));
                                       variable.setAttribute("name", id.getText());

                                       string = variable.toString();
                                      

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return string;
    }
    // $ANTLR end "individualvariabledeclaration"



    // $ANTLR start "localvariabledeclaration"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:82:3: localvariabledeclaration returns [String string] : ^( VAR (i= individuallocalvariabledeclaration )+ ) ;
    public final String localvariabledeclaration() throws RecognitionException {
        String string = null;


        String i =null;


        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:82:51: ( ^( VAR (i= individuallocalvariabledeclaration )+ ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:83:3: ^( VAR (i= individuallocalvariabledeclaration )+ )
            {
            match(input,VAR,FOLLOW_VAR_in_localvariabledeclaration337); 

            StringTemplate localvariables = group.getInstanceOf("localvariables");

            match(input, Token.DOWN, null); 
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:84:4: (i= individuallocalvariabledeclaration )+
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
            	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:84:5: i= individuallocalvariabledeclaration
            	    {
            	    pushFollow(FOLLOW_individuallocalvariabledeclaration_in_localvariabledeclaration347);
            	    i=individuallocalvariabledeclaration();

            	    state._fsp--;


            	    localvariables.setAttribute("variable", i);

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



                                                                                           string= localvariables.toString();
                                                                                          

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return string;
    }
    // $ANTLR end "localvariabledeclaration"



    // $ANTLR start "individuallocalvariabledeclaration"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:89:1: individuallocalvariabledeclaration returns [String string] : ^(t= TYPE id= IDENTIFIER ) ;
    public final String individuallocalvariabledeclaration() throws RecognitionException {
        String string = null;


        CommonTree t=null;
        CommonTree id=null;

        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:89:59: ( ^(t= TYPE id= IDENTIFIER ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:90:3: ^(t= TYPE id= IDENTIFIER )
            {
            t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_individuallocalvariabledeclaration373); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_individuallocalvariabledeclaration377); 

            match(input, Token.UP, null); 


            StringTemplate localvariable = group.getInstanceOf("localvariable");
                                       
                                       localvariable.setAttribute("type", niklausToJavaType(t.getText()));
                                       localvariable.setAttribute("name", id.getText());

                                       string = localvariable.toString();
                                      

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return string;
    }
    // $ANTLR end "individuallocalvariabledeclaration"



    // $ANTLR start "functiondeclaration"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:99:1: functiondeclaration returns [String string] : ^( FUNCTION id= IDENTIFIER t= TYPE p= parameterlist ^( DECLARATIONS (v= localvariabledeclaration )* ) ^( BODY (s= statement )* ) ) ;
    public final String functiondeclaration() throws RecognitionException {
        String string = null;


        CommonTree id=null;
        CommonTree t=null;
        String p =null;

        String v =null;

        String s =null;


        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:99:44: ( ^( FUNCTION id= IDENTIFIER t= TYPE p= parameterlist ^( DECLARATIONS (v= localvariabledeclaration )* ) ^( BODY (s= statement )* ) ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:100:3: ^( FUNCTION id= IDENTIFIER t= TYPE p= parameterlist ^( DECLARATIONS (v= localvariabledeclaration )* ) ^( BODY (s= statement )* ) )
            {
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functiondeclaration399); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_functiondeclaration403); 

            t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_functiondeclaration407); 

            StringTemplate function = group.getInstanceOf("function");
                                               function.setAttribute("name", id.getText());
                                               function.setAttribute("type", niklausToJavaType(t.getText()));
                                               if(t.getText().equals("TRUTH")) function.setAttribute("default","false");
                                               else function.setAttribute("default","0");
                                              

            pushFollow(FOLLOW_parameterlist_in_functiondeclaration415);
            p=parameterlist();

            state._fsp--;


            function.setAttribute("parameters", p);

            match(input,DECLARATIONS,FOLLOW_DECLARATIONS_in_functiondeclaration423); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:107:18: (v= localvariabledeclaration )*
                loop6:
                do {
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==VAR) ) {
                        alt6=1;
                    }


                    switch (alt6) {
                	case 1 :
                	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:107:19: v= localvariabledeclaration
                	    {
                	    pushFollow(FOLLOW_localvariabledeclaration_in_functiondeclaration428);
                	    v=localvariabledeclaration();

                	    state._fsp--;


                	    function.setAttribute("local_variables", v);

                	    }
                	    break;

                	default :
                	    break loop6;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            match(input,BODY,FOLLOW_BODY_in_functiondeclaration438); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:108:10: (s= statement )*
                loop7:
                do {
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==BODY||LA7_0==DEFINEDAS||(LA7_0 >= IDENTIFIER && LA7_0 <= IF)||LA7_0==OUTPUT||LA7_0==REPEAT||LA7_0==WHILE) ) {
                        alt7=1;
                    }


                    switch (alt7) {
                	case 1 :
                	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:108:11: s= statement
                	    {
                	    pushFollow(FOLLOW_statement_in_functiondeclaration443);
                	    s=statement();

                	    state._fsp--;


                	    function.setAttribute("statements", s);

                	    }
                	    break;

                	default :
                	    break loop7;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            match(input, Token.UP, null); 


            string = function.toString();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return string;
    }
    // $ANTLR end "functiondeclaration"



    // $ANTLR start "proceduredeclaration"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:112:1: proceduredeclaration returns [String string] : ^( FUNCTION id= IDENTIFIER p= parameterlist ^( DECLARATIONS (v= localvariabledeclaration )* ) ^( BODY (s= statement )* ) ) ;
    public final String proceduredeclaration() throws RecognitionException {
        String string = null;


        CommonTree id=null;
        String p =null;

        String v =null;

        String s =null;


        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:112:45: ( ^( FUNCTION id= IDENTIFIER p= parameterlist ^( DECLARATIONS (v= localvariabledeclaration )* ) ^( BODY (s= statement )* ) ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:113:3: ^( FUNCTION id= IDENTIFIER p= parameterlist ^( DECLARATIONS (v= localvariabledeclaration )* ) ^( BODY (s= statement )* ) )
            {
            match(input,FUNCTION,FOLLOW_FUNCTION_in_proceduredeclaration472); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_proceduredeclaration476); 

            StringTemplate procedure = group.getInstanceOf("procedure");
                                               procedure.setAttribute("name", id.getText());
                                              

            pushFollow(FOLLOW_parameterlist_in_proceduredeclaration484);
            p=parameterlist();

            state._fsp--;


            procedure.setAttribute("parameters", p);

            match(input,DECLARATIONS,FOLLOW_DECLARATIONS_in_proceduredeclaration492); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:117:18: (v= localvariabledeclaration )*
                loop8:
                do {
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==VAR) ) {
                        alt8=1;
                    }


                    switch (alt8) {
                	case 1 :
                	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:117:19: v= localvariabledeclaration
                	    {
                	    pushFollow(FOLLOW_localvariabledeclaration_in_proceduredeclaration497);
                	    v=localvariabledeclaration();

                	    state._fsp--;


                	    procedure.setAttribute("local_variables", v);

                	    }
                	    break;

                	default :
                	    break loop8;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            match(input,BODY,FOLLOW_BODY_in_proceduredeclaration508); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:118:11: (s= statement )*
                loop9:
                do {
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==BODY||LA9_0==DEFINEDAS||(LA9_0 >= IDENTIFIER && LA9_0 <= IF)||LA9_0==OUTPUT||LA9_0==REPEAT||LA9_0==WHILE) ) {
                        alt9=1;
                    }


                    switch (alt9) {
                	case 1 :
                	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:118:12: s= statement
                	    {
                	    pushFollow(FOLLOW_statement_in_proceduredeclaration513);
                	    s=statement();

                	    state._fsp--;


                	    procedure.setAttribute("statements", s);

                	    }
                	    break;

                	default :
                	    break loop9;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            match(input, Token.UP, null); 


            string = procedure.toString();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return string;
    }
    // $ANTLR end "proceduredeclaration"



    // $ANTLR start "parameterlist"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:122:1: parameterlist returns [String string] : ^( PARAM (p= parameters )* ) ;
    public final String parameterlist() throws RecognitionException {
        String string = null;


        String p =null;


        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:122:38: ( ^( PARAM (p= parameters )* ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:123:3: ^( PARAM (p= parameters )* )
            {
            match(input,PARAM,FOLLOW_PARAM_in_parameterlist542); 

            StringTemplate parameters = group.getInstanceOf("parameters");

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:124:4: (p= parameters )*
                loop10:
                do {
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==TYPE) ) {
                        alt10=1;
                    }


                    switch (alt10) {
                	case 1 :
                	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:124:5: p= parameters
                	    {
                	    pushFollow(FOLLOW_parameters_in_parameterlist553);
                	    p=parameters();

                	    state._fsp--;


                	    parameters.setAttribute("parameter",p);

                	    }
                	    break;

                	default :
                	    break loop10;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            string = parameters.toString();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return string;
    }
    // $ANTLR end "parameterlist"



    // $ANTLR start "parameters"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:128:1: parameters returns [String string] : ^(t= TYPE id= IDENTIFIER ) ;
    public final String parameters() throws RecognitionException {
        String string = null;


        CommonTree t=null;
        CommonTree id=null;

        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:128:36: ( ^(t= TYPE id= IDENTIFIER ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:129:2: ^(t= TYPE id= IDENTIFIER )
            {
            t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_parameters582); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameters586); 

            match(input, Token.UP, null); 


            StringTemplate parameter = group.getInstanceOf("parameter");
                                     parameter.setAttribute("name", id.getText());
                                     parameter.setAttribute("type", niklausToJavaType(t.getText()));
                                     string = parameter.toString();
                                    

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return string;
    }
    // $ANTLR end "parameters"



    // $ANTLR start "statement"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:136:1: statement returns [String string] : (a= assignment |o= output |c= conditional |l= loop |p= procedurecall | ^( BODY (s= statement )* ) );
    public final String statement() throws RecognitionException {
        String string = null;


        String a =null;

        String o =null;

        String c =null;

        String l =null;

        String p =null;

        String s =null;


        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:136:34: (a= assignment |o= output |c= conditional |l= loop |p= procedurecall | ^( BODY (s= statement )* ) )
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
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:137:3: a= assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement607);
                    a=assignment();

                    state._fsp--;


                    string = a + ";";

                    }
                    break;
                case 2 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:138:5: o= output
                    {
                    pushFollow(FOLLOW_output_in_statement618);
                    o=output();

                    state._fsp--;


                    string = o + ";";

                    }
                    break;
                case 3 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:139:5: c= conditional
                    {
                    pushFollow(FOLLOW_conditional_in_statement628);
                    c=conditional();

                    state._fsp--;


                    string = c ;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:140:5: l= loop
                    {
                    pushFollow(FOLLOW_loop_in_statement639);
                    l=loop();

                    state._fsp--;


                    string = l;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:141:5: p= procedurecall
                    {
                    pushFollow(FOLLOW_procedurecall_in_statement649);
                    p=procedurecall();

                    state._fsp--;


                    string = p + ";";

                    }
                    break;
                case 6 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:142:5: ^( BODY (s= statement )* )
                    {
                    match(input,BODY,FOLLOW_BODY_in_statement658); 

                    StringTemplate block = group.getInstanceOf("block");

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:143:5: (s= statement )*
                        loop11:
                        do {
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( (LA11_0==BODY||LA11_0==DEFINEDAS||(LA11_0 >= IDENTIFIER && LA11_0 <= IF)||LA11_0==OUTPUT||LA11_0==REPEAT||LA11_0==WHILE) ) {
                                alt11=1;
                            }


                            switch (alt11) {
                        	case 1 :
                        	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:143:6: s= statement
                        	    {
                        	    pushFollow(FOLLOW_statement_in_statement670);
                        	    s=statement();

                        	    state._fsp--;


                        	    block.setAttribute("statement", s);

                        	    }
                        	    break;

                        	default :
                        	    break loop11;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }


                    string = block.toString();

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
        return string;
    }
    // $ANTLR end "statement"



    // $ANTLR start "assignment"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:147:1: assignment returns [String string] : ^( DEFINEDAS id= IDENTIFIER e= expression ) ;
    public final String assignment() throws RecognitionException {
        String string = null;


        CommonTree id=null;
        String e =null;


        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:147:35: ( ^( DEFINEDAS id= IDENTIFIER e= expression ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:148:3: ^( DEFINEDAS id= IDENTIFIER e= expression )
            {
            match(input,DEFINEDAS,FOLLOW_DEFINEDAS_in_assignment702); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignment706); 

            pushFollow(FOLLOW_expression_in_assignment710);
            e=expression();

            state._fsp--;


            match(input, Token.UP, null); 


            StringTemplate assignment = group.getInstanceOf("assignment");
                                                       assignment.setAttribute("variable", id.getText());
                                                       assignment.setAttribute("expression", e);
                                                       string = assignment.toString();
                                                      

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return string;
    }
    // $ANTLR end "assignment"



    // $ANTLR start "output"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:155:1: output returns [String string] : ^( OUTPUT (s= STRINGLITERAL |id= IDENTIFIER ) ) ;
    public final String output() throws RecognitionException {
        String string = null;


        CommonTree s=null;
        CommonTree id=null;

        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:155:31: ( ^( OUTPUT (s= STRINGLITERAL |id= IDENTIFIER ) ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:156:3: ^( OUTPUT (s= STRINGLITERAL |id= IDENTIFIER ) )
            {
            match(input,OUTPUT,FOLLOW_OUTPUT_in_output732); 

            StringTemplate output = group.getInstanceOf("output");

            match(input, Token.DOWN, null); 
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:157:4: (s= STRINGLITERAL |id= IDENTIFIER )
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
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:157:5: s= STRINGLITERAL
                    {
                    s=(CommonTree)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_output742); 

                    output.setAttribute("string", s.getText());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:158:6: id= IDENTIFIER
                    {
                    id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_output754); 

                    output.setAttribute("string", id.getText());

                    }
                    break;

            }


            match(input, Token.UP, null); 


            string = output.toString();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return string;
    }
    // $ANTLR end "output"



    // $ANTLR start "conditional"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:162:1: conditional returns [String string] : ^( IF b= expression s1= statement (s2= statement )? ) ;
    public final String conditional() throws RecognitionException {
        String string = null;


        String b =null;

        String s1 =null;

        String s2 =null;


        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:162:36: ( ^( IF b= expression s1= statement (s2= statement )? ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:163:3: ^( IF b= expression s1= statement (s2= statement )? )
            {
            match(input,IF,FOLLOW_IF_in_conditional784); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_conditional788);
            b=expression();

            state._fsp--;


            pushFollow(FOLLOW_statement_in_conditional792);
            s1=statement();

            state._fsp--;


            StringTemplate ifStatement = group.getInstanceOf("if");
                                                ifStatement.setAttribute("condition", b);
                                                ifStatement.setAttribute("if_body", s1); 
                                                string = ifStatement.toString();
                                               

            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:168:3: (s2= statement )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==BODY||LA14_0==DEFINEDAS||(LA14_0 >= IDENTIFIER && LA14_0 <= IF)||LA14_0==OUTPUT||LA14_0==REPEAT||LA14_0==WHILE) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:168:4: s2= statement
                    {
                    pushFollow(FOLLOW_statement_in_conditional802);
                    s2=statement();

                    state._fsp--;


                    StringTemplate elseStatement = group.getInstanceOf("else");
                                 elseStatement.setAttribute("else_body", s2);
                                 string = string + "\n" + elseStatement.toString();
                                

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
        return string;
    }
    // $ANTLR end "conditional"



    // $ANTLR start "loop"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:174:1: loop returns [String string] : (w= whileloop |r= repeatloop );
    public final String loop() throws RecognitionException {
        String string = null;


        String w =null;

        String r =null;


        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:174:29: (w= whileloop |r= repeatloop )
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
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:175:3: w= whileloop
                    {
                    pushFollow(FOLLOW_whileloop_in_loop826);
                    w=whileloop();

                    state._fsp--;


                    string = w;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:176:5: r= repeatloop
                    {
                    pushFollow(FOLLOW_repeatloop_in_loop836);
                    r=repeatloop();

                    state._fsp--;


                    string = r;

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
        return string;
    }
    // $ANTLR end "loop"



    // $ANTLR start "whileloop"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:179:1: whileloop returns [String string] : ^( WHILE b= expression s= statement ) ;
    public final String whileloop() throws RecognitionException {
        String string = null;


        String b =null;

        String s =null;


        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:179:34: ( ^( WHILE b= expression s= statement ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:180:3: ^( WHILE b= expression s= statement )
            {
            match(input,WHILE,FOLLOW_WHILE_in_whileloop857); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_whileloop861);
            b=expression();

            state._fsp--;


            pushFollow(FOLLOW_statement_in_whileloop865);
            s=statement();

            state._fsp--;


            match(input, Token.UP, null); 


            StringTemplate whileloop = group.getInstanceOf("whileloop");
                                                        whileloop.setAttribute("condition", b);
                                                        whileloop.setAttribute("body", s);
                                                        string = whileloop.toString();
                                                       

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return string;
    }
    // $ANTLR end "whileloop"



    // $ANTLR start "repeatloop"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:187:1: repeatloop returns [String string] : ^( REPEAT s= statement b= expression ) ;
    public final String repeatloop() throws RecognitionException {
        String string = null;


        String s =null;

        String b =null;


        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:187:35: ( ^( REPEAT s= statement b= expression ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:188:3: ^( REPEAT s= statement b= expression )
            {
            match(input,REPEAT,FOLLOW_REPEAT_in_repeatloop885); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_statement_in_repeatloop889);
            s=statement();

            state._fsp--;


            pushFollow(FOLLOW_expression_in_repeatloop893);
            b=expression();

            state._fsp--;


            match(input, Token.UP, null); 


            StringTemplate repeatloop = group.getInstanceOf("repeatloop");
                                                     repeatloop.setAttribute("condition", b);
                                                     repeatloop.setAttribute("body", s);
                                                     string = repeatloop.toString();
                                                    

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return string;
    }
    // $ANTLR end "repeatloop"



    // $ANTLR start "procedurecall"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:195:1: procedurecall returns [String string] : ^(id= IDENTIFIER ^( PARAM (e= expression )* ) ) ;
    public final String procedurecall() throws RecognitionException {
        String string = null;


        CommonTree id=null;
        String e =null;


        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:195:38: ( ^(id= IDENTIFIER ^( PARAM (e= expression )* ) ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:196:3: ^(id= IDENTIFIER ^( PARAM (e= expression )* ) )
            {
            id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_procedurecall917); 

            StringTemplate procedureCall = group.getInstanceOf("procedurecall");
                                procedureCall.setAttribute("name",id.getText());
                               

            match(input, Token.DOWN, null); 
            match(input,PARAM,FOLLOW_PARAM_in_procedurecall926); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:199:12: (e= expression )*
                loop16:
                do {
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==ADDITION||LA16_0==COMPARISON||LA16_0==COUNT||LA16_0==DIVISION||LA16_0==EQUALITY||LA16_0==FLOAT||LA16_0==IDENTIFIER||(LA16_0 >= MULTIPLICATION && LA16_0 <= NONEQUALITY)||LA16_0==SUBTRACTION) ) {
                        alt16=1;
                    }


                    switch (alt16) {
                	case 1 :
                	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:199:13: e= expression
                	    {
                	    pushFollow(FOLLOW_expression_in_procedurecall931);
                	    e=expression();

                	    state._fsp--;


                	    procedureCall.setAttribute("parameter", e); 

                	    }
                	    break;

                	default :
                	    break loop16;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            match(input, Token.UP, null); 


            string = procedureCall.toString();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return string;
    }
    // $ANTLR end "procedurecall"



    // $ANTLR start "expression"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:204:1: expression returns [String string] : (a= arithmeticexpression |b= booleanexpression );
    public final String expression() throws RecognitionException {
        String string = null;


        String a =null;

        String b =null;


        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:204:35: (a= arithmeticexpression |b= booleanexpression )
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
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:205:4: a= arithmeticexpression
                    {
                    pushFollow(FOLLOW_arithmeticexpression_in_expression973);
                    a=arithmeticexpression();

                    state._fsp--;


                    string = a;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:206:6: b= booleanexpression
                    {
                    pushFollow(FOLLOW_booleanexpression_in_expression984);
                    b=booleanexpression();

                    state._fsp--;


                    string = b;

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
        return string;
    }
    // $ANTLR end "expression"



    // $ANTLR start "arithmeticexpression"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:209:1: arithmeticexpression returns [String string] : ( ^(op= ( ADDITION | SUBTRACTION | MULTIPLICATION | DIVISION ) a1= arithmeticexpression a2= arithmeticexpression ) | ^( NEGATE a1= arithmeticexpression ) | ^( ADDITION at= ( COUNT | FLOAT ) ) |c= COUNT |f= FLOAT |id= IDENTIFIER |p= procedurecall );
    public final String arithmeticexpression() throws RecognitionException {
        String string = null;


        CommonTree op=null;
        CommonTree at=null;
        CommonTree c=null;
        CommonTree f=null;
        CommonTree id=null;
        String a1 =null;

        String a2 =null;

        String p =null;


        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:209:45: ( ^(op= ( ADDITION | SUBTRACTION | MULTIPLICATION | DIVISION ) a1= arithmeticexpression a2= arithmeticexpression ) | ^( NEGATE a1= arithmeticexpression ) | ^( ADDITION at= ( COUNT | FLOAT ) ) |c= COUNT |f= FLOAT |id= IDENTIFIER |p= procedurecall )
            int alt18=7;
            switch ( input.LA(1) ) {
            case ADDITION:
                {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case COUNT:
                        {
                        int LA18_10 = input.LA(4);

                        if ( (LA18_10==UP) ) {
                            alt18=3;
                        }
                        else if ( (LA18_10==ADDITION||LA18_10==COUNT||LA18_10==DIVISION||LA18_10==FLOAT||LA18_10==IDENTIFIER||(LA18_10 >= MULTIPLICATION && LA18_10 <= NEGATE)||LA18_10==SUBTRACTION) ) {
                            alt18=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 10, input);

                            throw nvae;

                        }
                        }
                        break;
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
                    case FLOAT:
                        {
                        int LA18_11 = input.LA(4);

                        if ( (LA18_11==UP) ) {
                            alt18=3;
                        }
                        else if ( (LA18_11==ADDITION||LA18_11==COUNT||LA18_11==DIVISION||LA18_11==FLOAT||LA18_11==IDENTIFIER||(LA18_11 >= MULTIPLICATION && LA18_11 <= NEGATE)||LA18_11==SUBTRACTION) ) {
                            alt18=1;
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
            case NEGATE:
                {
                alt18=2;
                }
                break;
            case DIVISION:
            case MULTIPLICATION:
            case SUBTRACTION:
                {
                alt18=1;
                }
                break;
            case COUNT:
                {
                alt18=4;
                }
                break;
            case FLOAT:
                {
                alt18=5;
                }
                break;
            case IDENTIFIER:
                {
                int LA18_6 = input.LA(2);

                if ( (LA18_6==DOWN) ) {
                    alt18=7;
                }
                else if ( ((LA18_6 >= UP && LA18_6 <= ADDITION)||LA18_6==BODY||LA18_6==COMPARISON||LA18_6==COUNT||LA18_6==DEFINEDAS||LA18_6==DIVISION||LA18_6==EQUALITY||LA18_6==FLOAT||(LA18_6 >= IDENTIFIER && LA18_6 <= IF)||(LA18_6 >= MULTIPLICATION && LA18_6 <= NONEQUALITY)||LA18_6==OUTPUT||LA18_6==REPEAT||LA18_6==SUBTRACTION||LA18_6==WHILE) ) {
                    alt18=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 6, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:210:3: ^(op= ( ADDITION | SUBTRACTION | MULTIPLICATION | DIVISION ) a1= arithmeticexpression a2= arithmeticexpression )
                    {
                    op=(CommonTree)input.LT(1);

                    if ( input.LA(1)==ADDITION||input.LA(1)==DIVISION||input.LA(1)==MULTIPLICATION||input.LA(1)==SUBTRACTION ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arithmeticexpression_in_arithmeticexpression1023);
                    a1=arithmeticexpression();

                    state._fsp--;


                    pushFollow(FOLLOW_arithmeticexpression_in_arithmeticexpression1027);
                    a2=arithmeticexpression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    StringTemplate binaryoperation = group.getInstanceOf("binaryoperation");
                                                                                                                                  binaryoperation.setAttribute("operator", op.getText());  
                                                                                                                                  binaryoperation.setAttribute("operand1", a1);  
                                                                                                                                  binaryoperation.setAttribute("operand2", a2);  
                                                                                                                                  string = binaryoperation.toString();
                                                                                                                                 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:216:5: ^( NEGATE a1= arithmeticexpression )
                    {
                    match(input,NEGATE,FOLLOW_NEGATE_in_arithmeticexpression1038); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arithmeticexpression_in_arithmeticexpression1042);
                    a1=arithmeticexpression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    string = "(- " + a1 + ")";

                    }
                    break;
                case 3 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:217:5: ^( ADDITION at= ( COUNT | FLOAT ) )
                    {
                    match(input,ADDITION,FOLLOW_ADDITION_in_arithmeticexpression1052); 

                    match(input, Token.DOWN, null); 
                    at=(CommonTree)input.LT(1);

                    if ( input.LA(1)==COUNT||input.LA(1)==FLOAT ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.UP, null); 


                    string = at.toString();

                    }
                    break;
                case 4 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:218:5: c= COUNT
                    {
                    c=(CommonTree)match(input,COUNT,FOLLOW_COUNT_in_arithmeticexpression1071); 

                    string = c.getText();

                    }
                    break;
                case 5 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:219:5: f= FLOAT
                    {
                    f=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_arithmeticexpression1081); 

                    if (f.getText().matches(".([eE][+-]?[0-9]+)?")) string = "0.0"; 
                                 else string = new Double(Double.parseDouble(f.getText())).toString();

                    }
                    break;
                case 6 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:221:5: id= IDENTIFIER
                    {
                    id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_arithmeticexpression1091); 

                    string = id.getText();

                    }
                    break;
                case 7 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:222:5: p= procedurecall
                    {
                    pushFollow(FOLLOW_procedurecall_in_arithmeticexpression1101);
                    p=procedurecall();

                    state._fsp--;


                    string = p;

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
        return string;
    }
    // $ANTLR end "arithmeticexpression"



    // $ANTLR start "booleanexpression"
    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:225:1: booleanexpression returns [String string] : ^(op= ( EQUALITY | NONEQUALITY | COMPARISON ) a1= arithmeticexpression a2= arithmeticexpression ) ;
    public final String booleanexpression() throws RecognitionException {
        String string = null;


        CommonTree op=null;
        String a1 =null;

        String a2 =null;


        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:225:42: ( ^(op= ( EQUALITY | NONEQUALITY | COMPARISON ) a1= arithmeticexpression a2= arithmeticexpression ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\NiklausGenerator.g:226:3: ^(op= ( EQUALITY | NONEQUALITY | COMPARISON ) a1= arithmeticexpression a2= arithmeticexpression )
            {
            op=(CommonTree)input.LT(1);

            if ( input.LA(1)==COMPARISON||input.LA(1)==EQUALITY||input.LA(1)==NONEQUALITY ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_arithmeticexpression_in_booleanexpression1137);
            a1=arithmeticexpression();

            state._fsp--;


            pushFollow(FOLLOW_arithmeticexpression_in_booleanexpression1141);
            a2=arithmeticexpression();

            state._fsp--;


            match(input, Token.UP, null); 


            StringTemplate binaryoperation = group.getInstanceOf("binaryoperation");
                                                                                                        binaryoperation.setAttribute("operator", op.getText());  
                                                                                                        binaryoperation.setAttribute("operand1", a1);  
                                                                                                        binaryoperation.setAttribute("operand2", a2);  
                                                                                                        string = binaryoperation.toString();
                                                                                                        

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return string;
    }
    // $ANTLR end "booleanexpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_MODULE_in_module57 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_module61 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_declarations_in_module67 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_body_in_module72 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLARATIONS_in_declarations135 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declaration_in_declarations140 = new BitSet(new long[]{0x0010000004001008L});
    public static final BitSet FOLLOW_BODY_in_body156 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_body161 = new BitSet(new long[]{0x0020110060010048L});
    public static final BitSet FOLLOW_constantdeclaration_in_declaration186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variabledeclaration_in_declaration196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functiondeclaration_in_declaration206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_proceduredeclaration_in_declaration216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_constantdeclaration237 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TYPE_in_constantdeclaration242 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_constantdeclaration246 = new BitSet(new long[]{0x0001007022842810L});
    public static final BitSet FOLLOW_expression_in_constantdeclaration250 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_in_variabledeclaration273 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_individualvariabledeclaration_in_variabledeclaration283 = new BitSet(new long[]{0x0004000000000008L});
    public static final BitSet FOLLOW_TYPE_in_individualvariabledeclaration309 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_individualvariabledeclaration313 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_in_localvariabledeclaration337 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_individuallocalvariabledeclaration_in_localvariabledeclaration347 = new BitSet(new long[]{0x0004000000000008L});
    public static final BitSet FOLLOW_TYPE_in_individuallocalvariabledeclaration373 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_individuallocalvariabledeclaration377 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_in_functiondeclaration399 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_functiondeclaration403 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_TYPE_in_functiondeclaration407 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_parameterlist_in_functiondeclaration415 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DECLARATIONS_in_functiondeclaration423 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localvariabledeclaration_in_functiondeclaration428 = new BitSet(new long[]{0x0010000000000008L});
    public static final BitSet FOLLOW_BODY_in_functiondeclaration438 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_functiondeclaration443 = new BitSet(new long[]{0x0020110060010048L});
    public static final BitSet FOLLOW_FUNCTION_in_proceduredeclaration472 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_proceduredeclaration476 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_parameterlist_in_proceduredeclaration484 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DECLARATIONS_in_proceduredeclaration492 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localvariabledeclaration_in_proceduredeclaration497 = new BitSet(new long[]{0x0010000000000008L});
    public static final BitSet FOLLOW_BODY_in_proceduredeclaration508 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_proceduredeclaration513 = new BitSet(new long[]{0x0020110060010048L});
    public static final BitSet FOLLOW_PARAM_in_parameterlist542 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameters_in_parameterlist553 = new BitSet(new long[]{0x0004000000000008L});
    public static final BitSet FOLLOW_TYPE_in_parameters582 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parameters586 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_assignment_in_statement607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_output_in_statement618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_in_statement628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loop_in_statement639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedurecall_in_statement649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BODY_in_statement658 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statement670 = new BitSet(new long[]{0x0020110060010048L});
    public static final BitSet FOLLOW_DEFINEDAS_in_assignment702 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_assignment706 = new BitSet(new long[]{0x0001007022842810L});
    public static final BitSet FOLLOW_expression_in_assignment710 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OUTPUT_in_output732 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_output742 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_output754 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_conditional784 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_conditional788 = new BitSet(new long[]{0x0020110060010040L});
    public static final BitSet FOLLOW_statement_in_conditional792 = new BitSet(new long[]{0x0020110060010048L});
    public static final BitSet FOLLOW_statement_in_conditional802 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_whileloop_in_loop826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repeatloop_in_loop836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileloop857 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_whileloop861 = new BitSet(new long[]{0x0020110060010040L});
    public static final BitSet FOLLOW_statement_in_whileloop865 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REPEAT_in_repeatloop885 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_repeatloop889 = new BitSet(new long[]{0x0001007022842810L});
    public static final BitSet FOLLOW_expression_in_repeatloop893 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_procedurecall917 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PARAM_in_procedurecall926 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_procedurecall931 = new BitSet(new long[]{0x0001007022842818L});
    public static final BitSet FOLLOW_arithmeticexpression_in_expression973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanexpression_in_expression984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_arithmeticexpression1005 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arithmeticexpression_in_arithmeticexpression1023 = new BitSet(new long[]{0x0001003022042010L});
    public static final BitSet FOLLOW_arithmeticexpression_in_arithmeticexpression1027 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEGATE_in_arithmeticexpression1038 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arithmeticexpression_in_arithmeticexpression1042 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ADDITION_in_arithmeticexpression1052 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_arithmeticexpression1056 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COUNT_in_arithmeticexpression1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_arithmeticexpression1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_arithmeticexpression1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedurecall_in_arithmeticexpression1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanexpression1123 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arithmeticexpression_in_booleanexpression1137 = new BitSet(new long[]{0x0001003022042010L});
    public static final BitSet FOLLOW_arithmeticexpression_in_booleanexpression1141 = new BitSet(new long[]{0x0000000000000008L});

}
