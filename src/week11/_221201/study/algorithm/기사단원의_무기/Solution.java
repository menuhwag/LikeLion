package week11._221201.study.algorithm.기사단원의_무기;

public class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            int divisorCnt = 0;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    if (j == i / j) divisorCnt += 1;
                    else divisorCnt += 2;
                }
            }
            if (divisorCnt > limit) {
                divisorCnt = power;
            }
            answer += divisorCnt;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int number1 = 10;
        int limit1 = 3;
        int power1 = 2;
        System.out.println(solution.solution(number1, limit1, power1));
    }
}
