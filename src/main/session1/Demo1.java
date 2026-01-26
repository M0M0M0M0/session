package main.session1;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        int x = 10;
        float y = 3.14f;
        double z = 3.14159;
        boolean t = true;
        String s = "Hello world!";
        char c = 'h';
        int u = 20;
        int v = 30;
        System.out.println(u + "+" + v + "=" + add(u, v));
        System.out.println(u + "/" + v + "=" + div(u, v));


        System.out.println("Enter the number: ");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (isPrime(n)) System.out.println(n + " is a prime number.");
        else System.out.println(n + " is not a prime number.");


        double p;


    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double div(int a, int b) {
        if (b == 0) return 0;
        return (double) a / b;
    }

    public static boolean isPrime(int a) {
        if (a <= 1) return false;
        for (int i = 2; i < a / 2; i++) {
            if (a % i == 0) return false;

        }
        return true;
    }
}
