package com.bristlecone.collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class CreateHashSet {

    public static void main(String[] args) {
        Set<String> animals = new HashSet<String>();
        animals.add("dog");
        animals.add("rat");
        animals.add("fish");
        animals.add("dog");
        animals.add(null);
        System.out.println(animals);
    }
}
