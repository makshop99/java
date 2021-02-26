package day1;

import java.util.*;

public class CollectionsApplication {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Wert1");
        stringList.add("Wert2");
        stringList.add("Wert3");

        System.out.println(stringList.contains("Wert1"));
        for(String s : stringList) {
            System.out.println(s);
        }

        Set<String> stringSet = new HashSet<>();
        stringSet.add("Wert1");
        stringSet.add("Wert2");
        stringSet.add("Wert3");
        stringSet.add("Wert1");

        for(String s : stringSet) {
            System.out.println(s);
        }

        Customer customer1 = new Customer("User", "Eins");
        Customer customer2 = new Customer("User", "Zwei");
        Map<String, Customer> customerNumberToCustomer = new HashMap<>();
        customerNumberToCustomer.put("Abc1", customer1);
        customerNumberToCustomer.put("Abc2", customer2);
        customerNumberToCustomer.containsKey("Abc1");
        Set<String> allKeys = customerNumberToCustomer.keySet();

        for(Map.Entry<String,Customer> e: customerNumberToCustomer.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        System.out.println(customerNumberToCustomer.get("Abc1").getLastName());



    }
}
