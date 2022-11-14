package week9._221114.study.algorithm;

import java.util.Arrays;

public class EratosthenesTest {
    public static void main(String[] args) {
        Eratosthenes eratosthenes = new Eratosthenes();
        int[] primeNumber = eratosthenes.sortPrimeNumber(50);
        System.out.println(Arrays.toString(primeNumber));
    }
}
