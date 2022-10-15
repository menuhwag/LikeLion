package week4._221012.study.db;

public class Hospital {
    public static final String INSERT_INTO_SQL = "INSERT INTO `hospital`.`seoul` (`id`,`address`,`district`,`category`,`emergency_room`,`name`,`subdivision`)\n";
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

    public int getEmergencyRoom() {
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

    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("(")
                .append("'")
                .append(getId())
                .append("',")
                .append("'")
                .append(getAddress())
                .append("',")
                .append("'")
                .append(getDistrict())
                .append("',")
                .append("'")
                .append(getCategory())
                .append("',")
                .append("'")
                .append(getEmergencyRoom())
                .append("',")
                .append("'")
                .append(getName())
                .append("',");

        if (getSubdivision() == null) {
            sb.append("null");
        } else {
            sb.append("'")
                    .append(getSubdivision())
                    .append("'");
        }
        sb.append(")");

        return sb.toString();
    }
}
