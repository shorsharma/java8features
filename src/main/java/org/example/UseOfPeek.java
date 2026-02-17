package org.example;

import java.util.List;
import java.util.stream.Stream;

public class UseOfPeek {
    public static void main(String[] args) {

        List<String> list = Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e)) // Logs "three", "four"
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))   // Logs "THREE", "FOUR"
                .toList();

        //System.out.println(list);
    }
}
