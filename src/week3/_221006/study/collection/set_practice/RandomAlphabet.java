package week3._221006.study.collection.set_practice;

import java.util.HashSet;
import java.util.Set;

public class RandomAlphabet {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        Set<Character> setChar = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            setChar.add((char) randomNumberGenerator.generate(26, 65));
        }
        System.out.println(setChar);
    }
}
