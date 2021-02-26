package Day02.Exercises.threading;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ThreadSort implements Runnable
{
    private List<Integer> lData = new ArrayList<>();
    private Object lock = new Object();

    public ThreadSort(ArrayList<Integer> lData)
    {
        this.lData = lData;
    }

    @Override
    public void run()
    {
        lData.sort(Comparator.naturalOrder());
    }

}
