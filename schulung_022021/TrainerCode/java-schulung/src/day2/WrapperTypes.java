package day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WrapperTypes {
    public static void main(String[] args) {
        int number = 0;
        Integer numberWrapper = 0;
        Integer numberWrapper2 = number;

        List<Integer> integerList = new ArrayList<>();
        Float myFloat = 2.2f;
        Boolean myBoolean = Boolean.parseBoolean("true");
        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();
        System.out.println(Integer.parseInt(value) + 2);
        //funkitoniert nicht
        //List<int> integerList = new ArrayList<>();

    }
}
