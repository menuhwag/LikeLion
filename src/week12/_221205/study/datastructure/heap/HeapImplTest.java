package week12._221205.study.datastructure.heap;

public class HeapImplTest {
    public static void main(String[] args) {
        HeapImpl heap1 = new HeapImpl(new int[]{5, 8, 4, 7, 3, 2, 9, 6, 7});
        HeapImpl heap2 = new HeapImpl(new int[]{6, 5, 7, 8});
        System.out.println(heap1);
        System.out.println(heap2);
    }
}
