package com.collectors;

import java.util.*;
import java.util.stream.Collectors;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        String paragraph = "Java Stream API makes Java code more readable and Java code more functional";

        Map<String, Integer> wordCount =
            Arrays.stream(paragraph.toLowerCase().split("\\s+"))
                  .collect(Collectors.toMap(
                      word -> word,        // key
                      word -> 1,           // initial value
                      Integer::sum         // merge function
                  ));

        wordCount.forEach((word, count) ->
            System.out.println(word + " → " + count)
        );
    }
}
