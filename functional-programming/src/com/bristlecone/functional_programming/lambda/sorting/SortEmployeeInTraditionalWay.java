package com.bristlecone.functional_programming.lambda.sorting;

import com.bristlecone.functional_programming.entity.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEmployeeInTraditionalWay {

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

        Collections.sort(employees, new SalaryComparatorAsc());
        System.out.println(employees);

        Collections.sort(employees, new SalaryComparatorDesc());
        System.out.println(employees);


    }
}

class SalaryComparatorAsc implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSalary()-o2.getSalary();
    }
}

class SalaryComparatorDesc implements Comparator<Employee>{


    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.getSalary()-o1.getSalary();
    }
}