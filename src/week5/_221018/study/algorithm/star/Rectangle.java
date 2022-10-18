package week5._221018.study.algorithm.star;

public class Rectangle {
    public void print(int x, int y) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
