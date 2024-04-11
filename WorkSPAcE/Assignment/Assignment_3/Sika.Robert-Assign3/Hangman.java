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
 * 
 * It randomly selects a word and prompts the user to guess 
 * one letter at a time. Each letter is initially hidden as 
 * an asterisk. When the user guesses correctly, the letter 
 * is revealed. The game tracks missedGuess and asks if the 
 * user wants to continue after each word is guessed. 
 * It can use a predefined word list or accept custom 
 * words via command-line parameters.
 * --------------------------------------------------------------
 */

 


import java.util.Scanner;
import java.util.Random;

/**
 * The Hangman class implements a simple version of the Hangman game.
 * It randomly selects a word from a predefined list, 
 * It then prompts the user to guess the word, but one letter at a time.
 * Each letter is initially hidden as an asterisk. The letter is revealed upon correct guess.
 * It tracks and communicates the number of missedGuess (wrong guesses made) once the user guesses the full word. 
 * It then asks the user if they want to play again after each round. 
 *      If `yes`, The Game repeats and the User gets to play another word
 *      If `no`, The program exits.
 */
public class Hangman {

    /**
     * Declaring and Initialising variables
     */
    private static String[] words = {"write", "that", "this", "hangman", "random", "game", "developed", "through", "java", "programming", "was", "indeed", "something", "fun"}; // Array to store words
    private static Random random = new Random();  // For Randomisation
    private static String guessWords; // For user to guess
    private static StringBuilder guessedWord; // For tracking letters in the word guessed right.
    private static int missedGuess; // Number of misses (incorrect guesses) by the user

    /**
     * This main method starts the Hangman game.
     * It manages the game loop and user interactions.
     * @param args Command-line arguments (args parameter is present in the main method signature
     *                                      is used in this implementation)
     */
    public static void main(String[] args) {



        // Dynamically collecting words from command-line
        // Check if command-line arguments are provided
        if (args.length > 0) {
            // Using provided words as the list of words to guess
            words = args;
        }

        // Creating scanner object to enable user make inputs
        Scanner scanner = new Scanner(System.in);

        // To control the main game loop
        // Is set to `true` so game can start
        // At end of game, when user is prompted to replay,
        //       If user inputs `Yes`, then this remains true so game restart
        //       If user inputs `No`, then 'replay' sets to 'false' 
        //          and game loop ends to exit the game.
        boolean replay = true;

        // Main loop : will continue as long as `replay` variable is true
        while (replay) {

            // Invvoking method that selects word at random for user to guess
            pickWord(); 
            // Invoking method that sets intial state of `guessedWord` variable replacing all letters with (*)
            initializeGuessedWord(); 
            // Set to 0 : This resets for every new word / completion of old word
            missedGuess = 0; 

            // Game loop: continue until the word is guessed completely
            while (!guessWords.equals(guessedWord.toString())) {
                // Invoking method to display the current state of the word to the player.
                displayWord();
                // Reading first character of the user's input
                // representing their guess, from the scanner.
                char letterGuessed = scanner.next().charAt(0);

                // To check if the guessed letter is already in the word
                boolean alreadyGuessed = false;
                for (int i = 0; i < guessedWord.length(); i++) {
                    if (guessedWord.charAt(i) == letterGuessed) {
                        alreadyGuessed = true;
                        break;
                    }
                }
                // Display message that the letter is already in the word
                if (alreadyGuessed) {
                    System.out.printf("\n    [%c] is already in the word\n", letterGuessed);
                    missedGuess++;// Increase the number of missedGuesses if the guess already exists

                } else { // Display message if letter is guessed wrongly
                    if (!updateGuessedWord(letterGuessed)) {
                        System.out.printf("\n    [%c] is not in the word\n", letterGuessed);
                        missedGuess++;// Increase the number of missedGuesses if the guess is incorrect

                    }
                }

            }

            // Communicate result and ask if the user wants to play again
            if (missedGuess == 0) {
                System.out.printf("\nThe word is [%s] . You Guessed without missing.", guessWords);
                System.out.print("\nDo you want to play again? (yes/no): ");
                String response = scanner.next();
                replay = response.equalsIgnoreCase("yes");
            } else if (missedGuess == 1) {
                System.out.printf("\nThe word is [%s]. You missed %s guess.", guessWords,  missedGuess);
                System.out.print("\nDo you want to play again? (yes/no): ");
                String response = scanner.next();
                replay = response.equalsIgnoreCase("yes");
            } else {
                System.out.printf("\nThe word is [%s] . You missed %s guesses.", guessWords, missedGuess);
                System.out.print("\nDo you want to play again? (yes/no): ");
                String response = scanner.next();
                replay = response.equalsIgnoreCase("yes");
            }
        }
        // Closing scanner object for system and resource management
        scanner.close();
        // Display final message to user on game exit
        System.out.println("\n\nGreat, Thanks for playing!! ");
    }

