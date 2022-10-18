package dao;

import domain.Hospital;

import java.sql.*;

public class HospitalDao {
    private SqlConnector connector;

    public HospitalDao(SqlConnector connection) {
        this.connector = connection;
    }

    public void add(Hospital hospital) throws SQLException, ClassNotFoundException {
        java.sql.Connection conn = connector.getConnection();
        PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO seoul(id, address, district, category, emergency_room, name, subdivision)" +
                        "VALUES (?, ?, ?, ?, ?, ?, ?)"
        );

        ps.setString(1, hospital.getId());
        ps.setString(2, hospital.getAddress());
        ps.setString(3, hospital.getDistrict());
        ps.setString(4, hospital.getCategory());
        if (hospital.getEmergencyRoom() != null) {
            ps.setInt(5, hospital.getEmergencyRoom());
        } else {
            ps.setNull(5, Types.INTEGER);
        }
        ps.setString(6, hospital.getName());
        ps.setString(7, hospital.getSubdivision());

        ps.executeUpdate();

        ps.close();
        conn.close();
    }

    public Hospital findById(String id) throws SQLException, ClassNotFoundException {
        java.sql.Connection conn = connector.getConnection();
        PreparedStatement ps = conn.prepareStatement(
                String.format("SELECT * FROM seoul WHERE id = '%s'", id)
        );

        ResultSet result = ps.executeQuery();

        Hospital findHospital = null;

        if (result.next()) {
            findHospital = new Hospital();
            findHospital.setId(result.getString(1));
            findHospital.setAddress(result.getString(2));
            findHospital.setDistrict(result.getString(3));
            findHospital.setCategory(result.getString(4));
            findHospital.setEmergencyRoom(result.getInt(5));
            findHospital.setName(result.getString(6));
            findHospital.setSubdivision(result.getString(7));
        }

        ps.close();
        conn.close();

        return findHospital;
    }
}
