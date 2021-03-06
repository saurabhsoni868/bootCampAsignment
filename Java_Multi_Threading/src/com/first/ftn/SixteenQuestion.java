package com.first.ftn;

/**
 * Question 16: Create a deadlock and resolve it using tryLock()
 */
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SixteenQuestion<counter> {


        public static int  counter = 0;
        public static void main (String args[])
        {

            final ReentrantLock lockA = new ReentrantLock();
            final ReentrantLock lockB = new ReentrantLock();

            new Thread()
            {
                public void run ()
                {
                    while (counter<=10)
                    {
                        try
                        {
                            System.out.println (this + " acquiring lockA");
                            if (lockA.tryLock())
                            {
                                System.out.println (this + " acquired lockA");
                                System.out.println (this + " acquiring lockB");
                                if (lockB.tryLock())
                                {
                                    System.out.println (this + " acquired lockB");
                                }
                            }
                        }
                        finally
                        {
                            counter++;
                            if (lockB.isHeldByCurrentThread()) lockB.unlock();
                            if (lockA.isHeldByCurrentThread()) lockA.unlock();
                        }
                    }
                }
            }.start();

            new Thread() {
                public void run ()
                {
                    while (counter<=10)
                    {
                        try
                        {
                            System.out.println (this + " acquiring lockB");
                            if (lockB.tryLock())
                            {
                                System.out.println(this + " acquired lockB");
                                System.out.println(this + " acquiring lockA");
                            }
                            if (lockA.tryLock())
                            {
                                System.out.println (this + " acquired lockA");
                            }
                        }
                        finally
                        {
                            counter++;
                            if (lockA.isHeldByCurrentThread()) lockA.unlock();
                            if (lockB.isHeldByCurrentThread()) lockB.unlock();

                        }
                    }
                }
            }.start();
        }
    }
