/**
 * --------------------------------------------------------------
 * Project: Connect Four Game
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
 * This Java program is a Connect Four game. 
 * 
 * The Connect Four program is a two-player board game 
 * implemented in Java. Players take turns dropping colored disks
 * into a vertically suspended grid with seven columns and six rows.
 * 
 * The objective is to connect four same-colored disks in a row, 
 * column, or diagonal before the opponent can do likewise. 
 * The program prompts two players to drop red or yellow disks 
 * alternately. After each disk is dropped, the program displays 
 * the updated board and determines the status of the game 
 * (win, draw, or continue).
 * --------------------------------------------------------------
 */




import java.util.Scanner;

/**
 * The ConnectFour class implements the terminal version of the Connect Four game, 
 * Here, two players take turns dropping colored disks desirably RED and YELLOW
 * into a vertically suspended grid to connect four disks of the same color either; 
 * vertically, horizontally, or diagonally.
 */

public class ConnectFour {
    /**
     * Declaring and initialising needed variables
     */
    private static final int ROWS = 6; // Number of rows in the game board according to game prompt
    private static final int COLS = 7; // Number of columns in the game board also according to game prompt
    private static final char EMPTY = ' ';// Empty space representing empty cell on the game board 
    private static final char RED = 'R'; // Symbol representing a red player's disk
    private static final char YELLOW = 'Y'; // Symbol representing a yellow player's disk

    private char[][] board; // 2D (Dimensional) array to build the game board
    private char currentPlayer; // The current player as (either RED or YELLOW)

    public ConnectFour() {
        board = new char[ROWS][COLS]; // Create the game board array
        currentPlayer = RED; // Set to have Player Red start the game
        initializeBoard(); // Invoking method to Initialize the game board
    }

    /**
     * Initializes the game board. 
     * Shows empty cells.
     */
    private void initializeBoard() {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                board[row][col] = EMPTY; // Set each cell to be empty
            }
        }
    }

    /**
     * Displays the current state / instance of the game board
     * reflecting the interactions of the users
     */
    private void printBoard() {
        System.out.println();
        // Displaying the column numbers as a reference for players
        for (int col = 0; col < COLS; col++) {
            System.out.print(col + " | ");
        }
        System.out.println();
        
        // Displaying the content of the board
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
        }
        System.out.println("___________________________");
    }


    /**
     * Drops the disk of the current player's color into the specified column.
     * @param col The column where the disk should be dropped (0-6)
     * @return true if the disk was successfully dropped, false if the column is full, and triggers isBoardFUll method.
     */
    private boolean dropDisk(int col) {
        for (int row = ROWS - 1; row >= 0; row--) {
            if (board[row][col] == EMPTY) {
                board[row][col] = currentPlayer;
                return true;
            }
        }
        return false; // Column is full
    }


    /**
     * Checks if the current player has won the game by connecting four disks vertically, horizontally,
     * or diagonally.
     * @return `true` if the current player has won, `false` otherwise
     */
    private boolean checkWin() {
        // Check horizontally
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS - 3; col++) {
                if (board[row][col] == currentPlayer &&
                        board[row][col+1] == currentPlayer &&
                        board[row][col+2] == currentPlayer &&
                        board[row][col+3] == currentPlayer) {
                    return true;
                }
            }
        }
        // Check vertically
        for (int row = 0; row < ROWS - 3; row++) {
            for (int col = 0; col < COLS; col++) {
                if (board[row][col] == currentPlayer &&
                        board[row+1][col] == currentPlayer &&
                        board[row+2][col] == currentPlayer &&
                        board[row+3][col] == currentPlayer) {
                    return true;
                }
            }
        }
        // Check diagonally (positive slope)
        for (int row = 0; row < ROWS - 3; row++) {
            for (int col = 0; col < COLS - 3; col++) {
                if (board[row][col] == currentPlayer &&
                        board[row+1][col+1] == currentPlayer &&
                        board[row+2][col+2] == currentPlayer &&
                        board[row+3][col+3] == currentPlayer) {
                    return true;
                }
            }
        }
        // Check diagonally (negative slope)
        for (int row = 3; row < ROWS; row++) {
            for (int col = 0; col < COLS - 3; col++) {
                if (board[row][col] == currentPlayer &&
                        board[row-1][col+1] == currentPlayer &&
                        board[row-2][col+2] == currentPlayer &&
                        board[row-3][col+3] == currentPlayer) {
                    return true;
                }
            }
        }
        return false; // No winning configuration found
    }


    /**
     * Checking if Game Board is full. 
     * This is a draw if no one still managed to Connect Four Disks
     * @return true if the game board is full, false otherwise
     */
    private boolean isBoardFull() {
        for (int col = 0; col < COLS; col++) {
            if (board[0][col] == EMPTY) {
                return false; // Meaning if at least one cell is found empty, then the board is not full so `fasle`
            }
        }
        return true;  // No empty cells found, game board is full
    }


    /**
     * Begins the Connect Four game.
     */
    public void play() {
        Scanner scanner = new Scanner(System.in);
        boolean gameWon = false;
        while (!gameWon && !isBoardFull()) {
            printBoard(); // Invoking method to display the current state of the game board
            // System.out.println("\nPlayer " + currentPlayer + "'s turn.");
            System.out.printf("\nPlayer %s's turn", currentPlayer);
            // System.out.print("Drop a " + currentPlayer + " disk at column (0-6): ");
            System.out.printf("\nDrop a %s disk at column (0-6): ", currentPlayer);
            int col = scanner.nextInt();
            if (col < 0 || col >= COLS) {
                System.out.println("\nInvalid column. Please enter a column between 0 and 6.");
                continue; // Prompt user to re-enter column choice if it's out of range
            }
            if (!dropDisk(col)) {
                System.out.println("\nColumn is full. Please choose another column.");
                continue; // Prompting user to re-enter column choice if it's full
            }
            if (checkWin()) {
                gameWon = true;
                System.out.printf("\nCongratulations Player %s  \n", currentPlayer);
            } else {
                currentPlayer = (currentPlayer == RED) ? YELLOW : RED; 
            }
        }
        
        printBoard(); // Invoking method to display the final state of the game board as well as final message
        if (!gameWon) {
            System.out.println("It's a draw!");
        }
        scanner.close();  // Closing scanner object for system and resource management
    }

    /**
     * This main method starts game.
     * @param args Command-line arguments (args parameter is present in the main method signature
     *                                      but not used in this implementation)
     */
    public static void main(String[] args) {
        ConnectFour gameConnectFour = new ConnectFour(); // Creating a new instance of game
        gameConnectFour.play(); // Starts the game
    }
}





