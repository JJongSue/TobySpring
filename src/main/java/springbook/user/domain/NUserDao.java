package springbook.user.domain;

import java.sql.Connection;
import java.sql.SQLException;

public class NUserDao extends UserDao {
    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        return null;
    }
}
