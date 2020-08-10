package day18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionFileOpen {
	public static String getFirstLine() throws FileNotFoundException {
		BufferedReader in = null;
		String line = null;
		
		in = new BufferedReader(new FileReader("log.txt"));
		return line;
		
		
	}
}
