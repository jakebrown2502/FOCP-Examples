//********************************************************************
//  GradeReport.java       Java Foundations
//
//  Demonstrates the use of a if else  statements
//********************************************************************

import java.util.Scanner;

public class GradeReport_usingIfelse
{
   //-----------------------------------------------------------------
   //  Reads a grade from the user and prints comments accordingly.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      int grade, category;

      Scanner scan = new Scanner (System.in);

      System.out.print ("Enter a numeric grade (0 to 100): ");
      grade = scan.nextInt();

      category = grade / 10;

      System.out.print ("That grade is ");

      
	(if == 10)
       {
           System.out.println ("a perfect score. Well done.");
        }
      else if ( category == 9)
           {
            System.out.println ("well above average. Excellent.");
            }
     	   else if ( category == 8)
                {
                 System.out.println ("above average. Nice job.");
          	}
		else if ( category == 7)  
                    {
       		     System.out.println ("average.");
		    }		   
		   else if ( category == 6)  
		     {
			System.out.print ("below average. Please see the ");
	               System.out.println ("instructor for assistance.");
                      }
                    else 
                     {
                     System.out.println ("not passing.");
                     }
     }
}
