package week10._221125.study.algorithm.recur;

public class TailRecur {
    private static void recur1(int n) {
        if (n <= 0) return;
        recur1(n - 1);
        System.out.println(n);
        recur1(n - 2);
    }

    private static void recur2(int n) {
        while (n > 0) {
            recur2(n - 1);
            System.out.println(n);
            n = n - 2;
        }
    }

    public static void main(String[] args) {
        System.out.println("재귀 1");
        recur1(4);
        System.out.println();

        System.out.println("재귀 2 : 꼬리 재귀 제거");
        recur2(4);
    }
}
