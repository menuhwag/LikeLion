package week8._221108.study.algorithm.binary_search;

public class BinarySearch {
    public int search(int[] arr, int number) {
        return search(arr, number, 0, arr.length - 1);
    }

    private int search(int[] arr, int target, int startIdx, int endIdx) { // 파라미터 개수를 줄일 수 없을까?
        int midIdx = (startIdx + endIdx) / 2;
        if (arr[midIdx] == target) return midIdx;
        if (startIdx == endIdx) return -1;
        if (target < arr[midIdx]) return search(arr, target, startIdx, midIdx - 1);
        return search(arr, target, midIdx + 1, endIdx);
    }
}
