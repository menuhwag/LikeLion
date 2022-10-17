package week5._221017.homework.codeup._1087;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        int sum = 0;
        int i = 0;
        while(sum < limit) {
            sum += i++;
        }
        System.out.println(sum);
    }
}
