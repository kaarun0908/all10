package com.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FibonacciTest {

    @Test
    void testFibonacciBaseCases() {
        assertEquals(List.of(), Fibonacci.generate(0));
        assertEquals(List.of(0L), Fibonacci.generate(1));
        assertEquals(List.of(0L, 1L), Fibonacci.generate(2));
    }

    @Test
    void testFibonacciFirstEight() {
        List<Long> expected = List.of(0L, 1L, 1L, 2L, 3L, 5L, 8L, 13L);
        assertEquals(expected, Fibonacci.generate(8));
    }

    @Test
    void testNegativeTermsThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.generate(-1));
    }
}
