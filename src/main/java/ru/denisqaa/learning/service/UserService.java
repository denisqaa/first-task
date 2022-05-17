package ru.denisqaa.learning.service;

import java.util.List;
import ru.denisqaa.learning.model.User;

public interface UserService {
  void createUsersTable();

  void dropUsersTable();

  void saveUser(String name, String lastName, byte age);

  void removeUserById(long id);

  List<User> getAllUsers();

  void cleanUsersTable();
}
