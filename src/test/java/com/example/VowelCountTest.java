package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VowelCountTest {

    @Test
    void testStandardStrings() {
        assertEquals(5, VowelCount.countVowels("aeiou"));
        assertEquals(5, VowelCount.countVowels("AEIOU"));
        assertEquals(2, VowelCount.countVowels("Hello"));
        assertEquals(4, VowelCount.countVowels("Java Program"));
    }

    @Test
    void testNoVowels() {
        assertEquals(0, VowelCount.countVowels("rhythm"));
        assertEquals(0, VowelCount.countVowels("12345!@#$"));
    }

    @Test
    void testEmptyAndNull() {
        assertEquals(0, VowelCount.countVowels(""));
        assertEquals(0, VowelCount.countVowels(null));
    }
}
