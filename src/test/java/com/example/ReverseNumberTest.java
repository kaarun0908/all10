package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseNumberTest {

    @Test
    void testReversePositiveNumber() {
        assertEquals(54321, ReverseNumber.reverse(12345));
    }

    @Test
    void testReverseNegativeNumber() {
        assertEquals(-54321, ReverseNumber.reverse(-12345));
    }

    @Test
    void testReverseSingleDigit() {
        assertEquals(7, ReverseNumber.reverse(7));
        assertEquals(0, ReverseNumber.reverse(0));
    }

    @Test
    void testReverseWithTrailingZeros() {
        assertEquals(1, ReverseNumber.reverse(100));
    }
}
