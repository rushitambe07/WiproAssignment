package com.wipro.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParamTest {

    @ParameterizedTest
    @ValueSource(strings = {"piyvan", "amit", "jayanth"})
    void check(String s) {
        assertTrue(isToCheck(s), "String is not in lowercase: " + s);
    }

    boolean isToCheck(String s) {
        return s.equals(s.toLowerCase());
    }
}
