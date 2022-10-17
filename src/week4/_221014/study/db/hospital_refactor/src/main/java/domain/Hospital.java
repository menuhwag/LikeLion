package domain;

public class Hospital {
    private String id;
    private String address;
    private String district;
    private String category;
    private Integer emergencyRoom;
    private String name;
    private String subdivision;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getEmergencyRoom() {
        return emergencyRoom;
    }

    public void setEmergencyRoom(int emergencyRoom) {
        this.emergencyRoom = emergencyRoom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubdivision() {
        return subdivision;
    }

    public void setSubdivision(String subdivision) {
        this.subdivision = subdivision;
    }

    @Override
    public String toString() {
        String result = String.format("(\"%s\",\"%s\",\"%s\",\"%s\",\"%d\",\"%s\",%s)",
                getId(), getAddress(), getDistrict(), getCategory(), getEmergencyRoom(), getName(), (getSubdivision() == null) ? "null" : "\""+ getSubdivision() + "\"");

        return result;
    }
}
