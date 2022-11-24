package week10._221124.study.algorithm.codeup._1859;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Main.print(n);
    }

    private static String star(int n) {
        if (n <= 0 ) return "";
        return "*" + star(n - 1);
    }

    private static void print(int n) {
        if (n <= 0) return;
        print(n - 1);
        System.out.println(star(n));
    }
}
