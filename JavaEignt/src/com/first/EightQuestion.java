package com.first;

/**
 * Question 8: Implement multiple inheritance with default methods inside interface
 */

interface InterfaceOne
{
    default void sayHello()
    {
        System.out.println("hello , I M First INTERFACE, i hope everthig is good");
    }
}

interface InterfaceTwo
{
    default void sayHello()
    {
        System.out.println("hello, I M Second INTERFACE , i hope everthig is good");
    }
}

public class EightQuestion implements InterfaceOne, InterfaceTwo
{
    public void sayHello()
    {
        //InterfaceOne.super.sayHello();
         InterfaceTwo.super.sayHello();
    }

    public static void main(String[] args) {
        EightQuestion demo = new EightQuestion();
        demo.sayHello();
    }
}
