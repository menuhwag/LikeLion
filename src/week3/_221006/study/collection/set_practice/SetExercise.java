package week3._221006.study.collection.set_practice;

import java.util.HashSet;
import java.util.Set;

public class SetExercise {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("황민우");
        set1.add("황민우");
        set1.add("신짱구");
        System.out.println(set1);

        Set<Integer> setInteger = new HashSet<>();
        setInteger.add(1);
        setInteger.add(1);
        setInteger.add(2);
        setInteger.add(3);
        System.out.println(setInteger);
    }
}
