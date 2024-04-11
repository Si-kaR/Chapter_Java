// // import java.util.Scanner;

// // public class OneProg{
// // 	public static void main(String[] args){

// // 		// Task 1 HardCode two variables to contain int values. Add up the values. 
// // 		// Display their sum
// // 		int a = 31;
// // 		int b = 4;
// // 		int sum = a + b;
// // 		System.out.println("");
// // 		System.out.println("Sum of hardcoded values: " + sum);


// // // Task 2 Take two int values as input from usr. Add up the values. Display their sum

// // 	    // Creating tool for scanning
// // 		Scanner input = new Scanner(System.in);

// // 	    // Ask for usr input
// // 		System.out.print("Enter your first number: ");
// // 		// Take usr input
// // 		int c = input.nextInt();
// // 	    // Ask for usr input
// // 		System.out.print("Enter your second number: ");
// // 		// Take usr input
// // 		int d = input.nextInt();
	    
// // 		int total = c + d;
// // 	    // Display usr input
// // 		System.out.println("The total is: "+total);
// // 		System.out.println();


// // 		System.out.println(2^3);
// // 		System.out.println(4e2);

// // 		input.close();


// // 	}

// // }


// =============================================================================================================================================


// import java.util.Scanner;

// /**
//  * This class demonstrates basic Java functionalities.
//  */
// public class BasicJavaProgram1 {

//     /**
//      * Main method to execute the program.
//      *
//      * @param args command-line arguments (unused in this example)
//      */
//     public static void main(String[] args) {
//         displayHardcodedSum();
//         displayUserInputSum();
//         demonstrateOperators();
//     }

//     /**
//      * Task 1: Add hardcoded integers and display their sum.
//      */
//     private static void displayHardcodedSum() {
//         int num1 = 31;
//         int num2 = 4;
//         int sum = num1 + num2;

//         System.out.println("Task 1:");
//         System.out.println("Sum of hardcoded values: " + sum);
//         System.out.println();
//     }

//     /**
//      * Task 2: Take user input, add integers, and display their sum.
//      */
//     private static void displayUserInputSum() {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter your first number: ");
//         int firstNumber;
//         try {
//             firstNumber = scanner.nextInt();
//         } catch (Exception e) {
//             System.out.println("Invalid input. Please enter a valid integer.");
//             return;
//         }

//         System.out.print("Enter your second number: ");
//         int secondNumber;
//         try {
//             secondNumber = scanner.nextInt();
//         } catch (Exception e) {
//             System.out.println("Invalid input. Please enter a valid integer.");
//             return;
//         }

//         int total = firstNumber + secondNumber;
//         System.out.println("The total is: " + total);
//         System.out.println();

//         scanner.close();


//     }

//     /**
//      * Demonstrates basic operators in Java.
//      */
//     private static void demonstrateOperators() {
//         // Bitwise XOR operator: 2 ^ 3
//         System.out.println("Result of 2 ^ 3: " + (2 ^ 3));

//         // Scientific notation: 4e2
//         System.out.println("Result of 4e2: " + (4e2));
//     }


// }


// =============================================================================================================================================



import java.util.Scanner;

/**
 * This class demonstrates basic Java functionalities.
 */
public class BasicJavaProgram1 {

    /**
     * Main method to execute the program.
     *
     * @param args command-line arguments (unused in this example)
     */
    public static void main(String[] args) {
        displayHardcodedSum();
        displayUserInputSum();
        demonstrateOperators();
    }

    /**
     * Task 1: Add hardcoded integers and display their sum.
     */
    private static void displayHardcodedSum() {
        int num1 = 31;
        int num2 = 4;
        int sum = num1 + num2;

        System.out.println("Task 1:");
        System.out.println("Sum of hardcoded values: " + sum);
        System.out.println();
    }

    /**
     * Task 2: Take user input, add integers, and display their sum.
     */
    private static void displayUserInputSum() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Task 2:\nEnter your first number: ");
        int firstNumber;
        try {
            firstNumber = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.close();
            return;
        }

        System.out.print("Enter your second number: ");
        int secondNumber;
        try {
            secondNumber = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.close();
            return;
        }

        int total = firstNumber + secondNumber;
        System.out.println("The total is: " + total);
        System.out.println();

        scanner.close();
    }

    /**
     * Demonstrates basic operators in Java.
     */
    private static void demonstrateOperators() {
        // Bitwise XOR operator: 2 ^ 3
        int bitwiseXORResult = 2 ^ 3;
        System.out.println("Bitwise XOR result of 2 ^ 3: " + bitwiseXORResult);

        // Scientific notation: 4e2
        double scientificNotationResult = 4e2;
        System.out.println("Scientific notation result of 4e2: " + scientificNotationResult);
    }
}
