package week4._221014.study.algorithm.insertionsort;

import java.util.Arrays;

public class InsertionSortTest {

    public static void main(String[] args) {
        int[] arr = {8, 5, 6, 2, 4};
        InsertionSort is = new InsertionSort();
        is.sort(arr, 1);
        System.out.println(Arrays.toString(arr));
    }
}
