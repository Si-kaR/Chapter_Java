// public class RandIntGenerator { 
//     public static void main(String [] args) {

//         final int MIN = 17;
//         final int MAX = 99;
//         final int COUNT =2;

//         int randNum;

//         for (int i=0; i<100; i++) {
//             randNum = ()
//         }
//     }
// }


import java.util.Random;

public class RandIntGenerator { 
    public static void main(String [] args) {

        final int MIN = 17;
        final int MAX = 99;
        final int COUNT = 2;

        int randNum;

        Random random = new Random();

        System.out.println("Random Integers between " + MIN + " and " + MAX + ":");
        
        for (int i = 0; i < COUNT; i++) {
            randNum = random.nextInt((MAX - MIN) + 1) + MIN; //= 100// Trying to ensure randNum gives values only between 17 and 99 (inclusive) but you have to have the count start from 17 to 99 making 100 counts in programmers language but in layman it will be seen as 99.
            System.out.println(randNum);
        }
    }
}
