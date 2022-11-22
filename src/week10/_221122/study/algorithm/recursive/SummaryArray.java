package week10._221122.study.algorithm.recursive;

public class SummaryArray {
    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 9};
        int sum = SummaryArray.summary(arr, 0, 0);
        System.out.println(sum);
    }

    private static int summary(int[] arr, int idx, int init) {
        if (arr.length <= idx) return init;
        return summary(arr, idx + 1, init + arr[idx]);
    }
}
