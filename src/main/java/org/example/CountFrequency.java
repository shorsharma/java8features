package org.example;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFrequency {
    public static void main(String[] args) {
        String s = "program";

        s.chars().mapToObj(c -> (char) c)
                .collect(
                        Collectors.groupingBy(Function.identity(), LinkedHashMap::new ,Collectors.counting())
                ).forEach((k,v) -> System.out.println(k + " -> " + v));
    }
}
