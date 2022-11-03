package week7._221103.study.algorithm;

public class Eratosthenes {
    public static int countPrimeNumber(int num) {
        int[] check = new int[num];
        // number = index + 1;
        check[0] = -1; // 1 제거
        for (int i = 2; i * i <= num; i++) {
            for (int j = 2; i * j <= num; j++) {
                check[i * j - 1] = -1;
            }
        }
        int count = 0;
        for (int flag : check) {
            if (flag > -1) count++;
        }
        return count;
    }
}
