package week12._221205.study.datastructure.heap;

public class HeapImplTest {
    public static void main(String[] args) {
        HeapImpl minHeap1 = new HeapImpl(new int[]{5, 8, 4, 7, 3, 2, 9, 6, 7});
        HeapImpl minHeap2 = new HeapImpl(new int[]{6, 5, 7, 8});
        HeapImpl minHeap3 = new HeapImpl(new int[]{10, 9, 5, 8, 3, 2, 4, 6, 7, 1});
        System.out.println(minHeap1);
        System.out.println(minHeap2);
        System.out.println(minHeap3);
        HeapImpl maxHeap1 = new HeapImpl(new int[]{5, 8, 4, 7, 3, 2, 9, 6, 7}, (n1, n2) -> n2 - n1);
        HeapImpl maxHeap2 = new HeapImpl(new int[]{6, 5, 7, 8}, (n1, n2) -> n2 - n1);
        HeapImpl maxHeap3 = new HeapImpl(new int[]{10, 9, 5, 8, 3, 2, 4, 6, 7, 1}, (n1, n2) -> n2 - n1);
        System.out.println(maxHeap1);
        System.out.println(maxHeap2);
        System.out.println(maxHeap3);
    }
}
