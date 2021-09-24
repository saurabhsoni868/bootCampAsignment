/**
 * Question 9: Write a program to display times in different country format
 */

package com.first.ftn;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CountryTimeFormatDemo
{
    public static void main(String[] args)
    {
        SimpleDateFormat simpleDateFormatOne = new SimpleDateFormat("d/M/yyyy hh:mm:ss a z"); //India
        SimpleDateFormat simpleDateFormatTwo = new SimpleDateFormat("M/d/yyyy");  //United States
        SimpleDateFormat simpleDateFormatThree = new SimpleDateFormat("d/MM/yyyy"); //Australia
        SimpleDateFormat simpleDateFormatFour = new SimpleDateFormat("dd.MM.yyyy"); // Russia
        SimpleDateFormat simpleDateFormatFive = new SimpleDateFormat("yyyy/MM/dd"); //Japan
        SimpleDateFormat simpleDateFormatSix = new SimpleDateFormat("yyyy-M-d"); //China
        Calendar calendar = Calendar.getInstance();

        System.out.println("India: " + simpleDateFormatOne.format(calendar.getTime()));
        System.out.println("United States: " + simpleDateFormatTwo.format(calendar.getTime()));
        System.out.println("Australia: " + simpleDateFormatThree.format(calendar.getTime()));
        System.out.println("Russia: " + simpleDateFormatFour.format(calendar.getTime()));
        System.out.println("Japan: " + simpleDateFormatFive.format(calendar.getTime()));
        System.out.println("China: " + simpleDateFormatSix.format(calendar.getTime()));
    }

}
