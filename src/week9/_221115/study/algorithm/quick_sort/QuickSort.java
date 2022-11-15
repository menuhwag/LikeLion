package week9._221115.study.algorithm.quick_sort;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public int[] sort(int[] arr) {
        int pivot = arr.length / 2;
        List<Integer> mid = new ArrayList<>();
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        mid.add(arr[pivot]);

        for (int num : arr) {
            if (num < arr[pivot]) left.add(num);
            else if (arr[pivot] <= num) right.add(num);
        }
        System.out.printf("left : %s\n", left);
        System.out.printf("mid : %s\n", mid);
        System.out.printf("right : %s\n", right);
        return null;
    }
}
