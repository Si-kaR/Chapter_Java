/*
 * --------------------------------------------------------------
 * Project: Income Tax Calculation
 * Author: [ Robert Sika ]
 * Student ID: [ 89212025 ]
 * Date of Commencement: [Start Date]
 * Date of Completion: [ January 22, 2023 - Monday ]
 * University: [ Ashesi University ]
 * Faculty: [ Dr.Ayorkor Korsah ]
 * Faculty Intern: [ Elijah Boateng  &  Gideon - - - - ]
 * --------------------------------------------------------------
 * Description:
 * This Java program calculates income tax based on the
 * provided gross salary. It uses a progressive tax rate
 * structure to determine the tax amount.
 * --------------------------------------------------------------
 */

import java.util.Scanner;

public class IncomeTaxCalculator {

    /**
     * Calculates income tax and net salary based on the provided gross salary.
     * It uses a progressive tax rate structure to calculate taxes on different income brackets.
     *
     * @param grossSalary The gross salary amount.
     * @return The net income after deducting taxes.
     */
    public static void main(String[] args){

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter their gross salary
        System.out.print("\nEnter Gross Salary: > > > ");
 
        // Read the gross income entered by the user
        double grossIncome = input.nextDouble();

        // Calculate the net income after deducting taxes
        double netIncome = IncomeTax(grossIncome);

        // Display the tax and net income with formatted output
        System.out.printf("\nTax on GHC%.2f is GHC%.2f\n", grossIncome, (grossIncome - netIncome));
        System.out.printf("\nYour take home salary is GHC%.2f\n", netIncome);

        input.close();
    }


    /**
     * Calculates income tax based on a progressive tax rate structure.
     *
     * @param grossIncome The gross income amount.
     * @return The net income after deducting taxes.
     */

    public static double IncomeTax(double grossIncome) {

        // Initialize variables for tax calculation
        double tax = 0;
        double netIncome = grossIncome;
        double tempIncome = grossIncome;

        
        // Check each income bracket and calculate taxes accordingly

        // Bracket 1: 0% tax on income up to 402
        if (tempIncome > 402) {
            tax += 0;
            tempIncome -= 402;
        } else {
            tax = 0;
            netIncome -= tax;
        }

        // ... (similar logic for other brackets)

        if (tempIncome > 110) {
            tax += 5.5;
            tempIncome -= 110;
        } else {
            tax = (0.05 * tempIncome);
            tempIncome -= tax;
        }

        if (tempIncome > 130) {
            tax += 13;
            tempIncome -= 30;
        } else {
            tax += (0.10 * tempIncome);
            netIncome -= tax;
        }

        if (tempIncome > 3000) {
            tax += 525;
            tempIncome -= 3000;
        } else { 
            tax += (0.175 * tempIncome);
            netIncome -= tax;
        }

        if (tempIncome > 16395) { 
            tax += 4098.75;
            tempIncome -= 16395;
        } else { 
            tax += (0.25 * tempIncome);
            netIncome -= tax;
        }

        if (tempIncome > 29963) {
            tax += 8988.90;
            tempIncome -= 29963;
        } else {
        tax += (0.3 * tempIncome);
        netIncome -= tax;
        }

        if (tempIncome > 50000) {
        tax += (0.35 * tempIncome);
        netIncome -= tax;
        }

        // Return the calculated net income after deducting taxes
        return netIncome;
        
    }

    
   
}

