// // import java.util.Scanner;

// public class While {

//     /**
//      * This class makes use of the while loop.
//      * Just practicing While___Loops
//      * @param args
//      */

//     public static void main(String[] args) {


//         // Scanner askName = new Scanner(System.in);

//         // Scanner _- - -_ = new Scanner(System.in);
//         // String variable = "";

//         int count = 2;
//         String asterisk = "*";

//         // String drawpattern;

//         // while (count < 100) {
//         //     // System.out.printf("%s\n", count);
//         //     // drawpattern = asterisk + count;
//         //     System.out.print(asterisk);
//         //     count++;
//         // }
//         while ( count < 5 ) {
//             for (int i = 0; i < count; i++){
//                 System.out.printf("%s", asterisk);
//             }
//             System.out.println();
//             count++;
//         }



//         // While loop will keep running while condition is true
//         // while (1==1) {
//         //     System.out.println("Help ! I am stuck in a while loop running on condition 1 = = 1 ! ! !");
//         // }
        

//         // Now ask for user input. 
//         // Keep asking until User enters name. 

//         // while (name.isBlank()) {

//         //     System.out.print("\nEnter your name: ");
//         //     name = askName.nextLine();

//         // }

//         // System.out.printf("\nHi %s", name);


//         // do {

//         //     System.out.print("\nEnter your name: ");
//         //     name = askName.nextLine();

//         // } while (name.isBlank());

//         // System.out.printf("\nHi %s", name);

//         // while (count < 100) {
//         //     System.out.printf("\nCounting ! \nCurrently on %d !!\n", count);
//         //     count++;
//         // }
//         // System.out.printf("\n\nDone counting!!! \nHave counted up to a %d now!!!", count);

        





//         // askName.close();

//     }
// }
















































// import java.util.Scanner;

// public class While {
//     public static void main(String[] args) {
//     int number1 = (int)(Math.random() * 10);
//     int number2 = (int)(Math.random() * 10);

//     // Create a Scanner
//     Scanner input = new Scanner(System.in);

//     System.out.print("\nWhat is " + number1 + " + " + number2 + "? ");

//     int answer = input.nextInt();

//     while (number1 + number2 != answer) {

//         System.out.print("\nWrong answer. Try again. What is " + number1 + " + " + number2 + "? ");

//         answer = input.nextInt();
//     }

//     System.out.println("You got it!");

//     input.close();
// }
// }




















import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner takeAnswer = new Scanner(System.in);
        
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int answer;

        do {
            System.out.printf("\nWhat is %d + %d ?\n Enter answer : > > > > >", number1, number2);
            answer = takeAnswer.nextInt();
        } while (number1+number2!=answer){
        System.out.printf("\nYour answer [%d] is wrong ! Please try again");
        }
    }
    system.out.printf("\nYour answer [%d] is correct !!!", answer);
    takeAnswer.close();
}
}