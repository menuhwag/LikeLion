package week10._221122.study.algorithm.recursive;

public class OneToN {
    public static void print1ToN(int start) {
        if (start > 100) return;
        System.out.println(start);
        print1ToN(start + 1);
    }

    public static void main(String[] args) {
        OneToN.print1ToN(1);
    }
}
