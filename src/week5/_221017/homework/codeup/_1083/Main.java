package week5._221017.homework.codeup._1083;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.print((i % 3 != 0) ? i : "X");
            System.out.print((i != num) ? " " : "");
        }
    }
}
