package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class StringPalindromeTest {

    @Test
    void testStandardPalindromes() {
        assertTrue(StringPalindrome.isPalindrome("racecar"));
        assertTrue(StringPalindrome.isPalindrome("madam"));
        assertTrue(StringPalindrome.isPalindrome("level"));
        assertTrue(StringPalindrome.isPalindrome("noon"));
    }

    @Test
    void testPalindromeWithSpacesAndPunctuation() {
        assertTrue(StringPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
        assertTrue(StringPalindrome.isPalindrome("Madam, I'm Adam"));
    }

    @Test
    void testNonPalindromes() {
        assertFalse(StringPalindrome.isPalindrome("hello"));
        assertFalse(StringPalindrome.isPalindrome("jenkins"));
        assertFalse(StringPalindrome.isPalindrome(null));
    }
}
