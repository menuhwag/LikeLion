package practice.java_221014.algorithm.insertionsort;

import java.util.Arrays;

public class InsertionSortTest {
    public static void main(String[] args) {
        int[] arr = {8, 5, 6, 2, 4};
        InsertionSort is = new InsertionSort();
        is.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
