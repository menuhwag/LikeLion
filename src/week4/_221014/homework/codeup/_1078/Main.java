package week4._221014.homework.codeup._1078;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) result += i;
        }
        System.out.println(result);
    }
}
