package week9._221115.study.algorithm.quick_sort;

import java.util.Arrays;

public class QuickSortTest {
    public static void main(String[] args) {
        int[] arr = {20, 18, 5, 19, 5, 25, 40, 50};
        QuickSort quickSort = new QuickSort();
        int[] sorted = quickSort.sort(arr);
        System.out.println(Arrays.toString(sorted));
    }
}
