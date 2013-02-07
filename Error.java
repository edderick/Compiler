import java.io.*;

/**
 * DO NOT CHANGE
 *  
 * Part of test harness.
 * Use to report errors.
 * Implement compiler in Niklaus.compile.
 */
public class Error {

	private PrintStream stream;
	
	public Error(PrintStream stream) {
		this.stream = stream;
	}
	
	/**
	 * Should be used to report syntax and contextual errors
	 * @param line - line number
	 * @param chr - character offset on line
	 * @param msg - error message
	 */
	public void error(int line, int chr, String msg) {
		stream.println("error line " + line + ":" + chr + " " + msg);
	}
		
}
