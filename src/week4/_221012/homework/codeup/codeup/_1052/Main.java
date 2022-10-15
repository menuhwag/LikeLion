package week4._221012.homework.codeup.codeup._1052;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a != b) {
            System.out.println(1);
            return;
        }
        System.out.println(0);
    }
}
