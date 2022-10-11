package practice.java_221011.programmers.sum_digit;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        while(n > 0) {
            answer += n%10;
            n = n / 10;
        }
        return answer;
    }
//    public int solution(int n) {
//        int answer = 0;
//        String str = String.valueOf(n);
//        for (int i = 0; i < str.length(); i++) {
//            answer += Integer.parseInt(String.valueOf(str.charAt(i))); // 이게 최선인가...
//        }
//
//        return answer;
//    }
}