# Aufgaben Java-Basics

## Zufallszahlen-Spiel
Es soll ein Programm geschrieben werden, dass eine Zufallszahl generiert und der Benutzer diese Stück für Stück erraten muss.
Mit diesem Codeblock lässt sich eine zufällige Zahl zwischen 0 und 49 bestimmen.
```
Random rand = new Random(); 
int value = rand.nextInt(50); 
```
Zu Beginn des Programms soll eine zufällige Zahl zwischen 0 und 100 bestimmt werden. Der Benutzer bekommt dann die Möglichkeit eine Zahl einzugeben. Sollte sie die erratene Zahl sein, soll eine entsprechende Mitteilung angezeigt werden und das Programm beendet werden.

Soll die Zahl größer sein, soll auch das dem Benutzer angezeigt werden und der Spieler die erneute Möglichkeit zur Eingabe bekommen, bis er die Zahl erraten an. Analog wird bei einer niedrigeren Zahl verfahren.

## Windrichtung
Captain CiaoCiao segelt über das Meer, der Wind bläst von allen Seiten. Er muss die Windgeschwindigkeit und Windrichtung immer im Blick haben.

Aufgabe:

1.  Deklariere zwei Arrays  `int[] windSpeed`  und  `int[] windDirection`.

2.  Initialisiere beide Arrays je mit drei ganzzahligen Zufallszahlen (prinzipiell sollte die Anzahl beliebig sein), wobei die Windstärke zwischen 0 und <200 (km/h) und die Windrichtung zwischen 0 und <360 (Grad) liegen kann.

3.  Laufe mit einer Schleife über das Array und gib alle Pärchen kommasepariert aus.


Beispiel:

-   Enthält z. B. das Array  `windSpeed`  die Werte  `{82, 70, 12}`  und das Array  `windDirection`  die Werte  `{12, 266, 92}`  soll die Ausgabe auf dem Bildschirm sein:

    Wind speed 82 km/h and wind direction 12°, Wind speed 70 km/h and wind direction 266°, Wind speed 12 km/h and wind direction 92°


Hinweis: Bedenke, dass die Segmente mit einen Komma getrennt werden und am Ende kein Komma steht.




## Radio
In die neue Klasse  `Radio`  sollen Methoden gesetzt werden, damit das Objekt etwas ›kann‹.

Aufgabe:
- Das Radio hat folgende nicht-statische Felder:
    - int volume
    - boolean isOn

-  Das Radio hat folgende nicht-statische Methoden

    -   `void volumeUp()`/  `void volumeDown()`: Verändern die Objektvariable  `volume`  um 1 bzw. -1. (Optional: Die Lautstärke soll nur im Bereich von 0 bis 100 liegen.)

    -   `void on()`/  `void off()`/  `boolean isOn()`: Greifen auf Objektvariable  `isOn`  zurück; es ist in Ordnung, wenn eine Methode so heißt wie eine Objektvariable. Die Methoden  `on()/off()`  sollen Meldungen wie "an"/"aus" auf dem Bildschirm ausgeben.

    -   `public String toString()`: Sie soll Informationen über den internen Zustand als String zurückgeben, wobei die Zeichenkette eine Form wie  `Radio[volume=2, is on]`  annehmen sollte.


-   In der  `main(…​)`-Methode der Klasse  `day1.Application`  können die Objektmethoden des Radios zum Beispiel so getestet werden:

    Listing 1. Ausschnitt aus day1.Application.java

    ```java
    Radio grandmasOldRadio = new Radio();
    System.out.println( grandmasOldRadio.isOn() );     // false
    grandmasOldRadio.on();
    System.out.println( grandmasOldRadio.isOn() );     // true
    System.out.println( grandmasOldRadio.volume );     // 0
    grandmasOldRadio.volumeUp();
    grandmasOldRadio.volumeUp();
    grandmasOldRadio.volumeDown();
    grandmasOldRadio.volumeUp();
    System.out.println( grandmasOldRadio.volume );     // 2
    System.out.println( grandmasOldRadio.toString() ); // Radio[volume=2, is on]
    System.out.println( grandmasOldRadio );            // Radio[volume=2, is on]
    grandmasOldRadio.off();
    ```

## Statische Methoden für das Radio
Bisher hat das Radio nur Objekteigenschaften. Ergänzen wir eine statische Methode, die keine Beziehung zu einem konkreten Radio-Objekt hat.

Aufgabe:

-   Implementiere in  `Radio`  eine statische Methode  `double stationNameToFrequency(String)`, die einem Sender als Zeichenkette eine Frequenz zuordnet (zum Beispiel hat der bekannte Piratensender ›Walking the plank‹ die Frequenz 98.3). Es sollen insgesamt drei Radiosender hinterlegt sein.

