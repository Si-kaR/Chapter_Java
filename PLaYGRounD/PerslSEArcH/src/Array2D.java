public class Array2D {
    public static void main(String[] args) {
        
        // Declaring array
        String[][] cars = new String[3][3];

        // Row o
        cars[0][0] = "KIA";
        cars[0][1] = "BMW";
        cars[0][2] = "Fer";
        
        // Row 1
        cars[1][0] = "Mer";
        cars[1][1] = "Cam";
        cars[1][2] = "Vau";
        
        // Row 2
        cars[2][0] = "G-W";
        cars[2][1] = "Toy";
        cars[2][2] = "OPE";

        // cars[3][0] = "OPE";
            //    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
            //     at Array2D.main(Array2D.java:22)
    

        // Accessing array 
        for (int i=0; i < cars.length; i++) {                                                                                                                       
            System.out.println("");
            System.out.println("Row number > > > > > " + i);


            for (int j=0; j < cars[i].length; j++) {
                System.out.println("__" + j + "__" + cars[i][j]);
            }

        }
        // Now access the arrays and arrange them a matrix form

        for (int i=0; i<cars.length;i++) {

            System.out.println("\nRow > > > " + i);
            for (int j=0;j<cars[i].length;j++) {
                System.out.println("I am in the - - - J - - - array");
            }
        }


        for (int i=0; i<cars.length;i++) {

            System.out.println("\nRow > > > " + i);
            for (int j=0;j<cars[i].length;j++) {
                // System.out.println("I am in the - - - J - - - array : : : " + j);
                System.out.print(cars[i][j] + "     ");
            }
        }

        //  Now number the layout and if possible draw a grid containing the brands

        System.out.println("\n\nAttempt printing grid and number layout\n");
        for (int i=0; i<cars.length;i++) {
            System.out.println("\n");
            for (int j=0;j<cars[i].length;j++) {
                // System.out.println("I am in the - - - J - - - array : : : " + j);
                System.out.print(j + " | " + cars[i][j] + "   ");
            }
            System.out.println("");
        }
    
    }
    
}
