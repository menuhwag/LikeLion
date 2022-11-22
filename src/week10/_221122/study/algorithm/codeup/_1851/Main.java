package week10._221122.study.algorithm.codeup._1851;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        printStar(n);
    }

    public static void printStar(int n) {
        if (n <= 0) return;
        System.out.print("*");
        printStar(n - 1);
    }
}
