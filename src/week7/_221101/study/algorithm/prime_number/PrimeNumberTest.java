package week7._221101.study.algorithm.prime_number;

public class PrimeNumberTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] cases = {13, 17, 19, 23, 25};
        for (int num : cases) {
            System.out.printf("[Solution1] %d : %s\n", num, solution.solution1(num));
            System.out.printf("[Solution2] %d : %s\n", num, solution.solution2(num));
            System.out.printf("[Solution3] %d : %s\n", num, solution.solution3(num));
            System.out.println();
        }
    }
}
