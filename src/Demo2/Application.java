//this demo shows the "try catch" way of handling exceptions

package Demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Application {

	public static void main(String[] args) {

		File file1 = new File("resume.txt");

		// this time, use the menus to select Add Try/Catch
		try {
			FileReader fr = new FileReader(file1);
		} catch (FileNotFoundException e) {
			e.printStackTrace(); //this is default code
			//but you can write new code. like:
			System.out.println("File not found: " + file1.toString());
		}
		//unlike other approach, it doesn't throw the exception in main
		//instead it runs some code if the exception is caught
	}
}
