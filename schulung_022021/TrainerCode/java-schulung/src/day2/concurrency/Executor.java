package day2.concurrency;

import java.util.concurrent.*;

public class Executor {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(8);
        executorService.execute(new Runner(0));
        executorService.execute(() -> System.out.println("Thread started"));
        Future<Integer> result = executorService.submit(() -> {
            System.out.println("Calculation started");
            return 10 + 10;
        });

//        while(!result.isDone()) {
//            System.out.println("not done yet");
//        }

        try {
            result.get(200, TimeUnit.MILLISECONDS);
//            result.cancel(true);
//            result.isCancelled();
            System.out.println(result.get());
            System.out.println(result.get());
            System.out.println(result.get());
            System.out.println(result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }

        executorService.shutdown();
    }
}
