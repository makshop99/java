package Day02.streamlambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        var list = new ArrayList<Customer>();

        list.add(new Customer("Lieschen", "Müller", 20));
        list.add(new Customer("Hans", "Müller", 30));
        list.add(new Customer("Peter", "Meyer", 40));
        list.add(new Customer("Berta", "Schmidt", 50));
        list.add(new Customer("Anke", "Schmidt", 50));
        list.add(new Customer("Anke", "Schmidt", 50));
        list.add(new Customer("Ruth", "Schmidt", 60));
        list.add(new Customer("Anke", "Schmidt", 50));
        list.add(new Customer("Anke", "Schmidt", 50));

        for (Customer c : list) {
            if(c.getLastName().equals("Schmidt")) {
//                System.out.println(c);
            }
        }
//        List<Customer> muellers = new ArrayList<>();
//        for (Customer c : list) {
//            if(c.getLastName().equals("Müller")) {
//                muellers.add(c);
//            }
//        }
//        System.out.println(muellers);

        list.stream()
                .filter((Customer c) -> c.getLastName().equals("Schmidt"))
                .forEach((Customer c) -> System.out.println(c));

        list.stream()
                .filter(c -> c.getLastName().equals("Schmidt"))
                .filter(c -> c.getAge() < 60)
                .forEach(c -> System.out.println(c));

        System.out.println("----");
        List<Customer> muellers = list.stream()
                .filter(c -> c.getLastName().equals("Müller"))
                .collect(Collectors.toList());
        System.out.println(muellers);

        System.out.println("----");

        list.stream()
                .map(c -> c.getLastName())
                .forEach(lastName -> System.out.println(lastName));

        list.stream()
                .filter(c -> c.getLastName().equals("Müller"))
                .map(c -> c.getLastName())
                .forEach(lastName -> System.out.println(lastName));

        long count = list.stream()
                .filter(c -> c.getAge() > 18)
                .count();
        System.out.println(count);
        System.out.println("----");

        list.stream()
                .filter(c -> c.getLastName().equals("Schmidt"))
                .limit(5)
                .forEach(c -> System.out.println(c));
        System.out.println("----");

        list.stream()
                .filter(c -> c.getLastName().equals("Schmidt"))
                .distinct()
                .forEach(c -> System.out.println(c));
        var stringList = new ArrayList<String>();
        stringList.add("Abc");
        stringList.add("Def");
        stringList.add("Abb");
        stringList.add("Bcd");
        System.out.println("----");

        stringList.stream()
                .sorted()
                .forEach(s -> System.out.println(s));

        list.stream()
                .filter(c -> c.getLastName().equals("Schmidt"))
                .distinct()
                .sorted(Comparator.comparing(c -> c.getFirstName()))
                .forEach(c -> System.out.println(c));

        boolean schmidt = list.stream()
                .anyMatch(c -> c.getLastName().equals("Schmidt"));

        boolean allSchmidts = list.stream()
                .allMatch(c -> c.getLastName().equals("Schmidt"));

        boolean noSchmidts = list.stream()
                .noneMatch(c -> c.getLastName().equals("Schmidt"));



    }

    private static boolean filterForSchmidt(Customer c) {
        return c.getLastName().equals("Schmidt");
    }
}
