package com.example;

/**
 * 5. Java program to calculate a student's grade based on marks.
 */
public class StudentGrade {

    public static String calculateGrade(double marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100.");
        }
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        double marks = 85.5;
        System.out.println("Marks: " + marks + " -> Grade: " + calculateGrade(marks));
    }
}
