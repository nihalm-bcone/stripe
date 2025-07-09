package com.bristlecone.collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class AccessElementsFromHashSet {

    public static void main(String[] args) {
        Set<String> animals1 = new HashSet<>();
        animals1.add("fish");
        animals1.add("dog");
        animals1.add("cat");
        animals1.add("lion");

        System.out.println(animals1.contains("fish"));
        System.out.println(animals1.size());
        System.out.println(animals1.isEmpty());
    }
}