/**
 * Initializing Four Connect Game Board:
 * Game board -> 2D (Dimensional) array of characters (char[][] board).
 * According tot he game the board has 6 rows and 7 columns.
 * Each cell of the board can be empty (' '), contain a red disk ('R'), or a yellow disk ('Y').
 * 
 * 
 * Printing the Board:
 * The printBoard() method is responsible for displaying the current state of the board in the console.
 * It iterates over each cell of the 2D array and prints the corresponding character
 * 
 * 
 * Dropping Disks:
 * The dropDisk(int col) method allows a player to drop their disk into a specified column.
 * It starts from the bottom of the column and searches upwards until it finds an empty cell to place the disk.
 * If the column is full, the method returns false indicating that the move is invalid.
 * 
 * 
 * Checking for a Win:
 * The checkWin() method checks if the current player has won the game.
 * It examines the board for four consecutive disks of the same color in a row, column, or diagonal.
 * The method iterates through all possible winning combinations horizontally, vertically, and diagonally.
 * 
 * 
 * Checking for a Draw:
 * The isBoardFull() method checks if the board is full, indicating a draw.
 * It checks if there are any empty cells left on the board
 * 
 * 
 * Playing the Game:
 * The play() method coordinates the gameplay loop.
 * It alternates between players, allowing each player to take turns dropping their disks.
 * After each turn, it checks for a win or a draw condition.
 * The game continues until one player wins or the board is full.
 * 
 * 
 * Main Method:
 * The main() method creates an instance of the ConnectFour class and starts the game by calling the play() method.
*/









/**
 * 1. Initialize the game board:
 *   - Create a 6x7 grid (6 rows, 7 columns)
 *   - Initialize all cells to empty ('-')
 *
 *2. Set up game variables:
 *   - Define constants for ROWS, COLS, EMPTY, RED, YELLOW
 *   - Initialize currentPlayer to RED (Red player starts)
 *
 *3. Define helper methods:
 *   - initializeBoard():
 *     - Set all cells on the board to empty
 *
 *   - printBoard():
 *     - Display the current state of the board on the console
 *
 *   - dropDisk(col):
 *     - Drop a disk of the current player's color into the specified column
 *     - Return true if successful, false if the column is full
 *
 *   - checkWin():
 *     - Check if the current player has won the game
 *     - Return true if there is a win, false otherwise
 *
 *   - isBoardFull():
 *     - Check if the game board is full (no empty cells left)
 *     - Return true if full, false otherwise
 *
 *4. Main game loop:
 *   - While game is not over:
 *     - Print the current board state
 *     - Prompt the current player to drop a disk into a column
 *     - If the column is valid:
 *       - Drop the disk into the column
 *       - Check if the current player has won
 *         - If yes, end the game and declare the winner
 *       - If no winner and the board is full, end the game as a draw
 *       - Switch to the next player
 *     - If the column is invalid, prompt the player to choose again
 *
 *5. End of game:
 *   - Print the final board state
 *   - If there is a winner, declare the winner
 *   - If the game ended in a draw, declare it as a draw
 */
























