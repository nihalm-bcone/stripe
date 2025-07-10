package com.bristlecone.functional_programming.pureFunction;

public class ImpureFunction {

    static double globalDiscount = 10;

    public static double applyDiscount(double price){
        return price - (price * globalDiscount/100);
    }

    public static void main(String[] args) {
        System.out.println(applyDiscount(1000));
        globalDiscount = 20;
        System.out.println(applyDiscount(1000));
    }
}
