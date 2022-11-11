package week8._221111.study.algorithm.secret_map;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            // 비트 or 연산으로 지도 그리기
            int decryption = arr1[i] | arr2[i];
            // 2진 스트링으로 바꾸고 1을 #으로 replace하여 answer에 추가
            // 가장 앞자리가 0일때 문제 발생..!
            answer.add(Integer.toBinaryString(decryption).replaceAll("1", "#").replaceAll("0", " "));
        }
        return answer.toArray(String[]::new);
    }
}
