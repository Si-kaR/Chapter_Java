/**
 * --------------------------------------------------------------
 * Project: Treasury Bill Yield Calculator
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
 * This Java program calculates the total value of an investment and the interest earned
 * over a specified period, considering compounding interest and additional deposits.
 * 
 * The program includes a static method called computeInvestmentValue, which takes in
 * parameters such as initial amount to invest (principal), yearly interest rate (rate),
 * compounding periods per year (periodsPerYear), deposit amount, and the total number
 * of periods. The method returns the total value of the investment.
 * 
 * The main method interacts with the user, prompting them to input the required details
 * for the investment. It then invokes the computeInvestmentValue method and displays
 * the total value of the investment, along with the total interest earned over the period.
 * 
 * Test Cases:
 *     Nana Araba's investment for 14 periods until graduation in June 2026. The program
 * calculates the final value of the investment and the total interest earned.
 *     Nana Araba's increased deposit of ¢400 every three months until graduation. The
 * program calculates the final value of the investment and the total interest earned.

*/


import java.util.Scanner;


/**
     * Computes the total value of an investment over a specified period, considering
     * compounding interest and additional deposits.
     * 
     * @param principal       Initial amount to invest.
     * @param rate            Yearly interest rate.
     * @param periodsPerYear  Compounding periods per year.
     * @param deposit         Amount the user will add to the investment account in
     *                        each period after the initial one.
     * @param totalPeriods    Number of periods the investment will accrue over.
     * @return Total value of the investment.
     */

public class TreasuryBillYields {

    public static double computeInvestmentValue(double principal, double rate, int periodsPerYear, double deposit,
            int totalPeriods) {
    // Calculate the nominal interest rate for each compounding period
    double nominalInterestRate = rate / periodsPerYear;

    // Calculate the amount after the first compounding period
    double amountAfterOnePeriod = principal + (principal * nominalInterestRate) / 100;
    // Initialize the total amount after all periods with the amount after the first period
    double amountAfterTotalPeriod = amountAfterOnePeriod;

    // Iterate through the compounding periods (excluding the first one)
    for (int period = 0; period < totalPeriods - 1; period++) {
        // Add the deposit to the total amount
        amountAfterTotalPeriod += deposit;
        // Calculate the interest earned for the current period and add it to the total amount
        amountAfterTotalPeriod += (nominalInterestRate * amountAfterTotalPeriod) / 100;
    }

    // Return the total value of the investment after all compounding periods
    return amountAfterTotalPeriod;
}
     /**
     * Main method to interact with the user, take input, and display the results.
     * 
     * @param args Command-line arguments (not used).
     */

    public static void main(String[] args) {

        // Create a new Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Displaying a welcome message to user
        System.out.println("\n\n=============================================================");
        System.out.println("\nWelcome to the Treasury Bill Yield Calculator!");
        System.out.println("\n=============================================================");

        // Prompt the user to enter the initial amount to invest and store the input as 'principal'
        System.out.print("\nEnter initial investment amount: : : : : : ");
        double principal = scanner.nextDouble();

        // Prompt the user to enter the yearly interest rate and store the input as 'rate'
        System.out.print("\nEnter yearly interest rate : : : : : : : : ");
        double rate = scanner.nextDouble();

        // Prompt the user to enter the compounding periods per year and store the input as 'periodsPerYear'
        System.out.print("\nEnter compounding periods per year : : : : ");
        int periodsPerYear = scanner.nextInt();

        // Prompt the user to enter the deposit amount in each period after the initial one and store the input as 'deposit'
        System.out.print("\nEnter periodic deposit : : : : : : : : : : ");
        double deposit = scanner.nextDouble();

        // Prompt the user to enter the total number of periods and store the input as 'totalPeriods'
        System.out.print("\nEnter total number of periods: : : : : : : ");
        int totalPeriods = scanner.nextInt();

        // Calculate the total value of the investment using the computeInvestmentValue method
        double totalValue = computeInvestmentValue(principal, rate, periodsPerYear, deposit, totalPeriods);
                
        // Display the total value of the investment to the user
        System.out.println("\n--------------------------------------------------------------");
        System.out.printf("\n%-35s%.2f\n", "Total value of the investment: ¢ ", totalValue);
        System.out.printf("%-35s%.2f\n", "Total interest earned over the period: ¢ ", (totalValue - principal - deposit * (totalPeriods - 1)));
        System.out.println("\n--------------------------------------------------------------");

        // Display the results in a nice format
        System.out.println("\nSummary:");
        System.out.println("--------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------");
        System.out.printf("%-35s¢%.2f\n", "Initial Investment:", principal);
        System.out.println("----------------------------------------------");
        System.out.printf("%-35s%.2f%%\n", "Yearly Interest Rate:", rate);
        System.out.println("----------------------------------------------");
        System.out.printf("%-35s%d\n", "Compounding Periods per Year:", periodsPerYear);
        System.out.println("----------------------------------------------");
        System.out.printf("%-35s¢%.2f\n", "Deposit Amount in Each Period:", deposit);
        System.out.println("----------------------------------------------");
        System.out.printf("%-35s%d\n", "Total Number of Periods:", totalPeriods);
        System.out.println("----------------------------------------------");
        System.out.printf("%-35s¢%.2f\n", "Total Value of the Investment:", totalValue);
        System.out.println("----------------------------------------------");
        System.out.printf("%-35s¢%.2f\n", "Total Interest Earned over the Period:", (totalValue - principal - deposit * (totalPeriods - 1)));
        System.out.println("--------------------------------------------------------------");

        // Print a thank you message
        System.out.println("\nThank you for using the Treasury Bill Yield Calculator!");
        System.out.println("\n=============================================================");


        
        // Close the Scanner to release system resources
        scanner.close();
    }
}
