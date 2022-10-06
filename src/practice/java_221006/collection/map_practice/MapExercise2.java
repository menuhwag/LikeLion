package practice.java_221006.collection.map_practice;

import java.util.HashMap;

public class MapExercise2 {
    public static void main(String[] args) {
        String repo = "https://github.com/menuhwang/LikeLion".toLowerCase();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < repo.length(); i++) {
            if (repo.charAt(i) >= 'a' && repo.charAt(i) <= 'z') {
                map.put(repo.charAt(i), map.getOrDefault(repo.charAt(i), 0) + 1);
            }
        }
        System.out.println(map);
    }
}
