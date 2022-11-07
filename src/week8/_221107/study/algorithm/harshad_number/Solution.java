package week8._221107.study.algorithm.harshad_number;

public class Solution {
    public boolean solution(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        System.out.println(sum);
        return true;
    }

    public static void main(String[] args) {
        new Solution().solution(135);
    }
}
