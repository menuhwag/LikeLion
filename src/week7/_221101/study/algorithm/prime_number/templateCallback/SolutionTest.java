package week7._221101.study.algorithm.prime_number.templateCallback;

public class SolutionTest {
    public static void main(String[] args) {
        int[] cases = {12, 13, 17, 19, 23, 25};
        PrimeNumberSolution solution1 = new PrimeNumberSolution();

        for (int num : cases) {
            System.out.printf("[Solution1] %d : %s\n", num, solution1.isPrime1(num));
            System.out.printf("[Solution2] %d : %s\n", num, solution1.isPrime2(num));
            System.out.printf("[Solution3] %d : %s\n", num, solution1.isPrime3(num));
            System.out.println();
        }
    }
}
