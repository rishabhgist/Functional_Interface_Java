package com.niit.jdp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        List<String> customerName = new ArrayList<>();
        Match match = new Match();
        customerName.add("Charles");
        customerName.add("Becky");
        customerName.add("Zyan");
        customerName.add("Mike");

        // Supplier
        Supplier<List<String>> name = () -> customerName;
        System.out.println(name.get());

        // Consumer
        Consumer<List<String>> firstName = strings -> System.out.println(strings.iterator().next());

    }
}