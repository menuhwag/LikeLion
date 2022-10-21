package week5._221021.study.algorithm.programmers.parentheses;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String case1 = "()()";
        String case2 = "(())()";
        String case3 = ")()(";
        String case4 = "(()(";

        System.out.println(solution.solution(case1)); // true
        System.out.println(solution.solution(case2)); // true
        System.out.println(solution.solution(case3)); // false
        System.out.println(solution.solution(case4)); // false

        System.out.println(solution.solution2(case1)); // true
        System.out.println(solution.solution2(case2)); // true
        System.out.println(solution.solution2(case3)); // false
        System.out.println(solution.solution2(case4)); // false

        System.out.println(solution.solution3(case1)); // true
        System.out.println(solution.solution3(case2)); // true
        System.out.println(solution.solution3(case3)); // false
        System.out.println(solution.solution3(case4)); // false
    }
}
