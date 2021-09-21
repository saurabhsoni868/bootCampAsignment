package com.first.ftn;

public class QuestionSeven
{
    public static  String name = "saurabh";
    public static String surname ="soni";
    public static int age = 23;

    static
    {
        System.out.println("Calling the static block and it's Data-------");
        System.out.println("my name is: "+QuestionSeven.name);
        System.out.println("my surname is: "+QuestionSeven.surname);
        System.out.println("my age is: "+QuestionSeven.age);
        System.out.println("\n");
    }

    public static void printPersonDetails(String name_ , String surname_ , int age_)
   {
       System.out.println("my name is: "+name_);
       System.out.println("my surname is: "+surname_);
       System.out.println("my age is: "+age_);
   }

    public static void main(String args[])
    {
       System.out.println("Calling with the help of static variables-------");
        System.out.println("my name is: "+QuestionSeven.name);
        System.out.println("my surname is: "+QuestionSeven.surname);
        System.out.println("my age is: "+QuestionSeven.age);
        System.out.println("\n");

        System.out.println("Calling with the help of static method-------");
        QuestionSeven.printPersonDetails("saurabh", "soni",23);

    }

}
