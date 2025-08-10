package com.wipro.annonymous;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Double, String> getFraction = n -> {
            double frac = n - Math.floor(n);      
            String s = String.format("%.3f", frac); 
            return s.substring(1);  
            
            
        };

        System.out.println(getFraction.apply(999.675));
	        
	        

	}

}
