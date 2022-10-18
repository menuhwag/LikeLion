package week5._221018.homework.codeup._1091;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        int m = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(new Main().rc(a, m ,d ,n));
    }
    public long rc(long a, int m, int d, int n) {
        if (n <= 1) return a;
        a = a * m + d;
        return rc(a, m , d, n-1);
    }
}
