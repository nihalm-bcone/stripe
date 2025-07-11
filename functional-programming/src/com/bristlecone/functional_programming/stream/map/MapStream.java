package com.bristlecone.functional_programming.stream.map;

import java.util.Arrays;
import java.util.List;

public class MapStream {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("apple", "banana", "orange");

        fruits.stream().peek(element -> System.out.println("Before Map "+element))
                .map(element -> element.toUpperCase())
                .peek(element -> System.out.println("After Map "+element))
                .toList();
    }
}
