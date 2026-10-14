package com.example;

/**
 * 3. Java program to check whether a number is a palindrome.
 */
public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            return false; // Negative numbers are not palindromic (e.g., -121 != 121-)
        }
        return number == ReverseNumber.reverse(number);
    }

    public static void main(String[] args) {
        int num = 12321;
        System.out.println("Is " + num + " a palindrome? " + isPalindrome(num));
    }
}
