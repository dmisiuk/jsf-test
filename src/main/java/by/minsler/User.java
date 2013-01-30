package by.minsler;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

/**
 * User: dzmitry.misiuk
 * Date: 1/29/13
 * Time: 5:55 PM
 */
@ManagedBean
@SessionScoped
public class User implements Serializable {
    private static final long serialVersionUID = -7794187246192485775L;

    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGreeting() {
        if (name == null || name.length() == 0) return "";
        return "Welcome to JSF application with ajax, " + name;
    }
}