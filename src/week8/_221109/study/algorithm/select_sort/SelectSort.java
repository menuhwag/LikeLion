package week8._221109.study.algorithm.select_sort;

public class SelectSort {
    public int[] sort(int[] arr, Comparator comparator) {
        return sort(arr, 0, comparator);
    }

    private int[] sort(int[] arr, int target , Comparator comparator) {
        if (arr.length == target) return arr;
        int findIdx = searchVal(arr, target, comparator);
        swap(arr, target, findIdx);
        return sort(arr, target + 1, comparator);
    }

    private int searchVal(int[] arr, int target, Comparator comparator) {
        int findIdx = target;
        for (int i = target + 1; i < arr.length; i++) {
            if (comparator.compare(arr[findIdx], arr[i])) {
                findIdx = i;
            }
        }
        return findIdx;
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
