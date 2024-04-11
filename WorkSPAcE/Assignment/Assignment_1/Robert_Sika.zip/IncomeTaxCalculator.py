"""
--------------------------------------------------------------
Project: Income Tax Calculation

Author: [  Robert Sika ]

Student ID: [ 89212025 ]

Date of Commencement: [Start Date]

Date of Completion: [ January 22, 2023 - Monday ]

University:  [ Ashesi University ]

Faculty: [  Dr. Ayorkor Korsah ]

Faculty Intern: [ Elijah Boateng  &  Gideon - - - - ]
--------------------------------------------------------------
Description:
This Python script calculates income tax based on the
provided gross salary. It uses a progressive tax rate
structure to determine the tax amount.
--------------------------------------------------------------
"""

def IncomeTax (grossSalary: float) -> float:

        # Initialize variables for tax, net_income, and temporary income calculations.
    tax = 0
    net_income = grossSalary
    temp_income = grossSalary
    
        # Apply tax rate for the first income bracket (up to 402)
    if temp_income > 402:
        tax += 0
        temp_income -= 402
    else:
        # If gross salary is below the bracket, no tax is applied.
        tax = 0
        net_income -= tax
        return net_income

        # Apply tax rate for the second income bracket (up to 110)    
    if temp_income > 110:
        tax += 5.5
        temp_income -= 110
    else:
        # If gross salary is below the bracket, apply a proportional tax rate.
        tax += (0.05 * temp_income)
        net_income -= tax
        return net_income# Return the net income after deducting all applicable taxes.
        
        # Similar logic follows for the remaining income brackets...
    
    if temp_income > 130:
        tax += 13
        temp_income -= 30
        
    else:
        tax += (0.10 * temp_income)
        net_income -= tax
        return net_income
        
    
    if temp_income > 3000:
        tax += 525
        temp_income -= 3000
        
    else:
        tax+= (0.175 * temp_income)
        net_income -= tax
        return net_income
        
    
    if temp_income > 16395:
        tax += 4098.75
        temp_income -= 16395
        
    else:
        tax += (0.25 * temp_income)
        net_income -= tax
        return net_income
        
    
    if temp_income > 29963:
        tax += 8988.90
        temp_income -= 29963
        
    else:
        tax += (0.3 * temp_income)
        net_income -= tax
        return net_income
        
    
    if temp_income > 50000:
        tax += (0.35 * temp_income)
        net_income -= tax
        return net_income

# This main function serves as the entry point for the script.
def main():
    try:
        # Prompt the user to enter their gross salary and ensure it is a valid positive number.
        gross_salary = float(input("\nEnter Gross Salaray > > >  "))
        while True:
            if gross_salary <= 0:
                gross_salary = float(input("\nEnter Gross Salary. Amount must be greater than 0 > > >  "))
            else:
                break

        # Call the IncomeTax function to calculate tax and net salary based on the gross salary.
        net_salary = (IncomeTax(gross_salary))
        tax = gross_salary - net_salary

        # Print the results, including tax amount and take-home salary.
        print(F"\nTax on GHC{gross_salary:.2f} is GHC{tax:.2f}")
        print(f"\nYour take home salary is GHC{net_salary:.2f}\n")
    except:
        # Handle exceptions for invalid inputs.
        print("\nPlease enter a valid salary.\n")

# Call the main function to execute the script.
main()
        
# This is from the Python 

Enter Gross Salaray > > >  450

Tax on GHC450.00 is GHC2.40

Your take home salary is GHC447.60




# This is from the Java
Enter Gross Salary: > > > 450

Tax on GHC450.00 is GHC88.26

Your take home salary is GHC361.74
"""
--------------------------------------------
| **Script Purpose**                      |
|------------------------------------------|
| This script calculates income tax and   |
| net salary based on the provided gross  |
| salary.                                 |
--------------------------------------------

--------------------------------------------
| **IncomeTax Function**                  |
|------------------------------------------|
| - Input: `grossSalary` (float) - the    |
|   gross salary amount.                  |
| - Output: float - the net income after  |
|   deducting taxes.                       |
| - Initialization of variables           |
|   (`tax`, `net_income`, `temp_income`). |
| - Application of progressive tax rates  |
|   to different income brackets.          |
| - Updates tax and net_income            |
|   accordingly.                          |
| - Returns the net_income after all tax   |
|   deductions.                           |
--------------------------------------------

--------------------------------------------
| **main Function**                       |
|------------------------------------------|
| - Entry point for the script.           |
| - Prompts user to enter gross salary,   |
|   ensuring it is a valid positive       |
|   number.                               |
| - Calls IncomeTax function to calculate|
|   tax and net salary based on the       |
|   provided gross salary.                |
| - Prints results to the console,        |
|   including tax amount and take-home    |
|   salary.                               |
| - Exception handling for invalid inputs.|
--------------------------------------------

--------------------------------------------
| **Example Usage**                       |
|------------------------------------------|
| - Enter Gross Salary > > > 50000.00     |
| - Tax on GHC50000.00 is GHC15758.90     |
| - Your take-home salary is GHC34241.10  |
--------------------------------------------

--------------------------------------------
| **Note**                                |
|------------------------------------------|
| The tax rates and brackets used in this  |
| script may not reflect the actual tax   |
| laws and should be adjusted accordingly.|
--------------------------------------------
"""
