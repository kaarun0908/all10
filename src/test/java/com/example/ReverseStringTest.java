package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ReverseStringTest {

    @Test
    void testStandardStrings() {
        assertEquals("olleh", ReverseString.reverse("hello"));
        assertEquals("avaJ", ReverseString.reverse("Java"));
        assertEquals("snikneJ", ReverseString.reverse("Jenkins"));
    }

    @Test
    void testSingleCharAndEmpty() {
        assertEquals("A", ReverseString.reverse("A"));
        assertEquals("", ReverseString.reverse(""));
    }

    @Test
    void testNullString() {
        assertNull(ReverseString.reverse(null));
    }
}
