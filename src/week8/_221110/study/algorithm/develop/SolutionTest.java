package week8._221110.study.algorithm.develop;

import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {
        int[] progress = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};

        Solution solution = new Solution();
        int[] result = solution.solution(progress, speeds);
        System.out.println(Arrays.toString(result));
    }
}
