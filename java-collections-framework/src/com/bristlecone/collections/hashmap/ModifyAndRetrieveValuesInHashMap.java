package com.bristlecone.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class ModifyAndRetrieveValuesInHashMap {

    public static void main(String[] args) {
        Map<String, Integer> numberMapping = new HashMap<>();
        numberMapping.put("One",1);
        numberMapping.put("Two",2);
        numberMapping.put("Three",3);
        numberMapping.put("Four",4);
        numberMapping.put("Five",5);

        if(numberMapping.containsValue(4)){
            System.out.println("True");
        }

        //get()
        System.out.println(numberMapping.get("Five"));
        numberMapping.put("Six",6);
        System.out.println(numberMapping);

        if(numberMapping.containsKey("Three")){
            numberMapping.put("Three",9);
        }
        System.out.println(numberMapping.get("Three"));

        System.out.println(numberMapping.isEmpty());
        System.out.println(numberMapping.size());
        System.out.println(numberMapping.keySet());
    }
}
