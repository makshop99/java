package day2.generics;

import java.util.List;

public class Utility {

    public static <T> int count(List<T> list, T objectToCount) {
        int counter = 0;
        for(T t: list) {
            if(t.equals(objectToCount)) {
                counter++;
            }
        }
        return counter;
    }
}
