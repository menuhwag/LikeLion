package week8._221108.study.algorithm.binary_search;

public class BinarySearchTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.search(arr, 7)); // 기댓값 : 6
        System.out.println(binarySearch.search(arr, 2)); // 기댓값 : 1
    }
}
