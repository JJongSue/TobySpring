package springbook.user.domain;

import java.sql.Connection;
import java.sql.SQLException;

public class NUserDao extends UserDao {
    public NUserDao(ConnectionMaker connectionMaker) {
        super(connectionMaker);
    }
}
