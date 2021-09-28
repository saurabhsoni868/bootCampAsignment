package com.first;
/**
 * Question 7: Override the default method of the interface
 */

interface SomeInterface {
    default void defaultMethod() {
        System.out.println("I'm a default method defined in an interface");
    }
}
public class SeventhQuestion implements SomeInterface {
    public void defaultMethod() {
        System.out.println("I'm overridden in an implementing class");
    }

    public static void main(String[] args) {
        SeventhQuestion defaultDemo = new SeventhQuestion();
        defaultDemo.defaultMethod();
    }
}
