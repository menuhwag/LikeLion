package practice.java_221007.bigdata_project_refactor.service;

import practice.java_221007.bigdata_project_refactor.chart.Categories;
import practice.java_221007.bigdata_project_refactor.chart.Data;
import practice.java_221007.bigdata_project_refactor.chart.HeatmapChart;
import practice.java_221007.bigdata_project_refactor.context.ReadLineContext;
import practice.java_221007.bigdata_project_refactor.context.TransferHistoryCounter;
import practice.java_221007.bigdata_project_refactor.enumeration.City;
import practice.java_221007.bigdata_project_refactor.domain.TransferHistory;

import java.util.ArrayList;
import java.util.List;

public class TransferHistoryAnalyzer {
    private final ReadLineContext<TransferHistory> readLineContext;
    private final TransferHistoryCounter counter;
    public TransferHistoryAnalyzer(ReadLineContext<TransferHistory> readLineContext, TransferHistoryCounter counter) {
        this.readLineContext = readLineContext;
        this.counter = counter;
    }

    public List<TransferHistory> getListByFromAndTo(City fromCity, City toCity) {
        List<TransferHistory> result = new ArrayList<>();
        for (TransferHistory history : readLineContext.readByLine()) {
            if (history.getFromCity() == fromCity && history.getToCity() == toCity) {
                result.add(history);
            }
        }
        return result;
    }

    public List<TransferHistory> getTransferHistories() {
        return readLineContext.readByLine();
    }

    public int[][] count(List<TransferHistory> list) {
        counter.clear();
        for (TransferHistory history : list) {
            counter.increase(history.getFromCity(), history.getToCity());
        }
        return counter.getCount();
    }

    public void saveHeatmapJson(String filename) {
        List<TransferHistory> find = getTransferHistories();

        HeatmapChart heatmapChart = new HeatmapChart();

        Categories categories = new Categories();
        for (City city : City.values()) {
            categories.add(city.getName());
        }
        heatmapChart.setxAxis(categories);
        heatmapChart.setyAxis(categories);

        Data data = new Data();
        for (int i = 0; i < City.values().length; i++) {
            for (int j = 0; j < City.values().length; j++) {
                int[] value = {i, j, count(find)[i][j]};
                data.add(value);
            }
        }

        heatmapChart.setData(data);

        heatmapChart.save(filename);
    }
}
