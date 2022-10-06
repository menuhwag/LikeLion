package homework.homework_221006.codeup._1025;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            System.out.printf("[%d]\n", Integer.parseInt(input.substring(i , i + 1)) * (int)Math.pow(10, input.length() - i - 1));
        }
    }
}
