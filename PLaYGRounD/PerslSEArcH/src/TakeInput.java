import java.util.Scanner;

public class TakeInput {

    public static void main(String[] args) {
        
        // In this program we will learn how to accept input from a user

        //To do this we have to start by importing the scanner library
        // outside the class. as import java.util.scanner;

        // Now that that is done, ......................................

        //create scanner object
        Scanner scanner = new Scanner(System.in);

        // Create a reason to take the User's input
        System.out.print("What is your name? =_=_=_=_=_=_=_=_= ");

        // Take the Users input
        String name = scanner.nextLine();

        // Now let's show we have their name 
        // Display a message to the user
        System.out.println();
        System.out.println("Hello "+name+"!");
        System.out.println("I am Rava, Your Personal Assistant !");
        System.out.println();



        System.out.println("I need to know more about you!");
        System.out.print("How old are you?=_=_=_=_=_=_=_=_= ");

        // Take the Users input
        int age = scanner.nextInt();
        System.out.println();
        System.out.println("Wow "+age+"?");
        System.out.println("I'm impressed at your live's achievements, "+name+"!");


        // Close the Scanner object
        scanner.close();




    }
    
}
