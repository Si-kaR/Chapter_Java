import java.util.Scanner;

public class MyProgram {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int a = keyboard.nextInt();
		System.out.print("Enter second number: "); 
		int b = keyboard.nextInt();
		int sum = a+b; 
		System.out.println(sum);
		keyboard.close();
	}
}