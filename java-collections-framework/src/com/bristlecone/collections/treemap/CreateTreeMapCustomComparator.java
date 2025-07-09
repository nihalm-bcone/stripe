package com.bristlecone.collections.treemap;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class CreateTreeMapCustomComparator {

    public static void main(String[] args) {
        SortedMap<String,Integer> numbers = new TreeMap<>(Comparator.reverseOrder());
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("four", 4);
        numbers.put("five", 5);

        System.out.println(numbers);
    }

}
