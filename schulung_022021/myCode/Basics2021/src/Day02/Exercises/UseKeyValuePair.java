package Day02.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class UseKeyValuePair
{
    public static void main(String[] args)
    {
        KeyValuePair<String, Integer> oObject1 = new KeyValuePair<>();
        KeyValuePair<Integer, String> oObject2 = new KeyValuePair<>();

        oObject1.setKey("Key01");
        oObject1.setValue(1);

        oObject2.setKey(1234);
        oObject2.setValue("Value01");

        print(oObject1.toString());
        print(oObject2.toString());



    }

    private static void print(String sMessage)
    {
        System.out.println(sMessage);
    }
}
