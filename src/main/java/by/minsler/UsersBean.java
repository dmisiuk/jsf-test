package by.minsler;

import by.minsler.model.User;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * User: dzmitry.misiuk
 * Date: 2/6/13
 * Time: 2:53 PM
 */
@ManagedBean(name = "usersBean")
@SessionScoped
public class UsersBean implements Serializable {

    private List<User> users;
    private DataModel<User> model;

    public UsersBean() {
        users = new ArrayList<User>();
        users.add(new User("dzmitry", "misiuk", 25, "male", true));
        users.add(new User("vasia", "pupkin", 30, "male", true));
        users.add(new User("kiryl", "bokiy", 25, "male", false));
        users.add(new User("natallia", "misiuk", 28, "female", true));
        users.add(new User("alexander", "pushkin", 200, "male", false));
        users.add(new User("linus", "torwalds", 40, "male", true));
        model = new ListDataModel<User>(users);
    }

    public List<User> getUsers() {
        return users;
    }

    public String removeUser(User user) {
        users.remove(user);
        return null;
    }

    public DataModel<User> getModelUsers() {
        return model;
    }
}