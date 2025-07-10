package com.bristlecone.collections.treemap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class RemoveElementFromTreeMap {

    public static void main(String[] args) {

        NavigableMap<String,Double> productPrices = new TreeMap<>();
        productPrices.put("Laptop", 9000.0);
        productPrices.put("Tablet", 8000.0);
        productPrices.put("Desktop", 5000.0);
        productPrices.put("Mobile", 4000.0);

        productPrices.remove("Laptop");
        productPrices.remove("Tablet",8000.0);
        productPrices.pollFirstEntry();
        System.out.println(productPrices);
    }
}
