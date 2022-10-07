package practice.java_221007.bigdata_project_refactor.chart;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HeatmapChart {
    private Categories xAxis;
    private Categories yAxis;
    private Data data;

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
        return "{\n" +
                "\"xAxis\" : " + xAxis +
                ",\n\"yAxis\" : " + yAxis +
                ",\n\"data\" : " + data +
                "\n}";
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
