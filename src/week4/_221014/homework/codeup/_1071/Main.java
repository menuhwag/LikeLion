package week4._221014.homework.codeup._1071;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Main m = new Main();
        m.loop(m.scanner.nextInt());
    }
    public void loop(int num) {
        if (num == 0) return;
        System.out.println(num);
        loop(scanner.nextInt());
    }
}
