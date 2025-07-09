package com.bristlecone.collections.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IterateOverHashMap {

    public static void main(String[] args) {
        Map<String, Integer> numberMapping = new HashMap<>();
        numberMapping.put("One",1);
        numberMapping.put("Two",2);
        numberMapping.put("Three",3);
        numberMapping.put("Four",4);
        numberMapping.put("Five",5);

        //Using Java8 for-each and Lambda
        numberMapping.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });

        //Using EntrySet and Iterator
        Iterator<Map.Entry<String,Integer>> itr = numberMapping.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String,Integer> entry = itr.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        //Using EntrySet and for-each
        numberMapping.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        });

        //Using Simple for-each
        for(Map.Entry<String,Integer> entry:numberMapping.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        //Iterating over keyset
        Set<String> keys = numberMapping.keySet();
        for(String key:keys){
            System.out.println(key + " : " + numberMapping.get(key));
        }

        numberMapping.keySet().forEach(key -> {
            System.out.println(key + " : " + numberMapping.get(key));
        });

    }
}
