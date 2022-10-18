package week5._221018.homework.codeup._1097;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[19][19];

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            for (int j = 0; j < 19; j++) {
                board[x][j] = board[x][j] == 0 ? 1 : 0;
                board[j][y] = board[j][y] == 0 ? 1 : 0;
            }
        }

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.printf("%d ", board[i][j]);
            }
            System.out.println();
        }
    }
}
