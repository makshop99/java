package day2.concurrency;

public class Runner implements Runnable{

    private int sleep;

    public Runner(int sleep) {
        this.sleep = sleep;
    }

    @Override
    public void run() {
        System.out.println("Hello from Thread " + Thread.currentThread().getName());
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished Thread " + Thread.currentThread().getName());
    }
}
