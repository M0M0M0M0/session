package main.asm4_1_28.animal;

public class Elephant extends Animal {
    public Elephant() {
    }

    public Elephant(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Elephant eats grass.");
    }
}
