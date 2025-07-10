package com.bristlecone.functional_programming.lambda.calculator;

import java.util.Scanner;

public class CalculatorPassLambdaAsParameter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;
        Calculator division = (a, b) -> a / b;
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
                    System.out.println("Sum is : "+doOperation(addition, firstNum, secondNum));
                    break;
                case 2:
                    System.out.println("Subtraction is : "+doOperation(subtraction, firstNum, secondNum));
                    break;
                case 3:
                    System.out.println("Multiplication is : "+doOperation(multiplication, firstNum, secondNum));
                    break;
                case 4:
                    System.out.println("Division is : "+doOperation(division, firstNum, secondNum));
                    break;
                case 5:
                    System.out.println("Thank you");
                    sc.close();
                    break;
            }
        }while(choice != 5);
    }

    private static int doOperation(Calculator calculator, int a, int b){
       return calculator.calculate(a,b);
    }
}
