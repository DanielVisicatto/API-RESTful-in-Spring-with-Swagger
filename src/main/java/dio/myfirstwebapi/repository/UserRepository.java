package dio.myfirstwebapi.repository;

import dio.myfirstwebapi.handler.BusinessException;
import dio.myfirstwebapi.handler.RequiredFieldException;
import dio.myfirstwebapi.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(User user) {
        if(user.getLogin() == null)
            throw new RequiredFieldException("Login");

        if(user.getPassword() == null)
            throw new RequiredFieldException("Password");

        if(user.getId()==null) System.out.println("SAVE - Receiving User in Repository");
        else System.out.println("UPDATE - Receiving User in Repository");

        System.out.println(user);
    }

    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - Receiving id: %d to delete", id));
        System.out.println(id);
    }

    public List<User> findAll(){
        System.out.println("LIST - Listing system users");
        List<User> users = new ArrayList<User>();
        users.add(new User("Daniel","I23A56"));
        users.add(new User("Wallace","65A32I"));
        return users;
    }

    public User findById(Integer id){
        System.out.println(String.format("FIND/id - Receiving id: %d to locate user", id));
        return new User("Daniel","I23A56");
    }

    public User findByUserName(String userName){
        System.out.println(String.format("FIND/userName - Receiving username: %s", userName));
        return new User("Daniel","I23A56");
    }
}
