package week3._221006.study.collection.set_practice;

import java.util.HashSet;
import java.util.Set;

public class RndNumberWithoutDuplicated {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        Set<Integer> setInteger = new HashSet<>();
        for (int i = 0; i < 50; i++) {
            setInteger.add(randomNumberGenerator.generate(50));
        }
        System.out.println("Set 개수 : " + setInteger.size());
        System.out.println(setInteger);
    }
}
