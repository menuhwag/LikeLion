package week5._221017.study.algorithm.star;

public class Diamond {
    //  *
    // ***
    //*****
    // ***
    //  *
    // 앞 공백 = |dan / 2 - i|
    // 별 출력 = dan - 2 * 앞 공백
    private int n;

    public Diamond(int n) {
        this.n = n;
    }

    public void print() {
        for (int i = 0; i < n; i++) {
            int space = Math.abs(n / 2 - i);

            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < n - 2 * space; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
