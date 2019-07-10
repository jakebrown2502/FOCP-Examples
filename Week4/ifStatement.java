import java.util.Scanner;

public class ifStatement {

	public static void main(String[] args) {
		
		int[]  numbers = new int[2];
		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.print("Enter first number: ");
		numbers[0] = keyboard.nextInt();
		
		System.out.print("Enter second number: ");
		numbers[1] = keyboard.nextInt();
		
		//Compare the numbers
		
		if (numbers[0] == numbers[1] )
			System.out.print(" The numbers are equal");
		
		if (numbers[0] > numbers[1] )
			System.out.print("First number is bigger than second number");
		
		if (numbers[0] < numbers[1] )
			System.out.print("First number is smaller than second number");
		
		
		

	}

}
