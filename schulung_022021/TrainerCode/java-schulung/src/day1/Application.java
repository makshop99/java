package day1;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hallo Welt!");

        int number2;
        number2 = 100;

        // 32 bit Ganzzahl
        int number = 42;

        // 64 bit Ganzzahl
        long bigNumber = 10000000000000L;

        // 16 bit Ganzzahl
        short smallNumber = 123;

        // 32 bit Fließkommazahl
        float kommaZahl = 42.42f;

        //64 bit Fließkommazahl
        double grosseKommaZahl = 123.123;

        // 8 Bit Ganzzahl
        byte verySmallNumber = 1;

        // Wahrheitswert
        boolean iamTrue = true;
        boolean iamFalse = false;

        //Buchtabe
        char character = 'c';
        // Zeichenkette
        String name = "Thomas";


//        Scanner scanner = new Scanner(System.in);
//        String eingabe = scanner.next();
//        System.out.println(eingabe);

        boolean alwaysTrue = 42 == 42;
        boolean alwaysFalse = 42 != 42;
        boolean compare1 = 10 > 20;
        boolean compare2 = 10 < 20;
        boolean compare3 = 10 >= 20;
        boolean compare4 = 10 <= 20;

        int counter = 6;
        while (counter < 5) {
            //  System.out.println(counter);
            //counter = counter+1;
            counter++;
            break;
        }


        for (int i = 0; i < 5; i++) {
            //  System.out.println(i);
        }

        int counter2 = 10;
        do {
            // System.out.println(counter2);
            counter2++;
        } while (counter2 < 5);

        System.out.println("Bitte Zahl eingeben:");
        Scanner scanner = new Scanner(System.in);
//        int eingabe = scanner.nextInt();
       // int eingabe2 = scanner.nextInt();
//        if (eingabe == 10) {
//            System.out.println("Eingabe gleich 10");
//        } else if (eingabe < 10) {
//            System.out.println("Eingabe kleiner 10");
//        } else {
//            System.out.println("Eingabe größer 10");
//        }

//        if(eingabe == 10 && eingabe2 == 10) {
//            System.out.println("Beide 10");
//        } else if(eingabe == 10 || eingabe2 == 10) {
//            System.out.println("Mindestens eins 10");
//        }

//        switch(eingabe) {
//            case 0:
//                System.out.println("Eingabe 0");
//                break;
//            case 10:
//                System.out.println("Eingabe 10");
//                break;
//            case 20:
//                System.out.println("Eingabe 20");
//                break;
//            default:
//                System.out.println("Ganz anderer Wert");
//                break;
//        }

        int[] myNumbers = new int[5];
        myNumbers[0] = 10;
        myNumbers[1] = 20;
        myNumbers[2] = 30;
        myNumbers[3] = 40;
        // myNumbers[4] = 50;

        for(int i = 0; i < myNumbers.length; i++) {
            System.out.println(myNumbers[i]);
        }

        int[] myValues = new int[]{10,20,30};

        String[] myStrings = new String[3];
        myStrings[0] = "Test";
        myStrings[1] = "Test2";
        myStrings[2] = "Test3";

        for(String s : myStrings) {
            System.out.println(s);
        }

        int[][] zahlenFeld = new int[][] {
                {1 ,2, 3},
                {4 ,5, 6},
                {7 ,8, 9},
        };

        System.out.println(zahlenFeld[0].length);
        for(int i = 0; i < zahlenFeld.length; i++) {
            for(int j = 0; j < zahlenFeld[i].length; j++) {
                System.out.println(zahlenFeld[i][j]);
            }
        }
    }
}
