import java.io.*;
import org.antlr.runtime.*;

/**
 * DO NOT CHANGE
 * 
 * Test harness main class
 * Implement compiler in Niklaus.compile.
 */
public class Main {
	
	/**
	 * Test harness main method. Should not be altered.
	 * To implement compiler extend Niklaus.compile.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {	
        // examine input arguments
		if (args.length > 0) {
			if (args[0].equals("-h")) {
			    // display usage
				printUsage();
				return;
			} else if (!args[0].equals("-")) {
				// open file from path
				String fileName = args[0];
				File f = new File(fileName);
				if (f.exists()) {
					try {
					    compileFile(new ANTLRFileStream(fileName, "UTF8"));
					    return;
					} catch (IOException ex) {
				        printUsage();
			            System.err.println("IOException: " + ex.getMessage());
			            return;
					}
				} else {
					printUsage();
					System.err.println("File " + fileName + " does not exist.");
					return;
				}
			}
		}
		
		// default: read from standard input
		try {
		    compileFile(new ANTLRInputStream(System.in));
	    } catch (IOException ex) {
	        System.err.println("IOException: " + ex.getMessage());
		}
	}
	
	private static void printUsage() {
		System.out.println("Niklaus compiler");
		System.out.println("Usage: java Main ...");
		System.out.println("  -h       displays this message");
		System.out.println("  PATH     compiles single file at PATH");
		System.out.println("  -        compiles source supplied on standard input");
	}
	
	private static void compileFile(CharStream stream) {
	    // error stream
	    Error err = new Error(System.err);
	    
	    // compile stream
	    Niklaus compiler = new Niklaus();
	    compiler.compile(err, stream, System.out);
	}

}
