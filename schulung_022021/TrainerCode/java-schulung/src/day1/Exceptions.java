package day1;

public class Exceptions {
    public static void main(String[] args) {
        System.out.println("Start Programm");
//        day1.Customer customer = new day1.Customer();
//        customer = null;
//        customer.sayName();
      int i = 5/0;

        System.err.println("Error");
        System.out.println("Error");
//        try {
//            int i = 6 / 0;
//            System.out.println("Hier hat alles geklappt");
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.err.println();
//            System.out.println(e.getMessage());
//            System.out.println("Es kam zu einem Fehler");
//        } finally {
//            System.out.println("Wird auf jeden Fall ausgeführt");
//        }
//        System.out.println("Ende Programm");

        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.setAmount(100);
        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.setAmount(200);

        try {
            bankAccount1.transfer(bankAccount2, 150);
        } catch (InsufficientBalanceException e) {
            e.printStackTrace();
        }
    }


//    private static void errorMethod() {
//        int i = 5 / 0;
//    }
}
