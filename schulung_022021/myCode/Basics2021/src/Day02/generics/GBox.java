package Day02.generics;

// generic class takes different types for "T"
public class GBox<T>
{
    // getter for the generic
    public T getInTheBox()
    {
        return inTheBox;
    }

    // setter for the generic
    public void setInTheBox(T inTheBox)
    {
        this.inTheBox = inTheBox;
    }

    // generic attribute
    private T inTheBox;
}
