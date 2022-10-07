package practice.java_221007.bigdata_project;

public class TransferCounter {
    private static int[][] counter = new int[51][51];

    public static void increaseCnt(int fromCity, int toCity) {
        counter[fromCity][toCity]++;
    }

    public static int[][] getCounter() {
        return counter;
    }
}
