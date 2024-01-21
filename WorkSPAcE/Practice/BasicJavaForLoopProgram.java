// /**
// * Importing all resources or classes that will be necessary for the program
// */
// import java.util.Scanner;

// /**
// * This program is to teach Basic Java
// */

// public class BasicJavaForLoopProgram {
//     /**
//      * Main Method to Execute program
//      * 
//      * @param args
//      */

//      public static void main(String[] args){
//         LoopProgram();
//      }

//      /** 
//       * This function demonstrates a Loop in a Program
//       */
//       private static void LoopProgram(){
//              /** 
//               * Creating Scanner tool
//               */
//               Scanner input = new Scanner (System.in);

//               /**
//                * For loop && Purposed Functionalities of Program 
//                */
//               for (int i=10; i>0; i--){
//                 /**
//                  * Ask for User First input
//                  */
//                 System.out.println("\nEnter first number");
//                 int firstNum;
//                 try{
//                     firstNum = input.nextInt();
//                 } catch (Exception e) {
//                     System.out.println("Invalid input! Please try again _ enter an integer: ");
//                     return;
//                 }

//                 /**
//                  * Ask for User next Input
//                  */
//                 System.out.println("Enter second input: ");
//                 int SecondNum;
//                 try {
//                     SecondNum = input.nextInt();
//                 } catch (Exception e) {
//                     System.out.println("Invalid input! Please try again _ enter an integer");
//                     return;
//                 }

//                 /**
//                  * Finding Sum of variables
//                  */
//                 int sum = firstNum + SecondNum;
//                 System.out.println("Total is : " + sum + "\n");
                
//               }
            

//       }
// }











import java.util.Scanner;

/**
 * This program demonstrates basic Java concepts using a for loop.
 */
public class BasicJavaForLoopProgram {

    /**
     * Main method to execute the program.
     *
     * @param args command-line arguments (unused in this example)
     */
    public static void main(String[] args) {
        loopProgram();
    }

    /**
     * This method demonstrates a loop in the program.
     */
    private static void loopProgram() {
        // Creating a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Loop to prompt user 10 times
        for (int i = 10; i > 0; i--) {
            // Prompting user for the first number
            System.out.print("Enter the first number: ");
            int firstNum;
            try {
                firstNum = input.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter an integer.");
                input.nextLine();  // Clearing the input buffer
                continue;  // Skipping the current iteration
            }

            // Prompting user for the second number
            System.out.print("Enter the second number: ");
            int secondNum;
            try {
                secondNum = input.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter an integer.");
                input.nextLine();  // Clearing the input buffer
                continue;  // Skipping the current iteration
            }

            // Calculating and displaying the sum
            int sum = firstNum + secondNum;
            System.out.println("The sum is: " + sum + "\n");
        }

        // Closing the Scanner object after its use
        input.close();
    }
}
