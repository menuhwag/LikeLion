package week6._221028.study.algorithm.programmers.pokemon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {
    public int solution(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        // 포켓몬을 map에 저장
        for (int num : nums) {
            map.put(num, 0); // 포켓몬의 종류별 수보다 종류가 중요함. 따라서 값에 0을 넣음.
        }
        // 총 포켓몬 종류의 수와 내가 가질 수 있는 수를 비교해서
        // 작은 수 만큼 가져감.
        // 총 포켓몬 종류의 수가 내가 가질 수 있는 수보다 작다면, 포켓몬 종류 수 만큼만 가져갈 수 있음 : 최대한 많은 종류를 가져가기 위함.
        // 반대의 경우 가져갈 수 있는 수 만큼 가져갈 수 있음.
        return (map.size() > nums.length / 2) ? nums.length / 2 : map.size();
    }

    public int solutionSet(int[] nums) {
        Set<Integer> pokemonSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        return (pokemonSet.size() > nums.length / 2) ? nums.length / 2 : pokemonSet.size();
    }
}
