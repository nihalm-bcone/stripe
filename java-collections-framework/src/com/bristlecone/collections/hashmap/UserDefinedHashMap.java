package com.bristlecone.collections.hashmap;

import com.bristlecone.collections.entity.Employee;

import java.util.HashMap;
import java.util.Map;

public class UserDefinedHashMap {

    public static void main(String[] args) {

        Map<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(1,new Employee(1,"Nihal","Mulla"));
        employeeMap.put(2,new Employee(2,"Nameera","Mulla"));

        System.out.println(employeeMap);
    }
}
