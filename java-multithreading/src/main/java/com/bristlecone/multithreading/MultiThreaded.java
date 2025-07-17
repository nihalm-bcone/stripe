package com.bristlecone.multithreading;

import java.util.stream.Stream;

public class MultiThreaded extends Thread{

    public static void main(String[] args) {

        MultiThreaded multiThreaded = new MultiThreaded();
        multiThreaded.start();

        for(int i = 1; i < 100; i++){
            System.out.println("i : "+i);
        }
    }

    @Override
    public void run() {
        for (int j = 1; j <= 100; j++) {
            System.out.println("j : "+j);
        }
    }
}
