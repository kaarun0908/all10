package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SimpleInterestTest {

    @Test
    void testStandardCalculation() {
        // P = 10000, R = 5, T = 2 -> SI = (10000 * 5 * 2) / 100 = 1000.0
        assertEquals(1000.0, SimpleInterest.calculate(10000, 5, 2), 0.001);
    }

    @Test
    void testZeroPrincipalOrRateOrTime() {
        assertEquals(0.0, SimpleInterest.calculate(0, 5, 2), 0.001);
        assertEquals(0.0, SimpleInterest.calculate(1000, 0, 2), 0.001);
        assertEquals(0.0, SimpleInterest.calculate(1000, 5, 0), 0.001);
    }

    @Test
    void testNegativeInputsThrowException() {
        assertThrows(IllegalArgumentException.class, () -> SimpleInterest.calculate(-100, 5, 2));
        assertThrows(IllegalArgumentException.class, () -> SimpleInterest.calculate(100, -5, 2));
        assertThrows(IllegalArgumentException.class, () -> SimpleInterest.calculate(100, 5, -2));
    }
}
