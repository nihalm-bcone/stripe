package com.bristlecone.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortArrayList {

    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("fish");

        Collections.sort(animals);
        System.out.println(animals);

        Collections.sort(animals, Collections.reverseOrder());
        System.out.println(animals);

        animals.sort(Comparator.naturalOrder());
        System.out.println(animals);

        animals.sort(Comparator.reverseOrder());
        System.out.println(animals);


    }
}
