package com.bristlecone.functional_programming.stream.filter;

import java.util.Arrays;
import java.util.List;

public class StreamFiltering {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream().filter(number -> number % 2 == 0).toList();

        System.out.println(evenNumbers);
    }
}
