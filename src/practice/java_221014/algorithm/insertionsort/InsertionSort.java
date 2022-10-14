package practice.java_221014.algorithm.insertionsort;

public class InsertionSort {
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j-1] > arr[j]) {
                    swap(arr, j, j - 1);
                    continue;
                }
                break;
            }
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
