package week9._221116.study.algorithm.quick_sort;

import java.util.Arrays;

public class QuickSortTest {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] arr1 = {20, 18, 5, 19, 40, 50, 5, 25};
        int[] arr2 = {20, 60, 5, 19, 40, 50, 5, 45};
        quickSort.sort(arr1, 0, arr1.length);
        System.out.println(Arrays.toString(arr1));
        quickSort.sort(arr2, 0, arr2.length);
        System.out.println(Arrays.toString(arr2));
    }
}
