import java.util.Scanner;

public class OneProg{
	public static void main(String[] args){

		// Task 1 HardCode two variables to contain int values. Add up the values. 
		// Display their sum
		int a = 31;
		int b = 4;
		int sum = a + b;
		System.out.println("");
		System.out.println("Sum of hardcoded values: " + sum);


// Task 2 Take two int values as input from usr. Add up the values. Display their sum

	    // Creating tool for scanning
		Scanner input = new Scanner(System.in);

	    // Ask for usr input
		System.out.print("Enter your first number: ");
		// Take usr input
		int c = input.nextInt();
	    // Ask for usr input
		System.out.print("Enter your second number: ");
		// Take usr input
		int d = input.nextInt();
	    
		int total = c + d;
	    // Display usr input
		System.out.println("The total is: "+total);
		System.out.println();


		System.out.println(2^3);
		System.out.println(4e2);

		input.close();


	}

}
