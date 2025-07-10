package com.bristlecone.functional_programming.firstClassFunctions;

import java.util.function.Function;

public class FunctionAsArgument {

    public static void applyFunction(Function<Integer, Integer> function, int value) {
        System.out.println(function.apply(value));
    }

    public static void main(String[] args) {
        Function<Integer, Integer> square = i -> i * i;

        Function<Integer, Integer> dblValue = i -> i * 2;

        applyFunction(square, 10);
        applyFunction(dblValue, 10);
    }
}
