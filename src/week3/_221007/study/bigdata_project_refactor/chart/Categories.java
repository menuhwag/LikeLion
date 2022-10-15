package week3._221007.study.bigdata_project_refactor.chart;

import java.util.ArrayList;
import java.util.List;

public class Categories {
    private List<String> categories = new ArrayList<>();

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public void add(String category) {
        this.categories.add(category);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(String name : categories) {
            sb.append("\"");
            sb.append(name);
            sb.append("\",");
        }
        sb.deleteCharAt(sb.toString().length()-1);
        sb.append("]");
        return "{" +
                "\"categories\" : " + sb +
                '}';
    }
}
