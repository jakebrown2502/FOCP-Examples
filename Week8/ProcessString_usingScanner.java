import java.util.Scanner;
public class ProcessString_usingScanner {

	public static void main(String[] args)
	{
		
	String line;
	String partofline;
	
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter a line fo text containing spaces : ");
	line = keyboard .nextLine();
	
	// Specify the input source 
	Scanner lineScan = new Scanner (line);
	
	// Display each part of the line
	while(lineScan.hasNext())
	{
		partofline = lineScan.next();
		System.out.println(partofline);

	}
	keyboard.close();
	lineScan.close();

	}

}
