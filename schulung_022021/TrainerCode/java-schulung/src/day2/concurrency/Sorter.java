package day2.concurrency;

import java.util.List;

public class Sorter implements Runnable{

    private List<Integer> list;

    public Sorter(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {

    }
}