-   Wird der Methode  `null`  übergeben, dann soll die Rückgabe  `0.0`  sein. Auch bei unbekannten Sendernamen soll die Rückgabe  `0.0`  sein.


Beispiel:

-   Im Hauptprogramm kann man schreiben:

    ```java
    System.out.println( Radio.stationNameToFrequency( "Walking the plank" ) ); // 98.3
    ```

## Reise nach Jerusalem
Bei einer Geburtstagsfeier spielen die Gäste Reise nach Jerusalem (engl. Musical chairs). Die Personen sitzen auf Stühlen, und wenn die Musik anfängt zu spielen, stehen sie auf, und laufen um die Stühle. Die Namen der Gäste befinden sich in einer Liste.

Aufgabe A:

-   Lege eine neue Klasse MusicalChairs an.

-   Lege einen Konstruktor  `MusicalChairs(List<String> names)`  an, die die Namen intern speichert.

-   Implementiere die Methode  `toString()`, die die Namen kommasepariert liefert.

-   Schreibe eine Methode  `rotate(int distance)`, die die Namen in der Liste um die Position  `distance`  nach rechts verschiebt. Die rechts herausfallenden Elemente werden links wieder eingeschoben. Die Operation ist in-place, die (interne) Liste selbst wird also verändert, und die Methode liefert keine Rückgabe.

Nutze für die Aufgabe eine passende Methode aus  `java.util.Collections`.

Beispiel:

```java
MusicalChairs musicalChairs = new MusicalChairs( "Laser", "Milka", "Popo", "Despot" );
musicalChairs.rotate( 2 );
System.out.println( musicalChairs ); // Popo, Despot, Laser, Milka
```

Aufgabe B:

-   Schreibe eine weitere Methode  `void rotateAndRemoveLast(int distance)`, die zunächst die Liste um  `distance`  Positionen nach rechts verschiebt, und dann das letzte Element löscht.

-   Ergänze eine Methode  `String play()`, die  `rotateAndRemoveLast(…​)`  in einer Schleife so oft aufruft, bis es nur noch ein Element in der Liste gibt; dann steht der Sieger fest und er wird als String zurückgegeben. Die Distanz ist bei jedem Durchlauf zufällig.


Berücksichtige bei der Lösung mögliche Fehler.


## Aufgabe day1.Exceptions I
Erstelle eine Klasse Person mit den Feldern/Variablen Vorname und Nachname.  
Erstelle eine Klasse Utility mit einer statischen Methode filter.   
Diese Methode nimmt eine Liste von Personen und einen Nachnamen entgegen.  
In der Methode wird die übergebene Liste nach der Person durchsucht, die den gleichen Nachnamen hat.   
Gebe dabei einfach den ersten zurück, die darauffolgenden Treffer werden ignoriert.

Sollte kein Treffer gefunden werden, soll eine neue Exception geworfen werden. Gebe  
über den Konstruktor der Exception eine eindeutige Fehlermeldung mit.

Rufe die Methode in einem try-catch-finally Block auf. Im catch-Teil des Blocks soll  
die Fehlermeldung ausgegeben werden.

Im finally-Abschnitt soll der Name ausgegeben werden, nach dem gesucht wurde.


## Aufgabe day1.Exceptions II
Erweitere dein Personenmodell um einen boolean isMarried. Zusätzlich soll es eine Methode marry geben, die eine weitere Person entgegen nimmt. Sollte bei beiden gelten isMarried == false,  wird bei beiden Personen der Wert auf true gesetzt.
Sollte einer der beiden bereits verheiratet sein,  
soll eine Exception geworfen werden. Erstelle dafür eine neue Exception mit dem Namen  AlreadyMarriedException. Diese enthält in einer Variable den Namen der Person, die bereits verheiratet ist.  
Sollten beide bereits verheiratet sein, übergebe die Namen ein einem String, verknüpft mit einem kaufmännischen Und.  
Bsp:  
throw new AlreadyMarriedException("Max") oder  
throw new AlreadyMarriedException("Max & Moritz")

Fange diese Exception wieder in einer main-Methode und printe dem Stacktrace aus.

## Mini-Sudoku prüfen
Ein Sudoku-Spiel besteht aus 81 Feldern in einem 9 × 9-Gitter. Jedes dieser neun Blöcke ist ein zweidimensionales Array der Größe 3 × 3, indem Zahlen von 1 bis 9 vorkommen müssen. Jede Zahl muss genau einmal vorkommen und folglich darf keine Zahl fehlen.

Aufgabe:

-   Schreibe ein Programm, das ein zweidimensionales Array mit neun Elementen testet, ob alle Zahlen von 1 bis 9 vorkommen.

