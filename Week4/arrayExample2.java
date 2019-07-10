import java.util.Scanner;

public class arrayExample2 {

	public static void main(String[] args) {
		String[] names = new String[5];
		
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Enter name1: ");
		names[0] = keyboard.nextLine();
		
		System.out.print("Enter name2: ");
		names[1] = keyboard.nextLine();
		
		System.out.print("Enter name3: ");
		names[2] = keyboard.nextLine();
		
		System.out.print("Enter name4: ");
		names[3] = keyboard.nextLine();
		
		System.out.print("Enter name5: ");
		names[4] = keyboard.nextLine();
		keyboard.close();
		
		


	}

}
