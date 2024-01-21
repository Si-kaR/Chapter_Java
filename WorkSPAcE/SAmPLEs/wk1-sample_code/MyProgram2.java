import java.util.Scanner;

public class MyProgram2 {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int a = keyboard.nextInt();
		System.out.print("Enter second number: "); 
		int b = keyboard.nextInt();
		int sum = a+b;
		System.out.println(sum);
		
		if (sum == 0)
			System.out.println("Sum is 0");
		else if (sum%2==0)
			System.out.println("Sum is even.");
		else
			System.out.println("Sum is odd.");
	}
}