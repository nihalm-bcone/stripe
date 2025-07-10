package com.bristlecone.functional_programming.lambda.calculator;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
            choice = sc.nextInt();
            System.out.println("Enter First Number");
            int firstNum = sc.nextInt();
            System.out.println("Enter Second Number");
            int secondNum = sc.nextInt();
            switch(choice){
                case 1:
                    Calculator addition = (a, b) -> a + b;
                    System.out.println("Sum is : "+addition.calculate(firstNum, secondNum));
                    break;
                case 2:
                    Calculator subtraction = (a, b) -> a - b;
                    System.out.println("Subtraction is : "+subtraction.calculate(firstNum, secondNum));
                    break;
                case 3:
                    Calculator multiplication = (a, b) -> a * b;
                    System.out.println("Multiplication is : "+multiplication.calculate(firstNum, secondNum));
                    break;
                case 4:
                    Calculator division = (a, b) -> a / b;
                    System.out.println("Division is : "+division.calculate(firstNum, secondNum));
                    break;
                case 5:
                    System.out.println("Thank you");
                    sc.close();
                    break;
            }
        }while(choice != 5);
    }

}
