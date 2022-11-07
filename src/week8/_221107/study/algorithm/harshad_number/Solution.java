package week8._221107.study.algorithm.harshad_number;

public class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int num = x;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return x % sum == 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(12));
        System.out.println(solution.solution(11));
    }
}
