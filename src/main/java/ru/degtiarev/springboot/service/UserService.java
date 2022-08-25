package ru.degtiarev.springboot.service;

import ru.degtiarev.springboot.model.User;


import java.util.List;

public interface UserService {
    void addUser(User user);
    User findById(int id);
    void updateUser(User user);

    void deleteUser(int id);

    List<User> getAllUsers();
}