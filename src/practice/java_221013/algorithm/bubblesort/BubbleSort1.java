package practice.java_221013.algorithm.bubblesort;

import java.util.Arrays;

public class BubbleSort1 {
    public void sort(int[] arr, int i) {
        if (i == arr.length) return;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] > arr[j]) swap(arr, i, j);
        }
        sort(arr, i + 1);
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};
        // 오름차순 또는 내림차순으로 정렬하는 알고리즘을 짜보세요

        BubbleSort1 bubbleSort = new BubbleSort1();

        bubbleSort.sort(arr, 0);

        System.out.println(Arrays.toString(arr));
    }
}
