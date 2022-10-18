package com.jdbcpractice;

import com.jdbcpractice.dao.HospitalDao;
import com.jdbcpractice.dao.MySqlConnector;
import com.jdbcpractice.dao.SqlConnector;

import java.util.Map;

public class Application {
    public static void main(String[] args) throws Exception{
        SqlConnector mysqlConnector = new MySqlConnector();
        HospitalDao hospitalDao = new HospitalDao(mysqlConnector);

        hospitalDao.add("D1000000", "인천광역시 남동구 구월동", "사랑내과");
        Map<String, Object> hospital = hospitalDao.findById("D1000000");

        for (String key : hospital.keySet()) {
            System.out.printf("%s=%s\n", key, hospital.get(key));
        }
    }
}
