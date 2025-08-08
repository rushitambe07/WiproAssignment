package com.wipro.springdemo.bean;
import org.springframework.stereotype.Component;

@Component
public class Display {
     int size = 6; 
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Display [size=" + size + "]";
    }
}
