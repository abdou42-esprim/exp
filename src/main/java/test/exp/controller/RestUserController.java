package test.exp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import test.exp.entities.User;
import test.exp.service.IUserService;

import java.util.List;

@RestController
public class RestUserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/retrive-all-users")
    public List<User> getAllUsers()
    {
        return userService.retrieveAllUsers();
    }

    @GetMapping("/retrive-user/{userid}")
    public User retrieveUser(@PathVariable("userid") Long userid)
    {return userService.retrieveUsers()}


}

