package week9._221115.study.algorithm.quick_sort;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public int[] sort(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        List<Integer> sortedList = sort(list);
        int[] sorted = new int[sortedList.size()];
        for (int i = 0; i < sortedList.size(); i++) {
            sorted[i] = sortedList.get(i);
        }
        return sorted;
    }

    public List<Integer> sort(List<Integer> arr) {
        if (arr.size() < 2) return arr;
        int pivot = arr.size() / 2;
        List<Integer> mid = new ArrayList<>();
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        mid.add(arr.get(pivot)); // 기준

        for (int i = 0; i < arr.size(); i++) {
            if (i == pivot) continue;
            int num = arr.get(i);
            // 좌우 나누기
            if (num < arr.get(pivot)) left.add(num);
            else if (arr.get(pivot) <= num) right.add(num);
        }
//        System.out.printf("left : %s\n", left);
//        System.out.printf("mid : %s\n", mid);
//        System.out.printf("right : %s\n", right);
        return merge(sort(left), mid, sort(right));
    }

    private List<Integer> merge(List<Integer> left, List<Integer> mid, List<Integer> right) {
        mid.addAll(1, right);
        mid.addAll(0, left);
        return mid;
    }
}
