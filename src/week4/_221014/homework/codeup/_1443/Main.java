package week4._221014.homework.codeup._1443;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] arr = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            arr[i] = sc.nextInt();
        }
        m.sort(arr);
        for (int num : arr) {
            System.out.println(num);
        }
    }

    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j;
            for (j = i; j > 0; j--) {
                if (arr[j - 1] < temp) break;
                arr[j] = arr[j - 1];
            }
            arr[j] = temp;
        }
    }
}
