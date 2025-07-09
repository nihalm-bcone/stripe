package com.bristlecone.collections.hashset;

import com.bristlecone.collections.entity.Employee;

import java.util.HashSet;
import java.util.Set;

public class HashSetOfUserDefinedObjects {

    public static void main(String[] args) {
        Set<Employee> employees = new HashSet<Employee>();
        Employee employee1 = new Employee(1,"Nihal","Mulla");
        Employee employee2 = new Employee(1,"Nihal","Mulla");
        Employee employee3 = new Employee(3,"Nameera","Mulla");
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        System.out.println(employees);
    }
}
