package day2;

import java.util.Scanner;

public class ShortIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();

        if(value.equals("Test")) {
            System.out.println("Ist Test");
        } else {
            System.out.println("Ist nicht Test");
        }

        String result =  value.equals("Test") ? "Ist Test" : "Ist nicht Test";
        System.out.println(result);
    }
}
