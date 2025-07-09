package com.bristlecone.collections.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CreateHashSetFromAnotherCollection {

    public static void main(String[] args) {
        List<String> animals1 = new ArrayList();
        animals1.add("fish");
        animals1.add("dog");

        List<String> animals2 = new ArrayList();
        animals2.add("cat");
        animals2.add("lion");

        Set<String> animals3 = new HashSet();
        animals3.addAll(animals1);
        animals3.addAll(animals2);

        System.out.println(animals3);


    }
}
