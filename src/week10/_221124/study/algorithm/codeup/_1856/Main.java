package week10._221124.study.algorithm.codeup._1856;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Main.solution(scanner.nextInt()));
    }

    private static int solution(int n) {
        if (n < 1) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;
        return solution(n - 1) + solution(n - 2) + solution(n - 3);
    }
}
