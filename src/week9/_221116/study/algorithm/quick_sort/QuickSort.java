package week9._221116.study.algorithm.quick_sort;

public class QuickSort {
    public void sort(int[] arr, int startIdx, int endIdx) {
        if (startIdx >= endIdx) return; // 무한 루프에 빠지지 않도록 종료 조건 입력
        int p = part(arr, startIdx, endIdx); // 배열 중앙을 기준으로 작은 값은 왼쪽 큰 값은 오른쪽으로 나눠준 후 나눠진 기준 인덱스를 반환.
        sort(arr, startIdx, p); // startIdx부터 반환 받은 기준 인덱스까지 재귀 호출 -> 왼쪽 블럭 정렬
        sort(arr, p + 1, endIdx); // 반환 받은 기준 인덱스 + 1 부터 endIdx까지 재귀 호출 -> 오른쪽 블럭 정렬
    }

    private int part(int[] arr, int startIdx, int endIdx) {
        int pivot = arr[(startIdx + endIdx + 1) / 2];
        while (startIdx < endIdx) {
            while (arr[startIdx] < pivot) startIdx++;
            while (pivot < arr[endIdx]) endIdx--;
            swap(arr, startIdx++, endIdx--);
        }
        return Math.min(startIdx, endIdx);
    }

    private void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
