# Aufgabe Reflection
Erstelle einen Klasse Animal mit folgenden Feldern:
String name
Boolean canFly
Integer maxAge

Erstelle zusätzlich dazu einen leeren Konstruktor, einen Konstruktor der alle Werte setzt (AllArgs-Konstruktor)
und einen der nur einen Namen entgegen nimmt. Zusätzlich Getter und Setter und eine To-String-Methode.

Erstelle zusätzlich eine Subklasse SwimmingAnimal, die von Animal erbt. Diese kann ansonsten leer bleiben.

Erledige nun folgende Aufgaben mit Hilfe der Java-Reflection:
1. Hole dir das Objekt Class zu der Klasse Animal mit Class.forName()
2. Lasse dir von dieser Klasse den einfachen Namen und den Namen mit Paketpfad angeben.
3. Überprüfe ob die Klasse public ist und lasse das Ergebnis ausgeben
4. Lasse dir die Superklasse von Animal ausgeben.
5. Lass dir den Namen aller Felder von Animal ausgeben. Zusätzlich soll ausgegeben werden, ob das Feld den private-Modifier hat.
6. Lass dir den Namen aller Methoden ausgeben.
7. Hole dir über getContructor den AllArgs-Konstruktor und erstelle mit Hilfe der Reflection eine neue Instanz von Animal.
8. Rufe die ToString-Methode dieses Objekts über Reflection auf und gebe das Ergebnis auf der Konsole aus.
9. Verändere den Namen des Tiers über Reflection
10. Lese den neuen Namen des Tieres über Reflection aus und gebe diesen auf der Konsole aus.
