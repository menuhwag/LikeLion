package week10._221122.study.algorithm.codeup._1854;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        int sum = Main.summary(0, n);
        System.out.println(sum);
    }

    private static int summary(int init, long number) {
        if (number <= 0) return init;
        return summary(init + (int)(number % 10), number/10);
    }
}
