package com.bristlecone.functional_programming.lambda;

interface Shape {
    void draw();
}
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle by traditional way");
    }
}

public class LambdaExample {

    public static void main(String[] args) {
        //Traditional Way
        Shape shape = new Rectangle();
        shape.draw();

        //Lambda
        Shape rectangle = () -> System.out.println("Rectangle by lambda way");
        rectangle.draw();
    }
}
