package week11._221130.study.algorithm.codeup._1936;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(upper(a, b));
    }

    private static int upper(int a, int b) {
        if (a > b) {
            return upper(a / 2, b) + 1;
        } else if (a < b) {
            return upper(a, b / 2) + 1;
        }
        return 0;
    }
}
