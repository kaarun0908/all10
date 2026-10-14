package com.example;

/**
 * 7. Java program to find the maximum element in an array.
 */
public class ArrayMax {

    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty.");
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {15, 42, 8, 99, 23, 74};
        System.out.println("Maximum element in array: " + findMax(numbers));
    }
}
