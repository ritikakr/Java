package com.day5;

import java.util.Scanner;

class CountryNotValidException extends Exception
{
    public CountryNotValidException(String message) 
    {
        super(message);
    }
}

class EmployeeNameInvalidException extends Exception 
{
    public EmployeeNameInvalidException(String message)
    {
        super(message);
    }
}

class TaxNotEligibleException extends Exception 
{
    public TaxNotEligibleException(String message) 
    {
        super(message);
    }
}

class TaxCalculator 
{
    /**
     * Calculates the tax amount for an employee based on their salary and citizenship.
     *
     * @param empName  The employee's name.
     * @param isIndian True if the employee is an Indian citizen, false otherwise.
     * @param empSal   The employee's annual salary.
     * @return The tax amount, or 0 if the employee is not eligible for tax.
     * @throws CountryNotValidException If the employee is not an Indian citizen.
     * @throws EmployeeNameInvalidException If the employee's name is null or empty.
     * @throws TaxNotEligibleException If the employee's salary is less than 10,000.
     */
    public double calculateTax(String empName, boolean isIndian, double empSal) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException 
    {
        // Check if the employee is an Indian citizen
        if (!isIndian) 
        {
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax.");
        }

        // Check if the employee's name is valid
        if (empName == null || empName.isEmpty()) 
        {
            throw new EmployeeNameInvalidException("The employee name cannot be empty.");
        }

        // Check if the employee is eligible for tax
        if (empSal < 10000) 
        {
            throw new TaxNotEligibleException("The employee does not need to pay tax.");
        }

        // Calculate the tax amount based on the employee's salary
        double taxAmount = 0;

        if (empSal >= 100000) 
        {
            taxAmount = empSal * 8 / 100;
        } else if (empSal >= 50000) 
        {
            taxAmount = empSal * 6 / 100;
        } else if (empSal >= 30000) 
        {
            taxAmount = empSal * 5 / 100;
        } else 
        {
            taxAmount = empSal * 4 / 100;
        }

        return taxAmount;
    }
}

public class CalculatorSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get employee information from the user
        System.out.print("Enter employee name: ");
        String empName = sc.nextLine();

        System.out.print("Is the employee Indian (true/false): ");
        boolean isIndian = sc.nextBoolean();

        System.out.print("Enter employee salary: ");
        double empSal = sc.nextDouble();

        // Calculate the tax amount and handle exceptions
        try {
            TaxCalculator taxCalculator = new TaxCalculator();
            double taxAmount = taxCalculator.calculateTax(empName, isIndian, empSal);
            System.out.println("Tax amount is: " + taxAmount);
        } catch (CountryNotValidException e) {
            System.out.println(e.getMessage());
        } catch (EmployeeNameInvalidException e) {
            System.out.println(e.getMessage());
        } catch (TaxNotEligibleException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        sc.close();
    }
}