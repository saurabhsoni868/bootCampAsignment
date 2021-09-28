package com.first.FirstQuestion;

/**
 * Question 1.1: First number is greater than second number or not
 * Parameter (int, int) Return boolean
 */
@FunctionalInterface
interface GreaterNumberInterFace {
    boolean isFirstNumberGreater(int firstNumber, int secondNumber);
}

public class GreaterNumber {
    public static void main(String[] args) {
        GreaterNumberInterFace greaterNumber = (firstNumber, secondNumber) -> {
            if (firstNumber > secondNumber)
                return true;
            else return false;
        };

        System.out.println("10 > 4 : " + greaterNumber.isFirstNumberGreater(10, 4));
        System.out.println("4 > 10 : " + greaterNumber.isFirstNumberGreater(4, 10));
    }
}
