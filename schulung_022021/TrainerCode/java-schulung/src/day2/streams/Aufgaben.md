# Aufgaben Streams

Erstelle eine Klasse Animal mit folgenden Feldern:
String name
boolean canFly
Kontinent kontinent
int weight

Kontinent stellt dabei ein Enum dar, das die sieben Kontinente repräsentiert. Sollte es bei Enums Probleme geben, findet sich ganz am Ende eine fertige
Definition des Enums.

Ein Konstruktoraufruf für ein Animal sieht dann so aus:
new Animal("Biber", false, Kontinent.EUROPA, 10)

Ein Vergleich des Enums erfolgt wie folgt:
animal.getKontinent() == Kontinent.EUROPA

Erstelle eine Liste mit 10 Testwerten. Es kann im Laufe der Aufgaben sinnvoll sein die Testwerte zu erweitern.

Nutze die Streams um folgende Operationen durchzuführen:

// Zuviel  - wird zur Fleißarbeit
1. Printe alle Tiere aus, die fliegen können.
2. Sammel alle Tiere in einer Liste, die mit einem "A" anfangen. 
3. Sammel alle Tiere in einer Liste, die in Nordamerika leben
4. Printe alle Tiere aus, die über 100 Kg wiegen
5. Sammel alle Tiere in einer Liste, die fliegen können und in Europa leben
6. Zähle alle fliegenden Tiere
7. Printe die Tiere aus, deren Name länger als vier Zeichen lang ist
8. Sammel die fliegenden Tiere mit einem Gewicht unter 50 Kg. Limitiere die Liste auf zwei Werte.
9. Sammel nur die Namen der Tiere, die fliegen können.
10. Sammel nur die Namen der Tiere aus Afrika und sortiere diese Namensliste alphabetisch.
11. Überprüfe, ob es ein Tier gibt, dass auf Antarktika lebt. Printe das Ergebnis (true oder false) aus.
12. Überprüfe, ob alle Tiere mehr als 10 kg wiegen.
13. Überprüfe, ob es keine fliegenden Tiere in Nordamerika gibt.

Mit .sorted(Comparator.comparing(p -> p.getFirstName())) kann man eine Sortierung für ein Feld eines Objekts einbauen.
14. Finde alle Tiere aus Europa und sortiere sie nach dem Gewicht.
15. Find die Tiere aus Asien die weniger als 10 Kg wiegen und nicht fliegen können und sortiere sie alphabetisch
16. Gebe alle Tiere die einen Namen mit mehr als Zehn zeichen haben und fliegen können auf der Konsole aus. Sortiere sie an Hand 
der Kontinente alphabetisch.
17. Lies dir etwas zu reduce durch: https://www.baeldung.com/java-stream-reduce. Versuche die Gewichte aller Tiere mit Hilfe von Reduce aufzusummieren.




public enum Kontinent {
    ASIEN, AFRIKA, NORDAMERIKA, SUEDAMERIKA, ANTARKTIKA, EUROPA, AUSTRALIEN
}
