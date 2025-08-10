package com.wipro.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class OrderServiceTest {

	@Test
	void testPlaceOrderMocked() {
		// Create a mock of OrderService
        OrderService mockService = mock(OrderService.class);

        // Mock behavior: when "ORD-01" is passed, return "successful"
        when(mockService.placeOrder("ORD-01")).thenReturn("successful");

        // Call the method with mocked behavior
        String result = mockService.placeOrder("ORD-01");

        assertEquals("successful", result);
        
		
	}

}
