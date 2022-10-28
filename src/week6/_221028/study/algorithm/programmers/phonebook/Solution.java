package week6._221028.study.algorithm.programmers.phonebook;

import java.util.HashSet;

public class Solution {
    public boolean solution(String[] phone_book) {
        HashSet<String> hs = new HashSet<>();

        for (String phoneNum : phone_book) {
            hs.add(phoneNum);
        }

        for (String phoneNum : phone_book) { // 왜 이게 O(N^2) 이 아닌가 phone_book 최대 100만
            for (int i = 0; i < phoneNum.length(); i++) { // 전화번호의 최대 길이는 20 이기 때문에
                if (hs.contains(phoneNum.substring(0, i))) return false;
            }
        }

        return true;
    }

    /*
    * O(N^2)으로 코딩하면
    * phone_book 으로 반복 // 100만
    * phone_book 으로 반복 // 100만
    * indexOf로 판별 // 100만 * 100만
    * */
}
