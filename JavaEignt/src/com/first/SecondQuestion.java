package com.first;

/**
 * Question 2: Create a functional interface whose method takes 2 integers and return one integer
 */

@FunctionalInterface
interface TakesTwoReturnsOne {
    int returnOne(int numberOne, int numberTwo);
}

public class SecondQuestion {
    public static void main(String[] args) {
        TakesTwoReturnsOne takesTwoReturnsOne = (numberOne, numberTwo) -> numberOne + numberTwo;

        System.out.println("5 + 7= " + takesTwoReturnsOne.returnOne(5, 7));
    }
}
