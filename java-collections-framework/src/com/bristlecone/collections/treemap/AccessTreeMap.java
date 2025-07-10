package com.bristlecone.collections.treemap;

import java.util.*;

public class AccessTreeMap {

    public static void main(String[] args) {

        NavigableMap<String,Double> productPrices = new TreeMap<>();
        productPrices.put("Laptop", 9000.0);
        productPrices.put("Tablet", 8000.0);
        productPrices.put("Desktop", 5000.0);
        productPrices.put("Mobile", 4000.0);

        Map.Entry<String,Double> firstEntry = productPrices.firstEntry();
        System.out.println(firstEntry);
        Map.Entry<String,Double> lastEntry = productPrices.lastEntry();
        System.out.println(lastEntry);
        Map.Entry<String,Double> lowerEntry = productPrices.lowerEntry("Laptop");
        System.out.println(lowerEntry);
        Map.Entry<String,Double> higherEntry = productPrices.higherEntry("Laptop");
        System.out.println(higherEntry);
    }
}
