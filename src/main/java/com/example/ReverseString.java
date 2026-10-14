package com.example;

/**
 * 9. Java program to reverse a string.
 */
public class ReverseString {

    public static String reverse(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String original = "DevOps Engineering";
        System.out.println("Original: " + original + " -> Reversed: " + reverse(original));
    }
}
