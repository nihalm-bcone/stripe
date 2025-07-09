package com.bristlecone.collections.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntrySetKeySetValues {

    public static void main(String[] args) {

        Map<String, Integer> numberMapping = new HashMap<>();
        numberMapping.put("One",1);
        numberMapping.put("Two",2);
        numberMapping.put("Three",3);
        numberMapping.put("Four",4);
        numberMapping.put("Five",5);

        Set<Map.Entry<String,Integer>> entries = numberMapping.entrySet();
        System.out.println(entries);

        Set<String> keys = numberMapping.keySet();
        System.out.println(keys);

        Collection<Integer> values = numberMapping.values();
        System.out.println(values);
    }
}
