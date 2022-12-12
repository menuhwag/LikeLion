package week13._221212.study.algorithm.min_cost;

import java.util.Arrays;

public class MinCost {
    private int[][] matrix;
    private int[][] memo;

    public MinCost(int[][] matrix) {
        this.matrix = matrix;
        this.memo = new int[matrix.length + 1][matrix[0].length + 1];
        this.memo[1][1] = this.matrix[0][0];
        findPath();
    }

    private void findPath() {
        for (int i = 1; i < memo.length; i++) {
            for (int j = 1; j < memo[i].length; j++) {
                int minCost = 0;
                minCost = (minCost == 0) ? this.memo[i][j - 1] : (this.memo[i][j - 1] == 0) ? minCost : Math.min(minCost, this.memo[i][j - 1]);
                minCost = (minCost == 0) ? this.memo[i - 1][j - 1] : (this.memo[i - 1][j - 1] == 0) ? minCost : Math.min(minCost, this.memo[i - 1][j - 1]);
                minCost = (minCost == 0) ? this.memo[i - 1][j] : (this.memo[i - 1][j] == 0) ? minCost : Math.min(minCost, this.memo[i - 1][j]);
                this.memo[i][j] = minCost + this.matrix[i - 1][j - 1];
            }
        }
    }

    public void print() {
        for (int[] row : memo) {
            System.out.println(Arrays.toString(row));
        }
    }
}
