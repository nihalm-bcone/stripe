package com.bristlecone.functional_programming.firstClassFunctions;

import java.util.function.Function;

public class FirstClassFunction {

    public static void main(String[] args) {

        Function<Integer, Integer> square = i -> i*i;

        Function<String, String> upperCase = s -> s.toUpperCase();

        System.out.println(square.apply(10));
        System.out.println(upperCase.apply("hello"));
    }
}
