package week10._221123.study.algorithm.codeup._1855;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fibonacci(5)));
        System.out.println(Arrays.toString(fibonacci(8)));
    }

    private static int[] fibonacci(int n ) {
        int[] fibo = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1) {
                fibo[i] = 1;
                continue;
            }
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        return fibo;
    }
}
