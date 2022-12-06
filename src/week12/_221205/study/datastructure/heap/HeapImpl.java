package week12._221205.study.datastructure.heap;

import java.util.Arrays;
import java.util.Comparator;

public class HeapImpl {
    int[] heap;
    public HeapImpl(int[] arr) {
        this.heap = arr;
        sort(arr.length, (n1, n2) -> n1 - n2);
    }

    public HeapImpl(int[] arr, Comparator<Integer> c) {
        this.heap = arr;
        sort(arr.length, c);
    }

    private void sort(int index, Comparator<Integer> c) {
        if (index <= 1) return;
        int chileIdx = index - 1;
        int parentIdx = getParent(index) - 1;
        if (c.compare(heap[parentIdx], heap[chileIdx]) > 0) {
            swap(chileIdx, parentIdx);
            sort(parentIdx + 1, c);
        }
        sort(index - 1, c);
    }

    private int getLeftChild(int parentIdx) {
        return 2 * parentIdx;
    }

    private int getRightChild(int parentIdx) {
        return 2 * parentIdx + 1;
    }

    private int getParent(int childIdx) {
        return childIdx / 2;
    }

    private void swap(int index1, int index2) {
        int temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }

    @Override
    public String toString() {
        return Arrays.toString(heap);
    }
}
