
// A programme to test the Clock class
public class TestClock {

	// The main method instantiates various 
	// Clock objects to test out the different
	// constructors.  It then runs many iterations
	// where the clocks "tick", and periodically
	// display their new values.  
	public static void main(String[] args) {
		Clock clock1 = new Clock();
		System.out.println("Clock 1: " + clock1);

		Clock clock2 = new Clock(4);
		System.out.println("Clock 2: " + clock2);

		Clock clock3 = new Clock(13,28);
		System.out.println("Clock 3: " + clock3);

		Clock clock4 = new Clock(23,01,57);
		System.out.println("Clock 4: " + clock4);


		//////////////////////////////////////////////////////////////////////////////////////////

		// Clock clock5 = new Clock (3,62,9); //A minutes is supposed to be 60, but rather is is 62 here. 
		// System.out.println("Clock 5: " + clock5);			

		// Put the clocks in an array to make it
		// easier to "tick" each clock repeatedly.
		Clock[] clocks = {clock1, clock2, clock3, clock4};
		int maxTicks = 3600; // how many ticks
		int printInterval = 30; // after how many ticks should we print?

		// create some formatted strings to enable
		// us print nicely.	
		int width = String.valueOf(maxTicks).length();
		String prefix1 = String.format("Clocks%"+(width-1)+"s"," ");
		String prefix2 = "Iter %"+(width)+"d";
		
		// display the initial values of all the clocks
		displayClocks(prefix1, clocks);

		// Repeatedly "tick" all the clocks
		for (int i=1; i<=maxTicks; i++){
			for (int j=0; j<clocks.length; j++){
				if (clocks[j].tick())
					System.out.println("*** Clock " + (j+1) +
										" rolled over! ***");
			}

			// Periodically display the current values
			// of the clocks
			if (i%printInterval == 0){
				displayClocks(String.format(prefix2,i), clocks);
			}
		}
	}

	// A helper method to nicely display the 
	// values of an array of clocks
	public static void displayClocks(String prefix, Clock[] clocks){
		System.out.print(prefix + ":   ");
		for (int i=0; i<clocks.length; i++)
			System.out.print(clocks[i] + "\t");
		System.out.println();
	}
}