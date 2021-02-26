package day2.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BoxForTwo<T,U> {
    private T firstInsideTheBox;
    private U secondInsideTheBox;
    List<T> myList = new ArrayList<>();

    public T getFirstInsideTheBox() {
        return firstInsideTheBox;
    }

    public void setFirstInsideTheBox(T firstInsideTheBox) {
        this.firstInsideTheBox = firstInsideTheBox;
    }

    public U getSecondInsideTheBox() {
        return secondInsideTheBox;
    }

    public void setSecondInsideTheBox(U secondInsideTheBox) {
        this.secondInsideTheBox = secondInsideTheBox;
    }
}
