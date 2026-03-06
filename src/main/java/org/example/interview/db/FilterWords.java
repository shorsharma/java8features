package org.example.interview.db;

import java.util.Arrays;
import java.util.List;

public class FilterWords {
    public static void main(String[] args) {

        List<String> input =
                Arrays.asList("week", "wateres", "walk", "taeete");

        List<String> output = input.stream()
                .filter(s -> s.chars()
                        .filter(ch -> ch == 'e')
                        .count() >= 2)
                .toList();

        System.out.println(String.join(", ", output));

    }
}
