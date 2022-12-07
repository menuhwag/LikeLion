package week12._221207.study.algorithm.디스크_컨트롤러;

import java.util.PriorityQueue;

public class Solution {
    public int solution(int[][] jobs) {
        int timestamp = 0;
        int answer = 0;

        PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> o1[0] - o2[0]);
        for (int i = 0; i < jobs.length; i++) {
            queue.add(jobs[i]);
        }

        for (int i = 0; i < jobs.length; i++) { // poll 할때 비교
            // 타임스탬프보다 요청시간이 크거나 같으면 즉, 디스크가 동작하고 있지 않으면 비교없이 그냥 바로 먼저 들어온 요청을 시작
            // 타임스태프보다 작으면 뒤에 값이랑 비교해서 작업시간이 짧은 작업부터 진행.
            int[] job1 = queue.poll();
            int[] job2 = queue.poll();
            if (timestamp <= job1[0]) {
                queue.add(job2);
                timestamp = Math.max(timestamp, job1[0]) + job1[1];
                answer += job1[1];
                continue;
            }
            int[] execute;
            if (job2 != null) {
                execute = (job1[1] <= job2[1]) ? job1 : job2; // 요청시간이 작은 작업.
                queue.add((job1[1] > job2[1]) ? job1 : job2); // 요청시간이 큰 작업 복원.
            } else {
                execute = job1;
            }
            answer += timestamp - execute[0] + execute[1];
            timestamp += execute[1];
        }

        return answer / jobs.length;
    }

    public static void main(String[] args) {
        int[][] jobs = {{0, 3}, {1, 9}, {2, 6}}; // 9
        int result = new Solution().solution(jobs);
        System.out.println(result);
    }
}
