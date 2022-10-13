package com.hospital.parser;

import com.hospital.domain.Hospital;

public class HospitalParser implements Parser<Hospital> {
    @Override
    public Hospital parse(String str) {
        String[] data = processString(str).split(",");

        String id = parseId(data);
        String address = parseAddress(data);
        String district = parseDistrict(data);
        String category = parseCategory(data);
        int emergencyRoom = parseEmergencyRoom(data);
        String name = parseName(data);
        String subdivision = findSubdivision(name);

        Hospital hospital = new Hospital();
        hospital.setId(id);
        hospital.setAddress(address);
        hospital.setDistrict(district);
        hospital.setCategory(category);
        hospital.setEmergencyRoom(emergencyRoom);
        hospital.setName(name);
        hospital.setSubdivision(subdivision);

        return hospital;
    }

    private String processString(String str) {
        return str.replaceAll("\"", "").replaceAll("'", "\\\\'");
    }

    private String parseId(String[] data) {
        final int INDEX = 0;
        return data[INDEX];
    }

    private String parseAddress(String[] data) {
        final int INDEX = 1;
        return data[INDEX];
    }

    private String parseDistrict(String[] data) {
        String[] addressArr = parseAddress(data).split(" ");
        return addressArr[0] + " " + addressArr[1];
    }

    private String parseCategory(String[] data) {
        final int INDEX = 2;
        return data[INDEX];
    }

    private int parseEmergencyRoom(String[] data) {
        final int INDEX = 6;
        return Integer.parseInt(data[INDEX]);
    }

    private String parseName(String[] data) {
        final int INDEX = 10;
        return data[INDEX];
    }

    private String findSubdivision(String name) {
        final String[] SUBDIVISION_LIST = {"재활의학과", "가정의학과", "이비인후과", "비뇨기과", "산부인과", "성형외과", "정형외과", "피부과", "소아과", "한의원", "안과", "외과", "내과", "치과"}; // 성형외과 보다 외과가 앞에 있으면 성형외과도 외과로 처리됨.

        for (String subdivision : SUBDIVISION_LIST) {
            if(name.contains(subdivision)) {
                return subdivision;
            }
        }

        return null;
    }
}
