package Day02.generics;

// usage of the generic class GBox
public class Generics
{
    public static void main(String[] args)
    {
        GBox<String> oGeneric = new GBox<>();
        GBox<Integer> oGeneric2 = new GBox<>();

        oGeneric.setInTheBox("hello world");
        oGeneric2.setInTheBox(23);
        System.out.println(oGeneric.getInTheBox());
        System.out.println(oGeneric2.getInTheBox());
    }
}
