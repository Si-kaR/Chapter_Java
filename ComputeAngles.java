/**
 * --------------------------------------------------------------
 * Project: Compute Angle of Triangle
 * Author:  [ Robert  Sika ]
 * Student ID: [ 89212025 ]
 * Date of Commencement: [ Thursday - January 25, 2024]
 * Time of Commencement: [ 10 : 00 pm]
 * Date of Completion: [January 26, 2024 - Monday]
 * Time of Completion: [ 2:00am]
 * University: [ Ashesi University ]
 * Faculty: [ Dr.Ayorkor Korsah ]
 * Faculty Intern: [ Elijah Boateng  &  Gideon - - - - ]
 * --------------------------------------------------------------
 * Description:
 * This Java program computes the three angles of a triangle.
 * The user is prompted to provide the three coordinate points of the triangle,
 * and the program provides the length of the triangle, as well as the angle
 * between the lengths that make up the triangle.
 * --------------------------------------------------------------
 */

 
 /**
  * Importing the Math and Scanner class for Math Methods and Input function respectively
  */
import java.lang.Math;
import java.util.Scanner;

public class ComputeAngles {

    /**
     * This class will compute the angle of a triangle 
     * given the coordinates provided by the user
     * 
     * @param 
     */
    public static void main(String[] args) {
        
        /**
         * Display welcome message to user
         */
        System.out.println("\nHi There, 👋🫠\nI'll be your CalcBot for the time being.🫠\n🤺 will compute the SIDE_LENGTH  &  ANGLE of your triangle🧘🏼");
        
        /**
         * Creating scanner object to take input user input
         */
        Scanner inputKeys = new Scanner(System.in);

        /**
         * Declare variables needed for the computations
         */
        double x1, x2, x3, y1, y2, y3, a, b, c, A, B, C;

        /**
         * Prompt user for coordinates
         */
        System.out.println("\nEnter Coordinates for Points (x1, y1)");
        System.out.print("Enter value x1 > > > ");
        x1 = inputKeys.nextDouble();
        System.out.print("Enter value y1 > > > ");
        y1 = inputKeys.nextDouble();

        System.out.println("\nEnter Coordinates for Points (x2, y2)");
        System.out.print("Enter value x2 > > > ");
        x2 = inputKeys.nextDouble();
        System.out.print("Enter value y2 > > > ");
        y2 = inputKeys.nextDouble();

        System.out.println("\nEnter Coordinates for Points (x3, y3)");
        System.out.print("Enter value x3 > > > ");
        x3 = inputKeys.nextDouble();
        System.out.print("Enter value y3 > > > ");
        y3 = inputKeys.nextDouble();

        /**
         * Compute lengths of sides a, b, c
         */
        System.out.println("\n\nBelow are the LENGTHS of the sides of the triangle based on the coordinates given");

        System.out.println("\nComputing Length of Side (a)======================");
        System.out.printf("     coordinates (x3, y3) = (%f, %f)\n", (x3), (y3));
        System.out.printf("     coordinates (x2, y2) = (%f, %f)\n", (x2), (y2));
        a = Math.sqrt(((x3-x2)*(x3-x2)) + ((y3-y2)*(y3-y2)));
        System.out.printf("    •Length Side (a) = %f cm\n", a);
        System.out.printf("    •Approx_Length Side (a) = %f cm\n", Math.round(a * 100) / 100.0 );

        System.out.println("\nComputing Length of Side (b)======================");
        System.out.printf("     coordinates (x3, y3) = (%f, %f)\n", (x3), (y3));
        System.out.printf("     coordinates (x1, y1) = (%f, %f)\n", (x1), (y1));
        b = Math.sqrt(((x3-x1)*(x3-x1)) + ((y3-y1)*(y3-y1)));
        System.out.printf("    •Length Side (b) = %f cm\n", b);
        System.out.printf("    •Approx_Length Side (b) = %f cm\n", Math.round(b * 100) / 100.0 );

        System.out.println("\nComputing Length of Side (c)======================");
        System.out.printf("     coordinates (x2, y2) = (%f, %f)\n", (x2), (y2));
        System.out.printf("     coordinates (x1, y1) = (%f, %f)\n", (x1), (y1));
        c = Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));
        System.out.printf("    •Length Side (b) = %f cm\n", c);
        System.out.printf("    •Approx_Length Side (c) = %f cm\n", Math.round(c * 100) / 100.0 );

        /**
         * Compute angles A, B, C
         */
        System.out.println("\n\nBelow are the ANGLES between the sides whose length were derived from the cordinats given");

        System.out.println("\nComputing Angle <-A-> between Sides (b) & (c)====================");
        System.out.printf("     Length of Side (a) = %f cm\n", a);
        System.out.printf("     Length of Side (b) = %f cm\n", b);
        System.out.printf("     Length of Side (b) = %f cm\n", c);
        A = Math.toDegrees(Math.acos((a*a)-(b*b)-(c*c))/((-2)*b*c));
        System.out.printf("    •> Angle <-A-> = %f°\n", A);
        System.out.printf("    •> Approx_Angle <-A-> = %f°\n", Math.round(A * 100) / 100.0 );

        System.out.println("\nComputing Angle <-B-> between Sides (a) & (c)====================");
        System.out.printf("     Length of Side (a) = %f cm\n", a);
        System.out.printf("     Length of Side (b) = %f cm\n", b);
        System.out.printf("     Length of Side (b) = %f cm\n", c);
        B = Math.toDegrees(Math.acos((b*b)-(a*a)-(c*c))/((-2)*a*c));
        System.out.printf("    •> Angle <-B-> = %f°\n", B);
        System.out.printf("    •> Approx_Angle <-B-> = %f°\n", Math.round(B * 100) / 100.0 );

        System.out.println("\nComputing Angle <-C-> between Sides (a) & (b)====================");
        System.out.printf("     Length of Side (a) = %f cm\n", a);
        System.out.printf("     Length of Side (b) = %f cm\n", b);
        System.out.printf("     Length of Side (b) = %f cm\n", c);
        C = Math.toDegrees(Math.acos((c*c)-(b*b)-(a*a))/((-2)*a*b));
        System.out.printf("    •> Angle <-C-> = %f°\n", C);
        System.out.printf("    •> Approx_Angle <-C-> = %f°\n", Math.round(C * 100) / 100.0 );


        System.out.println("\n\nThank me for my math stuff!\nBuy me ☕NesCaFe\n👋🫠\n");

        inputKeys.close();

    }
    
}
