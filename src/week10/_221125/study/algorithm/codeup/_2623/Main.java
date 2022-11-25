package week10._221125.study.algorithm.codeup._2623;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(gcd(a, b));
    }

    private static int gcd(int a, int b) {
        if (a == b) return a;
        if (a > b) return gcd(b, a);
        return gcd(a, b - a);
    }
}
