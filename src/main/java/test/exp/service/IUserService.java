package test.exp.service;

import test.exp.entities.User;

import java.util.List;

public interface IUserService {
    List<User> retrieveAllUsers();
User RetrieveUserById(int id);
User AddUser(User user);
User ModifyUser(User user);
Void RemoveUser(User user);
}
