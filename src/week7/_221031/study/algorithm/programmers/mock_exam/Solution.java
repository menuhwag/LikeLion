package week7._221031.study.algorithm.programmers.mock_exam;

import java.util.*;

public class Solution {
    public int[] solution(int[] answers) {
        int[] studentPattern1 = {1, 2, 3, 4, 5};
        int[] studentPattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] studentPattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] point = new int[3];

        for (int i = 0; i < answers.length; i++) {
            int student1Answer = studentPattern1[i % studentPattern1.length];
            int student2Answer = studentPattern2[i % studentPattern2.length];
            int student3Answer = studentPattern3[i % studentPattern3.length];
            if (answers[i] == student1Answer) point[0] += 1;
            if (answers[i] == student2Answer) point[1] += 1;
            if (answers[i] == student3Answer) point[2] += 1;
        }

        List<Integer> answer = new ArrayList<>();

        int max = Math.max(point[0], Math.max(point[1], point[2]));
        for (int i = 0; i < point.length; i++) {
            if (max == point[i]) answer.add(i+1);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
