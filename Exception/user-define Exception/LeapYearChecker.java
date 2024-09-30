package com.userdefineexception;
import java.util.Scanner;

class LeapYearException extends Exception {
    public LeapYearException(String message) {
        super(message);
    }
}

public class LeapYearChecker {
    public static void checkLeapYear(int year) throws LeapYearException {
        if ((year % 4 != 0) || ((year % 100 == 0) && (year % 400 != 0))) {
            throw new LeapYearException(year + " is not a leap year.");
        } else {
            System.out.println(year + " is a leap year.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        try {
            checkLeapYear(year);
        } catch (LeapYearException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

