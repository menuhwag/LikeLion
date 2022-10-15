package week4._221014.homework.codeup._1076;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = 'a';
        char endCh = sc.next().charAt(0);
        while (ch <= endCh) {
            System.out.println(ch++);
        }
    }
}
