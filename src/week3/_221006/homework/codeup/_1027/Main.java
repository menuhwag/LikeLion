package week3._221006.homework.codeup._1027;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] date = sc.nextLine().split("\\.");
        System.out.printf("%s-%s-%s\n", date[2], date[1], date[0]);
    }
}
