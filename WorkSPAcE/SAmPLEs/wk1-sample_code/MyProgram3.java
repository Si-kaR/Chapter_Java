import java.util.Scanner;

public class MyProgram3 {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int a,b,sum;

		for (int i=0; i<10; i++) {
			System.out.print("Enter first number: ");
			a = keyboard.nextInt();
			System.out.print("Enter second number: "); 
			b = keyboard.nextInt();
			sum = a+b;
			System.out.println(sum);

			if (sum == 0)
				System.out.println("Sum is 0");
			else if (sum%2==0)
				System.out.println("Sum is even.");
			else
				System.out.println("Sum is odd.");
		}
	}
}