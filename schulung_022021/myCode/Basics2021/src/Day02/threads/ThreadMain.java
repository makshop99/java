package Day02.threads;

public class ThreadMain
{
    public static void main(String[] args)
    {
        Thread t1 = new Thread(new MyThread(1000));
        Thread t2 = new Thread(new MyThread(2000));

        t1.start();
        t2.start();

        try
        {
            t1.join();
            t2.join();
        }
        catch (Exception exp)
        {
            exp.printStackTrace();
        }


        System.out.println("program ended");

    }
}
