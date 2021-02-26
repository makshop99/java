package Day01;

public class Day01_Schleifen
{
    public static void main(String[] args)
    {
        // while
        int iA = 5;
        int iB = 0;

        // while - gibt es auch fussgesteuert (do-while)
        while (iA != iB)
        {
            iB++;
            System.out.println("while - Runde " + iB);
            if (iB == 3) break; // ausstieg aus der schleife
        }

        // do-while
        iB = 0;
        do {
            iB++;
            System.out.println("do-while - Runde " + iB);
        } while (iA != iB);

        // for
        for(int iCount = 0; iCount < iA; iCount++)
        {
            System.out.println("for - Runde " + iCount);
        }

        // if
        if (iA == iB) System.out.println("iA gleich iB");
        else System.out.println("iA ungleich iB");

        // switch case
        switch (iB)
        {
            case 1:
                System.out.println("switch - iB = 1");
                break;
            case 2:
                System.out.println("switch - iB = 2");
            default:
                System.out.println("switch - iB = " + iB);
        }

    }
}
