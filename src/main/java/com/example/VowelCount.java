package com.example;

/**
 * 8. Java program to count the number of vowels in a string.
 */
public class VowelCount {

    public static int countVowels(String str) {
        if (str == null) {
            return 0;
        }
        int count = 0;
        String lower = str.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String sample = "Hello World Jenkins Maven";
        System.out.println("Vowel count in \"" + sample + "\": " + countVowels(sample));
    }
}
