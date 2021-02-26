package Day02.Exercises.threading;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ThreadMain
{
    public static void main(String[] args) throws InterruptedException {
        // erstellen der Liste mit X Zufallswerten
        int iNumbers = 10000;
        List<Integer> lData = new ValueListe(iNumbers).getlValues();
        System.out.println("number of values = " + lData.size());

        Thread tSort01 = new Thread(new ThreadSort((ArrayList<Integer>) lData));
        Thread tSort02 = new Thread(new ThreadSort((ArrayList<Integer>) lData));
        Thread tSort03 = new Thread(new ThreadSort((ArrayList<Integer>) lData));


        Instant start = Instant.now();

        // direkte Sortierung
        //lData.sort(Comparator.naturalOrder());

        // Sortierung über Threads
        tSort01.start();
        tSort02.start();
        //tSort03.start();

        tSort01.join();
        tSort02.join();
        //tSort03.join();



        Instant end = Instant.now();
        System.out.println(Duration.between(start,end).toMillis() + "ms");

        // sortieren der Liste ohne Threads

        String sOutput = "";
        for (int iCount = 0; iCount < iNumbers; iCount++)
        {
            sOutput += (lData.get(iCount)).toString() + ",";
        }
        System.out.println(sOutput);
        System.out.println("program ended");
    }




}
