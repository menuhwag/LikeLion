package week3._221005.homework.codeup._1018;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] time = sc.nextLine().split(":");
        System.out.printf("%s:%s", time[0], time[1]);
    }
}
