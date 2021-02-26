package day1.loesungen.reisenachjerusalem;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

class MusicalChairs {

    private final List<String> names;

    public MusicalChairs(List<String> names) {
        if (names.size() == 0)
            throw new IllegalArgumentException("no names are given, but names must not be empty");
        this.names = names;
    }

    public void rotate(int distance) {
        Collections.rotate(names, distance);
    }

    public void rotateAndRemoveLast(int distance) {
        if (names.isEmpty())
            throw new IllegalStateException("names ist empty, no names to remove");

        rotate(distance);
        names.remove(names.size() - 1);
    }

    public String play() {
        if (names.isEmpty())
            throw new IllegalStateException("names ist empty, no names to play with");

        while (names.size() > 1) {
            rotateAndRemoveLast(new Random().nextInt());
            System.out.println(names);
        }

        return names.get(0);
    }

    @Override
    public String toString() {
        return String.join(", ", names);
    }
}
