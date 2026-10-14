package com.example;

import java.util.Arrays;

/**
 * Main application runner demonstrating all 10 Java practical programs.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("============================================================");
        System.out.println("       JAVA PRACTICAL SUITE - 10 PROGRAMS EXECUTION         ");
        System.out.println("============================================================");

        // 1. Fibonacci series
        System.out.println("\n[1] Fibonacci Series (first 8 numbers):");
        System.out.println("    " + Fibonacci.generate(8));

        // 2. Reverse a number
        int numToReverse = 98765;
        System.out.println("\n[2] Reverse a Number:");
        System.out.println("    Input: " + numToReverse + " -> Reversed: " + ReverseNumber.reverse(numToReverse));

        // 3. Number palindrome
        int palindromeNumber = 12321;
        System.out.println("\n[3] Number Palindrome Check:");
        System.out.println("    Is " + palindromeNumber + " a palindrome? " + NumberPalindrome.isPalindrome(palindromeNumber));

        // 4. Simple interest
        double principal = 5000, rate = 6.5, time = 3;
        System.out.println("\n[4] Calculate Simple Interest:");
        System.out.printf("    Principal: %.2f, Rate: %.2f%%, Time: %.1f years -> SI: %.2f%n",
                principal, rate, time, SimpleInterest.calculate(principal, rate, time));

        // 5. Student grade
        double marks = 88.5;
        System.out.println("\n[5] Student Grade Calculation:");
        System.out.println("    Marks: " + marks + " -> Grade: " + StudentGrade.calculateGrade(marks));

        // 6. Sum of array elements
        int[] arr = {10, 25, 30, 45, 50};
        System.out.println("\n[6] Sum of Elements in Array:");
        System.out.println("    Array: " + Arrays.toString(arr) + " -> Sum: " + ArraySum.sum(arr));

        // 7. Maximum element in array
        int[] maxArr = {14, 88, 52, 99, 37, 61};
        System.out.println("\n[7] Maximum Element in Array:");
        System.out.println("    Array: " + Arrays.toString(maxArr) + " -> Max: " + ArrayMax.findMax(maxArr));

        // 8. Vowel count in string
        String text = "Continuous Integration with Jenkins and Maven";
        System.out.println("\n[8] Count Vowels in String:");
        System.out.println("    Text: \"" + text + "\" -> Vowel Count: " + VowelCount.countVowels(text));

        // 9. Reverse a string
        String strToReverse = "Jenkins Pipeline";
        System.out.println("\n[9] Reverse a String:");
        System.out.println("    Input: \"" + strToReverse + "\" -> Reversed: \"" + ReverseString.reverse(strToReverse) + "\"");

        // 10. String palindrome check
        String testPalindrome = "racecar";
        System.out.println("\n[10] String Palindrome Check:");
        System.out.println("    Is \"" + testPalindrome + "\" a palindrome? " + StringPalindrome.isPalindrome(testPalindrome));

        System.out.println("\n============================================================");
        System.out.println("       All 10 Programs Executed Successfully!               ");
        System.out.println("============================================================");
    }
}
