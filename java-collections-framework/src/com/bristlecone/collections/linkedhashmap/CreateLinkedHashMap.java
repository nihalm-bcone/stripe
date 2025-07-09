package com.bristlecone.collections.linkedhashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CreateLinkedHashMap {

    public static void main(String[] args) {
        Map<Integer, String> numbers = new LinkedHashMap<>();
        numbers.put(1, "one");
        numbers.put(2, "two");
        numbers.put(3, "three");

        System.out.println(numbers);
    }
}
