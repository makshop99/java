package com.jtraining.Aufgabe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class CalculatorController
{
    // GET /add/{zahl1}/{zahl2} -> Liefert den addierten Wert der beiden Zahlen zurück
    @GetMapping("/add")
    public String addNumbers(@RequestParam Integer zahl1, @RequestParam Integer zahl2)
    {
        String sReturn = zahl1.toString() + " + " + zahl2.toString() + " = " + Integer.toString(zahl1 + zahl2);
        return sReturn;
    }

    // GET /subtract/{zahl1}/{zahl2} -> Liefert den subtrahierten Wert der beiden Zahlen zurück
    @GetMapping("/subtract")
    public String subtractNumbers(@RequestParam Integer zahl1, @RequestParam Integer zahl2)
    {
        String sReturn = zahl1.toString() + " - " + zahl2.toString() + " = " + Integer.toString(zahl1 - zahl2);
        return sReturn;
    }

    // GET /power/{basis}?exponent={exponent} -> Liefert basis ^ exponent (Für die passend Funktion mal in der Klasse Math nachschauen).
    // Es werden hier double Werte und keine ints benötigt.
    @GetMapping("/power")
    public String power(@RequestParam Double zahl1, @RequestParam Double zahl2)
    {
        String sReturn = zahl1.toString() + "  " + zahl2.toString() + " = " + Double.toString(Math.pow(zahl1, zahl2));
        return sReturn;
    }

    // GET /random/{limit} -> Erstellt eine Zufallszahl im Bereich zwischen 0 und dem limit und liefert diese zurück
    @GetMapping("/random")
    public String power(@RequestParam Integer limit)
    {
        String sReturn = "random number is " + Integer.toString(new Random().nextInt(limit));
        return sReturn;
    }
}

