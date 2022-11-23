package week10._221123.study.algorithm.codeup._1912;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(fac(n));
    }

    private static int fac(int n) {
        if (n <= 1) return 1;
        return n * fac(n - 1);
    }
}
