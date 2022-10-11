package practice.java_221011.codeup._1278;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int result = 0;

        while(input > 0) {
            input = input / 10;
            result++;
        }
        System.out.println(result);
    }
}