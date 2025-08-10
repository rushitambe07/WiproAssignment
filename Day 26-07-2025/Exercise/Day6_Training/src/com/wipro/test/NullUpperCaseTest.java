package com.wipro.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NullUpperCaseTest {

	@Test
	public void testNullToUpperCaseThrowsException() {
        String str = null;

        assertThrows(NullPointerException.class, () -> {
            str.toUpperCase();
        });
	}

}
