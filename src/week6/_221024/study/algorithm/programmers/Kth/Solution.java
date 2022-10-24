package week6._221024.study.algorithm.programmers.Kth;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0;
        for (int[] command : commands) {
            int[] buf = Arrays.copyOfRange(array, command[0] - 1, command[1]);
            Arrays.sort(buf);
            answer[index++] = buf[command[2] - 1];
        }
        return answer;
    }
    
    public int[] solution2(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0;
        for (int[] command : commands) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int j = command[0] - 1; j < command[1]; j++) {
                pq.add(array[j]);
            }
            int result = 0;
            for (int i = 0; i < command[2]; i++) {
                result = pq.poll();
            }
            answer[index++] = result;
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
//        int[] answer = new Solution().solution(arr, commands);
        int[] answer = new Solution().solution2(arr, commands);
        System.out.println(Arrays.toString(answer));
    }
}
