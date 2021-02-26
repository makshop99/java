package Day01.Day01Exercise;

import java.util.Random;

public class Windrichtung
{
    private static int[] lWindspeed;
    private static int[] lWinddirection;

    public static void main(String[] args)
    {
        initValues();
        int iNumbers = lWindspeed.length;

        for (int iCount = 0; iCount < lWindspeed.length; iCount++)
        {
            String sOutput = "Wind speed " + lWindspeed[iCount] + " km/h and wind direction " + lWinddirection[iCount] + "°";
            if (iCount < iNumbers - 1) sOutput += ",";
            System.out.println(sOutput);
        }
    }

    private static void initValues()
    {
        Random oRandom = new Random();
        int iValueNumber = 5;
        lWindspeed = new int[iValueNumber];
        lWinddirection = new int[iValueNumber];
        for(int iCount = 0; iCount < iValueNumber; iCount++)
        {
            int iSpeed = oRandom.nextInt(200);
            int iDirection = oRandom.nextInt(360);
            lWindspeed[iCount] = iSpeed;
            lWinddirection[iCount] = iDirection;
        }
    }
}
