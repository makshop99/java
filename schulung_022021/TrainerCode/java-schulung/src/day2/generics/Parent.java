package day2.generics;

public class Parent implements IsEqual<String>{
    @Override
    public boolean isEqual(String other) {
        return false;
    }
}
