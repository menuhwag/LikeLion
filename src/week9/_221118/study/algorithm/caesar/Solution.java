package week9._221118.study.algorithm.caesar;

class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = (char)(s.charAt(i) + n);
            sb.append(ch);
        }
        return sb.toString();
    }
}