package week8._221109.study.algorithm.select_sort;

import java.util.Arrays;

public class SelectSortTest {
    public static void main(String[] args) {
        int[] arr1 = {4, 12, 7, 9, 24, 1, 35, 60, 2};
        int[] arr2 = {4, 12, 7, 9, 24, 1, 35, 60, 2};
        SelectSort selectSort = new SelectSort();
        int[] sort1 = selectSort.sort(arr1, (num1, num2) -> num1 > num2); // 오름차순
        System.out.println(Arrays.toString(sort1));

        int[] sort2 = selectSort.sort(arr2, (num1, num2) -> num1 < num2); // 내림차순
        System.out.println(Arrays.toString(sort2));
    }
}
