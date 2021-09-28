package com.first;

/**
 * Question 3: Using (instance) method reference create and apply
 * add and subtract method and using (static) method reference
 * create and apply multiplication method for the functional interface created
 */

@FunctionalInterface
interface OperationInterFace
{
    int processIntegers(int numberOne, int numberTwo);
}

public class ThirdQuestion {
    int add(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    int subtract(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }

    static int multiply(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }

    public static void main(String[] args) {
        OperationInterFace operation = new ThirdQuestion()::add;
        System.out.println("Adding: " + operation.processIntegers(5, 4));
        operation = new ThirdQuestion()::subtract;
        System.out.println("Subtract: " + operation.processIntegers(5, 4));
        operation = ThirdQuestion::multiply;
        System.out.println("Multiplying: " + operation.processIntegers(5, 4));
    }
}
