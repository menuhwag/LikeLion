package week12._221205.study.datastructure.heap;

import java.util.Arrays;

public class HeapImpl {
    int[] heap;
    public HeapImpl(int[] arr) {
        this.heap = arr;
        sort(arr.length);
    }

    private void sort(int index) {
        if (index <= 1) return;
        int chileIdx = index - 1;
        int parentIdx = getParent(index) - 1;
        if (heap[chileIdx] > heap[parentIdx]) {
            swap(chileIdx, parentIdx);
            sort(parentIdx + 1);
        }
        sort(index - 1);
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
