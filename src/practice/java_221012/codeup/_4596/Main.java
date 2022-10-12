package practice.java_221012.codeup._4596;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxNum = -1;
        int row = -1;
        int col = -1;

        for (int i = 0; i < 9; i++) {
            String strNum[] = sc.nextLine().split(" ");
            for (int j = 0; j < 9; j++) {
                int inputNum = Integer.parseInt(strNum[j]);
                if (maxNum < inputNum) {
                    maxNum = inputNum;
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println(maxNum);
        System.out.printf("%d %d\n", ++row, ++col);
    }
}
