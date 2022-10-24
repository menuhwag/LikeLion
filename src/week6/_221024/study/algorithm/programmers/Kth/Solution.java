package week6._221024.study.algorithm.programmers.Kth;

import java.util.Arrays;

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

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer = new Solution().solution(arr, commands);
        System.out.println(Arrays.toString(answer));
    }
}
