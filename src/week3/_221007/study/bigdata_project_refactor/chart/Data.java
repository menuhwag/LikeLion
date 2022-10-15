package week3._221007.study.bigdata_project_refactor.chart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Data {
    private List<int[]> data = new ArrayList<>();

    public void add(int[] data) {
        if (data.length != 3) throw new IllegalArgumentException("배열의 길이가 3이 아닙니다.");
        this.data.add(data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int[] value : data) {
            sb.append(Arrays.toString(value));
            sb.append(",");
        }
        sb.deleteCharAt(sb.toString().length()-1);
        sb.append("]");
        return "{" +
                "\"data\" : " + sb +
                '}';
    }
}
