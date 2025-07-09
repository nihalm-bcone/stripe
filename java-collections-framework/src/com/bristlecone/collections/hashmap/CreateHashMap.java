package com.bristlecone.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class CreateHashMap {

    public static void main(String[] args) {

        Map<String, Integer> numberMapping = new HashMap<>();
        numberMapping.put("One",1);
        numberMapping.put("Two",2);
        numberMapping.put("Three",3);
        numberMapping.put("Four",4);
        numberMapping.put("Five",5);

        numberMapping.putIfAbsent("Six",6);

        System.out.println(numberMapping);


    }
}
