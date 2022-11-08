package week8._221108.study.algorithm.binary_search;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main m = new Main();
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int target = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(m.search(arr, target));
    }

    private int search(int[] arr, int number) {
        return search(arr, number, 0, arr.length - 1);
    }

    private int search(int[] arr, int target, int startIdx, int endIdx) {
        int midIdx = (startIdx + endIdx) / 2;
        if (arr[midIdx] == target) return midIdx + 1;
        if (startIdx == endIdx) return -1;
        if (target < arr[midIdx]) return search(arr, target, startIdx, midIdx - 1);
        return search(arr, target, midIdx + 1, endIdx);
    }
}
