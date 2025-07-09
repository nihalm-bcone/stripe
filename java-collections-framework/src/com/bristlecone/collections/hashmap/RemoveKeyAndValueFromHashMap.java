package com.bristlecone.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class RemoveKeyAndValueFromHashMap {

    public static void main(String[] args) {

        Map<String, Integer> numberMapping = new HashMap<>();
        numberMapping.put("One",1);
        numberMapping.put("Two",2);
        numberMapping.put("Three",3);
        numberMapping.put("Four",4);
        numberMapping.put("Five",5);

        numberMapping.remove("Five"); // Removes Key and Assciated Value
        System.out.println(numberMapping);

        numberMapping.remove("Two", 2); // Removes Key and Value only if Key has exactly that Value
        System.out.println(numberMapping);

        numberMapping.remove("Three", 30);
        System.out.println(numberMapping);

    }
}
