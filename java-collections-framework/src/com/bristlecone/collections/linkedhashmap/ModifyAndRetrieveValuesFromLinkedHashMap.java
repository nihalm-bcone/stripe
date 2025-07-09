package com.bristlecone.collections.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class ModifyAndRetrieveValuesFromLinkedHashMap {

    public static void main(String[] args) {

        Map<Integer, String> numbers = new LinkedHashMap<>();
        numbers.put(1, "one");
        numbers.put(2, "two");
        numbers.put(3, "three");

        if(numbers.containsKey(2)){
            System.out.println("True");
        }

        System.out.println(numbers.get(2));

        if(numbers.containsKey(3)){
            numbers.put(3, "six");
        }

        System.out.println(numbers.get(3));


    }
}
