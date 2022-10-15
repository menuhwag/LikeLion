package com.hospital.dto.juso;

import java.util.List;

public class Results {
    private Common common;
    private List<Juso> juso;

    public Common getCommon() {
        return common;
    }

    public List<Juso> getJuso() {
        return juso;
    }

    @Override
    public String toString() {
        return "Results{" +
                "common=" + common +
                ", juso=" + juso +
                '}';
    }
}
