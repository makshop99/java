package Day01.Day01Exercise;

import java.util.Random;
import java.util.Scanner;

public class ZufallszahlenSpiel
{
    public static void main(String[] args)
    {
        System.out.println("Das Spiel beginnt.");
        boolean bGameEnded = false;
        Random oRandom = new Random();
        int iValue = oRandom.nextInt(100);
System.out.println(iValue);
        int iCount = 1;

        do
        {
            int iTipp = getGuess();
            int iDiff = iValue - iTipp;
            String sMeldung = " kleiner ";
            if (iDiff == 0) break;
            else if (iDiff > 0) sMeldung = " größer ";
            System.out.println("Die zu erratende Zahl ist" + sMeldung + "als " + iTipp);
            iCount++;
        }
        while (bGameEnded == false);

        System.out.println("Die Zahl " + iValue + " erraten in " + iCount + " Versuchen");
    }


    private static int getGuess()
    {
        System.out.print("Bitte einen Tipp abgeben : ");
        Scanner oScanner = new Scanner(System.in);
        int iGuess = oScanner.nextInt();
        return iGuess;
    }
}
