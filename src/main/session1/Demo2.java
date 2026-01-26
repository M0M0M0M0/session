package main.session1;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2}; //Khai bao 1 int array

        Integer a = 10;
        Float b = 3.14f;

        ArrayList ar = new ArrayList();
        ar.add(5);
        ar.add("Hello");
        ArrayList<Integer> intArr = new ArrayList<>();// mang so nguyen
        intArr.add(3);
        intArr.add(6);
        ArrayList<Double> dbArr = new ArrayList<>(); //mang so thuc

        for (int i = 0; i < intArr.size(); i++) {
            System.out.println(intArr.get(i));
        }
        for (Integer integer : intArr) {
            System.out.println(integer);
        }

    }
}
