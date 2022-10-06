package homework.homework_221006.codeup._1026;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] time = sc.nextLine().split(":");
        System.out.println(Integer.parseInt(time[1]));
    }
}
