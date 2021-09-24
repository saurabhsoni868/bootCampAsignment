package com.first.ftn;

/**
 * Question 6: Return a Future from ExecutorService by using Callable and use get(),
 * isDone(), isCancelled() with the Future object to know the status of task submitted
 */
import java.util.concurrent.*;

public class SixQuestion
{
    public static void main(String[] args) throws ExecutionException, InterruptedException
    {
            ExecutorService executorService = Executors.newFixedThreadPool(1);
            Future<Integer> future = executorService.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    System.out.println("Thread one is running ");
                    Thread.sleep(5000);
                    return 5;
                }
            });
            while (!future.isDone()) {
                System.out.println("Main Thread waiting for the response");
                Thread.sleep(1000);
            }
            System.out.println("Main Thread got the response");
            try {
                System.out.println(future.get());
            } catch (ExecutionException e) {
                e.printStackTrace();
            }

            finally
            {
            executorService.shutdownNow();
             }

        if (future.isDone())
            System.out.println("Value in Future object: " + future.get().toString());
        if (future.isCancelled())
            System.out.println("Task was cancelled");
        System.out.println("Thread exiting: " + Thread.currentThread().getName());
    }
}