    /**
     * Randomly selects a word from the predefined array of words.
     */
    private static void pickWord() {
        guessWords = words[random.nextInt(words.length)];
    }

    /**
     * Initializing the progress of guessed letters in the word using asterisks.
     */
    private static void initializeGuessedWord() {
        guessedWord = new StringBuilder();
        for (int i = 0; i < guessWords.length(); i++) {
            guessedWord.append('*');
        }
    }

    /**
     * Displaying progressive output of game based on user interaction (guess)
     */
    private static void displayWord() {
        System.out.printf("\n(Guess) Enter a letter in word %s > ", guessedWord);
    }

    /**
     * Updating the progress of guessed letters in the word based on the user's guess.
     * @param guess The letter guessed by the user
     * @return true if the guess is correct, false otherwise
     */
    private static boolean updateGuessedWord(char guess) {
        boolean found = false;
        for (int i = 0; i < guessWords.length(); i++) {
            if (guessWords.charAt(i) == guess) {
                guessedWord.setCharAt(i, guess);
                found = true;
            }
        }
        return found;
    }
}






/**
 * Hangman Game:
 * This Java program implements the classic Hangman game.
 * It randomly selects a word from a predefined list or custom words provided as command-line parameters.
 * The player's objective is to guess the word by inputting one letter at a time.
 * Each letter is initially hidden as an asterisk. When the player guesses correctly, the letter is revealed.
 * The game tracks the number of missed guesses and ends when the word is guessed correctly or the player exceeds the maximum allowed misses.
 *
 * Main Class: Hangman
 * - Entry point of the program.
 * - Manages the game loop and user interactions.
 *
 * Class Variables:
 * - words: Array containing the list of words for the game.
 * - random: Random object for word selection.
 * - guessWords: The word to be guessed by the player.
 * - guessedWord: StringBuilder for tracking the guessed letters in the word.
 * - missedGuess: Counter for the number of missed guesses by the player.
 *
 * Methods:
 * - main(String[] args): Entry point of the program. Starts the Hangman game.
 * - pickWord(): Randomly selects a word from the predefined word list.
 * - initializeGuessedWord(): Initializes the progress of guessed letters in the word with asterisks.
 * - displayWord(): Displays the current progress of guessed letters in the word.
 * - updateGuessedWord(char guess): Updates the progress of guessed letters in the word based on the user's guess.
 *
 * Game Loop:
 * 1. Select a word to guess.
 * 2. Initialize the progress of guessed letters.
 * 3. Enter the game loop:
 *    - Display the current progress of guessed letters.
 *    - Prompt the user to guess a letter.
 *    - Check if the guessed letter is correct.
 *    - Update the progress of guessed letters accordingly.
 *    - Track the number of missed guesses.
 *    - Repeat until the word is guessed completely or maximum misses are reached.
 * 4. Communicate the result and ask if the user wants to play again.
 *
 * Helper Methods:
 * - pickWord(): Randomly selects a word from the predefined array of words.
 * - initializeGuessedWord(): Initializes the progress of guessed letters in the word with asterisks.
 * - displayWord(): Displays the current progress of guessed letters in the word.
 * - updateGuessedWord(char guess): Updates the progress of guessed letters in the word based on the user's guess.
 *
 * Overall Structure:
 * - Initialization: Initialize variables and game setup.
 * - Game Loop: Manage the gameplay and user interactions.
 * - End Game: Communicate the result and ask for replay.
 */









/**
 *Hangman Game Pseudocode:
 *
 *1. Initialize the Hangman game:
 *   - Define the list of words for the game.
 *   - Initialize variables for tracking the current word, guessed letters, and missed guesses.
 *   - Create a random object for word selection.
 *
 *2. Select a word to guess:
 *   - Randomly pick a word from the predefined list of words.
 *
 *3. Initialize the progress of guessed letters:
 *   - Create a StringBuilder to represent the word being guessed.
 *   - Initialize each character in the guessed word as an asterisk.
 *
 *4. Start the game loop:
 *   - While the word is not guessed completely and the maximum allowed misses are not reached:
 *     - Display the current progress of guessed letters.
 *     - Prompt the player to guess a letter.
 *     - Check if the guessed letter is correct:
 *       - If correct, reveal the letter in the guessed word.
 *       - If incorrect, increment the missed guesses counter.
 *     - Check if the word is guessed completely:
 *       - If yes, end the game loop.
 *     - Check if the maximum allowed misses are reached:
 *       - If yes, end the game loop.
 *
 *5. End the game:
 *   - Display the final result:
 *     - If the word is guessed completely, display a victory message.
 *     - If the maximum allowed misses are reached, display a defeat message.
 *   - Ask the player if they want to play again:
 *     - If yes, go back to step 2.
 *     - If no, end the game.
 *
 *
 **/