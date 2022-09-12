package com.niit.jdp;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        // Supplier
        Supplier<String> name = () -> "Java";
        System.out.println(name.get());

        // Consumer
        Consumer<String> firstName = s -> System.out.println("John");
        System.out.println(firstName);

        // Predicate
        Predicate<String> values = s -> true;
        System.out.println(values.test("Becky"));

        //Function
        Function<String, Integer> lengthFunction = String::length;
        lengthFunction.apply("Java");
    }
}