/**
 * --------------------------------------------------------------
 * Project: Hangman Game
 * 
 * Author:  [ Robert  Sika ]
 * Student ID: [ 89212025 ]

 * Assigned : [ February 13, 2024 - Tuesday]
 * Due Date : [February 22, 2024 - Thursday]
 * 
 * University: [ Ashesi University ]
 * Faculty: [ Dr.Ayorkor Korsah ]
 * Faculty Intern: [ Elijah Boateng  &  Gideon Bonsu ]
 * --------------------------------------------------------------
 * Description:
 * This Java program is a Hangman game. 
 * It randomly selects a word and prompts the user to guess 
 * one letter at a time. Each letter is initially hidden as 
 * an asterisk. When the user guesses correctly, the letter 
 * is revealed. The game tracks misses and asks if the user 
 * wants to continue after each word is guessed. It can use 
 * a predefined word list or accept custom words via 
 * command-line parameters.
 * --------------------------------------------------------------
 */




 import java.util.Scanner;
import java.util.Random;

/**
 * The Hangman class implements a simple version of the Hangman game.
 * It randomly selects a word from a predefined list, prompts the user
 * to guess one letter at a time, and displays the progress of the guessed word with asterisks.
 * It tracks the number of misses and asks the user if they want to play again after each round.
 */
public class Hanrman {
    // Predefined array of words for guessing
    private static String[] words = {"write", "that", "hangman", "java", "programming"};
    private static Random random = new Random();
    private static String wordToGuess; // The word to be guessed by the user
    private static StringBuilder guessedWord; // The current progress of guessed letters in the word
    private static int misses; // Number of misses (incorrect guesses) by the user

    /**
     * The main method that starts the Hangman game.
     * It manages the game loop and user interactions.
     * @param args Command-line arguments (not used in this implementation)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            selectWord(); // Select a word to guess
            initializeGuessedWord(); // Initialize the progress of guessed letters
            misses = 0; // Reset the number of misses for each new word

            // Game loop: continue until the word is guessed completely
            while (!wordToGuess.equals(guessedWord.toString())) {
                displayWord(); // Display the current progress of guessed letters
                System.out.print("Enter a letter: ");
                char guess = scanner.next().charAt(0);
                if (!updateGuessedWord(guess)) {
                    misses++; // Increase the number of misses if the guess is incorrect
                }
            }

            // Display congratulations message and ask if the user wants to play again
            System.out.println("Congratulations! You guessed the word \"" + wordToGuess + "\" with " + misses + " misses.");
            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
        }
        scanner.close();
    }

    /**
     * Randomly selects a word from the predefined array of words.
     */
    private static void selectWord() {
        wordToGuess = words[random.nextInt(words.length)];
    }

    /**
     * Initializes the progress of guessed letters in the word with asterisks.
     */
    private static void initializeGuessedWord() {
        guessedWord = new StringBuilder();
        for (int i = 0; i < wordToGuess.length(); i++) {
            guessedWord.append('*');
        }
    }

    /**
     * Displays the current progress of guessed letters in the word.
     */
    private static void displayWord() {
        System.out.println("Word: " + guessedWord);
    }

    /**
     * Updates the progress of guessed letters in the word based on the user's guess.
     * @param guess The letter guessed by the user
     * @return true if the guess is correct, false otherwise
     */
    private static boolean updateGuessedWord(char guess) {
        boolean found = false;
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == guess) {
                guessedWord.setCharAt(i, guess);
                found = true;
            }
        }
        return found;
    }
}


/**
 * Approach 1  :  Word Dictionary
 * 
 * A dictionary (file) of words is used in this approach.
 * 
 * The words from the file are then put into a giant list.
 * 
 * From the list, the program makes use of the words for the game.
 * 
 */

//  import java.util.Scanner;
//  import java.util.Random;
//  import java.io.File;

//  public class Hangman {
 
//     public static void main(String[] args) {

//         Scanner scanner = new Scanner (new File("/home/griphen/Space/EnvironDev/vscodium/Java-Object-Oriented-Programming/WorkSPAcE/Assignment/Assignment_3/hang_man_dictionary.txt");

        
        
//     }
//  }











// import java.util.Scanner;
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Random;
// import java.io.File;
// import java.io.FileNotFoundException;

// public class Hangman {

