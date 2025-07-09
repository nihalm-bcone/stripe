package com.bristlecone.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromAnotherArrayList {

    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("fish");

        System.out.println(animals);

        List<String> animals2 = new ArrayList<>();
        animals2.add("dog");
        animals2.add("cat");

        List<String> animals3 = new ArrayList<>(animals);
        animals3.addAll(animals2);
        System.out.println(animals3);

    }
}
