package day2.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
//    private int counter = 0;
//    private Object lock = new Object();
    private AtomicInteger counter = new AtomicInteger(0);
    public AtomicInteger getCounter() {
        return counter;
    }

    public void setCounter(AtomicInteger counter) {
        this.counter = counter;
    }

    //    public synchronized void increment() {
//        counter++;
//    }
//    public void increment() {
//        synchronized(lock){
//            counter++;
//        }
//    }

    public void increment() {
        counter.incrementAndGet();
    }


}
