package week8._221108.study.algorithm.simple_search;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (numbers[i] == k) {
                index = i + 1;
                break;
            }
        }
        System.out.println(index);
    }
}
