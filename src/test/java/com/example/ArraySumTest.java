package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArraySumTest {

    @Test
    void testStandardSum() {
        assertEquals(150, ArraySum.sum(new int[]{10, 20, 30, 40, 50}));
    }

    @Test
    void testSingleElementAndEmpty() {
        assertEquals(42, ArraySum.sum(new int[]{42}));
        assertEquals(0, ArraySum.sum(new int[]{}));
    }

    @Test
    void testNegativeNumbers() {
        assertEquals(-10, ArraySum.sum(new int[]{-5, -10, 5}));
    }

    @Test
    void testNullArrayThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> ArraySum.sum(null));
    }
}
