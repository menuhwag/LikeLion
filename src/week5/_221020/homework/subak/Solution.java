package week5._221020.homework.subak;

public class Solution {
    public String solution(int n) {
        String answer = "";
        for (int i = 1; i <= n; i++) {
            answer += (i % 2 == 1) ? "수" : "박";
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int case1 = 3; // 수박수
        int case2 = 4; // 수박수박

        System.out.printf("case1 pass : %s\n", "수박수".equals(solution.solution(case1)));
        System.out.printf("case2 pass : %s\n", "수박수박".equals(solution.solution(case2)));
    }
}
