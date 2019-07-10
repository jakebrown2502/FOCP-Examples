import java.util.Scanner;

public class for_Loop_Example {

public static void main(String[] args)
	
	{
		Scanner keyboard = new Scanner (System.in);
		
		String[] names = new String[5];
		int index;
		
		for (index = 0; index < 5; index++)
		{
			System.out.print("Enter a name: ");
			names[index] = keyboard.nextLine();
					
		} 
		
				
		for (index = 0; index < 5; index++)
		{
			System.out.println(names[index]);
			
		} 
	}


}
