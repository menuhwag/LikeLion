package week12._221207.study.algorithm.디스크_컨트롤러;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public int solution(int[][] jobs) {
        /*
        * 1. 현재 작업 중에 들어온 요청들을 큐에 담는다. (timestamp보다 요청시간이 작거나 같은 작업)
        * 2. 그 큐는 작업시간의 오름차순으로 정렬된다.
        * 3. 그 큐가 빌때까지 작업한다.
        * 4. 반복한다.
        * 엣지 케이스
        * 요청 시점이 같은 경우.
        * */
        int timestamp = 0;
        int answer = 0;

        PriorityQueue<int[]> wait = new PriorityQueue<>((o1, o2) -> {  // 요청 시점 오름차순 정렬
            if (o1[0] == o2[0]) return o1[1] - o2[1]; // 요청 시점이 같은 경우 작업 시간 오름차순 정렬
            return o1[0] - o2[0];
        });
        PriorityQueue<int[]> reserve = new PriorityQueue<>((o1, o2) -> { // 작업 시간 오름차순 정렬
            return o1[1] - o2[1];
        });

        int[] execute = null;

        for (int i = 0; i < jobs.length; i++) {
            wait.add(jobs[i]);
        }

        while (!wait.isEmpty() || !reserve.isEmpty()) { // 모든 작업이 완료될때까지 반복.
            while (!wait.isEmpty() && wait.peek()[0] <= timestamp || reserve.isEmpty()) {
                reserve.add(wait.poll());
                if (wait.isEmpty()) break;
            }
            execute = reserve.poll();
            System.out.println(Arrays.toString(execute));
            timestamp = Math.max(timestamp, execute[0]);
            answer += timestamp + execute[1] - execute[0];
            timestamp += execute[1];
        }

        return answer / jobs.length;
    }

    public static void main(String[] args) {
        int[][] jobs = null;
        int result = 0;
        Solution solution = new Solution();
        jobs = new int[][] {{0, 3}, {1, 9}, {2, 6}}; // 9
        result = solution.solution(jobs);
        System.out.println(result);
        jobs = new int[][] {{7, 8}, {3, 5}, {8, 6}}; // 8
        result = solution.solution(jobs);
        System.out.println(result);
        jobs = new int[][] {{7, 8}, {3, 5}, {9, 6}}; // 9
        result = solution.solution(jobs);
        System.out.println(result);
        jobs = new int[][] {{0, 3}, {0, 5}, {0, 7}}; // 8
        result = solution.solution(jobs);
        System.out.println(result);
    }
}
