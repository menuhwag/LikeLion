package week7._221101.study.algorithm.prime_number.templateCallback;

public abstract class AbstractPrimeNumber {
    protected boolean isPrime(int num, LoopLimit loopLimit) {
        for (int i = 2; i < loopLimit.limit(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
