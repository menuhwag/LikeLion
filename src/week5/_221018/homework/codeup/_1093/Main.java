package week5._221018.homework.codeup._1093;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[23];

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr[num-1] = arr[num-1] + 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num).append(" ");
        }
        System.out.println(sb.substring(0, sb.length()-1));
    }
}
