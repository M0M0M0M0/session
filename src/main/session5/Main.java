package main.session5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Person p = new Person();  vi du de chung minh khong the tao doi tuong tu abstract class
        Asian a = new Asian();
        Euro e = new Euro();
        ArrayList<Person> p = new ArrayList<>();
        p.add(a);
        p.add(e);

    }
}
