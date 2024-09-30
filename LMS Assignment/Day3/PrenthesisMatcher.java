package com.day3;

public class PrenthesisMatcher 
{
	public static int findClosingParenthesis(String sentence, int openingParenthesisIndex) 
	{
        int count = 1;
        for (int i = openingParenthesisIndex + 1; i < sentence.length(); i++) 
        {
            if (sentence.charAt(i) == '(') 
            {
                count++;
            } else if (sentence.charAt(i) == ')') 
            {
                count--;
            }
            if (count == 0) 
            {
                return i;
            }
        }
        throw new IllegalArgumentException("No matching closing parenthesis found.");
    }

    public static void main(String[] args) 
    {
        String sentence = "Sometimes (when I nest my parenthesis (also called parentheticals) too many times (like this (and this))) they get quite confusing."; 
        int openingParenthesisIndex = 10;

        int closingParenthesisIndex = findClosingParenthesis(sentence, openingParenthesisIndex);
        System.out.println("Closing parenthesis index: " + closingParenthesisIndex);
    }

}
