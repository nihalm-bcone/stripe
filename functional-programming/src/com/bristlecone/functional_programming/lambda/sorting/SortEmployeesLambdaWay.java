package com.bristlecone.functional_programming.lambda.sorting;

import com.bristlecone.functional_programming.entity.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEmployeesLambdaWay {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        Employee e1 = new Employee(1,"Nihal","Mulla",30000);
        Employee e2 = new Employee(2,"Nameera","Mulla",90000);
        Employee e3 = new Employee(3,"Girish","Mane",80000);
        Employee e4 = new Employee(4,"Malik","Mane",45000);

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        Comparator<Employee> salaryComparatorAsc = (o1, o2) -> o1.getSalary()-o2.getSalary();
        Collections.sort(employees, salaryComparatorAsc);
        System.out.println(employees);

        Comparator<Employee> salaryComparatorDesc = (o1, o2) -> o2.getSalary()-o1.getSalary();
        Collections.sort(employees, salaryComparatorDesc);
        System.out.println(employees);
    }
}
