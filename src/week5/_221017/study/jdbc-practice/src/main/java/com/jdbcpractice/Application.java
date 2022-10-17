package com.jdbcpractice;

import java.util.Map;

public class Application {
    public static void main(String[] args) throws Exception{
        HospitalDao hospitalDao = new HospitalDao();

        hospitalDao.add("D1000000", "인천광역시 남동구 구월동", "사랑내과");
        Map<String, Object> hospital = hospitalDao.findById("D1000000");

        for (String key : hospital.keySet()) {
            System.out.printf("%s=%s\n", key, hospital.get(key));
        }
    }
}
