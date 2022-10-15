package week3._221007.study.bigdata_project_refactor.domain;

import week3._221007.study.bigdata_project_refactor.enumeration.City;

public class TransferHistory {
    private City toCity;
    private City fromCity;

    public TransferHistory(City toCity, City fromCity) {
        this.toCity = toCity;
        this.fromCity = fromCity;
    }

    public City getFromCity() {
        return fromCity;
    }

    public City getToCity() {
        return toCity;
    }

    @Override
    public String toString() {
        return "TransferHistory{" +
                "toCity=" + toCity +
                ", fromCity=" + fromCity +
                '}';
    }
}
