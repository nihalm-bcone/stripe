package com.bristlecone.collections.treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class IterateOverTreeMap {

    public static void main(String[] args) {

        NavigableMap<String,Double> productPrices = new TreeMap<>();
        productPrices.put("Laptop", 9000.0);
        productPrices.put("Tablet", 8000.0);
        productPrices.put("Desktop", 5000.0);
        productPrices.put("Mobile", 4000.0);

        productPrices.forEach((s,price)->{
            System.out.println(s);
        });

        Iterator<Map.Entry<String,Double>> itr = productPrices.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<String,Double> entry = itr.next();
            System.out.println(entry);
        }
    }
}
