package com.bristlecone.functional_programming.pureFunction;

public class PureFunction {

    public static double applyDiscount(double price, double discount){
        return price - (price * discount/100);
    }

    public static void main(String[] args) {
        System.out.println(applyDiscount(1000,10));
        System.out.println(applyDiscount(1000,10));
    }
}
