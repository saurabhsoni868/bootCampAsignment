package com.first.ftn;

public class QuestionEight
{
        public static void main(String args[])
        {
            StringBuffer sbf = new StringBuffer("Saurabh Soni Abes Ghaziabad");
            System.out.println("String buffer = " + sbf);

            // Here it reverses the string buffer
            String reveseString = sbf.reverse().toString();
            char[] character = new char[reveseString.length()-6];
            for(int i=0; i<reveseString.length(); i++)
            {
                if(i<4 )
                {
                    character[i] = reveseString.charAt(i);
                }

                if(i>9)
                {
                    character[i-6] = reveseString.charAt(i);
                }
            }

            String newlysortedString = new String(character);
            System.out.println("String after reversing and removing index from4-9 :  = " + newlysortedString);



        }
    }

