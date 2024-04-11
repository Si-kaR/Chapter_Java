public class FactorsTable {

	public static void main(String[] args){
		int[][] factorsTable = createFactorsTable(10);
	}

	/**
	 * A method to create a table containing factors of
	 * all numbers from 1 to maxNum
	 **/
	public static int[][] createFactorsTable(int maxNum){
    	int[][] factorsTable = new int[maxNum+1][];
    
    	// because each number has a different number
    	// of factors, we need to create the list of
    	// factors one at a time.  Each list will have
    	// a different length.
    	for (int i=1; i<=maxNum; i++){
      		factorsTable[i] = computeFactors(i);
      }
      return factorsTable;
	}

	/**
	 * A method to compute and return an array containing
	 * all the factors of a give number, num.
	 * The implementation of this method is still a work-in-progress.
	 **/
	public static int[] computeFactors(int num){
		// create a temporary array to hold the factors
		int[] temp = new int[num/2+1];
		System.out.print("Computing factors of "+ num + ". ");
		temp[0] = 1; // 1 is a factor of all numbers
		int numFactors = 1;

		// compute additional factors by checking for
		// divisability by all numbers from 2 to num/2
		for (int i=2; i<=num/2; i++){
			if (num % i == 0){
				temp[numFactors++] = i;
			}
		}
		if (num != 1)
			temp[numFactors++] = num; // num is factor of itself

		System.out.print("I found " + numFactors + " factors: ");
		for (int i=0; i<numFactors; i++){
			System.out.print(temp[i] + " ");
		}
		System.out.println();

		return null;
	}
}