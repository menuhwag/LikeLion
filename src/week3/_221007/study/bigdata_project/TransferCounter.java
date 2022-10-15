package week3._221007.study.bigdata_project;

public class TransferCounter {
    private static int[][] counter = new int[17][17];

    public static void increaseCnt(int fromCity, int toCity) {
        counter[fromCity][toCity]++;
    }

    public static int[][] getCounter() {
        return counter;
    }
}
