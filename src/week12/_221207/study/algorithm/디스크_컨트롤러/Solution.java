package week12._221207.study.algorithm.디스크_컨트롤러;

import java.util.PriorityQueue;

public class Solution {
    public int solution(int[][] jobs) {
        int timestamp = 0;
        int answer = 0;

        PriorityQueue<int[]> process = new PriorityQueue<>((o1, o2) -> o1[0] - o2[0]);
        PriorityQueue<int[]> waitingQueue = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        for (int i = 0; i < jobs.length; i++) {
            process.add(jobs[i]);
        }

        /*
        * 1. 현재 작업 중에 들어온 요청들을 큐에 담는다. (timestamp보다 요청시간이 작거나 같은 작업)
        * 2. 그 큐는 작업시간의 오름차순으로 정렬된다.
        * 3. 그 큐가 빌때까지 작업한다.
        * 4. 반복한다.
        * 엣지 케이스
        * timestamp보다 요청시간이 늦는 경우 => waitingQueue가 비어있는 경우.
        * */
        while (!process.isEmpty()) {
            while ((process.peek() != null && process.peek()[0] <= timestamp) || waitingQueue.isEmpty()) { // 진행할 작업 예약.
                waitingQueue.add(process.poll());
            }
            while (!waitingQueue.isEmpty()) { // 예약된 작업 진행.
                int[] job = waitingQueue.poll();
                timestamp = Math.max(timestamp, job[0]);
                answer += timestamp - job[0] + job[1];
                timestamp += job[1];
            }
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
    }
}
