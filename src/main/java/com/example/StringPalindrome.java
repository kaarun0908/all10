package com.example;

/**
 * 10. Java program to check whether a string is a palindrome.
 */
public class StringPalindrome {

    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        // Normalize: remove non-alphanumeric and convert to lowercase for general palindrome checking
        String clean = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = clean.length() - 1;

        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String test = "Madam, I'm Adam";
        System.out.println("\"" + test + "\" is palindrome? " + isPalindrome(test));
    }
}
