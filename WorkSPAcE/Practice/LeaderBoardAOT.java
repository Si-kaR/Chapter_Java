// public class LeaderBoardAOT {
//     public static void main (String [] args) {

//         // Creating an array

//         // Declare intention for creation of array
//         // int leaderBoard[];

//         // Allocates memory for 4 integers
//         int[] leaderBoard = new int[4]; // What is the length of my array?

//         leaderBoard[0] = 78;
//         leaderBoard[1] = 2;
//         leaderBoard[2] = 3;
//         leaderBoard[3] = 4;
//         // leaderBoard[4] = 5; 
//         // leaderBoard[5] = 6;

//         // System.out.println(leaderBoard);

//         for ( int i = 0; i <leaderBoard.length; i++ ) {
//             System.out.println(leaderBoard + "  = ..... =  " + i +  "  = ..... =  " + leaderBoard[i]);
//             // System.out.println(leaderBoard[i]);
//         }


//         // Initialise the array
//     }

// }









public class LeaderBoardAOT {
    public static void main (String [] args) {

        // Creating an array

        // Declare intention for creation of array
        // int leaderBoard[];

        // Allocates memory for 4 integers
        int[] leaderBoard = new int[4]; // What is the length of my array?

        leaderBoard[0] = 5;
        leaderBoard[1] = 3;
        leaderBoard[2] = 3;
        leaderBoard[3] = 2;
        // leaderBoard[4] = 5; // This line will result in the array going out of bound. 
        //  We initialised our array to have 4 integers, thus from 0 to 3. . . .and here we are, adding one more int to the thing
        // Who invites an extra mouth to a table that won't provide for more than the people present

        // System.out.println(leaderBoard);
        int total = 0;

        for ( int i = 0; i < leaderBoard.length; i++ ) {
            // System.out.println(leaderBoard + "  = ..... =  " + i +  "  = ..... =  " + leaderBoard[i]);
            // System.out.println(leaderBoard[i]);
            total += leaderBoard[i];
        }
        System.out.println("\nTotal Score = ..........= " + total);
        System.out.println( "\nLength of array is =...........= " + leaderBoard.length);

        // Initialise the array



        // finding largest number in the array




        // finding smallest number in the array


    }

}