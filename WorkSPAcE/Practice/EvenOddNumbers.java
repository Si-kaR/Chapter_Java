public class EvenOddNumbers {
    
    public static void main(String[] args) {
        // List integers from 1 to 10
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        // Iterate through the list and display whether each number is even or odd
        for (int num : numbers) {
            if (isEven(num)) {
                System.out.println(num + " is even.");
            } else {
                System.out.println(num + " is odd.");
            }
        }
    }
    
    /**
     * Checks if a number is even.
     *
     * @param number the number to check
     * @return true if the number is even, false otherwise
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
