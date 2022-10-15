package week3._221007.study.bigdata_project;

import week3._221007.study.bigdata_project.chart.Categories;
import week3._221007.study.bigdata_project.chart.Data;
import week3._221007.study.bigdata_project.chart.HeatmapChart;
import week3._221007.study.bigdata_project.chart.Text;

import java.util.ArrayList;
import java.util.List;

public class TransferHistoryAnalyzer {
    private List<TransferHistory> transferHistories;

    public TransferHistoryAnalyzer(List<TransferHistory> transferHistories) {
        this.transferHistories = transferHistories;
    }

    public List<TransferHistory> getTransferHistoriesByCity(City fromCity, City toCity) {
        List<TransferHistory> result = new ArrayList<>();
        for (TransferHistory transferHistory : this.transferHistories) {
            if (transferHistory.getFromCity() == fromCity && transferHistory.getToCity() == toCity) {
                result.add(transferHistory);
            }
        }
        return result;
    }

    public int getTransferHistoriesCountByCity(City fromCity, City toCity) {
        return TransferCounter.getCounter()[fromCity.getIndex()][toCity.getIndex()];
    }

    public void populationTransferCity() {
        int fromIdx = 0;
        int toIdx = 0;
        int maxCount = -1;
        for (int i = 0; i < TransferCounter.getCounter().length; i++) {
            for (int j = 0; j < TransferCounter.getCounter()[i].length; j++) {
                if (maxCount < TransferCounter.getCounter()[i][j]) {
                    maxCount = TransferCounter.getCounter()[i][j];
                    fromIdx = i;
                    toIdx = j;
                }
            }
        }
        System.out.printf("가장 많은 전입전출\n전출 도시 : %s\n전입 도시 : %s\n", City.indexOf(fromIdx).getName(), City.indexOf(toIdx).getName());
    }

    public HeatmapChart toChart() {
        HeatmapChart chart = new HeatmapChart();
        chart.setTitle(new Text("인구 이동 데이터 분석"));

        Categories categories = new Categories();
        categories.setCategories(City.getNames());

        chart.setxAxis(categories);
        chart.setyAxis(categories);

        Data data = new Data();
        for (int i = 0; i < TransferCounter.getCounter().length; i++) {
            for (int j = 0; j < TransferCounter.getCounter()[i].length; j++) {
                int[] value = new int[3];
                value[0] = i;
                value[1] = j;
                value[2] = TransferCounter.getCounter()[i][j];
                data.add(value);
            }
        }

        chart.setData(data);

        return chart;
    }


}
