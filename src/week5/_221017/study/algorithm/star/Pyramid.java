package week5._221017.study.algorithm.star;

public class Pyramid {
    private int n;

    public Pyramid(int n) {
        this.n = n;
    }

    public void print() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
