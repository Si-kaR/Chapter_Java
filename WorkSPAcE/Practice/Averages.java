// get a class
// get a method for averages
        // parameter - array of integers
        // a -> get sum of elements in parameter
        // b -> get number items
// return a/b as a double right?

// -----------------------------------Start coding------------------------------------------------

public class Averages {

    public static void main(String[] args) {



        //test our code
        int ourTestnumbers[] = [1,2,3,4,5,6,7,8,9];
    }

    // Structure of function  -> <access modifier> <binding> <returnType> <identifier->name> <parameter>
    public static double computeAverage (int[] numbers) {

        int sumNumbers = 0;
        //calculating sum of number
        for (int eachNumber: numbers) { 
            sumNumbers += eachNumber;
        }
        return sumNumbers/(double) numbers.length;

    }


}
