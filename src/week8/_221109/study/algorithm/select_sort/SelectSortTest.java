package week8._221109.study.algorithm.select_sort;

import java.util.Arrays;

public class SelectSortTest {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 9, 24, 1, 35, 60, 2};
        SelectSort selectSort = new SelectSort();
        int[] sort = selectSort.sort(arr);
        System.out.println(Arrays.toString(sort));
    }
}
