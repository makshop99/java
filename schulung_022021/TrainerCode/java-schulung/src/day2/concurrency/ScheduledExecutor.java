package day2.concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ScheduledExecutor {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutor = Executors.newScheduledThreadPool(8);
        AtomicInteger atomicInteger = new AtomicInteger(0);
        scheduledExecutor.schedule(() -> System.out.println("Hallo mit Verspätung"), 5, TimeUnit.SECONDS);

        scheduledExecutor.scheduleAtFixedRate(() -> System.out.println(atomicInteger.incrementAndGet()), 5, 1, TimeUnit.SECONDS);

        // scheduledExecutor.
    }
}
