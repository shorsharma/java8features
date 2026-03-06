package org.example.interview.amazon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopProductsJava8TopN {
    public static void main(String[] args) {
        List<String> products = Arrays.asList("Alexa", "Kindle", "Echo", "Fire");
        List<String> comments = Arrays.asList("I love Alexa", "I prefer Kindle", "Alexa is best", "Fire is ok", "Alexa is best", "Kindle is best for reading");

        System.out.println(topProducts(products, comments, 1)); // [Alexa]
        System.out.println(topProducts(products, comments, 2)); // [Alexa, Kindle]
        System.out.println(topProducts(products, comments, 3)); // [Alexa, Kindle, Fire]
    }

    public static List<String> topProducts(List<String> products, List<String> comments, int topN) {
        Map<String, Integer> countMap = new HashMap<>();

        // Count mentions (exact substring match)
        products.forEach(product -> {
            int count = (int) comments.stream().filter(c -> c.contains(product)).count();
            if(count > 0)
                countMap.put(product, count);
        });

        // Sort by count desc and limit to topN
        return  countMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(topN)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

    }
}
