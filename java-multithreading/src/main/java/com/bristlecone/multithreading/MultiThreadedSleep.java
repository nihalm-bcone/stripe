package com.bristlecone.multithreading;

public class MultiThreadedSleep extends Thread {

    public static void main(String[] args) throws InterruptedException {

        MultiThreadedSleep multiThreaded = new MultiThreadedSleep();
        multiThreaded.start();

        for(int i = 1; i < 100; i++){
            System.out.println("i : "+i);
            Thread.sleep(500);
        }
    }

    @Override
    public void run() {
        for (int j = 1; j <= 100; j++) {
            System.out.println("j : "+j);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
