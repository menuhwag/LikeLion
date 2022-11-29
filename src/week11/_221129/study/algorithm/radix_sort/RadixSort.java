package week11._221129.study.algorithm.radix_sort;

import java.util.Arrays;

public class RadixSort {
    private static int RADIX = 10;

    public static int[] sort(int[] arr) {
        Integer[] radix = new Integer[RADIX];
        for (int i = 0; i < arr.length; i++) {
            radix[arr[i]] = arr[i];
        }
        int[] sorted = new int[arr.length];
        int index = 0;
        for (int i = 0; i < RADIX; i++) {
            if (radix[i] != null) {
                sorted[index++] = radix[i];
            }
        }
        return sorted;
    }

    public static void main(String[] args) {
        int[] arr = {7,4,5,9,1,0};
        int[] sorted = sort(arr);
        System.out.println(Arrays.toString(sorted));
    }
}
