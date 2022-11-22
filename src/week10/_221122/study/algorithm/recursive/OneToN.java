package week10._221122.study.algorithm.recursive;

public class OneToN {
    public static void print1ToN(int start, int end) {
        if (start > end) return;
        System.out.println(start);
        print1ToN(start + 1, end);
    }

    public static void main(String[] args) {
        OneToN.print1ToN(1, 100);
    }
}
