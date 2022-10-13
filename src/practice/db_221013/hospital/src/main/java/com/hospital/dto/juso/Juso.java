package com.hospital.dto.juso;

public class Juso {
    private String detBdNmList;
    private String engAddr;
    private String rn;
    private String emdNm;
    private String zipNo;
    private String roadAddrPart2;
    private String emdNo;
    private String sggNm;
    private String jibunAddr;
    private String siNm;
    private String roadAddrPart1;
    private String bdNm;
    private String admCd;
    private String udrtYn;
    private String lnbrMnnm;
    private String roadAddr;
    private String lnbrSlno;
    private String buldMnnm;
    private String bdKdcd;
    private String liNm;
    private String rnMgtSn;
    private String mtYn;
    private String bdMgtSn;
    private String buldSlno;

    public String getRn() {
        return rn;
    }

    public String getEmdNm() {
        return emdNm;
    }

    public String getZipNo() {
        return zipNo;
    }

    public String getRoadAddrPart2() {
        return roadAddrPart2;
    }

    public String getEmdNo() {
        return emdNo;
    }

    public String getSggNm() {
        return sggNm;
    }

    public String getJibunAddr() {
        return jibunAddr;
    }

    public String getSiNm() {
        return siNm;
    }

    public String getRoadAddrPart1() {
        return roadAddrPart1;
    }

    public String getBdNm() {
        return bdNm;
    }

    public String getRoadAddr() {
        return roadAddr;
    }

    @Override
    public String toString() {
        return "Juso{" +
                "roadAddrPart1='" + roadAddrPart1 + '\'' +
                '}';
    }
}
