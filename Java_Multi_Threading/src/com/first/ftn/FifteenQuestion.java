package com.first.ftn;

/**
 * Question 15: Use ReentrantLock to coordinate two threads with signal(),
 * signalAll(), and wait()
 */
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class FifteenQuestion
{
    Lock lock = new ReentrantLock(true);
    Condition condition = lock.newCondition();

    public void workerOne()
    {
        try {
            lock.lock();
            System.out.println("workerOne working");
            condition.await();
            //condition.signalAll();
            System.out.println("workerOne done");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void workerTwo() {
        try {
            lock.lock();
            System.out.println("workerTwo working");
            condition.signal();
            //condition.signalAll();
            System.out.println("workerTwo done");
        } finally {
            lock.unlock();
        }
    }

    public void workerThree() {
        try {
            lock.lock();
            System.out.println("workerThree working");
            condition.signalAll();
            System.out.println("workerThree done");
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException
    {
        System.out.println("Thread starting: " + Thread.currentThread().getName());

        FifteenQuestion awaitSignalDemo = new FifteenQuestion();

        Thread thread1 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                awaitSignalDemo.workerOne();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                awaitSignalDemo.workerTwo();
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                awaitSignalDemo.workerThree();
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
        System.out.println("Thread exiting: " + Thread.currentThread().getName());
    }
}
