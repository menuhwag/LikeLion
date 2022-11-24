package week10._221124.study.algorithm.codeup._1860;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Main.print(n);
    }

    private static String number(int n) {
        if (n <= 0) return "";
        return number(n - 1) + n + " ";
    }

    private static void print(int n) {
        if (n <= 0) return;
        print(n - 1);
        System.out.println(number(n));
    }
}
