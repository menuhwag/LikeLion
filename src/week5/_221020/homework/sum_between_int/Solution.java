package week5._221020.homework.sum_between_int;

public class Solution {
    public long solution(int a, int b) {
        if (a > b) return solution(b, a);
        long answer = 0;
        for (int i = a; i <= b; i++) {
            answer += (long) i;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] case1 = {3, 5}; // expected 12
        int[] case2 = {3, 3}; // expected 3
        int[] case3 = {5, 3}; // expected 12

        System.out.printf("case1 pass : %s\n", solution.solution(case1[0], case1[1]) == 12);
        System.out.printf("case2 pass : %s\n", solution.solution(case2[0], case2[1]) == 3);
        System.out.printf("case3 pass : %s\n", solution.solution(case3[0], case3[1]) == 12);
    }
}
