package com.pratice;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfArray {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {1, 2, 3, 4, 2, 1, 5, 3, 2, 4, 4, 5};
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("Frequency of each element:");

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
        }
    }
}