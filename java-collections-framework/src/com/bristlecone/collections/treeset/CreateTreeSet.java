package com.bristlecone.collections.treeset;

import java.util.SortedSet;
import java.util.TreeSet;

public class CreateTreeSet {

    public static void main(String[] args) {
        SortedSet<String> fruits = new TreeSet();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("orange");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Pear");
        fruits.add("Strawberry");
        fruits.add("Mango");

        System.out.println(fruits);
    }
}
