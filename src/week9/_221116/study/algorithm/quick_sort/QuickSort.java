package week9._221116.study.algorithm.quick_sort;

public class QuickSort {
    public void sort(int[] arr, int startIdx, int endIdx) {
        int pivot = (startIdx + endIdx) / 2;
        while (startIdx < endIdx) {
            while (startIdx < pivot) {
                if (arr[startIdx] > arr[pivot]) {
                    swap(arr, startIdx, pivot--);
                }
                startIdx++;
            }
            while (pivot < endIdx) {
                if (arr[pivot] > arr[endIdx-1]) {
                    swap(arr, pivot++, endIdx-1);
                }
                endIdx--;
            }
            // pivot이랑 비교하다가 pivot위치가 바뀌면 기준이 바뀌는게 이해가 안감.
        }
    }

    private void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
