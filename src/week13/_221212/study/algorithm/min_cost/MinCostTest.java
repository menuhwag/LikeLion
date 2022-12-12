package week13._221212.study.algorithm.min_cost;

public class MinCostTest {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 2},
                {4, 6, 2},
                {1, 2, 4}
        };
        MinCost minCost = new MinCost(matrix);
        minCost.print();
    }
}
