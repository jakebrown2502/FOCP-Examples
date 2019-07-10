import java.util.Scanner;

public class While_Loop_Exmaple {

public static void main(String[] args)
	
	{
		Scanner keyboard = new Scanner (System.in);
		
		String[] names = new String[5];
		int index = 0;
		
		while (index < 5)
		{
			System.out.print("Enter a name: ");
			names[index] = keyboard.nextLine();
			index = index + 1;
			
		}
		
		index = 0;
		while (index < 5)
		{
			System.out.println(names[index]);
			index = index + 1;
		}
	}


}
