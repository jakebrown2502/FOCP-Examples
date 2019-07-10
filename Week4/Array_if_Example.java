import java.util.Scanner;

public class Array_if_Example {
		public static void main(String[] args)
	   {
	     
	         String[] items  = {"Laptop", "PC", "USB"};
	         String userInput;
	         String message = "Not in stock";
	          
	         Scanner scan = new Scanner(System.in);

	         System.out.print("Enter description of an item: ");

	         userInput = scan.nextLine();
	         
	         
	         if(userInput.equals(items[0]))
	             message = userInput+ " is in stock";
	         
	         if(userInput.equals(items[1]))
	        	 message = userInput+ " is in stock";
	         
	         if(userInput.equals(items[2]))
	        	 message = userInput+ " is in stock";
	         
	                 	           
		     System.out.println(message);
	   }
	
}
