package com.wipro.stream;

public class FoodItem {
	 String foodName;
	 String foodType;   
	 String cuisine;    
	 double price;

	public FoodItem(String foodName, String foodType, String cuisine, double price) {
		this.foodName = foodName;
		this.foodType = foodType;
		this.cuisine = cuisine;
		this.price = price;
	}

	
	public String getFoodName() {
		return foodName;
	}

	public String getFoodType() {
		return foodType;
	}

	public String getCuisine() {
		return cuisine;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return foodName + " - " + foodType + " - " + cuisine + " - ₹" + price;
	}
}
