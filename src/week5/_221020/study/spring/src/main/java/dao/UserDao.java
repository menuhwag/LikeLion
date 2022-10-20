package dao;

import domain.User;
import org.springframework.dao.EmptyResultDataAccessException;

import java.sql.*;

public class UserDao {
    private ConnectionMaker connectionMaker;

    public UserDao(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }

    public void add(User user) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;

        try {
            c = connectionMaker.makeConnection();
            ps = c.prepareStatement("INSERT INTO users(id, name, password) values (?, ?, ?)");
            ps.setString(1, user.getId());
            ps.setString(2, user.getName());
            ps.setString(3, user.getPassword());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw e;
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ignore) {
                }
            }
            if (c != null) {
                try {
                    c.close();
                } catch (SQLException ignore) {
                }
            }
        }
    }

    public User findById(String id) throws SQLException{
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User user = null;

        try {
            c = connectionMaker.makeConnection();
            ps = c.prepareStatement("select * from users where id = ?");
            ps.setString(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                user = new User(
                        rs.getString("id"),
                        rs.getString("name"),
                        rs.getString("password")
                );
            }

        } catch (SQLException e) {
            throw e;
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ignore) {
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ignore) {
                }
            }
            if (c != null) {
                try {
                    c.close();
                } catch (SQLException ignore) {
                }
            }
        }
        if (user == null) throw new EmptyResultDataAccessException(1);
        return user;
    }

    public void deleteAll() throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;

        try {
            c = connectionMaker.makeConnection();
            ps = c.prepareStatement("DELETE FROM users");
            ps.executeUpdate();
        } catch (SQLException e) {
            throw e;
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ignore) {
                }
            }
            if (c != null) {
                try {
                    c.close();
                } catch (SQLException ignore) {
                }
            }
        }
    }

    public int getCountAll() throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            c = connectionMaker.makeConnection();
            ps = c.prepareStatement("SELECT COUNT(*) FROM users");
            rs = ps.executeQuery();
            rs.next();
            return rs.getInt(1);
        } catch (SQLException e) {
            throw e;
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ignore) {
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ignore) {
                }
            }
            if (c != null) {
                try {
                    c.close();
                } catch (SQLException ignore) {
                }
            }
        }
    }
}
