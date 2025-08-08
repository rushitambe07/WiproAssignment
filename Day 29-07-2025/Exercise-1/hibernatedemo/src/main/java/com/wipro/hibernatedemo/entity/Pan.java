package com.wipro.hibernatedemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Pan")
public class Pan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     int id;

    @Column(name="panholder_name")
     String panholderName;
    @Column(name="pan_number")
     String panNumber;

    // Constructors
    public Pan() {}
    public Pan(String panholderName, String panNumber) {
        this.panholderName = panholderName;
        this.panNumber = panNumber;
    }

    // Getters and Setters
    public int getId() { 
    	return id; }
    
    public String getPanholderName() { 
    	return panholderName; }
    
    public void setPanholderName(String panholderName) 
    { 
    	this.panholderName = panholderName; }

    public String getPanNumber() { 
    	return panNumber; }
    
    public void setPanNumber(String panNumber) {
    	this.panNumber = panNumber; }

    @Override
    public String toString() {
        return "Pan [id=" + id + ", panholderName=" + panholderName + ", panNumber=" + panNumber + "]";
    }
	public void setId(int id) {
		this.id=id;
		
	}
}

