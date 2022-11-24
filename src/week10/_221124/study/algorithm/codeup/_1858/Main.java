package week10._221124.study.algorithm.codeup._1858;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(pascalNumber(n, k));
    }

    private static int pascalNumber(int n, int k) {
        if (k < 1 || k > n) return 0;
        if (k == 1 || k == n) return 1;
        return pascalNumber(n - 1, k - 1) + pascalNumber(n - 1, k);
    }
}
