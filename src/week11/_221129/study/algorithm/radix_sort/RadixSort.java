package week11._221129.study.algorithm.radix_sort;

import java.util.*;

public class RadixSort {
    private static int DEC = 10;

    public static int[] sortByFirstDigit(int[] arr) {
        Queue<Integer>[] radix = new Queue[DEC];
        for (int i = 0; i < DEC; i++) {
            radix[i] = new ArrayDeque<>();
        }
        for (int i = 0; i < arr.length; i++) {
            radix[arr[i] % DEC].add(arr[i]);
        }
        int[] sorted = new int[arr.length];
        int index = 0;
        for (int i = 0; i < DEC; i++) {
            if (radix[i] != null) {
                while (!radix[i].isEmpty()) {
                    sorted[index++] = radix[i].poll();
                }
            }
        }
        return sorted;
    }

    public static int[] getDigits(int[] arr) {
        Set<Integer> digits = new HashSet<>();
        for (int num : arr) {
            if (num == 0) digits.add(1);
            else digits.add((int) (Math.log10(num) + 1));
        }
        int[] result = new int[digits.size()];
        int index = 0;
        for (int digit : digits) {
            result[index++] = digit;
        }
        Arrays.sort(result);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {7, 14, 5, 9, 1, 0, 11, 4, 15};
        int[] sorted = sortByFirstDigit(arr);
        System.out.println(Arrays.toString(sorted));
        int[] digits = getDigits(arr);
        System.out.println(Arrays.toString(digits));
    }
}
