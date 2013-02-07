// $ANTLR 3.4 C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g 2012-04-26 12:08:39

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class NiklausLexer extends Lexer {
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

      public Error err = new Error(System.err);

      @Override
      public void reportError(RecognitionException e) {
                   
                        err.error(e.line, e.charPositionInLine, "Lexer Error near '" + this.emit().getText() + "'");     
                        Niklaus.fail = true; 
      }


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public NiklausLexer() {} 
    public NiklausLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public NiklausLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g"; }

    // $ANTLR start "MODULE"
    public final void mMODULE() throws RecognitionException {
        try {
            int _type = MODULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:175:7: ( 'MODULE' )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:176:3: 'MODULE'
            {
            match("MODULE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MODULE"

    // $ANTLR start "BEGIN"
    public final void mBEGIN() throws RecognitionException {
        try {
            int _type = BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:179:6: ( 'BEGIN' )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:180:3: 'BEGIN'
            {
            match("BEGIN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BEGIN"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:183:4: ( 'END' )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:184:3: 'END'
            {
            match("END"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:187:5: ( ';' )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:188:3: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:191:6: ( ',' )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:192:3: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "STRINGLITERAL"
    public final void mSTRINGLITERAL() throws RecognitionException {
        try {
            int _type = STRINGLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:195:14: ( DOUBLEQUOTE (~ ( '\\n' | DOUBLEQUOTE ) )* DOUBLEQUOTE )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:196:3: DOUBLEQUOTE (~ ( '\\n' | DOUBLEQUOTE ) )* DOUBLEQUOTE
            {
            mDOUBLEQUOTE(); 


            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:196:15: (~ ( '\\n' | DOUBLEQUOTE ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '!')||(LA1_0 >= '#' && LA1_0 <= '\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            mDOUBLEQUOTE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRINGLITERAL"

    // $ANTLR start "DOUBLEQUOTE"
    public final void mDOUBLEQUOTE() throws RecognitionException {
        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:201:21: ( '\"' )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:202:3: '\"'
            {
            match('\"'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLEQUOTE"

    // $ANTLR start "OPENINGPARENTHESIS"
    public final void mOPENINGPARENTHESIS() throws RecognitionException {
        try {
            int _type = OPENINGPARENTHESIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:206:19: ( '(' )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:207:2: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPENINGPARENTHESIS"

    // $ANTLR start "CLOSINGPARENTHESIS"
    public final void mCLOSINGPARENTHESIS() throws RecognitionException {
        try {
            int _type = CLOSINGPARENTHESIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:210:19: ( ')' )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:211:2: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSINGPARENTHESIS"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:214:6: ( ':' )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:215:3: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "DEFINEDAS"
    public final void mDEFINEDAS() throws RecognitionException {
        try {
            int _type = DEFINEDAS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:218:10: ( ':=' )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:219:3: ':='
            {
            match(":="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEFINEDAS"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:222:4: ( 'VAR' )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:223:3: 'VAR'
            {
            match("VAR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "CONST"
    public final void mCONST() throws RecognitionException {
        try {
            int _type = CONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:226:6: ( 'CONST' )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:227:3: 'CONST'
            {
            match("CONST"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONST"

    // $ANTLR start "FUNCTION"
    public final void mFUNCTION() throws RecognitionException {
        try {
            int _type = FUNCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:230:9: ( 'FUNCTION' )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:231:3: 'FUNCTION'
            {
            match("FUNCTION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FUNCTION"

    // $ANTLR start "PROCEDURE"
    public final void mPROCEDURE() throws RecognitionException {
        try {
            int _type = PROCEDURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:234:10: ( 'PROCEDURE' )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:235:3: 'PROCEDURE'
            {
            match("PROCEDURE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PROCEDURE"

    // $ANTLR start "OUTPUT"
    public final void mOUTPUT() throws RecognitionException {
        try {
            int _type = OUTPUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:238:7: ( 'OUTPUT' )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:239:3: 'OUTPUT'
            {
            match("OUTPUT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OUTPUT"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:242:3: ( 'IF' )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:243:3: 'IF'
            {
            match("IF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:246:5: ( 'THEN' )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:247:2: 'THEN'
            {
            match("THEN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:250:5: ( 'ELSE' )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:251:3: 'ELSE'
            {
            match("ELSE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:254:6: ( 'WHILE' )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:255:2: 'WHILE'
            {
            match("WHILE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:258:3: ( 'DO' )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:259:2: 'DO'
            {
            match("DO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "REPEAT"
    public final void mREPEAT() throws RecognitionException {
        try {
            int _type = REPEAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:262:7: ( 'REPEAT' )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:263:2: 'REPEAT'
            {
            match("REPEAT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REPEAT"

    // $ANTLR start "UNTIL"
    public final void mUNTIL() throws RecognitionException {
        try {
            int _type = UNTIL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:266:6: ( 'UNTIL' )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:267:2: 'UNTIL'
            {
            match("UNTIL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNTIL"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:270:5: ( 'TRUTH' | 'COUNT' | 'FLOAT' )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 'T':
                {
                alt2=1;
                }
                break;
            case 'C':
                {
                alt2=2;
                }
                break;
            case 'F':
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:271:3: 'TRUTH'
                    {
                    match("TRUTH"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:272:5: 'COUNT'
                    {
                    match("COUNT"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:273:5: 'FLOAT'
                    {
                    match("FLOAT"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPE"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:276:11: ( LETTER ( LETTER | DIGIT | '_' )* )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:277:3: LETTER ( LETTER | DIGIT | '_' )*
            {
            mLETTER(); 


            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:277:10: ( LETTER | DIGIT | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "EQUALITY"
    public final void mEQUALITY() throws RecognitionException {
        try {
            int _type = EQUALITY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:280:9: ( '==' )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:281:3: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUALITY"

    // $ANTLR start "NONEQUALITY"
    public final void mNONEQUALITY() throws RecognitionException {
        try {
            int _type = NONEQUALITY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:284:12: ( '!=' )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:285:3: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NONEQUALITY"

    // $ANTLR start "COMPARISON"
    public final void mCOMPARISON() throws RecognitionException {
        try {
            int _type = COMPARISON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:288:11: ( GREATERTHAN | GREATERTHANOREQUAL | LESSTHAN | LESSTHANOREQUAL )
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='>') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='=') ) {
                    alt4=2;
                }
                else {
                    alt4=1;
                }
            }
            else if ( (LA4_0=='<') ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2=='=') ) {
                    alt4=4;
                }
                else {
                    alt4=3;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:289:3: GREATERTHAN
                    {
                    mGREATERTHAN(); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:290:5: GREATERTHANOREQUAL
                    {
                    mGREATERTHANOREQUAL(); 


                    }
                    break;
                case 3 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:291:5: LESSTHAN
                    {
                    mLESSTHAN(); 


                    }
                    break;
                case 4 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:292:5: LESSTHANOREQUAL
                    {
                    mLESSTHANOREQUAL(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMPARISON"

    // $ANTLR start "GREATERTHAN"
    public final void mGREATERTHAN() throws RecognitionException {
        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:295:21: ( '>' )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:296:3: '>'
            {
            match('>'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATERTHAN"

    // $ANTLR start "GREATERTHANOREQUAL"
    public final void mGREATERTHANOREQUAL() throws RecognitionException {
        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:299:28: ( '>=' )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:300:3: '>='
            {
            match(">="); 



            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATERTHANOREQUAL"

    // $ANTLR start "LESSTHAN"
    public final void mLESSTHAN() throws RecognitionException {
        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:303:18: ( '<' )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:304:3: '<'
            {
            match('<'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESSTHAN"

    // $ANTLR start "LESSTHANOREQUAL"
    public final void mLESSTHANOREQUAL() throws RecognitionException {
        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:307:25: ( '<=' )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:308:3: '<='
            {
            match("<="); 



            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESSTHANOREQUAL"

    // $ANTLR start "ADDITION"
    public final void mADDITION() throws RecognitionException {
        try {
            int _type = ADDITION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:311:9: ( '+' )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:312:3: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ADDITION"

    // $ANTLR start "SUBTRACTION"
    public final void mSUBTRACTION() throws RecognitionException {
        try {
            int _type = SUBTRACTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:315:12: ( '-' )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:316:3: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUBTRACTION"

    // $ANTLR start "DIVISION"
    public final void mDIVISION() throws RecognitionException {
        try {
            int _type = DIVISION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:319:9: ( '/' )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:320:3: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIVISION"

    // $ANTLR start "MULTIPLICATION"
    public final void mMULTIPLICATION() throws RecognitionException {
        try {
            int _type = MULTIPLICATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:323:15: ( '*' )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:324:3: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MULTIPLICATION"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:328:6: ( ( INTEGER )? DECIMALPOINT ( DIGIT )* ( EXPONENT )? )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:329:3: ( INTEGER )? DECIMALPOINT ( DIGIT )* ( EXPONENT )?
            {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:329:3: ( INTEGER )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:329:3: INTEGER
                    {
                    mINTEGER(); 


                    }
                    break;

            }


            mDECIMALPOINT(); 


            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:329:25: ( DIGIT )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:329:32: ( EXPONENT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='E'||LA7_0=='e') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:329:33: EXPONENT
                    {
                    mEXPONENT(); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:332:18: ( ( 'e' | 'E' ) ( SIGN )? INTEGER )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:333:3: ( 'e' | 'E' ) ( SIGN )? INTEGER
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:333:15: ( SIGN )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='+'||LA8_0=='-') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            mINTEGER(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "COUNT"
    public final void mCOUNT() throws RecognitionException {
        try {
            int _type = COUNT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:336:6: ( INTEGER )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:337:3: INTEGER
            {
            mINTEGER(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COUNT"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:340:17: ( ( DIGIT )+ )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:341:4: ( DIGIT )+
            {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:341:4: ( DIGIT )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "SIGN"
    public final void mSIGN() throws RecognitionException {
        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:344:15: ( ( '+' | '-' ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SIGN"

    // $ANTLR start "DECIMALPOINT"
    public final void mDECIMALPOINT() throws RecognitionException {
        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:348:22: ( '.' )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:349:3: '.'
            {
            match('.'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DECIMALPOINT"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:352:16: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:356:15: ( ( '0' .. '9' ) )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:360:8: ( '/*' ( . )* '*/' )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:361:3: '/*' ( . )* '*/'
            {
            match("/*"); 



            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:361:8: ( . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1 >= '\u0000' && LA10_1 <= '.')||(LA10_1 >= '0' && LA10_1 <= '\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0 >= '\u0000' && LA10_0 <= ')')||(LA10_0 >= '+' && LA10_0 <= '\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:361:8: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            match("*/"); 



            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:364:3: ( ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+ )
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:365:3: ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+
            {
            // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:365:3: ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0 >= '\t' && LA11_0 <= '\n')||(LA11_0 >= '\f' && LA11_0 <= '\r')||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:1:8: ( MODULE | BEGIN | END | SEMI | COMMA | STRINGLITERAL | OPENINGPARENTHESIS | CLOSINGPARENTHESIS | COLON | DEFINEDAS | VAR | CONST | FUNCTION | PROCEDURE | OUTPUT | IF | THEN | ELSE | WHILE | DO | REPEAT | UNTIL | TYPE | IDENTIFIER | EQUALITY | NONEQUALITY | COMPARISON | ADDITION | SUBTRACTION | DIVISION | MULTIPLICATION | FLOAT | COUNT | COMMENT | WS )
        int alt12=35;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:1:10: MODULE
                {
                mMODULE(); 


                }
                break;
            case 2 :
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:1:17: BEGIN
                {
                mBEGIN(); 


                }
                break;
            case 3 :
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:1:23: END
                {
                mEND(); 


                }
                break;
            case 4 :
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:1:27: SEMI
                {
                mSEMI(); 


                }
                break;
            case 5 :
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:1:32: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 6 :
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:1:38: STRINGLITERAL
                {
                mSTRINGLITERAL(); 


                }
                break;
            case 7 :
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:1:52: OPENINGPARENTHESIS
                {
                mOPENINGPARENTHESIS(); 


                }
                break;
            case 8 :
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:1:71: CLOSINGPARENTHESIS
                {
                mCLOSINGPARENTHESIS(); 


                }
                break;
            case 9 :
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:1:90: COLON
                {
                mCOLON(); 


                }
                break;
            case 10 :
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:1:96: DEFINEDAS
                {
                mDEFINEDAS(); 


                }
                break;
            case 11 :
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:1:106: VAR
                {
                mVAR(); 


                }
                break;
            case 12 :
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:1:110: CONST
                {
                mCONST(); 


                }
                break;
            case 13 :
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:1:116: FUNCTION
                {
                mFUNCTION(); 


                }
                break;
            case 14 :
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:1:125: PROCEDURE
                {
                mPROCEDURE(); 


                }
                break;
            case 15 :
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:1:135: OUTPUT
                {
                mOUTPUT(); 


                }
                break;
            case 16 :
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:1:142: IF
                {
                mIF(); 


                }
                break;
            case 17 :
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:1:145: THEN
                {
                mTHEN(); 


                }
                break;
            case 18 :
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:1:150: ELSE
                {
                mELSE(); 


                }
                break;
            case 19 :
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:1:155: WHILE
                {
                mWHILE(); 


                }
                break;
            case 20 :
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:1:161: DO
                {
                mDO(); 


                }
                break;
            case 21 :
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:1:164: REPEAT
                {
                mREPEAT(); 


                }
                break;
            case 22 :
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:1:171: UNTIL
                {
                mUNTIL(); 


                }
                break;
            case 23 :
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:1:177: TYPE
                {
                mTYPE(); 


                }
                break;
            case 24 :
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:1:182: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 25 :
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:1:193: EQUALITY
                {
                mEQUALITY(); 


                }
                break;
            case 26 :
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:1:202: NONEQUALITY
                {
                mNONEQUALITY(); 


                }
                break;
            case 27 :
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:1:214: COMPARISON
                {
                mCOMPARISON(); 


                }
                break;
            case 28 :
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:1:225: ADDITION
                {
                mADDITION(); 


                }
                break;
            case 29 :
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:1:234: SUBTRACTION
                {
                mSUBTRACTION(); 


                }
                break;
            case 30 :
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:1:246: DIVISION
                {
                mDIVISION(); 


                }
                break;
            case 31 :
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:1:255: MULTIPLICATION
                {
                mMULTIPLICATION(); 


                }
                break;
            case 32 :
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:1:270: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 33 :
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:1:276: COUNT
                {
                mCOUNT(); 


                }
                break;
            case 34 :
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:1:282: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 35 :
                // C:\\Users\\Edward\\workspace\\ANTLRTest\\src\\Niklaus.g:1:290: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\3\25\5\uffff\1\45\13\25\6\uffff\1\64\1\uffff\1\65\2\uffff"+
        "\4\25\2\uffff\6\25\1\101\3\25\1\105\2\25\3\uffff\2\25\1\112\1\25"+
        "\1\114\6\25\1\uffff\3\25\1\uffff\4\25\1\uffff\1\132\1\uffff\6\25"+
        "\1\141\5\25\1\147\1\uffff\1\150\1\151\1\25\1\151\2\25\1\uffff\1"+
        "\151\1\155\1\25\1\157\1\160\3\uffff\2\25\1\163\1\uffff\1\164\2\uffff"+
        "\2\25\2\uffff\1\167\1\25\1\uffff\1\171\1\uffff";
    static final String DFA12_eofS =
        "\172\uffff";
    static final String DFA12_minS =
        "\1\11\1\117\1\105\1\114\5\uffff\1\75\1\101\1\117\1\114\1\122\1\125"+
        "\1\106\2\110\1\117\1\105\1\116\6\uffff\1\52\1\uffff\1\56\2\uffff"+
        "\1\104\1\107\1\104\1\123\2\uffff\1\122\2\116\2\117\1\124\1\60\1"+
        "\105\1\125\1\111\1\60\1\120\1\124\3\uffff\1\125\1\111\1\60\1\105"+
        "\1\60\1\123\1\116\1\103\1\101\1\103\1\120\1\uffff\1\116\1\124\1"+
        "\114\1\uffff\1\105\1\111\1\114\1\116\1\uffff\1\60\1\uffff\4\124"+
        "\1\105\1\125\1\60\1\110\1\105\1\101\1\114\1\105\1\60\1\uffff\2\60"+
        "\1\111\1\60\1\104\1\124\1\uffff\2\60\1\124\2\60\3\uffff\1\117\1"+
        "\125\1\60\1\uffff\1\60\2\uffff\1\116\1\122\2\uffff\1\60\1\105\1"+
        "\uffff\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\172\1\117\1\105\1\116\5\uffff\1\75\1\101\1\117\1\125\1\122\1"+
        "\125\1\106\1\122\1\110\1\117\1\105\1\116\6\uffff\1\52\1\uffff\1"+
        "\71\2\uffff\1\104\1\107\1\104\1\123\2\uffff\1\122\1\125\1\116\2"+
        "\117\1\124\1\172\1\105\1\125\1\111\1\172\1\120\1\124\3\uffff\1\125"+
        "\1\111\1\172\1\105\1\172\1\123\1\116\1\103\1\101\1\103\1\120\1\uffff"+
        "\1\116\1\124\1\114\1\uffff\1\105\1\111\1\114\1\116\1\uffff\1\172"+
        "\1\uffff\4\124\1\105\1\125\1\172\1\110\1\105\1\101\1\114\1\105\1"+
        "\172\1\uffff\2\172\1\111\1\172\1\104\1\124\1\uffff\2\172\1\124\2"+
        "\172\3\uffff\1\117\1\125\1\172\1\uffff\1\172\2\uffff\1\116\1\122"+
        "\2\uffff\1\172\1\105\1\uffff\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\4\uffff\1\4\1\5\1\6\1\7\1\10\14\uffff\1\30\1\31\1\32\1\33\1\34"+
        "\1\35\1\uffff\1\37\1\uffff\1\40\1\43\4\uffff\1\12\1\11\15\uffff"+
        "\1\42\1\36\1\41\13\uffff\1\20\3\uffff\1\24\4\uffff\1\3\1\uffff\1"+
        "\13\15\uffff\1\22\6\uffff\1\21\5\uffff\1\2\1\14\1\27\3\uffff\1\23"+
        "\1\uffff\1\26\1\1\2\uffff\1\17\1\25\2\uffff\1\15\1\uffff\1\16";
    static final String DFA12_specialS =
        "\172\uffff}>";
    static final String[] DFA12_transitionS = {
            "\2\37\1\uffff\2\37\22\uffff\1\37\1\27\1\6\5\uffff\1\7\1\10\1"+
            "\34\1\31\1\5\1\32\1\36\1\33\12\35\1\11\1\4\1\30\1\26\1\30\2"+
            "\uffff\1\25\1\2\1\13\1\22\1\3\1\14\2\25\1\17\3\25\1\1\1\25\1"+
            "\16\1\15\1\25\1\23\1\25\1\20\1\24\1\12\1\21\3\25\6\uffff\32"+
            "\25",
            "\1\40",
            "\1\41",
            "\1\43\1\uffff\1\42",
            "",
            "",
            "",
            "",
            "",
            "\1\44",
            "\1\46",
            "\1\47",
            "\1\51\10\uffff\1\50",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55\11\uffff\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\63",
            "",
            "\1\36\1\uffff\12\35",
            "",
            "",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "",
            "",
            "\1\72",
            "\1\73\6\uffff\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\102",
            "\1\103",
            "\1\104",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\106",
            "\1\107",
            "",
            "",
            "",
            "\1\110",
            "\1\111",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\113",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "",
            "\1\123",
            "\1\124",
            "\1\125",
            "",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\152",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\153",
            "\1\154",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\156",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            "",
            "\1\161",
            "\1\162",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            "\1\165",
            "\1\166",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\170",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( MODULE | BEGIN | END | SEMI | COMMA | STRINGLITERAL | OPENINGPARENTHESIS | CLOSINGPARENTHESIS | COLON | DEFINEDAS | VAR | CONST | FUNCTION | PROCEDURE | OUTPUT | IF | THEN | ELSE | WHILE | DO | REPEAT | UNTIL | TYPE | IDENTIFIER | EQUALITY | NONEQUALITY | COMPARISON | ADDITION | SUBTRACTION | DIVISION | MULTIPLICATION | FLOAT | COUNT | COMMENT | WS );";
        }
    }
 

}