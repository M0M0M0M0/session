package main.asm4_1_28.animal;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Elephant("Voi"));
        animals.add(new Lion("Su tu"));
        animals.add(new Monkey("Khi"));
        for (Animal a : animals) {
            a.eat();
        }
    }
}
