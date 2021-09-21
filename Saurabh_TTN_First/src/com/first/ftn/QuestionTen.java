package com.first.ftn;

public class QuestionTen
{
    public static void sum(int a, int b)
    {
        int s = a + b;
        System.out.println("Sum of two numbers: " +s);
    }

    public static void sum(double a, double b)
    {
        double s = a + b;
        System.out.println("Sum of two numbers: " +s);
    }

    public static void multiply(int a, int b)
    {
        int mul = a * b;
        System.out.println("MUL of two numbers: " +mul);
    }

    public static void multiply(double a, double b)
    {
        double mul = a * b;
        System.out.println("MUL of two numbers: " +mul);
    }

    public static void concat(String a, String b)
    {
        String con = a + b;
        System.out.println("concatenation of two strings: " +con);
    }

    public static void concat(String a, String b , String c)
    {
        String con = a + b +c;
        System.out.println("concatenation of two strings: " +con);
    }

    public static void main(String[] args)
    {
        sum(2,3);
        sum(2.2,3.2);
        multiply(2,3);
        multiply(2.2,3.1);
        concat("saurabh","soni");
        concat("saurabh","soni" , "ABES");
    }


    }


