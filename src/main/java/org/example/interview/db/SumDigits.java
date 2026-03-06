package org.example.interview.db;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumDigits {
    public static void main(String[] args) {

        List<String> input = Arrays.asList("2345", "12345");

        List<Integer> output = input.stream()
                .map(s -> s.chars()
                        .map(c -> c - '0') // convert char digit to int
                        .sum())
                .collect(Collectors.toList());

        System.out.println(output);

    }
}
