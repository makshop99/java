package Day02.Exercises.threading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ValueListe
{
    public List<Integer> getlValues() {
        return lValues;
    }

    private List<Integer>lValues = new ArrayList<>();

    public ValueListe(int iValues)
    {
        Random oRandom = new Random();
        for (int iCount = 0; iCount < iValues; iCount++)
        {
            lValues.add(oRandom.nextInt(iValues));
        }
    }

    @Override
    public String toString()
    {
        return "number of values in list = " + lValues.size();
    }
}
