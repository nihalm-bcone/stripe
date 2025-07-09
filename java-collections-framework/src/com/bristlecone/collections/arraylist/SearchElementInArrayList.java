package com.bristlecone.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class SearchElementInArrayList {

    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("fish");
        System.out.println(animals);

       boolean containsAnimal = animals.contains("cat");
       System.out.println(containsAnimal);

    }
}
