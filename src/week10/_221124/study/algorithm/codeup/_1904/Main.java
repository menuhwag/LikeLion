package week10._221124.study.algorithm.codeup._1904;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Main.printOdd(a, b);
    }

    private static void printOdd(int start, int end) {
        if (start > end) return;
        if (start % 2 == 1) System.out.printf("%d ", start);
        printOdd(start + 1, end);
    }
}
