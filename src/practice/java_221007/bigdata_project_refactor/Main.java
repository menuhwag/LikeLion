package practice.java_221007.bigdata_project_refactor;

import practice.java_221007.bigdata_project_refactor.chart.Categories;
import practice.java_221007.bigdata_project_refactor.chart.Data;
import practice.java_221007.bigdata_project_refactor.chart.HeatmapChart;
import practice.java_221007.bigdata_project_refactor.context.Parser;
import practice.java_221007.bigdata_project_refactor.context.ReadLineContext;
import practice.java_221007.bigdata_project_refactor.context.TransferHistoryCounter;
import practice.java_221007.bigdata_project_refactor.enumeration.City;
import practice.java_221007.bigdata_project_refactor.domain.TransferHistory;
import practice.java_221007.bigdata_project_refactor.parser.TransferHistoryParser;
import practice.java_221007.bigdata_project_refactor.service.TransferHistoryAnalyzer;

import java.util.Arrays;
import java.util.List;

public class Main {
    final static String FILENAME = "2021_20220927_66125.csv";

    public static void main(String[] args) {
        new Main().test04();
    }

    public void test01() {
        /*
        List 초기화 후 다시 값을 요청했을 경우
        (readLine -> 객체 생성 -> 리스트에 추가) 과정을 반복하지 않고 이미 초기화 되어있는 값을 반환
        */
        Parser<TransferHistory> parser = new TransferHistoryParser();
        TransferHistoryCounter counter = new TransferHistoryCounter();
        ReadLineContext<TransferHistory> readLineContext = new ReadLineContext<>(parser, FILENAME);
        TransferHistoryAnalyzer analyzer = new TransferHistoryAnalyzer(readLineContext, counter);

        long start = System.currentTimeMillis();

        List<TransferHistory> find = analyzer.getTransferHistories();

        System.out.println("총 건수 : " + find.size());
        long lab1 = System.currentTimeMillis();
        System.out.println("초기화 : " + (lab1 - start) + "ms");

        List<TransferHistory> find2 = analyzer.getTransferHistories();
        System.out.println("총 건수 : " + find2.size());
        long lab2 = System.currentTimeMillis();

        System.out.println("재로딩 : " + (lab2 - lab1) + "ms");
    }

    public void test02() {
        /*
        getListByFromAndTo(City.SEOUL, City.GYEONGGI)
        전출 도시, 전입 도시 인자에 부합하는 List 반환
        */
        Parser<TransferHistory> parser = new TransferHistoryParser();
        TransferHistoryCounter counter = new TransferHistoryCounter();
        ReadLineContext<TransferHistory> readLineContext = new ReadLineContext<>(parser, FILENAME);
        TransferHistoryAnalyzer analyzer = new TransferHistoryAnalyzer(readLineContext, counter);

        long start = System.currentTimeMillis();
        List<TransferHistory> find = analyzer.getListByFromAndTo(City.SEOUL, City.GYEONGGI);

        System.out.println("총 건수 : " + find.size());
        System.out.println("소요시간 : " + (System.currentTimeMillis() - start) + "ms");
    }

    public void test03() {
        Parser<TransferHistory> parser = new TransferHistoryParser();
        TransferHistoryCounter counter = new TransferHistoryCounter();
        ReadLineContext<TransferHistory> readLineContext = new ReadLineContext<>(parser, FILENAME);
        TransferHistoryAnalyzer analyzer = new TransferHistoryAnalyzer(readLineContext, counter);

        List<TransferHistory> find = analyzer.getTransferHistories();

        int[][] count = analyzer.count(find);

        for (int[] row : count) {
            System.out.println(Arrays.toString(row));
        }
    }

    public void test04() {
        Parser<TransferHistory> parser = new TransferHistoryParser();
        TransferHistoryCounter counter = new TransferHistoryCounter();
        ReadLineContext<TransferHistory> readLineContext = new ReadLineContext<>(parser, FILENAME);
        TransferHistoryAnalyzer analyzer = new TransferHistoryAnalyzer(readLineContext, counter);

        analyzer.saveHeatmapJson("heatmap.json");
    }
}
