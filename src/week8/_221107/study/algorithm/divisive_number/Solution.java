package week8._221107.study.algorithm.divisive_number;

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public int[] solution(int[] arr, int divisor) {
        Queue<Integer> queue =  new PriorityQueue<>();
        for (int num : arr) {
            if (num % divisor == 0) queue.add(num);
        }
        System.out.println(queue);
        if (queue.size() == 0) return new int[] {-1};
        int[] answer = new int[queue.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = queue.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        Solution solution = new Solution();
        int[] answer = solution.solution(arr, divisor);
        for (int num : answer) {
            System.out.println(num);
        }
    }
}
