package homework.homework_221012.codeup._1054;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean a = (sc.nextInt() == 1);
        boolean b = (sc.nextInt() == 1);

        if (a && b) {
            System.out.println(1);
            return;
        }
        System.out.println(0);
    }
}
