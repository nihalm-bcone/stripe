package com.bristlecone.collections.arraylist;

import com.bristlecone.collections.entity.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListOfUserDefinedObjects {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee employee = new Employee(1,"Nihal","Mulla");
        Employee employee2 = new Employee(2,"Nameera","Mulla");
        employeeList.add(employee);
        employeeList.add(employee2);
        System.out.println(employeeList);

        employeeList.sort(Comparator.comparing(emp->emp.getFirstName()));
        System.out.println(employeeList);

        //Sort Using Comparator Class
        Collections.sort(employeeList, new NameComparator());
        System.out.println(employeeList);
    }
}
