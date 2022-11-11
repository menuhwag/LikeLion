package week8._221111.study.algorithm.secret_map;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            // 비트 or 연산으로 지도 그리기
            int decryption = arr1[i] | arr2[i];
            // 2진 스트링으로 바꾸고 1을 #으로 replace하여 answer에 추가
            // 가장 앞자리가 0일때 문제 발생..!
            String binary = toBinary(decryption, n);
            binary = binary.replace("1", "#").replace("0", " ");
            answer.add(binary);
        }
        return answer.toArray(String[]::new);
    }

    public String toBinary(int n, int displayLen) {
        Stack<Integer> stack = new Stack<>();
        int dec = n;
        while (dec > 0) {
            stack.push(dec % 2);
            dec /= 2;
        }
        StringBuilder answer = new StringBuilder();
        while (displayLen > 0) {
            answer.append((displayLen > stack.size()) ? "0" : stack.pop());
            displayLen--;
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        int n = 6;
//        int[] arr1 = {46, 33, 33 ,22, 31, 50};
//        int[] arr2 = {27 ,56, 19, 14, 14, 10};
//        solution.solution(n, arr1, arr2);
        System.out.println(solution.toBinary(3, 4));
        System.out.println(solution.toBinary(8, 4));
        System.out.println(solution.toBinary(15, 8));
    }
}
