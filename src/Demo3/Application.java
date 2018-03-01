//in this demo, main calls the problematic method
//and you can either "throw" or "try catch" in main

package Demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Application {

	public static void main(String[] args) throws FileNotFoundException {
		
		openFile();

	}
	
	public static void openFile() throws FileNotFoundException {
		
		File file1 = new File("resume.txt");
		
		FileReader fr = new FileReader(file1);
	}
}

//good practice: instead of printing stack traces, 
//let users see a message about what went wrong.
//stack traces alarm users lol
