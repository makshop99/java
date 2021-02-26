package day2.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Box<String> stringBox = new Box<>();
        stringBox.setInsideTheBox("Hallo");
        System.out.println(stringBox.getInsideTheBox());

        Box<Integer> integerBox = new Box<>();
        integerBox.setInsideTheBox(123);
        System.out.println(integerBox.getInsideTheBox());

        BoxForTwo<Integer, String> twoBox = new BoxForTwo<>();
        twoBox.setFirstInsideTheBox(123);
        twoBox.setSecondInsideTheBox("Abc");
        System.out.println(twoBox.getFirstInsideTheBox());
        System.out.println(twoBox.getSecondInsideTheBox());

        EqualsBox<String> equalsBox = new EqualsBox<>();
        equalsBox.setInsideTheBox("Test");
        System.out.println(equalsBox.isEqual("Test"));

        PlayGround<Child> playGround = new PlayGround<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(Utility.<Integer>count(list,1));
        System.out.println(Utility.count(list,1));

    }
}
