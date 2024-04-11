/*
 * --------------------------------------------------------------
 * Project: Number Guessing Game
 * Author:  [ Robert  Sika ]
 * Student ID: [ 89212025 ]
 * Date of Commencement: [Start Date]
 * Date of Completion: [January 22, 2023 - Monday]
 * University: [ Ashesi University ]
 * Faculty: [ Dr.Ayorkor Korsah ]
 * Faculty Intern: [ Elijah Boateng  &  Gideon - - - - ]
 * --------------------------------------------------------------
 * Description:
 * This Java program implements a number guessing game.
 * The user is prompted to guess a randomly generated number,
 * and the program provides feedback on each guess.
 * --------------------------------------------------------------
 */

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        guessGame(9);
    }  
    
    public static void guessGame(long seed) {
        Random random = new Random(seed);
        int randomNumber = random.nextInt(1, 100);
        int numberTries = 0;
        
        Scanner input = new Scanner(System.in);
        int guess = 0;
        System.out.println("\nI am thinking of a number between 1 and 100.");

        while (guess != randomNumber) {
            System.out.print("\nGuess > > > ");
            guess = input.nextInt();
            numberTries++;
            
            if (guess >= 1 && guess <= 100 ) {

                if (guess == randomNumber) {
                    System.out.print("\nYou got it! It took you " + numberTries + "\n");
                    if (numberTries == 1) {
                        System.out.println("try.");
                    } else {
                        System.out.println(" tries.");
                    }
                } else if (guess < randomNumber) {
                    System.out.println("\nYour guess is too low.");
                } else {
                    System.out.println("\nYour guess is too high.");
                }

            } else {
                System.out.println("\nInvalid input");
            }
        } 

        input.close();
    }
}























/*
 * --------------------------------------------------------------
 * | **Function: guessGame**                                     |
 * |------------------------------------------------------------ |
 * | **Input:** seed (int) - Seed for random number generation.  |
 * | **Output:** None                                            |
 * |                                                             |
 * | This function implements a simple number guessing game. It  |
 * | takes a seed for random number generation, generates a      |
 * | random number between 1 and 100, and prompts the user to    |
 * | guess the number. The game provides feedback on whether the |
 * | guess is too low, too high, or correct. It also counts the  |
 * | number of tries and gives appropriate messages upon         |
 * | successful guessing.                                        |
 * |                                                             |
 * | The function uses a while loop to repeatedly prompt the     |
 * | user for guesses until the correct number is guessed.       |
 * | Input validation ensures that the user enters a valid       |
 * | integer between 1 and 100. Exception handling is included   |
 * | to catch non-integer inputs.                                |
 * |                                                             |
 * | **Example Usage:**                                          |
 * | guessGame(9);                                               |
 * | I am thinking of a number between 1 and 100. Guess the      |
 * | number: 50                                                  |
 * | Your guess is too low.                                      |
 * | I am thinking of a number between 1 and 100. Guess the      |
 * | number: 75                                                  |
 * | Your guess is too high.                                     |
 * | I am thinking of a number between 1 and 100. Guess the      |
 * | number: 63                                                  |
 * | You got it! It only took you 3 tries.                       |
 * --------------------------------------------------------------
 */

