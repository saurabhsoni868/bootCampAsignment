package com.first.FirstQuestion;

/**
 * Question 1.3: Concatenation of 2
 * Parameter (String, String) Return String
 */
@FunctionalInterface
interface TwoStringConcatenationInterface {
    String concatTwoStrings(String stringOne, String stringTwo);
}

public class TwoStringConcatenation {
    public static void main(String[] args) {
        TwoStringConcatenationInterface twoStringConcatenation = (stringOne, stringTwo) -> stringOne.concat(stringTwo);

        System.out.println("Star concatenated with Wars: " + twoStringConcatenation.concatTwoStrings("Star", "Wars"));
    }
}
