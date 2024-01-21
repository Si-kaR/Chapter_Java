import java.util.Scanner;

public class InputMultiplier {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int UserInput;
        System.out.print("\nEnter positive integer: ");
        UserInput = input.nextInt();
        
        System.out.println("\nDisplaying Multiples of " + UserInput);


        for ( int counter = 0; counter <= 100; counter += UserInput ) {
            if (counter >= 100) {
                System.out.println("\nValue is > > > >  " + counter + "\n");
                System.out.println("\nValue is nearest to 100\n");
                System.out.println("Bye bye\n");
                input.close();
                break;
            } else {
                System.out.println("\nValue is > > > >  " + counter + "\n");
                input.close();
            }
            input.close();
        }
        input.close();
    }
}