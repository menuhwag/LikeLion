package homework.homework_221007.codeup._1035;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hex = "0123456789abcdef";
        String inputHex = sc.nextLine();
        int dec = 0;
        for (int i = 0; i < inputHex.length(); i++) {
            int num = hex.indexOf(inputHex.charAt(i));
            dec += num * Math.pow(16, inputHex.length() - i - 1);
        }
        System.out.println(Integer.toOctalString(dec));
    }
}

