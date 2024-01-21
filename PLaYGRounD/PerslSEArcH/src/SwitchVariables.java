public class SwitchVariables {

	public static void main (String[] args){

		String x = "Water";
		String y = "Fruit-Pop";

		// Displaying exactly what is contained in the vairables
		System.out.println("x: "+x);
		System.out.println("y: "+y);

		// Save Y in X, such that when we attempt to display X, it'll print the content of y

		x = y;

		System.out.println();
		System.out.println("When x = y, means x contains y, and therefore its content.");
		System.out.println("Hence, the value of x now becomes;");
		System.out.println();
		System.out.println("x: "+x);
		System.out.println("This same will happen for y = x");
		System.out.println("=================================================================");		
		System.out.println("=================================================================");
		System.out.println();



		// The problem here is that, now, X only contains the value / content of Y. 
		// It has lost its original value. It's true essence and purpose, for which it was initialised.
		// In short, till you delete the part of code where you put the Y into X . . .
		// X will no longer display Water when you sout.


		// The solution to this, is to use a variable called Temp, for storing values temporarily.  

		String temp; // Declared variable meant to stay x's content
		// As it stands it is empty. 
		// We could have set it to null;
		// BUt it's fine. This works fine too

		String r = "Rain Water";
		String s = "Sabbatical Dye";
		temp = r; // So temp is filled with r's content. 		

		// Displaying exactly what is contained in the vairables
		System.out.println("Trying the newer approach========================================");
		System.out.println("r: "+r);
		System.out.println("s: "+s);
		System.out.println();		
		System.out.println("temp: "+temp);
		System.out.println();

		// Now 'pour' s' content into r
		r = s;

		System.out.println("After pouring s content into r ===================================");
		System.out.println("r: "+r);
		System.out.println("s: "+s);
		System.out.println();		
		System.out.println("temp: "+temp);
		System.out.println();


		// now pour temp's content into s 

		s = temp;

		System.out.println("After pouring s content into r ===================================");
		System.out.println("r: "+r);
		System.out.println("s: "+s);
		System.out.println();		
		System.out.println("temp: "+temp);
		System.out.println("=====Now the r and s have had their contents successfully exchanged");

	}
}
