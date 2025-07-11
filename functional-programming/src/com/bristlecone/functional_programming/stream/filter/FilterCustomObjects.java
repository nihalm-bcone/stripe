package com.bristlecone.functional_programming.stream.filter;

import com.bristlecone.functional_programming.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class FilterCustomObjects {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        Product product1 = new Product("Phone","Electronics",2993.00);
        Product product2 = new Product("Shirt","Clothing",993.00);
        Product product3 = new Product("TV","Electronics",1993.00);
        Product product4 = new Product("Tablet","Electronics",693.00);
        Product product5 = new Product("Jeans","Clothing",430.00);

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

        products.stream().filter(product -> product.getCategory().equals("Electronics")).filter(product ->  product.getPrice()>=1000.00).forEach(System.out::println);
    }
}
