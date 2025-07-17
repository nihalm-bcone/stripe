package com.bristlecone.multithreading.synchronization;

public class SynchronizationDemo {

    public static void main(String[] args) {

        DisplayMessage dm = new DisplayMessage();

        MyThread t1 = new MyThread(dm,"abc");
        MyThread t2 = new MyThread(dm,"xyz");

        t1.start();
        t2.start();
    }
}
