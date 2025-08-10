package com.wipro.test;

public class Box<T> {

	T t;

    void set(T t) {
        this.t = t;
    }

    T get() {
        return t;
    }
}
