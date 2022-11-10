package week8._221110.study.algorithm.no_duplicate_number;

import java.util.Stack;

public class Solution {
    public int[] solution1(int []arr) {
        Stack<Integer> stack = new Stack<>();
        for (int num : arr) {
            if (stack.size() == 0 || stack.peek() != num) stack.push(num);
        }
        int[] answer = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            answer[i] = stack.get(i);
        }
        return answer;
    }
}
