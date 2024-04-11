// public class practiceArray {
//     public static void main(String[] args) {
        
//         // Declare array
//         int[] anArray, anotherArray;

//         // Create memory for 11 integers
//         anArray = new int[11];
//         anotherArray = new int[7];

//         // Inserting 11 values into the array
//         // anArray = [100,200,300,400,500,600,700,8,,900,1000,1100]
//         anArray[0] = 000;
//         anArray[1] = 100;
//         anArray[2] = 200;
//         anArray[3] = 300;
//         anArray[4] = 400;
//         anArray[5] = 500;
//         anArray[6] = 600;
//         anArray[7] = 700;
//         anArray[8] = 800;
//         anArray[9] = 900;
//         anArray[10] = 1000;
//         // anArray[11] = [200];

//         // anotherArray = {770,771,772,773,774,775,776};
//         anotherArray = new int[]{770,771,772,773,774,775,776};


//     }

    
// }



// public class practiceArray {
//     public static void main(String[] args) {
//         int[] numbers = {10, 20, 30, 40, 50};
//         System.out.println("\nLength of anArray is : > > > " + numbers.length);
//         System.out.printf("\nLength of anArray is : > > > %d\n\n", numbers.length);
        
//         for (int i = 0; i <= numbers.length; i++) {
//             System.out.println(i);
//             System.out.println(numbers[i]);

//             System.out.printf("At index %d ;\nCorrespondning value in anArray is > > > %d \n\n", i, numbers[i]);
//         }
//     }
// }



// public class practiceArray {
//     public static void main(String[] args) {
//         int[] anArray = new int[3];

//         anArray[0] = 1;
//         anArray[1] = 45;
//         anArray[2] = 900;
//         System.out.printf("Length of array is %d\n", anArray.length);


//         for ( int i=0; i < anArray.length; i++ ) {
//             System.out.println(anArray[i+1]);
//         }

//     }
// }



// public class practiceArray {
//     public static void main(String[] args) {
//         int[] anArray = new int[3];

//         anArray[0] = 1;
//         anArray[1] = 45;
//         anArray[2] = 900;
//         System.out.printf("Length of array is %d\n", anArray.length);
//         System.out.printf("Length of anArray - 1 is %d\n", anArray.length-1);


//         for ( int i=0; i < anArray.length-1; i++ ) {
//             System.out.println(anArray[i+1]);
//         }

//     }
// }




// public class practiceArray {
//     public static void main(String[] args) {
//         int[] anArray = new int[3];

//         anArray[0] = 1;
//         anArray[1] = 45;
//         anArray[2] = 900;
//         System.out.printf("Length of array is %d\n", anArray.length);
//         System.out.printf("Length of anArray - 1 is %d\n", anArray.length-1);
//         System.out.printf("Length of anArray - 2 is %d\n", anArray.length-2);


//         for ( int i=0; i < anArray.length-2; i++ ) {
//             System.out.println(anArray[i+1]);
//         }

//     }
// }

public class practiceArray {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Orange"};
        
        for (int i = 0; i < fruits.length; i++) {
            System.out.printf("\nLength of %s is %d \n", fruits[i], fruits[i].length());
        }
    }
}
