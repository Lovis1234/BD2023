package nl.belastingdienst.H5Methods;

import java.util.Arrays;

public class Main {
    private static int greatest(int a, int b) {
        if (a > b) {
            return a;
        } else if (b > a) {
            return b;
        } else return -1;
    }

    private static String greatest(String a, String b) {
        if (a.length() > b.length()) {
            return a;
        } else if (b.length() > a.length()) {
            return b;
        } else return "-1";
    }

    private static int greatest(int[] list) {
        return Arrays.stream(list).max().getAsInt();
    }

    public static long factorial(int n) {
        if (n >= 1)
            return n * factorial(n - 1);
        else
            return 1;
    }

    public static void main(String[] args) {
        System.out.println(factorial(6));
        Fibo fibo = new Fibo();
        System.out.println(fibo.run(4, 5, 6));
        System.out.println(fibo.goldenRatio(93));
        for (long num : fibo.runArray(6)) {
            System.out.println(num);
        }
    }
}
