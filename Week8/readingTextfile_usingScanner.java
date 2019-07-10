import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class readingTextfile_usingScanner {

	public static void main(String[] args)
	{
		
	String line;
	
	File Fileobject = new File ("data.txt");
	
	Scanner fileReader  = new Scanner (Fileobject);
		
		// Read and display each line in the file
	while(fileReader.hasNext())
	{
			line = fileReader.nextLine();
			System.out.println(line);

	}
		
	fileReader.close();
	
	
	
	
	}
}
