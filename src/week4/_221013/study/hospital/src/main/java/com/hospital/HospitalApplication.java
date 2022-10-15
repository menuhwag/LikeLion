package com.hospital;

import com.hospital.context.ReadLineContext;
import com.hospital.domain.Hospital;
import com.hospital.parser.HospitalParser;
import com.hospital.parser.Parser;

import java.util.List;
import java.util.stream.Collectors;

public class HospitalApplication {
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
