package week8._221111.study.algorithm.Repeat_Binary_Transformation;

import java.util.Arrays;

public class Solution {
    public int[] solution(String s) {
        return transfer(s, 0, 0);
    }

    private int[] transfer(String s, int transCnt, int zeroCnt) {
        if (s.equals("1")) return new int[]{transCnt, zeroCnt};
        int oneCnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                zeroCnt++;
            } else {
                oneCnt++;
            }
        }
        s = Integer.toBinaryString(oneCnt);
        return transfer(s, transCnt + 1, zeroCnt);
    }

    public static void main(String[] args) {
        String s = "110010101001";
        Solution solution = new Solution();
        int[] result = solution.solution(s);
        System.out.println(Arrays.toString(result));
    }
}
