import java.util.Scanner;

/**
 * This is a simple program to ilustrate the use of a loop
 * for printing out the individual characters in a String.
 **/
public class NameTest {
  
  public static void main(String[] args){
    
    String name;
    Scanner input = new Scanner(System.in);
    
    System.out.println("What is your name? ");
    name = input.next();
    
    System.out.println("First, using a for loop: ");
    
    // Print out the individual characters in the string, using a for-loop
    for (int i=0; i < name.length(); i++) {
      System.out.print("The character at index " + i + " is: ");
      System.out.println( name.charAt(i) );
    }
    
    System.out.println();
    System.out.println("Now, using a while loop");

    // Print out the individual characters in the string, using a while-loop
    int index = 0;
    while (index < name.length()) {
      System.out.print("The character at index " + index + " is: ");
      System.out.println(name.charAt(index));
      index++;
    }
    
  }
}