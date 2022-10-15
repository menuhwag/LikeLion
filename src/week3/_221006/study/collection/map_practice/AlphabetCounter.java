package week3._221006.study.collection.map_practice;

import java.util.HashMap;

public class AlphabetCounter {
    private String str;
    private HashMap<Character, Integer> alphabetCount;

    public AlphabetCounter(String str) {
        this.str = str.toLowerCase();
        this.alphabetCount = new HashMap<>();
        countAlphabet();
    }

    public HashMap<Character, Integer> getAlphabetCount() {
        return alphabetCount;
    }

    private void countAlphabet() {
        for (int i = 0; i < str.length(); i++) { // str 길이만큼 반복
            if (isAlphabet(str.charAt(i))) { // 알파벳인지 아닌지 구분
                alphabetCount.put(str.charAt(i), alphabetCount.getOrDefault(str.charAt(i), 0) + 1);
                // getOrDefault로 값을 가져온다, 없으면 0을 리턴해준다.
                // 그리고 +1 한 값으로 설정해준다.
            }
        }
    }

    private boolean isAlphabet(char ch) { // 알파벳인지 아닌지 구분
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }
}
