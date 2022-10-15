package week3._221007.study.bigdata_project_refactor.parser;

import week3._221007.study.bigdata_project_refactor.enumeration.City;
import week3._221007.study.bigdata_project_refactor.domain.TransferHistory;
import week3._221007.study.bigdata_project_refactor.context.Parser;

public class TransferHistoryParser implements Parser<TransferHistory> {
    @Override
    public TransferHistory parse(String str) {
        String[] arr = str.split(",");
        City toCity = City.codeOf(Integer.parseInt(arr[0]));
        City fromCity = City.codeOf(Integer.parseInt(arr[6]));
        return new TransferHistory(toCity, fromCity);
    }
}
