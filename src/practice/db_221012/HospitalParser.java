package practice.db_221012;

public class HospitalParser implements Parser<Hospital> {
    @Override
    public Hospital parse(String str) {
        String[] data = str.replaceAll("\"", "").replaceAll("'", "\\\\'").split(",");

        String[] addressArr = data[1].split(" ");

        String id = data[0];
        String address = data[1];
        String district = addressArr[0] + " " + addressArr[1];
        String category = data[2];
        int emergencyRoom = Integer.parseInt(data[6]);
        String name = data[10];
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

    private String findSubdivision(String name) {
        String[] subdivisionList = {"피부과", "성형외과", "외과", "내과", "소아과", "가정의학과", "치과", "한의원"}; // 성형외과 보다 외과가 앞에 있으면 성형외과도 외과로 처리됨.

        for (String subdivision : subdivisionList) {
            if(name.contains(subdivision)) {
                return subdivision;
            }
        }

        return null;
    }
}
