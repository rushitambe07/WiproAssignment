package com.wipro.carmicroservice.entity;


import jakarta.persistence.*;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String make;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "reg_id")
    private CarRegistrationDetail registrationDetail;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public CarRegistrationDetail getRegistrationDetail() {
        return registrationDetail;
    }

    public void setRegistrationDetail(CarRegistrationDetail registrationDetail) {
        this.registrationDetail = registrationDetail;
    }
}

