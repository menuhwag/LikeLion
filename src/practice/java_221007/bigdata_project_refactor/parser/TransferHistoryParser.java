package practice.java_221007.bigdata_project_refactor.parser;

import practice.java_221007.bigdata_project_refactor.enumeration.City;
import practice.java_221007.bigdata_project_refactor.domain.TransferHistory;
import practice.java_221007.bigdata_project_refactor.context.Parser;

public class TransferHistoryParser implements Parser<TransferHistory> {
    @Override
    public TransferHistory parse(String str) {
        String[] arr = str.split(",");
        City toCity = City.codeOf(Integer.parseInt(arr[0]));
        City fromCity = City.codeOf(Integer.parseInt(arr[6]));
        return new TransferHistory(toCity, fromCity);
    }
}
