package com.bristlecone.collections.treeset;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class AccessElementsOfTreeSet {

    public static void main(String[] args) {
        NavigableSet<String> fruits = new TreeSet();
        fruits.add("Pineapple");
        fruits.add("Banana");
        fruits.add("Strawberry");
        fruits.add("Mango");
        System.out.println(fruits.contains("Pineapple"));
        System.out.println(fruits.size());

        System.out.println(fruits.first());
        System.out.println(fruits.last());
        System.out.println(fruits.higher("Pineapple"));
    }
}
