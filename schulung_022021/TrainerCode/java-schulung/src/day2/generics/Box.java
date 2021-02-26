package day2.generics;

public class Box<T> {
    private T insideTheBox;

    public T getInsideTheBox() {
        return insideTheBox;
    }

    public void setInsideTheBox(T insideTheBox) {
        this.insideTheBox = insideTheBox;
    }
}
