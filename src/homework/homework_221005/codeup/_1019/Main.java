package homework.homework_221005.codeup._1019;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] date = sc.nextLine().split("\\.");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        System.out.printf("%04d.%02d.%02d", year, month, day);
    }
}
