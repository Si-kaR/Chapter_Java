// public static void main (String [] args) {
//     public static int max(int num1, int num2){
//         int result;
    
//         if (num1 > num2){
//             result = num1;
//         } else {
//             result - num2;
            
            
//         }
//     }
// }




public class MethodSignatureTesting {

    public static void main(String[] args) {

        // Example usage
        int result = max(5, 159);
        System.out.println("The maximum number is: " + result);
    }

    public static int max(int num1, int num2) {
        int result;

        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }

        return result;
    }
}
