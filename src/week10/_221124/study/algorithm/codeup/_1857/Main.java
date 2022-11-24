package week10._221124.study.algorithm.codeup._1857;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        System.out.println(Main.combination(n, r));
    }

    private static int combination(int n, int r) {
        if (r == 1) return n;
        if (n == r) return 1;
        if (n < r) return 0;
        return combination(n - 1, r - 1) + combination(n - 1, r);
    }
}
