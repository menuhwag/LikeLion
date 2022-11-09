package week8._221109.study.algorithm.select_sort;

public class SelectSort {
    public int[] sort(int[] arr) {
        return sort(arr, 0);
    }

    private int[] sort(int[] arr, int target) {
        if (arr.length == target) return arr;
        int minIdx = searchMinVal(arr, target);
        swap(arr, target, minIdx);
        return sort(arr, target + 1);
    }

    private int searchMinVal(int[] arr, int target) {
        int minIdx = target;
        for (int i = target + 1; i < arr.length; i++) {
            if (arr[minIdx] > arr[i]) {
                minIdx = i;
            }
        }
        return minIdx;
    }

    private void swap(int[] arr, int a, int b) {

    }
}
