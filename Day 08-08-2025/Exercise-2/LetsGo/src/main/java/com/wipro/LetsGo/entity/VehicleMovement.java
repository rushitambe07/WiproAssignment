package com.wipro.LetsGo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehicle_movement")
public class VehicleMovement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int vehId;
    private double lat;
    private double longitude;

    private LocalDateTime timestamp;

    // Constructors
    public VehicleMovement() {
        this.timestamp = LocalDateTime.now();
    }

    public VehicleMovement(int vehId, double lat, double longitude) {
        this.vehId = vehId;
        this.lat = lat;
        this.longitude = longitude;
        this.timestamp = LocalDateTime.now();
    }

    // Getters and Setters
    public int getId() { return id; }
    public int getVehId() { return vehId; }
    public void setVehId(int vehId) { this.vehId = vehId; }

    public double getLat() { return lat; }
    public void setLat(double lat) { this.lat = lat; }

    public double getLongitude() { return longitude; }
    public void setLongitude(double longitude) { this.longitude = longitude; }

    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
}