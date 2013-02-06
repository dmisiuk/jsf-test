package by.minsler;

import by.minsler.model.User;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * User: dzmitry.misiuk
 * Date: 2/6/13
 * Time: 2:53 PM
 */
@ManagedBean(name = "usersBean")
@ViewScoped
public class UsersBean implements Serializable {

    private List<User> users;

    public UsersBean() {
        users = new ArrayList<User>();
        users.add(new User("dzmitry", "misiuk"));
        users.add(new User("vasia", "pupkin"));
        users.add(new User("kiryl", "bokiy"));
    }

    public List<User> getUsers() {
        System.out.println("get users" + users);
        return users;
    }
}