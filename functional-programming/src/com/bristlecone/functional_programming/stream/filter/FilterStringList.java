package com.bristlecone.functional_programming.stream.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterStringList {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("apple", "orange", "banana", "kiwi", "grapefruit");

        fruits.stream().filter(fruit -> fruit.contains("apple")).forEach(System.out::println);
    }
}
