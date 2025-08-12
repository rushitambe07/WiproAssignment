package com.wipro.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class StringLowerCaseTest {

	@ParameterizedTest
    @ValueSource(strings = {"Rushikesh", "sham", "jayanth"})
    void check(String s) {
        assertTrue(isToCheck(s));
    }

    boolean isToCheck(String s) {
        return s.equals(s.toLowerCase());
    }
}
