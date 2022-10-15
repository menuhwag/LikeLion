package week4._221012.study.algorithm.maxmin;

public class MaxMinContext {

    private int getNum(int[] arr, IsCompare isCompare) {
        int num = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (isCompare.isCompare(num, arr[i])) {
                num = arr[i];
            }
        }
        return num;
    }

    public int getMax(int[] arr) {
        return getNum(arr, new MaxCompare());
    }

    public int getMin(int[] arr) {
        return getNum(arr, new MinCompare());
    }
}
