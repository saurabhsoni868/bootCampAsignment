package com.first.FirstQuestion;


/**
 * Question 1.4: Convert a string to uppercase and return it
 * Parameter String Return String
 */
@FunctionalInterface
interface StringToUppercaseInterFace {
    String stringToUpper(String myString);
}

public class StringToUppercase {
    public static void main(String[] args) {
        StringToUppercaseInterFace stringToUppercaseobj = myString -> myString.toUpperCase();

        System.out.println("Saurabh Soni in uppercase: " + stringToUppercaseobj.stringToUpper("Saurabh soni"));
    }
}
