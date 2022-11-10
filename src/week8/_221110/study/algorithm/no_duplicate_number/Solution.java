package week8._221110.study.algorithm.no_duplicate_number;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public int[] solution1(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (stack.peek() != arr[i]) stack.push(arr[i]);
        }
        int[] answer = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            answer[i] = stack.get(i);
        }
        return answer;
    }

    public int[] solution2(int[] arr) {
        List<Integer> answerList = new ArrayList<>();
        answerList.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (answerList.get(answerList.size() - 1) != arr[i]) answerList.add(arr[i]);
        }
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}
