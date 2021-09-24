/**
 * Question 5: Write a program to sort Student objects based on score,
 * if the scores are the same then sort on first name
 */

package com.first.ftn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student
{
    String firstName;
    double score;
    double age;

    public Student(String firstName, double score, double age)
    {
        this.firstName = firstName;
        this.score = score;
        this.age = age;
    }
}

class FirstNameComparator implements Comparator<Student>
{
    @Override
    public int compare(Student s1, Student s2) {
        return s1.firstName.compareTo(s2.firstName);
    }
}

class ScoreComparator implements Comparator<Student>
{

    @Override
    public int compare(Student s1, Student s2)
    {
        if (s1.score == s2.score)
            return new FirstNameComparator().compare(s1, s2);
        else
            return (int) (s1.score - s2.score);
    }
}

public class StudentDemo
{
    public static void main(String[] args)
    {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Saurabh", 89.9, 25));
        studentList.add(new Student("Abhi", 78.8, 44));
        studentList.add(new Student("Raman", 86.5, 39));
        studentList.add(new Student("Monoj", 89.9, 40));
        Collections.sort(studentList, new ScoreComparator());

        for (Student s : studentList)
            System.out.println(s.firstName + " is " + s.age + " and has scored " + s.score);
    }
}
