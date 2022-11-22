package week10._221122.study.algorithm.codeup._1853;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = Main.sigma(0, n);
        System.out.println(sum);
    }

    private static int sigma(int init, int n) {
        if (n <= 0) return init;
        return sigma(init + n, n - 1);
    }
}
