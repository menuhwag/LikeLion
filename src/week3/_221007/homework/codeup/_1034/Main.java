package week3._221007.homework.codeup._1034;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String oct = sc.nextLine();
        int dec = 0;
        for (int i = 0; i < oct.length(); i++) {
            dec += Integer.parseInt(String.valueOf(oct.charAt(i))) * Math.pow(8, oct.length() - i - 1);
        }
        System.out.println(dec);
    }
}
