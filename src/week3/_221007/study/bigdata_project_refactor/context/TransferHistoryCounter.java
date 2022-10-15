package week3._221007.study.bigdata_project_refactor.context;

import week3._221007.study.bigdata_project_refactor.enumeration.City;

public class TransferHistoryCounter {
    private static int arrSize = City.values().length;
    private int[][] count = new int[arrSize][arrSize];

    public void increase(City fromCity, City toCity) {
        count[fromCity.getIndex()][toCity.getIndex()]++;
    }

    public void clear() {
        count = new int[arrSize][arrSize];
    }

    public int[][] getCount() {
        return count;
    }
}
