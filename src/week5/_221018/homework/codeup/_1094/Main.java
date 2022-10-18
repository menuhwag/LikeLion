package week5._221018.homework.codeup._1094;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = n-1; i > -1; i--) {
            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb.substring(0, sb.length()-1));
    }
}
