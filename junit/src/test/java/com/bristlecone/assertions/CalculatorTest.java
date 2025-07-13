package com.bristlecone.assertions;

import com.bristlecone.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
        System.out.println("Before Each Method");
    }

    @AfterEach
    public void tearDown(){
        calculator = null;
        System.out.println("After Each Method");
    }

    @Test
    public void testAddition(){

        int actual = calculator.addition(1, 2);
        assertEquals(3, actual);
        System.out.println("Addition Method");
    }

    @Test
    public void testSubtraction(){

        int actual = calculator.subtraction(2, 1);
        assertEquals(1, actual);
        System.out.println("Subtraction Method");
    }

    @Test
    public void testMultiplication(){

        int actual = calculator.multiplication(1, 2);
        assertEquals(2, actual);
        System.out.println("Multiplication Method");
    }

    @Test
    public void testDivision(){

        int actual = calculator.division(4, 2);
        assertEquals(2, actual);
        System.out.println("Division Method");
    }

}
