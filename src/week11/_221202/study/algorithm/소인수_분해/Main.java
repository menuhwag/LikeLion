package week11._221202.study.algorithm.소인수_분해;

import java.util.Scanner;

// 4037
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int div = 2;
        while(num > 1) {
            if (isPrime(div)) {
                while (num % div == 0) {
                    num /= div;
                    System.out.printf("%d ", div);
                }
            }
            div++;
        }
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
