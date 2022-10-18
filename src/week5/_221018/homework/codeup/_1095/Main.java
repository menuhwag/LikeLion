package week5._221018.homework.codeup._1095;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = sc.nextInt();
        for (int i = 0; i < n-1; i++) {
            int num = sc.nextInt();
            if (min > num) min = num;
        }

        System.out.println(min);
    }
}
