package week4._221014.homework.codeup._1080;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int sum = 0;
        int result = 0;
        while (sum < limit) {
            sum += ++result;
        }
        System.out.println(result);
    }
}
