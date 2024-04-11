// public class MultiDimensionalArrays {

//     public static void main(String[] args) {
//         // Example usage: generating a 5x5 multiplication table
//         int[][] multiplicationTable = createMultiplyTab(5, 5);

//         // Print the generated multiplication table
//         printTable(multiplicationTable);
//     }

//     public static int[][] createMultiplyTab(int rows, int cols) {
//         // Validate input values
//         if (rows < 0 || cols < 0) {
//             throw new IllegalArgumentException("Rows and columns must be non-negative.");
//         }

//         // Create a 2D array to hold the multiplication table
//         int[][] table = new int[rows + 1][cols + 1];

//         // Populate the multiplication table
//         for (int i = 0; i < table.length; i++) {
//             for (int j = 0; j < table[i].length; j++) {
//                 table[i][j] = i * j;
//             }
//         }
//         return table;
//     }

//     // Helper method to print the 2D array
//     public static void printTable(int[][] table) {
//         for (int i = 0; i < table.length; i++) {
//             for (int j = 0; j < table[i].length; j++) {
//                 System.out.print(table[i][j] + "\t");
//             }
//             System.out.println();
//         }
//     }

    
// }








public class MultiDimensionalArrays { 

    /**
     * This method will create a 5x5 multidimensional array
     * @param args
     */

    public static void main(String[] args) {
        
        // Declaring the array
        int[][] matrixArray;

        // Creating 2-Dimension Array (5x5)
        matrixArray = new int[6][6];

        System.out.println(matrixArray); 
        // Execute the print command will mean retrieving the memory address of the array we've just created. i.e.   [[I@1dbd16a6

        // Populate the array such that row 2, column 3 has the value 17
        // matrixArray[2][3] = 17; 

        // The above code is valid, however if you're to do it for multiple instances then it'll work. 

        // Instead we can use the initialiser approach below
        int[][] matArray = {{1, 2, 3, 4, 5, 6, 8, 9, 0, 23, 7}, 
                            {6, 7, 8, 9, 10}, 
                            {11, 12, 13, 14, 15}, 
                            {16, 17, 18, 19, 20}, 
                            {21, 22, 23, 24, 25},  
                            {6, 7, 8, 9, 10},  
                            {6, 7, 8, 9, 10},
                            {21, 22, 23, 24, 25}};
        
                            System.out.printf("\nMatrix is of row length %d", matArray.length);
                            System.out.printf("\nMatrix Row Index (1) is of length %d", matArray[0].length);
    }
}