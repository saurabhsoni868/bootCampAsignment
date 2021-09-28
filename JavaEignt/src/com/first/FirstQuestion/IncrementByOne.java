package com.first.FirstQuestion;

/**
 * Question 1.2: Increment the number by 1 and return the incremented value
 * Parameter (int) Return int
 */
@FunctionalInterface
interface IncrementByOneInterFace {
    int addOne(int number);
}

public class IncrementByOne {
    public static void main(String[] args) {
        IncrementByOneInterFace incrementByOne = number -> number + 1;

        System.out.println("10 incremented by one: " + incrementByOne.addOne(10));
    }
}
