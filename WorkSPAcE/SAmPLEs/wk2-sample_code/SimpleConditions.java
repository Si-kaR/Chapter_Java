
import java.util.Scanner;

/**
 * This is a very simple program to illustrate that boolean literals
 * and boolean variables are allowed as conditions inside if() statements
 * 
 * It also shows some simple boolean expressions that can be used as
 * conditions.
 * 
 * @author G. Ayorkor Korsah
 */
public class SimpleConditions
{
 public static void main(String[] args)
 {
   boolean boolVariable = true;
   int x;
   Scanner input = new Scanner(System.in);
   
   // use a boolean literal as a condition
   if (false)
     System.out.print("Hello");
   else
     System.out.print("Hi");
   
   // use a boolean variable as a condition
   if (boolVariable)
     System.out.println(" you!");
   else
     System.out.println(" there!");
   
   System.out.print("Please enter a whole number: ");
   x = input.nextInt();
   
   // use a simple boolean expression as a condition
   if (x < 0)
     System.out.println(x + " is a negative number.");
   else if (x > 0)
     System.out.println(x + " is a positive number.");
   else
     System.out.println(x + " is zero.");
 }
}