package com.first.ftn;


/**
 * Question 2: Use sleep and join methods with threads
 */

class SecondQuestion extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(500);
            }catch(Exception e){System.out.println(e);}
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        SecondQuestion t1=new SecondQuestion();
        SecondQuestion t2=new SecondQuestion();
        SecondQuestion t3=new SecondQuestion();
        t1.start();
        try{
            t1.join();
        }catch(Exception e){System.out.println(e);}

        t2.start();
        t3.start();
    }
}