Beispiel:
-   Das folgende Array ist eine gültige Sudoku-Belegung:

    ```java
    final int DIMENSION = 3;
    
    int[][] array = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };
    ```



## Aufgabe Enums

Erstelle eine Enum mit den sieben Wochentagen. Zusätzlich soll das Enum zwei Methoden haben:
- isWeekDay() -> Gibt zurück, ob es sich um einen Wochentag handelt
- isWeekEnd() -> Gibt zurück, ob es sich um einen Tag am Wochenende handelt

Erweitere das Enum um ein Feld germanTranslation. Weise jedem Wochentag die deutsche Übersetzung zu.  
Erstelle folgende Methode:
- printDeutsch() -> Iteriert über alle Werte des Enums (also alle Wochentage) und gibt sie in Deutsch aus.


## Liste kürzen
Für Captain CiaoCiao soll es immer nur bergauf gehen; wenn er Zahlenfolgen liest, sollen die immer nur aufsteigen.

Aufgabe:

Schreibe eine Methode trimNonGrowingNumbers(List<Double> numbers), die die Liste abschneidet, wenn die nächste Zahl nicht mehr größer oder gleich der vorherigen ist.

Bedenke: Die übergebene Liste muss veränderbar sein, sodass Elemente gelöscht werden können.

Beispiele:

Wenn die Liste die Zahlen 1, 2, 3, 4, 5 enthält, bleibt die Liste so.

Enthält die Liste die Zahlen 1, 2, 3, 2, 1, wird die Sequenz gekürzt zu 1, 2, 3.

Tipp: Sublist

## Wiederholende Elemente
Napoleon Nase unterhält sich mit Bonny Brain über das Wetter: ›Wir hatten die letzten Monate so viele Regentage hintereinander, das war schlecht für Kaperungen.‹ Bonny Brain antwortet: ›So viele Regentage waren das nicht hintereinander!‹. Wer hat Recht?

Gegeben ist eine Liste von Wetterdaten:

Regen, Sonne, Regen, Regen, Hagel, Schnee, Sturm, Sonne, Sonne, Sonne, Regen, Regen, Sonne
In der Liste kommt Sonne dreimal hintereinander vor. Das wollen wir wissen. Zwar kommt Regen in der Liste insgesamt häufiger vor, doch das ist für die Lösung irrelevant.

Aufgabe:

Lege eine neue Klasse WeatherOccurrence an, die ein kleiner Behälter für Wetterinformationen ist. Sie ist so implementiert:
```java
class WeatherOccurrence {
String weather;
int    occurrences;
int    startIndex;
}
```
Implementiere eine Methode WeatherOccurrence longestSequenceOfSameWeather(List<String> weather), die verrät, welches Wetter
wie oft am häufigsten direkt hintereinander in der Liste auftaucht, und wo die längste Liste anfängt.

Kommt ein Wetter hintereinander gleich oft vor, kann die Methode frei entscheiden was sie liefert. Elemente dürfen null sein.


## Kassenbon
Schaut man auf einen Kassenbon an, so enthält er Einträge und Informationen wie Anzahl, Produktname, Preis, Gesamtsumme.
Programmiere in dieser Aufgabe einen Kassenbon.

Aufgabe:
Lege eine neue Klasse Receipt für den Bon an.
Ein Bon besteht aus Einträgen vom Typ Item. Lege die Klasse Item als geschachtelten Typ in Receipt.
Jedes Item hat einen Namen und einen (brutto) Preis, der in Cent gespeichert ist.
Receipt soll toString() überschreiben, und einen formatierten Bon liefern.
Gib alle Produkte und die Summe aus.
Einträge können auf dem Bon mehrmals vorkommen und sollen zusammengefasst werden. Es steht zum Beispiel nicht Nüsse, Nüsse untereinander, sondern 2x Nüsse. Die Einträge müssen für die Gleichwertigkeit den gleichen Namen und Preis haben.


Beispiel:

Mit dem Aufbau
```java
Receipt receipt = new Receipt();
receipt.addItem( new Receipt.Item( "Peanuts", 222 ) );
receipt.addItem( new Receipt.Item( "Lightsaber", 19999 ) );
receipt.addItem( new Receipt.Item( "Peanuts", 222 ) );
receipt.addItem( new Receipt.Item( "Log book", 1000 ) );
receipt.addItem( new Receipt.Item( "Peanuts", 222 ) );
System.out.println( receipt );
ist die Ausgabe:


3x  Peanuts                 2,22 €    6,66 €
1x  Lightsaber            199,99 €  199,99 €
1x  Log book               10,00 €   10,00 €

Sum: 216,65 €
```
