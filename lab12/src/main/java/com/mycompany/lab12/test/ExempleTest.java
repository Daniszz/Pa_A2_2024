package com.mycompany.lab12.test;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExempleTest {

    @Test
    public static void testAddition() {
        int result = 2 + 3;
        assertEquals(5, result);
    }

    @Test
    public static void testStringConcatenation() {
        String s1 = "Hello";
        String s2 = "World";
        String result = s1 + " " + s2;
        assertEquals("Hello World", result);
    }

    @Test
    public static void testFailingTest() {
        // This test is designed to intentionally fail
        fail("This test should fail.");
    }
    
}