//     public static void main(String[] args) {
//         try {
//             // Open the file for reading
//             Scanner scanner = new Scanner(new File("/home/griphen/Space/EnvironDev/vscodium/Java-Object-Oriented-Programming/WorkSPAcE/Assignment/Assignment_3/hang_man_dictionary.txt"));

//             List<String> words = new ArrayList<>();
//             // Read words from the file
//             while (scanner.hasNextLine()) {
//                 words.add(scanner.nextLine());
//                 String word = scanner.nextLine();
//                 // Process each word as needed (e.g., add it to an array or list)
//                 System.out.println(word); // For now, just print the word
//             }

//             // Close the scanner when done
//             scanner.close();
//         } catch (FileNotFoundException e) {
//             // Handle the case where the file is not found
//             System.err.println("File not found: " + e.getMessage());
//             e.printStackTrace();
//         }
//     }
// }










// import java.util.Scanner;
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Random;
// import java.io.File;
// // import java.io.FileNotFoundException;
// import java.io.FileNotFoundException;

// public class Hangman {

//     public static void main(String[] args) throws FileNotFoundException {


//         // Open the file for reading
//         Scanner scanner = new Scanner(new File("/home/griphen/Space/EnvironDev/vscodium/Java-Object-Oriented-Programming/WorkSPAcE/Assignment/Assignment_3/hang_man_dictionary.txt"));

//         List<String> words = new ArrayList<>();
//         // Read words from the file
//         // while (scanner.hasNextLine()) {
//         //     // String word = scanner.nextLine();
//         //     // // Add each word to the list
        //     // words.add(word);
        //     words.add(scanner.hasNext()) {
        //         words.add
        //     }
        // }
        // while (scanner.hasNext()) {
        //     words.add(scanner.nextLine());
        // }

        // // Picking words at random
        // Random rand = new Random();

        // // Making it possible to pick the words from the entire dictionary
        // String word = words.get(rand.nextInt(words.size()));


        // // Displaying the words one at a time to test code 
        // System.out.println(word);


        // // Close the scanner when done
        // scanner.close();


        // try {
        //     // Open the file for reading
        //     Scanner scanner = new Scanner(new File(" /home/griphen/Space/EnvironDev/vscodium/Java-Object-Oriented-Programming/WorkSPAcE/Assignment/Assignment_3/hang_man_dictionary.txt"));

        //     List<String> words = new ArrayList<>();
        //     // Read words from the file
        //     // while (scanner.hasNextLine()) {
        //     //     // String word = scanner.nextLine();
        //     //     // // Add each word to the list
        //     //     // words.add(word);
        //     //     words.add(scanner.hasNext()) {
        //     //         words.add
        //     //     }
        //     // }
        //     while (scanner.hasNext()) {
        //         words.add(scanner.nextLine());
        //     }

        //     // Picking words at random
        //     Random rand = new Random();

        //     // Making it possible to pick the words from the entire dictionary
        //     String word = words.get(rand.nextInt(words.size()));


        //     // Displaying the words one at a time to test code 
        //     System.out.println(word);


        //     // Close the scanner when done
        //     scanner.close();

        //     // Print the words read from the file (for testing)
        //     for (String word : words) {
        //         System.out.println(word);
        //     }
        // } catch (FileNotFoundException e) {
        //     // Handle the case where the file is not found
        //     System.err.println("File not found: " + e.getMessage());
        //     e.printStackTrace();
//         // }
//     }
// }








 /**
  * Appraoch 2 : Hardcoded Words
  * 
  */



/**
 * Approach 3 : User Inputs Words
 */














