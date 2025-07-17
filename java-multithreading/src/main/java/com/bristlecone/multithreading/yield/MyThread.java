package com.bristlecone.multithreading.yield;

public class MyThread extends Thread{

    public void run(){

        System.out.println("MyThread");
        Thread.yield();
    }
}
