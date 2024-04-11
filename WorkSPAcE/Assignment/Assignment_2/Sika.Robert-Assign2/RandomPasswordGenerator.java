/**
 * --------------------------------------------------------------
 * Project: Random Password Generator
 * Author:  [ Robert  Sika ]
 * Student ID: [ 89212025 ]
 * Date of Commencement: [ Thursday - January 25, 2024]
 * Date of Completion: [February 06, 2024 - Tuesday]
 * University: [ Ashesi University ]
 * Faculty: [ Dr.Ayorkor Korsah ]
 * Faculty Intern: [ Elijah Boateng  &  Gideon Bonsu ]
 * --------------------------------------------------------------
 * Description:
 * 
 *  This Java program generates random passwords based on user-specified rules. 
 *  The user is prompted to input the minimum password length 
 *  minimum number of uppercase characters, minimum number of digits, 
 *  minimum number of special characters, and a string indicating 
 *  the allowed special characters.
 *   
 *  The program includes a static method called generatePassword, which takes 
 *  in the specified parameters and returns a randomly generated password that 
 *  satisfies the rules. Additionally, there is a static method called checkPassword,
 *  which verifies whether a given password meets the specified rules.
 *
 *  The main method interacts with the user, prompting them to input the required
 *  rules and then invoking the generatePassword and checkPassword methods based
 *  on user preferences.
 * --------------------------------------------------------------
 */

import java.util.Random;
import java.util.Scanner;

/**
 * This class represents a Random Password Generator that allows users to generate and check passwords based on specified criteria.
 * The generated password includes a mix of uppercase letters, digits, special characters, and lowercase letters.
 *
 * @author Robert Sika
 * @version 1.0
 */


public class RandomPasswordGenerator {

    /**
     * The set of uppercase letters.
     */
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


    /**
     * The set of lowercase letters derived from the uppercase set.
     */
    private static final String LOWER = UPPER.toLowerCase();

     /**
     * The set of digits (0-9).
     */
    private static final String DIGITS = "0123456789";

    /**
     * Main method that allows users to interact with the Random Password Generator.
     *
     * @param args Command-line arguments (not used in this implementation).
     */

    public static void main(String[] args) {

        /**
         * Displaying welcome message to user
         */
        System.out.println("=============================================================");
        System.out.println("\n👋🫠Hi There and Welcome 🤺!\n\nI will be your Random Password Generator Bot🤖🧾 for the time being!");
        System.out.println("\n🤖🧾I encourage you to create a strong and secure passwords for a \nwell protected life.");
        System.out.println("\nLet's get started \n\n=============================================================");

        // creating scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompting user for inputs

        System.out.print("\nEnter minimum password length > > > > > ");
        int minLength = scanner.nextInt();
        System.out.println("=============================================================");

        System.out.print("\nEnter minimum number of uppercase characters > > > > > ");
        int minUpperCase = scanner.nextInt();
        System.out.println("=============================================================");


        System.out.print("\nEnter minimum number of digits > > > > > ");
        int minDigits = scanner.nextInt();
        System.out.println("=============================================================");


        System.out.print("\nEnter minimum number of special characters > > > > > ");
        int minSpecial = scanner.nextInt();
        System.out.println("=============================================================");


        System.out.print("\nEnter allowed special characters > > > > > ");
        scanner.nextLine(); String allowedSpecial = scanner.nextLine();
        System.out.println("=============================================================");


        // Generating password


        System.out.println("Generated password: : : : : : "
                + generatePassword(minLength, minUpperCase, minDigits, minSpecial, allowedSpecial) + " : : : : : ");
        
        System.out.println("\n🥸 Your Password is Set and Ready🧐 \n\nAwesome! Now check password strength below 😎");

        System.out.println("=============================================================");


        // Checking password validity
        System.out.print("\nEnter a password to check: : : : : : ");
        String password = scanner.nextLine();

        System.out.println("\n\nChecking Password validity 🤖🧾 ");
        System.out.println("\nPassword Status : > > > > > " + checkPassword(password, minLength, minUpperCase, minDigits, minSpecial, allowedSpecial));
        System.out.println("\n=============================================================");


        // Closing scanner object

        scanner.close();
    }


    /**
     * Generates the random password based on specified criteria.
     *
     * @param minLength      The minimum length of the password.
     * @param minUpperCase   The minimum number of uppercase characters in the password.
     * @param minDigits      The minimum number of digits in the password.
     * @param minSpecial     The minimum number of special characters in the password.
     * @param allowedSpecial The set of allowed special characters.
     * @return A randomly generated password.
     */

    public static String generatePassword(int minLength, int minUpperCase, int minDigits, int minSpecial,
            String allowedSpecial) {
        StringBuilder password = new StringBuilder();
        Random random = new Random();

        // Generate required number of uppercase characters and append to the password.
        for (int i = 0; i < minUpperCase; i++) {
            password.append(UPPER.charAt(random.nextInt(UPPER.length())));
        }

        // Generate required number of digits and append to the password.
        for (int i = 0; i < minDigits; i++) {
            password.append(DIGITS.charAt(random.nextInt(DIGITS.length())));
        }

        // Generate required number of special characters from the allowed set and append to the password.
        for (int i = 0; i < minSpecial; i++) {
            password.append(allowedSpecial.charAt(random.nextInt(allowedSpecial.length())));
        }

        // Fill the remaining length with characters from different categories (lowercase, uppercase, digits).
        for (int i = password.length(); i < minLength; i++) {

            // Choose a category (0: lowercase, 1: uppercase, 2: digits) randomly.
            int category = random.nextInt(3);
            switch (category) {
                case 0:
                    password.append(LOWER.charAt(random.nextInt(LOWER.length())));
                    break;
                case 1:
                    password.append(UPPER.charAt(random.nextInt(UPPER.length())));
                    break;
                case 2:
                    password.append(DIGITS.charAt(random.nextInt(DIGITS.length())));
                    break;
            }
        }

        // Shuffle the characters in the password for added randomness.
        for (int i = password.length() - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            char temp = password.charAt(index);
            password.setCharAt(index, password.charAt(i));
            password.setCharAt(i, temp);
        }

        // Convert the StringBuilder to a String and return the generated password.
        return password.toString();
    }


    /**
     * Checks if a given password meets the specified criteria.
     *
     * @param password       The password to be checked.
     * @param minLength      The minimum length required for the password.
     * @param minUpperCase   The minimum number of uppercase characters required.
     * @param minDigits      The minimum number of digits required.
     * @param minSpecial     The minimum number of special characters required.
     * @param allowedSpecial The set of allowed special characters.
     * @return True if the password is valid, false otherwise.
     */

    public static boolean checkPassword(String password, int minLength, int minUpperCase, int minDigits, int minSpecial,
            String allowedSpecial) {
        // Check length
        if (password.length() < minLength) {
            return false;
        }

        // Check uppercase characters
        int upperCount = 0;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperCount++;
            }
        }
        if (upperCount < minUpperCase) {
            return false;
        }

        // Check digits
        int digitCount = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        if (digitCount < minDigits) {
            return false;
        }

        // Check special characters
        int specialCount = 0;
        for (char c : password.toCharArray()) {
            if (allowedSpecial.indexOf(c) != -1) {
                specialCount++;
            }
        }
        if (specialCount < minSpecial) {
            return false;
        }

        return true;
    }
}