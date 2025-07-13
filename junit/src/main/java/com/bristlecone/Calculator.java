package com.bristlecone;

public class Calculator {

    public int addition(int a, int b){
        return a+b;
    }

    public int subtraction(int a, int b){
        return a-b;
    }

    public int multiplication(int a, int b){
        return a*b;
    }

    public int division(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.addition(1, 2);
        calculator.subtraction(1, 2);
        calculator.multiplication(1, 2);
        calculator.division(2, 4);

    }
}
