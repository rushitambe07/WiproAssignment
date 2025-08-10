package com.wipro.oops;


public class Restaurant {
    private String restaurantId;
    private String ownerName;
    private double averageRating;
  

    // Default constructor
    public Restaurant() {
    }

    // Parameterized constructor
    public Restaurant(String restaurantId, String ownerName, double averageRating) {
        this.restaurantId = restaurantId;
        this.ownerName = ownerName;
        this.averageRating = averageRating;
        
    }

    // Getters and Setters
    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    // toString method
    @Override
    public String toString() {
        return "Restaurant [ID=" + restaurantId + ", Owner=" + ownerName +
                ", Rating=" + averageRating + "]";
    }
}
