package week8._221110.study.algorithm.no_duplicate_number;

import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {
        int[] arr1 = {1,1,3,3,0,1,1};
        Solution solution = new Solution();
        int[] result1 = solution.solution1(arr1);
        System.out.println(Arrays.toString(result1));
        int[] result2 = solution.solution2(arr1);
        System.out.println(Arrays.toString(result2));
    }
}
