package week5._221017.homework.codeup._1086;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.printf("%.2f MB", (float) w * h * b / (8 * 1024 * 1024));
    }
}
