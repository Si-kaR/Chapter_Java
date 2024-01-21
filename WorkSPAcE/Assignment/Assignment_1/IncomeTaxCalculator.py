# Prompt the user for gross salary

def IncomeTax (grossSalary: float) -> float:
    tax = 0
    net_income = grossSalary
    temp_income = grossSalary
    
    if temp_income > 402:
        tax += 0
        temp_income -= 402
    
    else:
        tax = 0
        net_income -= tax
        return net_income
        
        
    if temp_income > 110:
        tax += 5.5
        temp_income -= 110
    
    else:
        tax += (0.05 * temp_income)
        net_income -= tax
        return net_income
        
    
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

def main():
    try:
        gross_salary = float(input("Enter Gross Salaray > > >  "))
        while True:
            if gross_salary <= 0:
                gross_salary = float(input("Enter Gross Salary. Amount must be greater than 0 > > >  "))
            else:
                break
        net_salary = (IncomeTax(gross_salary))
        tax = gross_salary - net_salary
        print(F"Tax on GHC{gross_salary:.2f} is GHC{tax:.2f}")
        print(f"Your take home salary is GHC{net_salary:.2f}")
    except:
        print("Please enter a valid salary.")
        
main()
        
    
    