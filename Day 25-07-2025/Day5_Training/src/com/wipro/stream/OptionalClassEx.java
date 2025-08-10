package com.wipro.stream;

import java.util.Optional;

public class OptionalClassEx {
    public static void main(String[] args) {

	// Create an Optional with an Integer value
    Optional<Integer> opt = Optional.of(100);

    // Use ifPresent to print value if present
    opt.ifPresent(val -> System.out.println("Value is: " + val));

    // Now test orElse on an empty Optional
    Optional<String> emptyOpt = Optional.ofNullable(null);
    String result = emptyOpt.orElse("Default Value");

    System.out.println("Result: " + result);
    }

}
