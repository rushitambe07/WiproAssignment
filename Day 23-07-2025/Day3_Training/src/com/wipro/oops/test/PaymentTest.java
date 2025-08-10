package com.wipro.oops.test;

import com.wipro.oops.Gpay;
import com.wipro.oops.PaymentMethod;
import com.wipro.oops.Phonepay;

public class PaymentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PaymentMethod method;

        // Using GPay
        method = new Gpay();
        method.pay(400.0);

        // Using PhonePay
        method = new Phonepay();
        method.pay(750.0);
	}

}
