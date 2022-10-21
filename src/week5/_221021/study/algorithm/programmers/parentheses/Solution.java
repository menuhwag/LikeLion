package week5._221021.study.algorithm.programmers.parentheses;

import java.util.Stack;

public class Solution {
    public boolean solution(String str) { // 처음 풀었던 방법.
        char[] parentheses = new char[str.length()];
        int top = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (top == 0 && ch == ')') return false; // 첫 글자가 ) 이면 올바르지 않음.
            if (ch == '(') {
                parentheses[top++] = ch;
            } else if (ch == ')') {
                parentheses[--top] = '\0';
            }
        }
        return parentheses[0] == '\0';
    }

    public boolean solution2(String str) { // 스택을 사용한 방법
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (stack.size() == 0 && ch == ')') return false;
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                stack.pop();
            }
        }
        return stack.size() == 0;
    }

    public boolean solution3(String str) { // 프로그래머스에 있는 답 중 살짝 설렌 코드
        int count = 0;
        for (int i = 0; i < str.length(); i++) { // '('가 들어올땐 +1 ')'가 들어올땐 -1을 해서 0이 총 합이 0이면 true, 중간에 음수가 되면 false
            count += (str.charAt(i) == '(') ? 1 : -1;
            if (count < 0) return false;
        }
        return count == 0;
    }
}
