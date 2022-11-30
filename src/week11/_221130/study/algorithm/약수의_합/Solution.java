package week11._221130.study.algorithm.약수의_합;

public class Solution {
    public static int solution(int n) {
        int answer = 0;
        int div = 1;
        while(div <= Math.sqrt(n)) {
            if (n % div == 0) {
                if (div == n / div) {
                    answer += div;
                    break;
                }
                answer += div;
                answer += n / div;
            }
            div++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(12));
        System.out.println(solution(5));
    }
}
