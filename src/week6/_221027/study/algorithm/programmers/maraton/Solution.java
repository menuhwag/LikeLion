package week6._221027.study.algorithm.programmers.maraton;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> hashMap = new HashMap<>();
        for (String person : participant) {
            hashMap.put(person, hashMap.getOrDefault(person, 0) + 1);
        }
        for (String person : completion) {
            if (hashMap.get(person) == 1) hashMap.remove(person);
            else hashMap.put(person, hashMap.get(person) - 1);
        }

        return hashMap.keySet().iterator().next();
    }

    public static void main(String[] args) {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        System.out.println(new week6._221025.study.algorithm.programmers.marathon.Solution().solution(participant,completion)); // vinko
    }
}
