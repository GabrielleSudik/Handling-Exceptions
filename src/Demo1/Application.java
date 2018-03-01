//make sure you look at all three applications in this project.

//this one shows how to "throw" when there is an exception

package Demo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//handling exceptions
//simple lesson.
//more complicated stuff later

public class Application {

	public static void main(String[] args) throws FileNotFoundException {
		
		//don't worry about the classes and stuff
		//this is a lesson about handling exceptions
		
		File file1 = new File("resume.txt");
		//tip: ctrl shift O imports the class and adds it above
		
		FileReader fr = new FileReader(file1);
		//you needed to click the red error x to add some stuff
		//specifically, the FileNotFoundException stuff
		
		//if you run it here, you'll get a bunch of red text in the console.
		//it tells you what went wrong.
		//called a stack trace.
		//clicking links in the red text can show where the errors occur
		
		
		

	}

}
