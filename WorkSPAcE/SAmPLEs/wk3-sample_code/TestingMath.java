import java.util.Scanner;

/**
 * A programme to demonstrate using the Math class.
 */
public class TestingMath {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the radius of the circle: ");
		double radius = input.nextDouble();

		System.out.println("Area is: " + roundToNDP(circleArea(radius),4));
		System.out.println("Circumference is: " + roundToNDP(circumference(radius),4));

		System.out.println("Please enter an angle in degrees: ");
		double angle = input.nextDouble();
		double sine = Math.sin(Math.toRadians(angle));
		System.out.println("The sin of " + angle + " is: " + roundToNDP(sine,4));
		
		input.close();
	}

	/** 
	 * A method to compute the area of a circle.
	 */
	public static double circleArea(double radius){
		return Math.PI*radius*radius;
	}

	/** 
	 * A method to compute the circumference of a circle.
	 */
	public static double circumference(double radius){
		return 2*Math.PI*radius;
	}

	/**
	 * A helper method to round to a specified number of 
	 * decimal places
	 */
	public static double roundToNDP(double num, int ndp){
		double step1 = num * Math.pow(10,ndp);
		double step2 = Math.rint(step1);
		double step3 = step2 / Math.pow(10,ndp);
		return step3;
	}


}