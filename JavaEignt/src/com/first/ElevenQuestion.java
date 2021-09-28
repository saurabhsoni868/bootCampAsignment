package com.first;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Question 11: Find the average of numbers inside an integer list after doubling them
 */

public class ElevenQuestion {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 1,2);
        System.out.println("Doubling numbers and averaging them: " +
                integers.stream()
                        .map(integer -> integer * 2)
                        .collect(Collectors.averagingInt(Integer::intValue)));
    }
}
