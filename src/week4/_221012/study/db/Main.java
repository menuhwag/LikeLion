package week4._221012.study.db;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("한글");
        Parser<Hospital> parser = new HospitalParser();
        ReadLineContext<Hospital> readLineContext = new ReadLineContext<>(parser);

        List<Hospital> list = readLineContext.toList("seoul_hospital_info.csv");

        List<String> values = list.stream().map(Hospital::getValue).collect(Collectors.toList());

        StringBuilder sql = new StringBuilder();
        sql.append(Hospital.INSERT_INTO_SQL)
                .append("VALUES\n")
                .append(String.join(",\n", values))
                .append(";");

        readLineContext.save("seoul_hospital.sql", sql.toString());
    }
}
