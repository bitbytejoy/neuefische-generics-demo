package de.neuefische;

import java.util.ArrayList;
import java.util.List;

public class NeuefischeList<Cat> {
    private static final int DELTA = 10;
    private List<Cat> elements = new ArrayList<>();
    private int lastIndex = -1;

    public boolean add (Cat element) {
        return elements.add(element);
    }

    public void clean () {
        elements.clear();
    }

    public Cat get(int i) {
        return get(i);
    }

    @Override
    public String toString() {
        return elements.toString();
    }
}
