package week8._221110.study.algorithm.develop;

import java.util.*;

public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        LinkedList<Integer> progressesList = new LinkedList<>();
        for (int progress : progresses) {
            progressesList.add(progress);
        }
        LinkedList<Integer> speedsList = new LinkedList<>();
        for (int speed : speeds) {
            speedsList.add(speed);
        }
        Stack<Integer> answerStack = new Stack<>();
        while (!progressesList.isEmpty()) {
            for (int i = 0; i < progressesList.size(); i++) {
                progressesList.set(i, progressesList.get(i) + speedsList.get(i));
            }
            int complete = 0;
            while (progressesList.size() > 0) {
                if (progressesList.peek() < 100) break;
                progressesList.poll();
                speedsList.poll();
                complete++;
            }
            if (complete > 0) answerStack.push(complete);
        }

        return answerStack.stream().mapToInt(Integer::intValue).toArray();
    }
}