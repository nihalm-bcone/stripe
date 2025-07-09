package com.bristlecone.collections.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateOverHashSet {

    public static void main(String[] args) {
        Set<String> animals = new HashSet<String>();
        animals.add("dog");
        animals.add("fish");
        animals.add("cat");
        animals.add("lion");

        for(String animal: animals){
            System.out.println(animal);
        }

        Iterator<String> animalsIterator = animals.iterator();
        while(animalsIterator.hasNext()){
            System.out.println(animalsIterator.next());
        }

        animals.iterator().forEachRemaining(animal -> System.out.println(animal));

        animals.forEach(animal -> System.out.println(animal));
        animals.forEach(System.out::println);
    }
}
