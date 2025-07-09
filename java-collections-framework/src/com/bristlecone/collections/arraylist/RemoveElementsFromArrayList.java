package com.bristlecone.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArrayList {

    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("fish");

        System.out.println(animals);

        animals.remove(0);
        System.out.println(animals);

        animals.remove("rat");
        System.out.println(animals);

        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("fish");

        List<String> animals4 = new ArrayList<>();
        animals4.add("rat");
        animals4.add("fish");

        animals.removeAll(animals4);
        System.out.println(animals);

        animals.removeIf(animal -> animal.equals("dog"));
        System.out.println(animals);

        animals.clear();
        System.out.println(animals);

    }
}
