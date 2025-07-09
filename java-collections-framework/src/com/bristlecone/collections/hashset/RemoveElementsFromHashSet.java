package com.bristlecone.collections.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveElementsFromHashSet {

    public static void main(String[] args) {
        Set<String> animals1 = new HashSet<String>();
        animals1.add("fish");
        animals1.add("bird");
        animals1.add("cat");
        animals1.add("dog");

        animals1.remove("bird");
        System.out.println(animals1);

        animals1.removeIf(animal->animal.equals("cat"));

        List<String> animals2 = new ArrayList<String>();
        animals2.add("dog");
        animals2.add("fish");

        animals1.removeAll(animals2);
        System.out.println(animals1);
    }
}
