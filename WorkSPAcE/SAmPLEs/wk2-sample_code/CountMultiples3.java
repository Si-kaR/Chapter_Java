
import java.util.Scanner;

/**
 * This is a program that counts in multiples of a specified number,
 * up to a specified maximum.  This version of the program has
 * checks to prevent bad input from the user.  It also uses the
 * condition (!goodInput), meaning (goodInput == false)
 * 
 * @author G. Ayorkor Korsah
 */
public class CountMultiples3
{
  // a constant representing the maximum number of times we would
  // like to run the while loop.
  public static final int MAX_TIMES = 500;
  
  // constants representing valid responses to yes/no questions
  public static final String YES = "Y";
  public static final String NO = "N";
  
  public static void main(String[] args)
  {
    int multiplier, limit, numTimes;
    int currentNumber;
    boolean goodInput;
    String answer;
    Scanner input = new Scanner(System.in);
    
    System.out.println("I can count in multiples of any positive number.");

    // initialize variables that I will use in the input loop to get the multiplier
    multiplier = 0;
    goodInput = false;
    
    // get the multiplier from the user, and keep trying to get input until the input
    // is good.
    while (!goodInput) {
      System.out.print("You would like me to count in multiples of what number? ");
      multiplier = input.nextInt();
      if (multiplier > 0)
        goodInput = true;
      else
        System.out.println("Please enter a strictly positive number.");
    }
    
    // initialize variables that I will use in the input loop to get the limit
    limit = 0;
    goodInput = false;
    
    // get the limit input from the user and keep trying to get input until the
    // input is good.
    while (!goodInput){
      System.out.print("And what number would you like me to count up to? ");
      limit = input.nextInt(); 
      
      // figure out how many times the loop will need to be run if we use this limit
      numTimes = limit/multiplier; 
  
      // if the loop will need to be run too many times, check whether the user
      // would really like to continue, or to change the limit
      if (numTimes > MAX_TIMES){
        System.out.println("I will need to execute the loop " + numTimes + " times.");
        System.out.println("Are you sure you want me to continue? (Y/N) ");
        answer = input.next();
        
        // if the user wants to go on, setting goodInput to true will allow us to
        // exit out of the loop.  Notic that this 'if' has no else.  Which means
        // that if the answer is not YES, goodInput will stay at its previous value
        // of false
        if (answer.equalsIgnoreCase(YES))
          goodInput = true;
      }
      else {
        goodInput = true;
      }
    }
    
    // Now that we have good input, we can finally do the counting
    currentNumber = multiplier;
    while (currentNumber <= limit){
      System.out.print(currentNumber + " ");
      
      currentNumber += multiplier;
    }
    
    System.out.println("");
    System.out.println("I'm done!");
  }
}