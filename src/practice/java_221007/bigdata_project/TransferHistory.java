package practice.java_221007.bigdata_project;

public class TransferHistory {
    private City toCity;
    private int toSigungu;
    private int toDong;
    private int year;
    private int month;
    private int day;
    private City fromCity;
    private int fromSido;
    private int fromDong;

    private TransferHistory(int toCity, int toSigungu, int toDong, int year, int month, int day, int fromCity, int fromSido, int fromDong) {
        this.toCity = City.codeOf(toCity);
        this.toSigungu = toSigungu;
        this.toDong = toDong;
        this.year = year;
        this.month = month;
        this.day = day;
        this.fromCity = City.codeOf(fromCity);
        this.fromSido = fromSido;
        this.fromDong = fromDong;
    }

    private TransferHistory(String toCity, String toSigungu, String toDong, String year, String month, String day, String fromCity, String fromSido, String fromDong) {
        this(Integer.parseInt(toCity),
            Integer.parseInt(toSigungu),
            Integer.parseInt(toDong),
            Integer.parseInt(year),
            Integer.parseInt(month),
            Integer.parseInt(day),
            Integer.parseInt(fromCity),
            Integer.parseInt(fromSido),
            Integer.parseInt(fromDong));
    }

    public static TransferHistory parse(String data) {
        String[] dataArr = data.split(",");
        return new TransferHistory(dataArr[0],
                                    dataArr[1],
                                    dataArr[2],
                                    dataArr[3],
                                    dataArr[4],
                                    dataArr[5],
                                    dataArr[6],
                                    dataArr[7],
                                    dataArr[8]);
    }

    public City getToCity() {
        return toCity;
    }

    public int getToSigungu() {
        return toSigungu;
    }

    public int getToDong() {
        return toDong;
    }

    public City getFromCity() {
        return fromCity;
    }

    public int getFromSido() {
        return fromSido;
    }

    public int getFromDong() {
        return fromDong;
    }

    @Override
    public String toString() {
        return "TransferHistory{" +
                "moveInCity=" + toCity +
                ", moveInState=" + toSigungu +
                ", moveInAddress=" + toDong +
                ", year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", moveOutCity=" + fromCity +
                ", moveOutState=" + fromSido +
                ", moveOutAddress=" + fromDong +
                '}';
    }
}
