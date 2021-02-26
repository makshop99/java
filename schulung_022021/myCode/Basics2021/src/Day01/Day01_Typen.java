package Day01;
import java.util.Scanner;

public class Day01_Typen
{
    public static void main(String[] args)
    {
        System.out.println("hello world - day 01, class 01");

        // Datentypen -----

        // int, 32 bit
        int iValue = 7;

        // long int, 64 bit
        long lNumber = 1111111111111111111l; // l fuer den Compiler als long Zeichen

        // short, 16bit
        short iShort = 16;

        // float und double
        float fKomma = 42.23f;
        double dKomma = 24.4432112;

        // byte - 8 Bit Zahlen
        byte bByte = 2;

        // boolean
        boolean bTrue = true;

        // char / einzelnes Zeichen
        char cChar = 'a';

        // String / Zeichenkette
        String sText = "hello";

        // klein geschriebene Typen sind primitive Typen, keine Klassen
        // String dagegen ist eine Klasse mit Methoden.

        Scanner oScanner = new Scanner(System.in);
        String sEingabe = oScanner.next();
        System.out.println(sEingabe);


    }
}
