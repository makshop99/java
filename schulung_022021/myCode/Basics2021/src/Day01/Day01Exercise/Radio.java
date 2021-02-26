package Day01.Day01Exercise;

public class Radio
{
    public int volume()
    {
        return iVolume;
    }

    private int iVolume;
    private boolean bIsOn;

    public Radio()
    {
        iVolume = 0;
        bIsOn = false;
    }

    public void volumeUp()
    {
        if (iVolume < 100) iVolume++;
    }

    public void volumeDown()
    {
        if (iVolume > 0) iVolume--;
    }

    public void on()
    {
        bIsOn = true;
    }

    public void off()
    {
        bIsOn = false;
    }

    public boolean isOn()
    {
        return bIsOn;
    }

    @Override
    public String toString() {
        String sReturn = "Radio[iVolume=" + iVolume + ", is ";
        String sState = "off";
        if (bIsOn) sState = "on";
        return sReturn + sState + "]";
    }

    public static double stationNameToFrequency(String sStation)
    {
        switch (sStation)
        {
            case "Walking the plank":
                return 98.3;

            case "Luna Radio":
                return 100.6;

            default:
                return 0.0;
        }
    }
}
