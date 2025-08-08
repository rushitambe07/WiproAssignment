package com.wipro.weatherdemo;

public class MobileDTO {
	int id;
	String make;
	String modelNumber;
	double price;
	
	
	public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
