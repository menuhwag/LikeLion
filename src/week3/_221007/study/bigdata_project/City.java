package week3._221007.study.bigdata_project;

import java.util.ArrayList;
import java.util.List;

public enum City {
    SEOUL("서울특별시", 11, 0),
    BUSAN("부산광역시", 26, 1),
    DAEGU("대구광역시", 27, 2),
    INCHEON("인천광역시", 28, 3),
    GWANGJU("광주광역시", 29, 4),
    DAEJEON("대전광역시", 30, 5),
    ULSAN("울산광역시", 31, 6),
    JEJONG("세종특별자치시", 36, 7),
    GYEONGGI("경기도", 41, 8),
    GANGWON("강원도", 42, 9),
    CHUNGBUK("충청북도", 43, 10),
    CHUNGNAM("충청남도", 44, 11),
    JUNBUK("전라북도", 45, 12),
    JUNNAM("전라남도", 46, 13),
    GYEONGBUK("경상북도", 47, 14),
    GYEONGNAM("경상남도", 48, 15),
    JEJU("제주특별자치도", 50, 16);

    private static final City[] VALUES;

    static {
        VALUES = values();
    }

    private final String name;
    private final int code;
    private final int index;

    City(String name, int code, int index) {
        this.name = name;
        this.code = code;
        this.index = index;
    }

    public static City codeOf(int code) {
        for (City city : VALUES) {
            if (city.code == code) {
                return city;
            }
        }
        throw new IllegalArgumentException("No matching constant for [" + code + "]");
    }

    public static City indexOf(int index) {
        for (City city : VALUES) {
            if (city.index == index) {
                return city;
            }
        }
        throw new IllegalArgumentException("No matching constant for [" + index + "]");
    }

    public String getName() {
        return name;
    }

    public static List<String> getNames() {
        List<String> result = new ArrayList<>();
        for (City city : VALUES) {
            result.add(city.getName());
        }
        return result;
    }

    public int getCode() {
        return code;
    }

    public int getIndex() {
        return index;
    }
}
