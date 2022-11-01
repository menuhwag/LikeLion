package week7._221101.study.algorithm.prime_number.templateCallback;

public class PrimeNumberSolution extends AbstractPrimeNumber {
    public boolean isPrime1(int num) {
        return super.isPrime(num, (index, number) ->  index < number);
    }

    public boolean isPrime2(int num) {
        return super.isPrime(num, (index, number) -> index <= number / 2);
    }

    public boolean isPrime3(int num) {
        return super.isPrime(num, (index, number) -> index * index <= number);
    }
}
