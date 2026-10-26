package test.exp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.exp.entities.User;
import test.exp.repository.UserRep;

import java.util.List;

@Service
public class UserServiceImpl {
    @Autowired
    private UserRep userRep ;

    public List<User> retrieveUser()
    {return userRep.findAll();}

    public User retrieveUserById(Integer id)
    {return userRep.findById(id).get();}

    public  User addUser(User user)
    {return userRep.save(user);}

    public  User modifyUser(User user)
    {return userRep.save(user);}

    void  removeUser(User user)
    {userRep.deleteById(user.getId());}
}
