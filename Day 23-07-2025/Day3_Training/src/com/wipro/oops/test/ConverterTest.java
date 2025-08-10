package com.wipro.oops.test;

import com.wipro.oops.Converter;

public class ConverterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Converter converter = new Converter();

        int result1 = converter.convert(4);            
        int result2 = converter.convert(10, 6);         
        double result3 = converter.convert(10.0);      

        System.out.println("convert(4): " + result1);
        System.out.println("convert(10, 6): " + result2);
        System.out.println("convert(10.0): " + result3);

	}

}
