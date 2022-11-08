package jm.task.core.jdbc;


import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Artur", "Urusov", (byte)22);
        userService.saveUser("Rutra", "sobaken", (byte)33);
        userService.saveUser("Test", "testtt", (byte)23);
        userService.saveUser("asdasd", "asdasd", (byte)123);
        List<User> allUsers = userService.getAllUsers();
        for (User i : allUsers) {
            System.out.println(i);
        }
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
