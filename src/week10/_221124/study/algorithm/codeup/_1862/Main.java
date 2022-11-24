package week10._221124.study.algorithm.codeup._1862;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fib(n));
    }

    private static boolean[] chk = new boolean[101];
    private static long[] val = new long[101];
    private static long fib(int n) {
        if (chk[n]) return val[n];
        long fib;
        if (n <= 2) fib = 1;
        else fib = fib(n - 1) + fib(n - 2);
        chk[n] = true;
        fib %= 1_000_000_007;
        val[n] = fib;
        return fib;
    }
}
