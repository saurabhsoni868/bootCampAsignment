package com.first.ftn;

//Write a program to replace a substring inside a string with other string

public class QuestionOne
{
    public static void main(String[] args)
    {
        String s1="my name is saurabh soni and i live in ghaziabad";
        String replaceString=s1.replace("saurabh soni","sachin kashyap");//replaces all occurrences
        System.out.println(replaceString);
    }
}