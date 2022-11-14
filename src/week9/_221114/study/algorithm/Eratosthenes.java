package week9._221114.study.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Eratosthenes {
    // 복습
    // n 자기 자신을 제외한 배수를 제거한다.
    // n은 2 이상 (1은 소수가 아니기때문)
    public int[] sortPrimeNumber(int n) {
        int[] mask = new int[n];
        mask[0] = -1;
        for (int i = 2; i * i <= n; i++) {
            for (int j = 2; j * i <= n; j++) {
                mask[i * j - 1] = -1;
            }
        }
        List<Integer> answerList = new ArrayList<>();
        for (int i = 0; i < mask.length; i++) {
            if (mask[i] > -1) answerList.add(i + 1);
        }
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}
