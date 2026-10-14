package com.example;

/**
 * 2. Java program to reverse a number.
 */
public class ReverseNumber {

    public static int reverse(int number) {
        int reversed = 0;
        int temp = Math.abs(number);

        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return number < 0 ? -reversed : reversed;
    }

    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Original: " + num + ", Reversed: " + reverse(num));
    }
}
