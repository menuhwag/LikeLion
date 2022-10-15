package week4._221012.study.algorithm.codeup._2081;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxNum = -1; // 음수로만 이루어진 배열이 들어올 경우 정상 작동하지 않음.
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
