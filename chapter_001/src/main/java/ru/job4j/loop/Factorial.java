package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        if (n <= 1) {
            return 1;
        }
        int fact = 1;
//        for (int a = 2; a < n; a++) {
//            fact = fact * (a + 1);
//        }

        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
