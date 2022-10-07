package practice.java_221007.bigdata_project.chart;

public class Text {
    private String text;

    public Text(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "{" +
                "\"text\" : '" + text + '\'' +
                '}';
    }
}
