package week9._221118.study.algorithm.caesar;

class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ('A' <= ch && 'Z' >= ch) {
                ch += n;
                if (ch > 'Z') ch = (char) (ch % 'Z' + 64);
            } else if ('a' <= ch && 'z' >= ch) {
                ch += n;
                if (ch > 'z') ch = (char) (ch % 'z' + 96);
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}