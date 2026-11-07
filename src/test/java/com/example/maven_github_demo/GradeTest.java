package com.example.maven_github_demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GradeTest {

    Grade g = new Grade();

    @Test
    public void testAGrade() {
        assertEquals("A", g.calculateGrade(95));
    }

    @Test
    public void testBGrade() {
        assertEquals("B", g.calculateGrade(85));
    }

    @Test
    public void testCGrade() {
        assertEquals("C", g.calculateGrade(65));
    }

    @Test
    public void testFailGrade() {
        assertEquals("Fail", g.calculateGrade(30));
    }
}