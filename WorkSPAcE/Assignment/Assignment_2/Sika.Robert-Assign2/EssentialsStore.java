/**
 * --------------------------------------------------------------
 * Project: Manages cash transactions for Ashesi Essentials Shop
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
 * This class, EssentialsStore, is designed to assist the Ashesi Essentials Shop
 * in managing cash transactions effectively. It provides functionality to calculate
 * the change to be given to a student based on the total cost of items purchased
 * and the amount paid. 
 * 
 * The program offers a breakdown of denominations of Ghana Cedi notes and coins, 
 * formatted with consideration for the currency symbol (\u20B5), Unicode value, 
 * and two decimal places precision.
 * 
 * The core functionality is encapsulated in the static method computeChangeBreakdown,
 * which takes in the cost of items purchased and the amount paid as parameters. This
 * method prints the needed change and the breakdown of denominations while returning
 * the change amount. 
 * 
 * The main method of this class interacts with the user, prompting them to input the cost
 * of items purchased and the amount paid. It then invokes the computeChangeBreakdown
 * method to calculate the change and provide the denominations breakdown according to
 * the specified requirements.
 * --------------------------------------------------------------
 */

import java.util.Scanner;


/**
 * Manages cash transactions for Ashesi Essentials Shop.
 * Calculates change and provides denomination breakdown.
 * 
 * @author Robert Sika
 * @version 1.0
 */

public class EssentialsStore {

    /**
     * Array representing denominations of Ghana Cedi notes and coins.
     */

    public static final double[] DENOMINATIONS = { 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1 };

    /**
     * Stores the calculated change.
     */
    public static double change;
    /**
     * Computes the change to be given and prints the denomination breakdown in a receipt format.
     * 
     * @param costOfItems The total cost of items purchased.
     * @param amountPaid  The amount paid by the customer.
     */
public static void computeChangeBreakdown(double costOfItems, double amountPaid) {
    change = amountPaid - costOfItems;

    if (change < 0) {
        System.out.println("🛑 Underpaid: Please provide the correct amount.");
        return;
    }

    // Displaying receipt header.
    System.out.println("--------------------------------------------------");
    System.out.println("               Ashesi Essentials Shop              ");
    System.out.println("                   Cash Management                ");
    System.out.println("--------------------------------------------------");

    // Displaying items and cost on the receipt.
    System.out.println("Items Purchased:                           \u20B5 " + costOfItems);
    System.out.println("Amount Paid:                               \u20B5 " + amountPaid);
    System.out.println("--------------------------------------------------");

    // Displaying change breakdown on the receipt.
    System.out.println("Change Breakdown:");
    for (int i = 0; i < DENOMINATIONS.length; i++) {
        if (change % DENOMINATIONS[i] != change) {
            int denominationCount = (int) (change / DENOMINATIONS[i]);
            System.out.printf("%-10s %-5s %-2s\n", "\u20B5 " + DENOMINATIONS[i], "x", denominationCount);
            change -= (denominationCount * DENOMINATIONS[i]);
        }
    }


    // Displaying receipt footer.
    System.out.println("--------------------------------------------------");
    System.out.printf("Total Change:                              \u20B5 %.2f\n", amountPaid - costOfItems);
    System.out.println("--------------------------------------------------");

    // Displaying Thanking you message in footer
    System.out.println("\n👋🥸 Thank you for shopping with us! 🛒🧾");
    System.out.println("\n=============================================================");
}



    /**
     * Main method to interact with the user and invoke the change calculation.
     * 
     * @param args Command-line arguments (not used in this program).
     */

    public static void main(String[] args) {

        // Creating a Scanner object to read user input from the console.
        Scanner keyboard = new Scanner(System.in);

        // Displaying a welcome message for the Ashesi Essentials Shop cash management app.
        System.out.println("\n=============================================================");
        System.out.println("\nWelcome to 🛒 Ashesi Essentials Shop Cash Management System!👋🤓");

        // Prompting the user to enter the amount the person gave.
        System.out.println("\n=============================================================");
        System.out.print("\nEnter Customer Paid Amount : : : : : : : : : : ");
        double paid = keyboard.nextDouble(); // Reading the amount paid by the customer from the console.

        // Prompting the user to enter the cost of items the person bought.
        System.out.print("\nEnter Cost Of items Purchase:  : : : : : : : : ");
        double cost = keyboard.nextDouble(); // Reading the total cost of items purchased from the console.

        System.out.println("\n🥸 Below is a receipt. Kindly issue this to the user ! 🧐");
        System.out.println("\n=============================================================");

        // Invoking the computeChangeBreakdown method with the provided cost and paid amount.
        computeChangeBreakdown(cost, paid);
        System.out.println("");
    }
}