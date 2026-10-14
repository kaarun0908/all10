package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Java program to generate the Fibonacci series.
 */
public class Fibonacci {

    public static List<Long> generate(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number of terms cannot be negative.");
        }
        List<Long> series = new ArrayList<>();
        if (n == 0) return series;

        long first = 0, second = 1;
        series.add(first);
        if (n == 1) return series;

        series.add(second);
        for (int i = 2; i < n; i++) {
            long next = first + second;
            series.add(next);
            first = second;
            second = next;
        }
        return series;
    }

    public static void main(String[] args) {
        int terms = 10;
        System.out.println("Fibonacci Series (" + terms + " terms): " + generate(terms));
    }
}
