package dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionMarker {
    Connection makeConnection() throws SQLException, ClassNotFoundException;
}
