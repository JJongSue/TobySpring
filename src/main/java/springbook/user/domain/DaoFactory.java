package springbook.user.domain;

public class DaoFactory {
    public UserDao userDao() {
        ConnectionMaker connectionMaker = new SimpleConnectionMaker();
        UserDao userDao = new UserDao(connectionMaker);
        return userDao;
    }
}
