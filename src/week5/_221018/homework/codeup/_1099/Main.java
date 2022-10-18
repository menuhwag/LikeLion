package week5._221018.homework.codeup._1099;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        /*
        * 시작 위치 좌표는 2,2 (1, 1)
        * 오른쪽에 벽이 없으면 (오른쪽 칸이 0)
        * 위치를 오른쪽 한 칸 이동
        * (0을 9로 바꾸고 위치 좌표 수정)
        * 오른쪽에 벽이 있으면 (오른쪽 칸이 1)
        * 아래로 한 칸 이동
        * 이동이 끝나는 조건
        * 1. 맨 아래의 가장 오른쪽에 도착한 경우 (위치가 8, 8인경우 인덱스 기준)
        * 2. 더 이상 움직일 수 없는 경우 (오른쪽과 아래쪽에 벽이 있는 경우 1인 경우)
        * 3. 먹이를 찾은 경우 2를 만났을 경우*/

        int x = 1;
        int y = 1;

        while(true) {

            if (board[x][y] == 2) { // 먹이 발견
                board[x][y] = 9;
                break;
            }

            board[x][y] = 9;
            if (board[x][y+1] == 0) { // 오른쪽에 벽이 없으면
                y++;
                continue;
            }
            if (board[x][y+1] == 1) { // 오른쪽에 벽이 있으면
                if (board[x+1][y] == 1) break;
                x++;
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%d ", board[i][j]);
            }
            System.out.println();
        }
    }
}
