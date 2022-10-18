package week5._221018.homework.codeup._1092;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int result = 1;
        while((result % x != 0) || (result % y != 0) || (result % z != 0)) {
            result++;
        }
        System.out.println(result);
    }
}
