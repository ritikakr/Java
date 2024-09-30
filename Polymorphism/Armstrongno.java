package com.armstrong;

public class Armstrongno 
{
	int number;

    Armstrongno(int number) 
    {
        this.number = number;
    }

    int calculateSumOfCubes() 
    {
        int temp = number;
        int sum = 0;
        int digits = (int) Math.log10(number) + 1;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum;
    }

    boolean isArmstrong() {
        return number == calculateSumOfCubes();
    }
}

