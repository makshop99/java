package day2.generics;

public class EqualsBox<T> implements IsEqual<T> {
    private T insideTheBox;

    public T getInsideTheBox() {
        return insideTheBox;
    }

    public void setInsideTheBox(T insideTheBox) {
        this.insideTheBox = insideTheBox;
    }

    @Override
    public boolean isEqual(T other) {
        return insideTheBox.equals(other);
    }
}
