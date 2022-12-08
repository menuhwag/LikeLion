package week12._221208.study.algorithm.dynamic_programming;

public class Fibonacci {
    private static boolean[] marker;
    private static int[] memo;

    public static int calculate1(int num) {
        marker = new boolean[num];
        memo = new int[num];
        return fibonacci1(num);
    }

    private static int fibonacci1(int num) {
        if (num <= 2) {
            marker[num - 1] = true;
            memo[num - 1] = 1;
            return 1;
        }
        if (marker[num - 1]) return memo[num - 1];
        marker[num - 1] = true;
        memo[num - 1] = fibonacci1(num - 1) + fibonacci1(num - 2);
        return memo[num - 1];
    }

    public static int fibonacci2(int num) {
        if (num <= 2) return 1;
        return fibonacci2(num - 1) + fibonacci2(num - 2);
    }

    public static void main(String[] args) {
        long start;
        long end;
        start = System.currentTimeMillis();
        System.out.println(Fibonacci.calculate1(46));
        end = System.currentTimeMillis();
        System.out.printf("DP : %dms\n", end - start);

        start = System.currentTimeMillis();
        System.out.println(Fibonacci.fibonacci2(46));
        end = System.currentTimeMillis();
        System.out.printf("DP : %dms\n", end - start);
    }
}
