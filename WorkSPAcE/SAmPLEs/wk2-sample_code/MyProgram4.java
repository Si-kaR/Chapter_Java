import java.util.Scanner;

public class MyProgram4 {

	public static void main(String[] args){
		int sum;
		do {
			sum = readAndSum();
			System.out.println(sum);
			if (sum%2==0)
				System.out.println("Sum is even.");
			else
				System.out.println("Sum is odd.");
		} while (sum!=0);
		
		System.out.println("Sum is 0. Bye!");
		return;
	}

	public static int readAndSum(){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = keyboard.nextInt();
		System.out.print("Enter second number: "); 
		int b = keyboard.nextInt();
		int sum = a+b;
		return sum;
	}
}