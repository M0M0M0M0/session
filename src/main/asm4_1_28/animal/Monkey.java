package main.asm4_1_28.animal;

public class Monkey extends Animal {
    public Monkey() {
    }

    public Monkey(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Monkey eats banana.");
    }
}
