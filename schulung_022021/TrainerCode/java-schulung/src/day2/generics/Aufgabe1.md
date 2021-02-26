# Aufgabe Generics

## Aufgabe 1
Schreibe eine Klasse KeyValuePair. Diese soll zwei generische Parameter K und V haben. Erstelle auch die notwendigen Getter und Setter.
In der ToString-Methode soll die Ausgabe so aussehen:
KEY -> VALUE

Bsp:
1 -> Test
Test -> 42
true -> false

## Aufgabe 2
Schreibe eine eigene Listenimplementierung. Intern nutzen wir eine ArrayList um die Werte zu speichern.
Ein Integer dient als "Zeiger" und speichert immer die Position des nächsten freien Platzes. Diese Liste soll generisch sein.
Die Liste hat 10 Plätze. 

Zu beachten: Eine ArrayList bietet neben dem einfachen 'add' auch ein 'add', dem man zusätzlich eine Position übergeben kann,
an der das Element eingefügt werden soll. Zusätzlich kann man mit 'set' einen bestimmten Index angeben und somit den Wert setzen.

Sollte die Liste voll sein und ein neues Objekt eingefügt werden, soll eine kurze Fehlermeldung über
System.out.println ausgegeben werden.

Folgende Methoden soll die Liste anbieten: 
- add(T object) → Fügt an den nächsten freien Platz hinzu
- removeLast() → setzt das letzte eingefügte Element auf null
- remove(int index) → setzt den übergebenen Index auf null
- removeAll() → setzt alle Elemente auf null

## Aufgabe 3
Schreibe eine generische, statische Methode filter.
Diese soll zwei Parameter annehmen: Eine Liste von Objekten des generischen Typs und ein einzelnes Objekt des Typs.
Zurückgegeben werden soll eine Liste, die nur noch Objekte enthält, die gleich dem zweiten Parameter sind.
Bsp:
filter(["Hallo","Hallo","Test"],"Test") -> ["Test"]


## Aufgabe 4
Erstelle ein Interface MakeSound folgender Methode:
- makeSound() →  macht ein Geräusch

Erstelle drei Klasse von Gegeständen, die Geräusche machen. Diese sollen das Interface
MakeSound implementieren. Printe dabei einen String, der das Geräusch nachahmt.

Erweitere deine Liste aus Aufgabe 1 nun so, dass nur Objekte eingefügt werden können, die das MakeSound
Interface implementieren.

Erweitere deine Liste um folgende Methode:
- makeAllSounds() → Printet die Geräusche aller beinhalteten Objekte aus.

