package practice.java_221012.codeup._2081;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxNum = -1;
        int maxIdx = -1;

        for (int i = 0; i < 9; i++) {
            int inputNum = sc.nextInt();
            if (maxNum < inputNum) {
                maxNum = inputNum;
                maxIdx = i;
            }
        }
        System.out.println(maxNum);
        System.out.println(++maxIdx);
    }
}
