package week10._221124.study.algorithm.codeup._1861;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        print(n);
    }

    private static void print(int n) {
        if (n <= 0) return;
        print(n - 1);
        print(n, n);
        System.out.println();
    }

    private static void print(int n, int k) {
        if (k <= 0) return;
        print(n, k - 1);
        System.out.print(pascalNumber(n, k) + " ");
    }

    private static int pascalNumber(int n, int k) {
        if (k < 1 || k > n) return 0;
        if (k == 1 || k == n) return 1;
        return pascalNumber(n - 1, k - 1) + pascalNumber(n - 1, k);
    }
}
