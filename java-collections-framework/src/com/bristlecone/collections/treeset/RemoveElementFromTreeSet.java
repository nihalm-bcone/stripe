package com.bristlecone.collections.treeset;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class RemoveElementFromTreeSet {

    public static void main(String[] args) {
        NavigableSet<String> fruits = new TreeSet<String>();
        fruits.add("Pineapple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Cherry");
        fruits.add("Watermelon");

        System.out.println(fruits);

        fruits.remove("Pineapple");
        System.out.println(fruits);

        fruits.removeIf(fruit -> fruit.equals("Banana"));
        System.out.println(fruits);

        fruits.pollFirst();
        System.out.println(fruits);
        fruits.pollLast();
        System.out.println(fruits);
    }
}
