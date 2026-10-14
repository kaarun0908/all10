package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentGradeTest {

    @Test
    void testGradeCategories() {
        assertEquals("A+", StudentGrade.calculateGrade(95));
        assertEquals("A+", StudentGrade.calculateGrade(90));
        assertEquals("A", StudentGrade.calculateGrade(85));
        assertEquals("B", StudentGrade.calculateGrade(75));
        assertEquals("C", StudentGrade.calculateGrade(65));
        assertEquals("D", StudentGrade.calculateGrade(55));
        assertEquals("F", StudentGrade.calculateGrade(40));
    }

    @Test
    void testBoundaryValues() {
        assertEquals("F", StudentGrade.calculateGrade(0));
        assertEquals("A+", StudentGrade.calculateGrade(100));
    }

    @Test
    void testInvalidMarksThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> StudentGrade.calculateGrade(-5));
        assertThrows(IllegalArgumentException.class, () -> StudentGrade.calculateGrade(105));
    }
}
