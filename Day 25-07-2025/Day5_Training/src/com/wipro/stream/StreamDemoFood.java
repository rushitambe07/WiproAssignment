package com.wipro.stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemoFood {
	public static void main(String[] args) {

		FoodItem f1 = new FoodItem("Spring Roll", "Veg", "Chinese", 150);
		FoodItem f2 = new FoodItem("Chicken Manchurian", "Non Veg", "Chinese", 250);
		FoodItem f3 = new FoodItem("Pad Thai", "Veg", "Thai", 300);
		FoodItem f4 = new FoodItem("Fried Rice", "Veg", "Chinese", 180);
		FoodItem f5 = new FoodItem("Pasta", "Veg", "Continental", 220);

		List<FoodItem> foodList = new ArrayList<>();
		foodList.add(f1);
		foodList.add(f2);
		foodList.add(f3);
		foodList.add(f4);
		foodList.add(f5);
		
           //Example 1 : find out the list of Chinese foods.
//		List<FoodItem> chineseFoods = foodList.stream()
//				.filter(f -> f.getCuisine().equalsIgnoreCase("Chinese"))
//				.collect(Collectors.toList());
//
//		for (FoodItem item : chineseFoods) {
//		    System.out.println(item);
//		}
		
		
		// Example 2 : Find most expensive Chinese dish
		foodList.stream()
        .filter(f -> f.getCuisine().equalsIgnoreCase("Chinese"))                 
        .max(Comparator.comparing(FoodItem::getPrice))                          
        .ifPresentOrElse(                                                      
            item -> System.out.println("Most expensive Chinese dish: " + item),
            () -> System.out.println("No Chinese food found.")
        );
    }

}
