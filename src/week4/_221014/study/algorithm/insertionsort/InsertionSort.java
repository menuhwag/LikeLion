package week4._221014.study.algorithm.insertionsort;

public class InsertionSort {

    public int[] sort(int[] arr, int i) { // 재귀 함수 버전.
        if ( i == arr.length ) return arr;
        for (int j = i; j > 0; j--) {
            if (arr[j-1] > arr[j]) {
                swap(arr, j, j - 1);
                continue;
            }
            break;
        }
        return sort(arr, i + 1);
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
