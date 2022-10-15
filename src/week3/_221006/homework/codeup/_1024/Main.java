package week3._221006.homework.codeup._1024;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            System.out.printf("'%c'\n", input.charAt(i));
        }
    }
}
