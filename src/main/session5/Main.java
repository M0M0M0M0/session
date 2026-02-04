package main.session5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Person p = new Person();  vi du de chung minh khong the tao doi tuong tu abstract class
        Asian a = new Asian();
        Euro e = new Euro();
        ArrayList<Person> ps = new ArrayList<>();
        ps.add(a);
        ps.add(e);
        Person p = new Person() {  // anonymous class
            @Override
            public void eat() {

            }

            @Override
            public void sleep() {

            }
        };
        LoveTipSpecial ls = new LoveTipSpecial() {
            @Override
            public void xyz(String s, int y) {

            }
        };
        LoveTipSpecial lss = (s, y) -> {

        };
        ArrayList<Integer> arrs = new ArrayList<>();
        arrs.stream().filter(i -> i > 0).map(i -> i < 10).toArray();
    }
}
