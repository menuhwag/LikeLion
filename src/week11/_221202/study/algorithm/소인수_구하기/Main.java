package week11._221202.study.algorithm.소인수_구하기;

import java.util.Scanner;

// 2203
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        long temp = num;
        long answer=1L;

        for (long div = 2L; div * div < num; div++) { // 반복문 범위를 제곱근으로 줄였습니다.
            /* 실험.
            * 루트 80억은 약 8만 9천 4백
            * div를 int로 바꿀 수 있지 않을까해서 int로 바꾸고 채점해보았다.
            * 그러나 시간 초과 발생.
            * 아무래도 캐스팅하는데 시간이 오래 걸리는것 같다.
            * */
            while (temp % div == 0L) { // 나머지 없이 딱 나누어 떨어진다면
                temp /= div; // 몫으로 덮어쓰고
                answer = div; // 나눈 값을 저장합니다.
            }
        }
        // 반복문의 범위를 제곱근으로 제한해두다보니
        // 58 같이 제곱근 범위 밖에 소수가 남는 경우가 있었습니다.
        // 따라서 temp에 남은 소수와 answer를 비교하여 큰 수를 출력하게 했습니다.
        System.out.println(Math.max(answer, temp));
    }
}
