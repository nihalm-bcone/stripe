package com.bristlecone.collections.treeset;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class IterateOverTreeSet {

    public static void main(String[] args) {
        NavigableSet<String> fruits = new TreeSet();
        fruits.add("Banana");
        fruits.add("Pineapple");
        fruits.add("Mango");
        fruits.add("Cherry");

        for(String fruit : fruits){
            System.out.println(fruit);
        }

        fruits.iterator().forEachRemaining(fruit -> System.out.println(fruit));
        fruits.forEach(System.out::println);
    }
}
