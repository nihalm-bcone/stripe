package com.bristlecone.functional_programming.stream.map;

import com.bristlecone.functional_programming.entity.User;

import java.util.ArrayList;
import java.util.List;

public class MapCustomObject {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        User user = new User(1,"nihal","1234","nihal@gmail.com");
        User user1 = new User(2,"nameera","12345","nameera@gmail.com");
        users.add(user);
        users.add(user1);

        users.stream().map((u)->u.getEmail()).forEach(System.out::println);
    }
}
