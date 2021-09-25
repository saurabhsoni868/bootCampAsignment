package com.first.ftn;

/**
 * Question 8: Schedule task using schedule(), scheduleAtFixedRate(), and scheduleWithFixedDelay()
 */
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

 class CountDownClock extends Thread
 {
    private String clockName;

    public CountDownClock(String clockName) {
        this.clockName = clockName;
    }

    public void run() {
        String threadName = Thread.currentThread().getName();

        for (int i = 5; i >= 0; i--) {

            System.out.printf("%s -> %s: %d\n", threadName, clockName, i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}

public class EightQuestion {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(3);

        CountDownClock clock1 = new CountDownClock("A");
        CountDownClock clock2 = new CountDownClock("B");
        CountDownClock clock3 = new CountDownClock("C");

        Future<?> f1 = scheduler.scheduleAtFixedRate(clock1, 3, 1, TimeUnit.SECONDS);
        Future<?> f2 = scheduler.scheduleWithFixedDelay(clock2, 2, 1, TimeUnit.SECONDS);
        Future<?> f3 = scheduler.schedule(clock3,  2, TimeUnit.SECONDS);

        Runnable cancelTask = new Runnable() {
            public void run() {
                f1.cancel(true);
                f2.cancel(true);
                f3.cancel(true);
            }
        };

        scheduler.schedule(cancelTask, 60, TimeUnit.SECONDS);

    }
}