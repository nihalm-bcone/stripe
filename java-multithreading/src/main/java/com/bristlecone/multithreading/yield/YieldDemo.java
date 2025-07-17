package com.bristlecone.multithreading.yield;

public class YieldDemo {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("Main Thread");

    }
}
