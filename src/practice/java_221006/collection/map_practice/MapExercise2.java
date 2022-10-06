package practice.java_221006.collection.map_practice;

import java.util.HashMap;

public class MapExercise2 {
    public static void main(String[] args) {
        String repo = "https://github.com/menuhwang/LikeLion".toLowerCase(); // 대문자를 소문자로 변환
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < repo.length(); i++) { // repo 길이만큼 반복
            if (isAlphabet(repo.charAt(i))) { // 알파벳인지 아닌지 구분
                map.put(repo.charAt(i), map.getOrDefault(repo.charAt(i), 0) + 1);
                // getOrDefault로 값을 가져온다, 없으면 0을 리턴해준다.
                // 그리고 +1 한 값으로 설정해준다.
            }
        }
        System.out.println(map);
    }

    public static boolean isAlphabet(char ch) { // 알파벳인지 아닌지 구분
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }
}
