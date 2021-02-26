package day2.concurrency;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Thread t = new Thread(new Runner(5000));
//        Thread t2 = new Thread(new Runner(1000));

//        t.start();
//        t2.start();
//        //t.interrupt();
//        try {
//            t.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        Counter counter = new Counter();
//        Thread t = new Thread(new Increment(counter));
//        Thread t2 = new Thread(new Increment(counter));
//        t.start();
//        t2.start();
//        try {
//            t.join();
//            t2.join();
//            System.out.println(counter.getCounter());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        var list = new ArrayList<Integer>();
        for(int i = 0; i < 10000000; i++) {
            list.add(new Random().nextInt(1000000));
        }
        System.out.println("Start sorting");
        list.sort(Comparator.naturalOrder());
        System.out.println("end sorting sorting");


//        System.out.println("Programm zuende");
    }
}
