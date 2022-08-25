package ru.degtiarev.springboot.dao;


import ru.degtiarev.springboot.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);
    User findById(int id);
    void updateUser(User user);
    void deleteUser(int id);

    List<User> getAllUsers();

}