package week7._221101.study.algorithm.prime_number.templateCallback;

public abstract class AbstractPrimeNumber {
    protected boolean isPrime(int num, StatementStrategy statementStrategy) {
        for (int i = 2; statementStrategy.compare(i, num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
