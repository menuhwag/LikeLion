package week9._221117.study.algorithm.quick_sort;

public class QuickSort {
    public int[] sort(int[] arr, int start, int end) {
        int pivot = arr[(start + end + 1) / 2];
        while(start < end) {
            while(arr[start] < pivot) start++;
            while(arr[end] > pivot) end--;
            swap(arr, start++, end--);
        }
        return arr;
    }

    private void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
