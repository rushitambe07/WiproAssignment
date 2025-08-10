package com.wipro.thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VowelTread {
    public static void main(String[] args) throws InterruptedException {
        List<String> names = new ArrayList<>(Arrays.asList("Amit", "Jayanta"));

        // Create threads with separate Runnable classes
        Thread t1 = new Thread(new VowelCapi(names));
        Thread t2 = new Thread(new Lowercase(names));

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        // Print final result
        System.out.println("Final names list:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}