/**
 Initialize Variables:

 Define an array of words to be guessed.
 Create variables to store the randomly selected word, the progress of guessed letters, and the number of misses.

 Main Game Loop:
 Implement a loop that manages the game and user interactions.


 Inside the loop:
 Select a word randomly from the array.
 Initialize the progress of guessed letters for the selected word.
 Reset the count of misses for each new word.
 Implement a nested loop to handle guessing the word:
 Display the current progress of guessed letters.
 Prompt the user to input a letter guess.
 Update the progress of guessed letters based on the user's guess.
 If the guess is incorrect, increment the miss count.


 Word Selection and Initialization:
 Create a method to randomly select a word from the array.
 Create a method to initialize the progress of guessed letters for the selected word.



 Displaying Word Progress:
 Create a method to display the current progress of guessed letters in the word.


 Updating Guessed Word:
 Create a method to update the progress of guessed letters based on the user's guess.


 Iterate through the selected word:
 If the guessed letter matches a letter in the word, reveal it in the progress.


 User Input and Output:
 Prompt the user to guess a letter.
 Display the current progress of guessed letters.


 After guessing the word:
 Display a congratulatory message with the correct word and the number of misses.
 Ask the user if they want to play again.

 */



 /*
  * 
  Initialize Variables:
    Define array of words
    Initialize variables for selected word, guessed letters, and misses

Main Game Loop:
    while (playAgain is true):
        Select a word randomly from the array
        Initialize progress of guessed letters for the word
        Reset count of misses

        Guessing Loop:
            while (word is not guessed completely):
                Display current progress of guessed letters
                Prompt user to input a letter guess
                Update progress of guessed letters based on user's guess
                If guess is incorrect, increment miss count

        Display congratulatory message with correct word and misses
        Ask user if they want to play again

Word Selection and Initialization:
    Select a word randomly from the array
    Initialize progress of guessed letters for the selected word

Displaying Word Progress:
    Display current progress of guessed letters in the word

Updating Guessed Word:
    Update progress of guessed letters based on user's guess

User Input and Output:
    Prompt user to guess a letter
    Display current progress of guessed letters
    After guessing the word:
        Display congratulatory message with correct word and misses
        Ask user if they want to play again

  */


















//  import java.util.Scanner;
//  import java.util.Random;
 
//  /**
//   * The Hangman class implements a simple version of the Hangman game.
//   * It randomly selects a word from a predefined list, prompts the user
//   * to guess one letter at a time, and displays the progress of the guessed word with asterisks.
//   * It tracks the number of misses and asks the user if they want to play again after each round.
//   */
//  public class Hangman {
//      // Predefined array of words for guessing
//      private static String[] words = {"write", "that", "hangman", "java", "programming"};
//      private static Random random = new Random();
//      private static String wordToGuess; // The word to be guessed by the user
//      private static StringBuilder guessedWord; // The current progress of guessed letters in the word
//      private static int misses; // Number of misses (incorrect guesses) by the user
 
//      /**
//       * The main method that starts the Hangman game.
//       * It manages the game loop and user interactions.
//       * @param args Command-line arguments (not used in this implementation)
//       */
//      public static void main(String[] args) {
//          Scanner scanner = new Scanner(System.in);
//          boolean playAgain = true;
 
//          while (playAgain) {
//              selectWord(); // Select a word to guess
//              initializeGuessedWord(); // Initialize the progress of guessed letters
//              misses = 0; // Reset the number of misses for each new word
 
//              // Game loop: continue until the word is guessed completely
//              while (!wordToGuess.equals(guessedWord.toString())) {
//                  displayWord(); // Display the current progress of guessed letters
//                  System.out.print("Enter a letter: ");
//                  char guess = scanner.next().charAt(0);
//                  if (!updateGuessedWord(guess)) {
//                      misses++; // Increase the number of misses if the guess is incorrect
//                  }
//              }
 
//              // Display congratulations message and ask if the user wants to play again
//              System.out.println("Congratulations! You guessed the word \"" + wordToGuess + "\" with " + misses + " misses.");
//              System.out.print("Do you want to play again? (yes/no): ");
//              String response = scanner.next();
//              playAgain = response.equalsIgnoreCase("yes");
//          }
//          scanner.close();
//      }
 
//      /**
//       * Randomly selects a word from the predefined array of words.
//       */
//      private static void selectWord() {
//          wordToGuess = words[random.nextInt(words.length)];
//      }
 
//      /**
//       * Initializes the progress of guessed letters in the word with asterisks.
//       */
//      private static void initializeGuessedWord() {
//          guessedWord = new StringBuilder();
//          for (int i = 0; i < wordToGuess.length(); i++) {
//              guessedWord.append('*');
//          }
//      }
 
//      /**
//       * Displays the current progress of guessed letters in the word.
//       */
//      private static void displayWord() {
//          System.out.println("Word: " + guessedWord);
//      }
 
//      /**
//       * Updates the progress of guessed letters in the word based on the user's guess.
//       * @param guess The letter guessed by the user
//       * @return true if the guess is correct, false otherwise
//       */
//      private static boolean updateGuessedWord(char guess) {
//          boolean found = false;
//          for (int i = 0; i < wordToGuess.length(); i++) {
//              if (wordToGuess.charAt(i) == guess) {
//                  guessedWord.setCharAt(i, guess);
//                  found = true;
//              }
//          }
//          return found;
//      }
//  }
 