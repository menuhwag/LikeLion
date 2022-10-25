package week6._221025.study.algorithm.programmers.pokemon;

import java.util.*;
import static java.util.stream.Collectors.toSet;

public class Solution {
    public int solution1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, 0);
        }
        return Math.min(map.keySet().size(), nums.length / 2);
    }

    public int solution2(int[] nums) {
        Set<Integer> pokemonSet = Arrays.stream(nums).boxed().collect(toSet());
        return Math.min(pokemonSet.size(), nums.length / 2);
    }
}
