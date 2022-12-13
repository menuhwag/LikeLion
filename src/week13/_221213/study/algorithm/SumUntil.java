package week13._221213.study.algorithm;

import java.util.Arrays;

public class SumUntil {
    public static void main(String[] args) {
        int[] cards = {2, 7, 40, 19};
        int[][] dp = new int[4][4];

        for (int i = 0; i < dp.length; i++) {
            dp[i][i] = cards[i];
        }

        for (int i = 0; i < dp.length; i++) {
            for (int j = i + 1; j < dp[i].length; j++) {
                dp[i][j] = dp[i][j - 1] + cards[j];
            }
        }

        for (int[] row : dp) {
            System.out.println(Arrays.toString(row));
        }
    }
}
