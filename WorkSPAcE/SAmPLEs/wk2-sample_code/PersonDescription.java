
import java.util.Scanner;

/**
 * This is a program to illustrate the use of if...else. 
 * It outputs a description of a person, based on their age and gender.
 * 
 * @author G. Ayorkor Korsah
 */
public class PersonDescription 
{
  public static final String MALE = "male";
  public static final String FEMALE = "female";
  public static final int GROWN_UP = 18;
  public static final int MIN_TEEN = 13;
  public static final int MAX_TEEN = 19;
  
  public static void main(String[] args)
  {
    int age;
    String gender;
    Scanner input = new Scanner(System.in);
    
    System.out.print("How old are you? ");
    age = input.nextInt();
    
    System.out.print("Are you male or female? ");
    gender = input.next();
   
    
    if (age < MIN_TEEN)
      System.out.println("You are a child.");
    else if (age >= MIN_TEEN && age <= MAX_TEEN)
      System.out.println("You are a teenager.");
    else 
      System.out.println("You are an adult.");
    
      
    if (age < GROWN_UP && gender.equalsIgnoreCase(MALE))
      System.out.println("You are a boy.");
    else if (age < GROWN_UP && gender.equalsIgnoreCase(FEMALE))
      System.out.println("You are a girl.");
    else if (age >= GROWN_UP && gender.equalsIgnoreCase(MALE))
      System.out.println("You are a man.");
    else if (age >= GROWN_UP && gender.equalsIgnoreCase(FEMALE))
      System.out.println("You are a woman.");
    else {
      System.out.println("I'm not quite sure what you are!");
    } 
  }
}