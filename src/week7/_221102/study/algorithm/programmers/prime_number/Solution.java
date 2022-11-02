package week7._221102.study.algorithm.programmers.prime_number;

public class Solution {
    /*
    * 에라토스테네스의 체
    * 1. 1은 소수가 아니므로 제거
    * 2. 2 자기 자신을 제외한 배수 제거
    * 3. 3 자기 자신을 제외한 배수 제거
    * 4. 4는 2의 배수이므로 이미 제거됨
    * 5. 5 자기 자신을 제외한 배수 제거
    * 6. 루트n까지 반복
    *
    * 반복문 1. 루트 n까지 반복 i * i < n
    * 반복문 2. n 이하의 배수 반복 i * j < n
    */
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
