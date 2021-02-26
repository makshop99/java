package day1;

public class OOApplication {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setFirstName("Thomas");
        customer.setLastName("Iffland");

        Customer testuser = Customer.getTestCustomer();
//        customer.setFirstName("Test");
        customer.sayName();
        System.out.println(customer.getFirstName());

        Customer customer2 = new Customer("Test", "day1.Customer");
        customer2.sayName();

        System.out.println(customer2.toString());

        System.out.println("Bitte Namen eingeben:");
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.next();
//
//        if(name.equals("Thomas")) {
//            System.out.println("Hallo Thomas");
//        } else {
//            System.out.println("Nicht Thomas");
//        }

        Bird bird = new Bird("Papagei");
        bird.sayName();

        Animal myBird = new Bird("Rotkehlchen");
        ((Bird) myBird).fly(500);

        WeekDay weekDay = WeekDay.MONTAG;

        WeekDay.listAllValues();
        System.out.println(WeekDay.MONTAG.getTranslation());



    }
}
