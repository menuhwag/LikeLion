package week12._221206.study.algorithm.더_맵게;

import java.util.PriorityQueue;

public class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int answer = 0;

        for (int food : scoville) {
            minHeap.add(food);
        }

        // 엣지 케이스 : 음식을 섞지 못하는 경우
        // 모두다 섞었는데(음식이 하나 남았는데) K보다 작은 경우.

        while (minHeap.peek() < K) {
            if (minHeap.size() == 1) return -1;
            int food1 = minHeap.poll();
            int food2 = minHeap.poll();
            int newFood = food1 + 2 * food2;
            minHeap.add(newFood);
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        System.out.println(new Solution().solution(scoville, K));
    }
}
