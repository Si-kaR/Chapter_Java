// import java.util.Scanner;

// public class TestingMath {
//     public static void main (String[] args) {
//         Scanner input = new Scanner(System.in);




//         System.out.print("\nEnter radius in radians: ");
//         double radius = input.nextDouble();

//         double area = Math.PI * radius;
//         double circumference = 2 * Math.PI * radius;

//         System.out.printf("\nArea is: %.2f", area);
//         System.out.printf("\nCircumference: %.2f\n", circumference);

//         /**
//          * 
//          */
//         System.out.println("Enter an Angle in Degrees: ");
//         double angle = input.nextDouble();
//         double sine = Math.sin(Math.toRadians(angle));
//         // System.out.println("The sin of " + angle + " is: " + sine);
//         System.out.printf("The sin of %s is: %s%n", angle, sine);

//         input.close();
//     }


//     public static double roundTONDP(double num, int ndp) {
//         System.out.println("R\nounding " + num + " to" + ndp + " degree");
//         double step1 = num * Math.pow(10,ndp);
//         System.out.println("\nstep 1" + step1);
//         double step2 = Math.rint(step1);
//         System.out.println("\nstep 2" + step2);
//         double step3 = step2 / Math.pow(10, ndp);
//         System.out.println("\nstep 3: " + step3);


//         return step3


//         // System.out.printf("Name: %s, Age: %d, Height: %.2f%n", name, age, height);
//     }


//     public static double circleArea(double radius){
//         double area = Math.PI*Math.pow(radius, 2);
//         return area;
//     }
// }


















import java.util.Scanner;

public class TestingMath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter radius in radians: ");
        double radius = input.nextDouble();

        double area = Math.PI * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.printf("\nArea is: %.2f", area);
        System.out.printf("\nCircumference: %.2f\n", circumference);

        System.out.print("\nEnter an Angle in Degrees: ");
        double angle = input.nextDouble();
        double sine = Math.sin(Math.toRadians(angle));
        System.out.printf("\nThe sin of %s is: %s %n\n", angle, sine);

        input.close();
    }

    public static double roundTONDP(double num, int ndp) {
        System.out.println("Rounding " + num + " to " + ndp + " decimal places");

        double step1 = num * Math.pow(10, ndp); 
        System.out.println("Step 1: " + step1);

        double step2 = Math.rint(step1);
        System.out.println("Step 2: " + step2);

        double step3 = step2 / Math.pow(10, ndp);
        System.out.println("Step 3: " + step3);

        return step3;
    }
}
