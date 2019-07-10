import java.util.Scanner;

//Example which shows how to convert a string to an integer, ensuring that the number is valid.
 
 
public class NumberProcessor {

	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);	// get input from the keyboard
		
		System.out.println("Enter a number, or something else if you like :");
				
		String line = s.nextLine();	// read a line of text and store in a String
		
		line = line.trim();	// strip any spaces from the beginning or end of the line
		
		try {	// "try" is a special statement which allows us to deal with "exceptions"
			
			int num = Integer.parseInt(line);	// attempt to convert the String into an Integer type value
			
			System.out.println("The number entered was "+num);
		}
		catch (NumberFormatException e) {
			
			// The number did not parse for some reason
			System.out.println("Invalid number entered");
		}
	}

}