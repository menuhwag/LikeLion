package week4._221014.homework.codeup._1072;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Main m = new Main();
        int count = m.scanner.nextInt();
        m.loop(count);
    }
    public void loop(int count) {
        if (count == 0) return;
        System.out.println(scanner.nextInt());
        loop(--count);
    }
}
