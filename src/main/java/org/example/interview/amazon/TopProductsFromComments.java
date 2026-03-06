package org.example.interview.amazon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopProductsFromComments {
    public static void main(String[] args) {

        List<String> products = Arrays.asList("Alexa", "Kindle", "Echo", "Fire");
        List<String> comments = Arrays.asList("I love Alexa", "I prefer Kindle", "Alexa is best");

        Map<String, Integer> countMap = new HashMap<>();

        // count occurrences (exact match)
        products.forEach(product -> {
            int count = (int) comments.stream().filter(c -> c.contains(product)).count();
            if(count > 0)
                countMap.put(product, count);
        });

        // sort by count desc and collect product names
        List<String> result = countMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
