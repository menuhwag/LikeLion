package week7._221102.study.algorithm.programmers.prime_number;

public class Solution {
    public int solution(int n) {
        int[] numbers = new int[n];
        numbers[0] = -1; // 1 제거
        for (int i = 2; i * i <= n; i++) {
            for (int j = 2; i * j <= n; j++) {
                numbers[i * j - 1] = -1;
            }
        }
        int answer = 0;
        for (int num : numbers) {
            if (num == 0) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        new Solution().solution(10);
    }
}
