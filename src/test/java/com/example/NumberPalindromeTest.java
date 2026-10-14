package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class NumberPalindromeTest {

    @Test
    void testPalindromeNumbers() {
        assertTrue(NumberPalindrome.isPalindrome(121));
        assertTrue(NumberPalindrome.isPalindrome(12321));
        assertTrue(NumberPalindrome.isPalindrome(7));
        assertTrue(NumberPalindrome.isPalindrome(0));
    }

    @Test
    void testNonPalindromeNumbers() {
        assertFalse(NumberPalindrome.isPalindrome(123));
        assertFalse(NumberPalindrome.isPalindrome(100));
        assertFalse(NumberPalindrome.isPalindrome(-121)); // negative numbers cannot be palindromes
    }
}
