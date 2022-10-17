package week5._221017.homework.codeup._1090;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int r = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(a * (long)Math.pow(r, n -1));
    }
}
