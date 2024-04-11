

import java.util.Scanner;

/**
 * This is a program that counts in multiples of a specified number,
 * up to a specified maximum.
 * 
 * @author G. Ayorkor Korsah
 */
public class CountMultiples
{
  public static void main(String[] args)
  {
    int multiplier, limit;
    int currentNumber;
    Scanner input = new Scanner(System.in);
    
    System.out.println("I can count in multiples of any positive number.");
    System.out.print("You would like me to count in multiples of what number?" +
                     "(Enter a positive number) ");
    multiplier = input.nextInt();
    
    System.out.print("And what number would you like me to count up to? " +
                     "(Enter a positive number, but not too big) ");
    limit = input.nextInt();
    
    currentNumber = multiplier;
    
    while (currentNumber <= limit){
      System.out.print(currentNumber + " ");
      
      currentNumber += multiplier;
    }
    
    System.out.println("");
    System.out.println("I'm done!");
    
  }
}