package com.bristlecone.collections.stack;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class IterateOverStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.forEach(System.out::println);
        stack.forEach(num->System.out.println(num));
        Iterator<Integer> itr = stack.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        stack.iterator().forEachRemaining(System.out::println);
        stack.iterator().forEachRemaining(num->System.out.println(num));
        ListIterator<Integer> itr1 = stack.listIterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
    }
}
