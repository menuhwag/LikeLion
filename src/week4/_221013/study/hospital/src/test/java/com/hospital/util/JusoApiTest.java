package com.hospital.util;

import com.hospital.dto.juso.Juso;
import com.hospital.dto.juso.JusoDTO;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JusoApiTest {
    private final String API_KEY = "";
    private final JusoApi jusoApi = new JusoApi(API_KEY);
    @Test
    void search() {
        JusoDTO jusoDTO = jusoApi.search("한국전력");
        System.out.println(jusoDTO);
        List<Juso> jusos = jusoDTO.getResults().getJuso();

        Juso juso = jusos.get(0);

        System.out.println(juso.getBdNm());
        System.out.println(juso.getRoadAddrPart1());
    }
}