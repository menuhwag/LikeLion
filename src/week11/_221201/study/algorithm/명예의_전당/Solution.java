package week11._221201.study.algorithm.명예의_전당;

import java.util.Arrays;

public class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] topK = new int[k];
        Arrays.fill(topK, -1); // -1로 초기화
        for (int i = 0; i < score.length; i++) {
            if (topK[0] < score[i]) { // 가장 처음값(최소값)이 새로운 점수보다 낮으면
                topK[0] = score[i]; // 처음값에 새로운 점수를 덮어 씌움
                Arrays.sort(topK); // 오름차순으로 정렬
            }
            for (int j = 0; j < k; j++) {
                if (topK[j] > -1) { // 최소값을 추가할때 초기화된 -1을 걸러내기 위함.
                    answer[i] = topK[j]; // 답에 최소값을 추가
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        int k = 4;
        int[] result = solution.solution(k, score);
        System.out.println(Arrays.toString(result));
    }
}
