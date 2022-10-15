package week4._221012.homework.codeup.codeup._1058;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean a = (sc.nextInt() == 1);
        boolean b = (sc.nextInt() == 1);

        System.out.println(!(a || b) ? 1 : 0);
    }
}
