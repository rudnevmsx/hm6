package ru.rudnev.test.java;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        Cat[] cats = {new Cat("Tom", 30), new Cat("Jerry", 50), new Cat("Barsik", 15)};
        for (Cat cat : cats){
            cat.eat(plate);
        }
        for (Cat cat : cats){
            System.out.println(cat.getName() + " if full: " + cat.isFullness());
        }
    }
}