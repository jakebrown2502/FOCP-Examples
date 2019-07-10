import java.util.Scanner;

public class StringFormating {

public static void main(String[] args)
	
	{
		Scanner keyboard = new Scanner (System.in);
		
		String[] description = new String[5];
		int index, quantity;
		quantity = 1;
		float price = 0;
		
		for (index = 0; index < 5; index++)
		{
			System.out.print("Enter description: ");
			description[index] = keyboard.nextLine();
					
		} 
		
		System.out.println(String.format("%-20s", "Description")+
				String.format("%-8s", "Price")+ 
				"\t"+ String.format("%-10s",  "Quantity"));
			
		for (index = 0; index < 5; index++)
		{
			price = price + index + 0.5f;
			quantity = quantity + index;
			System.out.println(String.format("%-20s", description[index])+
					String.format("%6.2f", price)+
					"\t"+ String.format("%-8d",  quantity));
		} 
	}


}
