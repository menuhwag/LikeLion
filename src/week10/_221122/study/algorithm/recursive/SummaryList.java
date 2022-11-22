package week10._221122.study.algorithm.recursive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SummaryList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(7, 3, 2, 9));
        int sum = SummaryList.summary(list);
        System.out.println(sum);
    }

    private static int summary(List<Integer> list) {
        if (list.isEmpty()) return 0;
        return list.remove(list.size() - 1) + summary(list);
    }
}
