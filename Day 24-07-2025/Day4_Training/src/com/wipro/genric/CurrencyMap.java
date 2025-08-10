package com.wipro.genric;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CurrencyMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> hmap = new TreeMap<>();
        hmap.put("USD", "United states Dollar");
        hmap.put("INR", "Rupees");
        hmap.put("EUR", "Euro");

        for (Map.Entry<String, String> k : hmap.entrySet()) {
            System.out.println(k.getKey() + " - " + k.getValue());
        }
	}

}
