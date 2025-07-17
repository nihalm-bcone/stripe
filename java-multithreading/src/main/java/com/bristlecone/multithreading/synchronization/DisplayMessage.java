package com.bristlecone.multithreading.synchronization;

public class DisplayMessage {

    public synchronized void sayHello(String name){

        for(int i = 1; i <= 10; i++){
            System.out.println("Hello "+name);
        }

    }
}
