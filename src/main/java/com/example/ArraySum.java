package com.example;

/**
 * 6. Java program to find the sum of elements in an array.
 */
public class ArraySum {

    public static int sum(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null.");
        }
        int total = 0;
        for (int value : arr) {
            total += value;
        }
        return total;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Sum of array elements: " + sum(numbers));
    }
}
