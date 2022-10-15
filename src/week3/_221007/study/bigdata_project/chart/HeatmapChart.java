package week3._221007.study.bigdata_project.chart;

import java.io.*;

public class HeatmapChart {
    private Text title;
    private Categories xAxis;
    private Categories yAxis;
    private Data data;

    public void setTitle(Text title) {
        this.title = title;
    }

    public void setxAxis(Categories xAxis) {
        this.xAxis = xAxis;
    }

    public void setyAxis(Categories yAxis) {
        this.yAxis = yAxis;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
                "\"title\" : " + title +
                ", \"xAxis\" : " + xAxis +
                ", \"yAxis\" : " + yAxis +
                ", \"data\" : " + data +
                '}';
    }

    public void save(String filename) {
        File file = new File(filename);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(toString());
            writer.close();
            System.out.println("파일 저장 완료!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
