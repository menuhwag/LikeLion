package week9._221117.study.algorithm.quick_sort;

import java.util.Arrays;

public class QuickSortTest {
    public static void main(String[] args) {
        int[] arr = {20, 18, 5, 19, 40, 50, 5, 25};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
