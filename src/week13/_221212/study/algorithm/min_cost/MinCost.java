package week13._221212.study.algorithm.min_cost;

import java.util.Arrays;

public class MinCost {
    private int[][] matrix;
    private int[][] memo;

    public MinCost(int[][] matrix) {
        this.matrix = matrix;
        this.memo = new int[matrix.length][matrix[0].length];
        this.memo[0][0] = this.matrix[0][0];
        findPath();
    }

    private void findPath() {
        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[i].length; j++) {
                if (i == 0 && j != 0) this.memo[i][j] = this.memo[i][j - 1] + this.matrix[i][j];
                else if (i != 0 && j == 0) this.memo[i][j] = this.memo[i - 1][j] + this.matrix[i][j];
                else if (i != 0 && j != 0) this.memo[i][j] = Math.min(this.memo[i][j - 1], Math.min(this.memo[i - 1][j - 1], this.memo[i - 1][j])) + this.matrix[i][j];
            }
        }
    }

    public void print() {
        for (int[] row : memo) {
            System.out.println(Arrays.toString(row));
        }
    }
}
