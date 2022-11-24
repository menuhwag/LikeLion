package week10._221124.study.algorithm.fibonacci;

public class Fibonacci {
    public static int to(int n) {
        if (n <= 2) return 1;
        return to(n - 1) + to(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci.to(8));
    }
}
