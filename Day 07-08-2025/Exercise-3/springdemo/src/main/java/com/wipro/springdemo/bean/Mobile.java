package com.wipro.springdemo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
     Display display;

    @Autowired  
    public Mobile(Display display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return "Mobile with " + display;
    }
}
