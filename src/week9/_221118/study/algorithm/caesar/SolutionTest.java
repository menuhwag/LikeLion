package week9._221118.study.algorithm.caesar;

public class SolutionTest {
    public static void main(String[] args) {
        String case1 = "ABC";
        String case2 = "A B C";
        String case3 = "a G z";
        String case4 = "A   h  Z b";
        String case5 = "a b c d Z";

        Solution solution = new Solution();

        System.out.println(solution.solution(case1, 1));
        System.out.println(solution.solution(case1, 3));
        System.out.println(solution.solution(case2, 1));
        System.out.println(solution.solution(case2, 5));
        System.out.println(solution.solution(case3, 3));
        System.out.println(solution.solution(case4, 3));
        System.out.println(solution.solution(case5, 25));
    }
}
