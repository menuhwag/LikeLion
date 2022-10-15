package week3._221007.study.bigdata_project;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        // [36, 41, 42, 11, 43, 44, 45, 46, 47, 48, 50, 26, 27, 28, 29, 30, 31]
        final String FILENAME = "2021_20220927_66125.csv";
        long start = System.currentTimeMillis(); // 타이머 시작

        TransferHistoryFileReader transferHistoryFileReader = new TransferHistoryFileReader(FILENAME); // 인구 이동 File 핸들러

        List<TransferHistory> transferHistories = transferHistoryFileReader.toList(); // 인구 이동 전체 리스트

        System.out.println(System.currentTimeMillis() - start + "ms"); // 타이머 종료 출력

        System.out.printf("전체 인구 이동 건수 : %d\n", transferHistories.size());

        TransferHistoryAnalyzer transferHistoryAnalyzer = new TransferHistoryAnalyzer(transferHistories); // 인구 이동 분석기 초기화

        transferHistoryAnalyzer.toChart().save("heatmap.json");
//        City fromCity = City.SEOUL;
//        City toCity = City.BUSAN;
//        List<TransferHistory> getTransferHistories서울To부산 = transferHistoryAnalyzer.getTransferHistoriesByCity(fromCity, toCity); // 인구 이동 분석 서울에서 부산으로 이동.
//
//        System.out.println(getTransferHistories서울To부산.size() + "건"); // 11에서 50으로 이동 건수 출력.
//
//        transferHistoryAnalyzer.populationTransferCity(); // 가장 이동이 많은 전입 전출 도시 코드 출력.


//        for (int[] arr : TransferCounter.getCounter()) { // TransferCounter 출력
//            System.out.println(Arrays.toString(arr));
//        }

//        Set<Integer> cityCode = new HashSet<>(); // 도시 코드 출력
//        for (TransferHistory transferHistory : transferHistories) {
//            cityCode.add(transferHistory.getFromCity());
//            cityCode.add(transferHistory.getToCity());
//        }
//        System.out.println(cityCode); // [36, 41, 42, 11, 43, 44, 45, 46, 47, 48, 50, 26, 27, 28, 29, 30, 31]
    }
}
