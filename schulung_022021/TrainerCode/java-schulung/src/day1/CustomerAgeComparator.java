package day1;

import java.util.Comparator;

public class CustomerAgeComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
