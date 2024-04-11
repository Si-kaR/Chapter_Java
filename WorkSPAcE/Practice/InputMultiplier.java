// import java.util.Scanner;

// public class InputMultiplier {
//     public static void main(String[] args){

//         Scanner input = new Scanner(System.in);

//         int UserInput;
//         System.out.print("\nEnter positive integer: ");
//         UserInput = input.nextInt();
        
//         System.out.println("\nDisplaying Multiples of " + UserInput);


//         for ( int counter = 0; counter <= 100; counter += UserInput ) {
//             if (counter >= 100) {
//                 System.out.println("\nValue is > > > >  " + counter + "\n");
//                 System.out.println("\nValue is nearest to 100\n");
//                 System.out.println("Bye bye\n");
//                 input.close();
//                 break;
//             } else if {
//                 System.out.println("\nValue is > > > >  " + counter + "\n");
//                 input.close();
//             } else (counter > 100 ) {
//                 System.out.println("\nValue is  > > > >  100")
//                 System.out.println("Value exceeds hundred now 100\nhowever I will not display those values\n");
//                 System.out.println("\nBye bye\n");
//             }
//             input.close();
//         }
//         input.close();
//     }
// }


import java.util.Scanner;

public class InputMultiplier {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int userNumber;
        System.out.print("\nEnter a positive integer: ");
        userNumber = input.nextInt();

        System.out.println("\nDisplaying Multiples of " + userNumber);

        for (int counter = 0; counter <= 100; counter += userNumber) {
            if (counter >= 100) {
                System.out.println("\nValue is > > > >  " + counter + "\n");
                System.out.println("\nValue is nearest to 100\n");
                System.out.println("Bye bye\n");
                break;
            } else {
                System.out.println("\nValue is > > > >  " + counter + "\n");
            }

            if (counter > 100) {
                System.out.println("\nValue is  > > > >  100");
                System.out.println("Value exceeds hundred now 100\nhowever I will not display those values\n");
                System.out.println("\nBye bye\n");
                break;
            }
        }
        input.close();
    }
}
