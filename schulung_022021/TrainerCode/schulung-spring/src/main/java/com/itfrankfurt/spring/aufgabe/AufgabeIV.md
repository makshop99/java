# Aufgabe Spring IV

Wir wollen nun einen Test für den CalculatorController aus Aufgabe I schreiben.
Hier nochmal eine fertige Implementierung:

````java
@RestController
public class CalculcatorController {
    @GetMapping("/add/{zahl1}/{zahl2}")
    public Integer add(@PathVariable int zahl1, @PathVariable int zahl2) {
        return zahl1+zahl2;
    }

    @GetMapping("/subtract/{zahl1}/{zahl2}")
    public Integer subtract(@PathVariable int zahl1, @PathVariable int zahl2) {
        return zahl1-zahl2;
    }

    @GetMapping("/power/{basis}")
    public Double power(@PathVariable double basis, @RequestParam double exponent) {
        return Math.pow(basis, exponent);
    }
    @GetMapping("/random/{limit}")
    public Integer random(@PathVariable int limit) {
        return new Random().nextInt(limit);
    }
}
````

Erstelle eine Klasse CalculatorControllerTest im test-Package. Es soll sich um einen Integrationstest (SpringBootTest) handeln.
Injecte dir dafür ein TestRestTemplate und nutze bspw. die getForEntity Methode.
Erstelle insgesamt vier Testmethoden, für jedes Mapping eine.
Überlege dir für den random-Aufruf ein mögliches Testszenario.


