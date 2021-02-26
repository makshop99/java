package day1;

import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("B");
        stringList.add("A");

        stringList.sort(Comparator.naturalOrder());
        System.out.println(stringList);
        stringList.sort(Comparator.reverseOrder());
        System.out.println(stringList);
        Collections.sort(stringList, Comparator.naturalOrder());

        Customer customer1 = new Customer("A", "Abc", 50);
        Customer customer2 = new Customer("B", "Bcd", 10);
        Customer customer3 = new Customer("C", "Def", 40);
        Customer customer4 = new Customer("A", "Def", 20);

        Set<Customer> customersSorted = new TreeSet<>(new CustomerFirstNameComparator());
        customersSorted.add(customer1);
        customersSorted.add(customer2);
        customersSorted.add(customer3);
        customersSorted.add(customer4);

        System.out.println(customersSorted);

        Map<String, Customer> sortedMap = new TreeMap<>();
        sortedMap.put("B", customer1);
        sortedMap.put("D", customer2);
        sortedMap.put("C", customer3);
        sortedMap.put("A", customer4);

        System.out.println(sortedMap);


//        List<day1.Customer> customers = new ArrayList<>();
//        customers.add(customer1);
//        customers.add(customer2);
//        customers.add(customer3);
//        customers.add(customer4);
//
//        customers.sort(new day1.CustomerFirstNameComparator().thenComparing(new day1.CustomerAgeComparator()));
//        System.out.println(customers);



    }
}
