package week5._221017.homework.codeup._1082;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String hex = "0123456789ABCDEF";
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);

        for (int i = 1; i < hex.length(); i++) {
            System.out.printf("%s*%s=%s\n", ch, hex.charAt(i), Integer.toHexString(hex.indexOf(ch) * i).toUpperCase());
        }
    }
}
