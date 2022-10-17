package week5._221017.homework.codeup._1088;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String result = "";
        for (int i = 0; i <= num; i++) {
            if (i % 3 == 0) continue;
            result += (i != num) ? String.format("%d ", i) : String.format("%d", i);
        }
        System.out.println(result);
    }
}
