package week9._221114.study.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Eratosthenes {
    // 복습
    // n 자기 자신을 제외한 배수를 제거한다.
    // n은 2 이상 (1은 소수가 아니기때문)
    public int[] sortPrimeNumber(int n) {
        int[] numbers = new int[n - 1];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 2;
        }
        for (int i = 2; i * i <= n; i++) {
            for (int j = 2; j * i <= n; j++) {
                numbers[i * j - 2] = -1;
            }
        }
        return Arrays.stream(numbers).filter(num -> num > 0).toArray();
    }
}
