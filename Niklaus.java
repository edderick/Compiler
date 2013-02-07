import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTreeNodeStream;

/**
 * Skeleton class to be extended to implement compiler
 */
public class Niklaus {
	public static Boolean fail = false;
	/**
	 * Must supply this default constructor to test harness
	 */
	public Niklaus () {
	}

	/**
	 * This method is used by the test harness to launch your 
	 * compiler. The input stream should be passed to your Lexer
	 * and all errors *including ANTLR parser errors* must be
	 * reported to the err object using the methods provided.
	 * 
	 * @param err - use for error reporting
	 * @param source - input stream for Lexer
	 * @param dest - output stream that java code generated should be written to.
	 */
	public void compile(Error err, CharStream source, PrintStream dest) {
		try { 

			// Lexer/parser:
				// assuming ANTLR grammar is Niklaus in Niklaus.g

			// The following should be included at the top of your grammar
			// to report errors using the Error class supplied
			/*
            @members {
                public Error err;
                public void displayRecognitionError(String[] tokenNames,
                                        RecognitionException e) {
                    String msg = getErrorMessage(e, tokenNames);
                    err.error(e.line, e.charPositionInLine, msg);
                }
            }
			 */
			

			NiklausLexer l = new NiklausLexer(source); 
			CommonTokenStream tokens = new CommonTokenStream(l);
			NiklausParser g = new NiklausParser(tokens);
			g.err = err;
			NiklausParser.module_return module = g.module(); 

			// Contextual constraints:
			if(!fail){
				CommonTreeNodeStream nodes = new CommonTreeNodeStream(module.tree); 
				NiklausChecker checker = new NiklausChecker(nodes); 
				checker.module();

				// Code generation
				if(!fail){
					nodes = new CommonTreeNodeStream(module.tree); 
					NiklausGenerator generator = new NiklausGenerator(nodes); 
					generator.out = dest;
					generator.module();
				}
			}

		} catch (RecognitionException ex) {

			// catches errors not handled in the parser
			err.error(ex.line, ex.charPositionInLine, ex.getMessage());
			System.out.println("Not handled by compier!");
		}
	}

}