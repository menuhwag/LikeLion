package week4._221011.homework.codeup._1046;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a + b + c;
        System.out.println((long)sum);
        System.out.printf("%.1f", (float) sum / 3 );
    }
}
