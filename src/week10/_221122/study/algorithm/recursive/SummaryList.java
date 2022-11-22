package week10._221122.study.algorithm.recursive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SummaryList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(7, 3, 2, 9));
        int sum = SummaryList.summary(list, 0);
        System.out.println(sum);
    }

    private static int summary(List<Integer> list, int init) {
        if (list.isEmpty()) return init;
        int element = list.remove(list.size() - 1);
        return summary(list, init + element);
    }
}
