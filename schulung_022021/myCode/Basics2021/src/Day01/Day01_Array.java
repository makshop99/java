package Day01;

public class Day01_Array {
    public static void main(String[] args) {
        int[] aryZahlen = new int[5];
        int[] aryShort = new int[]{0, 10, 20}; // kurze Initialisierung

        // Eingabe
        for (int iCount = 0; iCount < 5; iCount++) {
            aryZahlen[iCount] = iCount * iCount;
        }

        // Ausgabe
        for (int iCount = 0; iCount < 5; iCount++) {
            System.out.println("Stelle " + iCount + " = " + aryZahlen[iCount]);
        }

        // for each
        for (int iValue : aryShort) System.out.println("value of aryShort : " + iValue);

    }
}
