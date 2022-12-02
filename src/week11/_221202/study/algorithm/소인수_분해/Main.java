package week11._221202.study.algorithm.소인수_분해;

import java.util.Scanner;

// 4037
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int div = 2;
        while(num > 1) {
            while (num % div == 0) {
                num /= div;
                System.out.printf("%d ", div);
            }
            div++;
        }
        /*
        * 소수임을 판별할 필요가 없다.
        * 어짜피 2부터 차례대로 나누면서
        * 소수가 아닌 숫자들이 걸러지기때문 like 에라토스테네스의 체
        * */
    }
}
