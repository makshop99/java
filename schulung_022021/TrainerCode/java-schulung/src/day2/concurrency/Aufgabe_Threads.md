# Aufgaben Threads

## Zeitmessung Sortierung
Erstelle vier Listen mit einer großen Anzahl zufälliger Integer
(Da am besten ein bisschen ausprobieren, irgendwas zwischen 10000 und 1000000 Einträge).

Lass diese Listen als erstes hintereinander, ohne Parallelisierung sortieren.
```java
meineListe.sort(Comparator.naturalOrder())
```

Messe die Zeit, die dafür benötigt wird.
```java
Instant start = Instant.now();
...
...
...
Instant end = Instant.now();
System.out.println(Duration.between(start,end).toMillis());
```

Erstelle nun eine Klasse, die das Runnable-Interface implementiert und eine Liste im Konstruktor entgegen nimmt.
Die Liste soll nun in der run-Methode sortiert werden.
Erstelle nun zum sortieren erst zwei, dann drei, dann vier Threads und schaue, wie sich die Zeit verändert.
Achte auf das join, bevor du die Endzeit nimmst.

## Zeitmessung Sortierung II
Erstelle nun einen ExecutorService.
Gebe mit Hilfe eines Lambda-Ausdrucks das Sortieren per submit an den ExecutorService.
Die Zeitmessung soll innerhalb des Lambda-Ausdrucks geschehen. Die gemessene Zeit soll als Future zurückgegeben werden.
Da die 'toMillis()'-Methode einen long zurückgibt, wird also ein Future<Long> erwartet.
Verändere nun wieder die größe des ThreadPools. Zuerst zwei, dann drei, dann vier.
Hole die Werte der Futures mit dem blockierenden Aufruf get() und 
summiere die Dauer der einzelnen Ausführungen und gebe diese auf der Konsole aus.

## Scheduled Executor
Erstelle einen ScheduledExecutor.

1. Erstelle einen Task, der erst nach 10 Sekunden einmalig eine Ausgabe ausgibt.
2. Erstelle einen AtomicInteger, der mit dem Wert 0 startet. Erstelle dann einen periodischen Task, der alle 500ms den
AtomicInteger um eins inkrementiert und danach den Wert auf der Konsole ausgibt.


