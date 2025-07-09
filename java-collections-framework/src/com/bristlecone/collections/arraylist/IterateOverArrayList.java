package com.bristlecone.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateOverArrayList {

    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("fish");
        System.out.println(animals);

        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }

        for(String animal : animals){
            System.out.println(animal);
        }

        Iterator<String> iterator = animals.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        animals.iterator().forEachRemaining(animal -> System.out.println(animal));

        animals.forEach(System.out::println);

        animals.forEach(animal -> System.out.println(animal));
    }
}
