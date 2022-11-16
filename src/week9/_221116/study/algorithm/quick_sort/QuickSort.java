package week9._221116.study.algorithm.quick_sort;

public class QuickSort {
    public void sort(int[] arr, int startIdx, int endIdx) {
        int pivot = arr[(startIdx + endIdx + 1) / 2];
        while (startIdx < endIdx) {
            while (arr[startIdx] < pivot) startIdx++;
            while (pivot < arr[endIdx]) endIdx--;
            swap(arr, startIdx++, endIdx--);
        }
    }

    private void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
