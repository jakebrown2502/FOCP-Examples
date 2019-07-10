// Average.java   
// This program computes and displays the sum & average of 
// a set of whole numbers entered by the user.
//-----------------------------------------------------------------
    
import java.util.Scanner;

public class Average
{   
   public static void main (String[] args)
   {
      int sum = 0, value = 1, count = 0;
      double average;
      String temp;
      Scanner keyboard  = new Scanner (System.in);

      while (value != 0)  // sentinel value of 0 to terminate loop
      {   	  
    	  System.out.print ("Enter an integer (0 to quit): ");
	      temp = keyboard.nextLine();
	      value = Integer.valueOf(temp);
    	  if ( value != 0)
		      {
		      count++;
		      sum += value;
	    	 }
      }
      System.out.println ();
      if (count == 0)
         System.out.println ("No values were entered.");
      else
      {
         average = (double)sum / count;
         System.out.println ("You entered " + count + " numbers");
         System.out.println ("The sum of numbers is: " + sum);
         System.out.println ("The average of numbers is: " + average);
      }
   }
}
