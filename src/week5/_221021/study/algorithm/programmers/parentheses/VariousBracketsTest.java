package week5._221021.study.algorithm.programmers.parentheses;

public class VariousBracketsTest {
    public static void main(String[] args) {
        VariousBrackets variousBrackets = new VariousBrackets();

        String case1 = "{}()[](({))"; // false
        String case2 = "{}()[](({}))"; // true
        String case3 = "{}(][]"; // false
        String case4 = "{([(]))}"; // false

//        System.out.println(variousBrackets.solution1(case1));
//        System.out.println(variousBrackets.solution1(case2));
//        System.out.println(variousBrackets.solution1(case3));
//        System.out.println(variousBrackets.solution1(case4)); 실패!

        System.out.println(variousBrackets.solution2(case1));
        System.out.println(variousBrackets.solution2(case2));
        System.out.println(variousBrackets.solution2(case3));
        System.out.println(variousBrackets.solution2(case4));
    }
}
