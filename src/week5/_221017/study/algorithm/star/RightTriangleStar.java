package week5._221017.study.algorithm.star;

public class RightTriangleStar {
    private char ch;

    public RightTriangleStar(char ch) {
        this.ch = ch;
    }

    public void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
