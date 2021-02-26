package Day02.threads;

import java.util.concurrent.ExecutionException;

public class MyThread implements Runnable
{
    int iSleeptime = 0;

    public MyThread(int iSleep)
    {
        iSleeptime = iSleep;
    }

    @Override
    public void run()
    {
        try
        {
            Thread.sleep(iSleeptime);
        }
        catch (InterruptedException exp)
        {
            exp.printStackTrace();
        }
        System.out.println("hello from thread " + Thread.currentThread().getName());
    }
}
