package com.bristlecone.multithreading;

import java.util.Scanner;

public class JoinMethodDemo extends Thread{

    static int n,sum = 0;

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        JoinMethodDemo j = new JoinMethodDemo();
        j.start();
        j.join();

        System.out.println("Sum is "+ JoinMethodDemo.sum);

    }

    public void run(){

        for(int i=0;i<=JoinMethodDemo.n;i++){
            JoinMethodDemo.sum += i;
        }

    }
}
