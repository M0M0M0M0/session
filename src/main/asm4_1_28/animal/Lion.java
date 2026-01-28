package main.asm4_1_28.animal;

public class Lion extends Animal {
    public Lion() {
    }

    public Lion(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Lion eats meat.");
    }
}
