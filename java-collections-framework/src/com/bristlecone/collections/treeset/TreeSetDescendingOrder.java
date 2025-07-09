package com.bristlecone.collections.treeset;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDescendingOrder {

    public static void main(String[] args) {
        SortedSet<String> fruits = new TreeSet<String>(Comparator.reverseOrder());
        fruits.add("Pear");
        fruits.add("Strawberry");
        fruits.add("Mango");
        fruits.add("Pineapple");
        fruits.add("Banana");
        System.out.println(fruits);
    }
}
