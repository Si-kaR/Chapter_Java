// public class For {
//     public static void main(String[] args) {
//         //     int i;
//         //     for (i=0; i<10; i++) {
//         //         System.out.printf("\nCounting %d", i);
//         //     }
//         //     System.out.printf("\n\nLoop run [%d] times", i);
//         // }
        
//         // for (int i = 0, j = 0; i + j < 10; i++, j++) {
//         //     System.out.println("P");
//         // }
//         // int sum;

//         // int sum = 0; // Initialize sum outside the loop
//         // for (int i = 0; i < 10; ++i) {
//         //     sum += i;
//         // }
//         // System.out.println(sum);


//         // // Display name at table top
//         // System.out.println("\n         Multiplication table");

//         // // Display horizontal numbers underneath it
//         // System.out.print("         ");
//         // for (int j = 1; j<10; j++ ) {
//         //     System.out.printf(" %d    ",j);
//         // }
//         // System.out.println("\n         _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");


//         // // Displaying vertical column now
//         // for (int j = 1; j < 10; j++ ) {
//         //     System.out.printf("\n\n%d  | ", j);
//         //     for (int i = 1; i < 10; i++) {
//         //         System.out.printf( "%6d", i*j);
//         //     }
//         // }


//         // for (int i = 0; i < 5;i++) {
//         //     for (int j = 0; j < i; j++){
//         //         System.out.printf("\nExecution %d\nExecution Successful because j = %d < i = %d\nHence I am displaying %d\n\n",i,j,i,i);
//         //     }
//         //     // System.out.println("\nOut of Inner "+i);
//         // }

//         // for (int i = 1; i < 5; i++) {
//         //     int j = 0;
//         //     while (j < i) {
//         //      System.out.print(j + " ");
//         //      j++;
//         //      }
//         //      }


//         // int i = 0;
//         // while (i < 5) {
//         //     for (int j = i; j > 1; j--)
//         //         System.out.print(j + " ");
//         //     System.out.println("****");
//         //     i++;
//         // }

//         // int i = 5;
//         // while (i >= 1) {
//         //     int num = 1;
//         //     for (int j = 1; j <= i; j++) {
//         //         System.out.print(num + "xxx");
//         //         num *= 2;
//         //     }
//         //     System.out.println();
//         //     i--;
//         // }



//         int i = 1;
//         do {
//             int num = 1;
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(num + "G");
//                 num += 2;
//             }
//             System.out.println();
//             i++;
//         } while (i <= 5);
//     }
// }




class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Alice");
        System.out.println("Before calling method: " + person.name); // Output: Before calling method: Alice
        changeName(person);
        System.out.println("After calling method: " + person.name);  // Output: After calling method: Bob
    }

    public static void changeName(Person p) {
        p.name = "Bob"; // Changes made here are reflected outside the method
    }
}
