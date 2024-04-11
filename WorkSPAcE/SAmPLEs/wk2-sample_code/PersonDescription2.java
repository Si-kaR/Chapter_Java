
import java.util.Scanner;

/**
 * This is a program to illustrate the use of nested if...else blocks
 * It outputs a description of a person, based on their age and gender.
 * 
 * @author G. Ayorkor Korsah
 */
public class PersonDescription2 
{
  public static final String MALE = "male";
  public static final String FEMALE = "female";
  public static final int ADULT = 18;
  
  public static void main(String[] args)
  {
    int age;
    String gender;
    Scanner input = new Scanner(System.in);
    
    System.out.print("How old are you? ");
    age = input.nextInt();
    
    System.out.print("Are you male or female? ");
    gender = input.next();
   
    if (gender.equalsIgnoreCase(MALE)) {
      if (age < ADULT)
        System.out.println("You are a boy.");
      else
        System.out.println("You are a man.");
    }
    
    else if (gender.equalsIgnoreCase(FEMALE)) {
      if (age < ADULT)
        System.out.println("You are a girl.");
      else
        System.out.println("You are a woman.");
    }
    
    else {
      System.out.println("I'm not quite sure what you are!");
    } 
    
  }
}