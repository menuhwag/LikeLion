package week9._221118.study.algorithm.matrix_dupl;

public class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[0].length; j++) {
                int num = 0;
                for (int x = 0; x < arr1[i].length; x++) {
                    num += arr1[i][x] * arr2[x][j];
                }
                answer[i][j] = num;
            }
        }
        return answer;
    }
}