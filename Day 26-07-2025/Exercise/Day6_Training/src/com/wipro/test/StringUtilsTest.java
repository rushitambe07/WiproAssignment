package com.wipro.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;  // ✅ This is from JUnit 5




public class StringUtilsTest {

    @Test
    public void testUpperCaseTrue() {
        assertTrue(StringUtils.isUpperCase("HELLO"));
    }

    @Test
    public void testUpperCaseFalse() {
        assertFalse(StringUtils.isUpperCase("Hello"));
    }

    @Test
    public void testEmptyString() {
        assertTrue(StringUtils.isUpperCase(""));
    }

    @Test
    public void testNullInput() {
        assertFalse(StringUtils.isUpperCase(null));
    }
}
