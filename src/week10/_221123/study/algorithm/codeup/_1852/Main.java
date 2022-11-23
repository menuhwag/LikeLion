package week10._221123.study.algorithm.codeup._1852;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(oneToN(n));
    }

    private static String oneToN(int n) {
        if (n <= 0) return "";
        return oneToN(n - 1) + n + " ";
    }
}
