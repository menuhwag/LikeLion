package week5._221018.homework.codeup._1098;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] board = new int[h][w];

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int len = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            if (d == 0) {
                for (int j = 0; j < len; j++) {
                    board[x][y+j] = 1;
                }
            } else {
                for (int j = 0; j < len; j++) {
                    board[x+j][y] = 1;
                }
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.printf("%d ", board[i][j]);
            }
            System.out.println();
        }
    }
}
