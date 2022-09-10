package springbook.user.domain;

import java.sql.SQLException;

public class UserMain {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao dao = new UserDao();

        User user = new User();
        user.setId("json.p");
        user.setName("박종수");
        user.setPassword("1234");

        dao.add(user);

        System.out.println(user.getId() + "등록 성공");

        User user2 = dao.get(user.getId());
        System.out.println(user2.toString());

        System.out.println(user2.getId() + "조회 성공");
    }
}
