package day2.concurrency;

public class Increment implements Runnable{
    private Counter counter;

    public Counter getCounter() {
        return counter;
    }

    public void setCounter(Counter counter) {
        this.counter = counter;
    }

    public Increment(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10000; i++) {
            counter.increment();
        }
    }
}
