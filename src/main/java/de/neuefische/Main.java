package de.neuefische;

public class Main {
    public static void main(String[] args) {
        NeuefischeList<Cat> list = new NeuefischeList();
        list.add(new Cat("Miaui", 10));
        list.add(new Cat("Bowser", 2));
        System.out.println(list);

        list.clean();
        System.out.println(list);
    }
}