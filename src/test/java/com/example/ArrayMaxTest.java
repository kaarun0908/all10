package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayMaxTest {

    @Test
    void testStandardMax() {
        assertEquals(99, ArrayMax.findMax(new int[]{15, 42, 8, 99, 23, 74}));
    }

    @Test
    void testAllNegativeNumbers() {
        assertEquals(-2, ArrayMax.findMax(new int[]{-10, -50, -2, -8}));
    }

    @Test
    void testSingleElement() {
        assertEquals(100, ArrayMax.findMax(new int[]{100}));
    }

    @Test
    void testEmptyAndNullArrayThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> ArrayMax.findMax(new int[]{}));
        assertThrows(IllegalArgumentException.class, () -> ArrayMax.findMax(null));
    }
}
