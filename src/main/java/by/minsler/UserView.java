package by.minsler;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.Locale;

/**
 * User: dzmitry.misiuk
 * Date: 1/29/13
 * Time: 5:55 PM
 */
@ManagedBean
@SessionScoped
public class UserView implements Serializable {
    private static final long serialVersionUID = -7794187246192485775L;

    private String name;
    private String password;
    private Locale locale;

    public UserView() {
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new RuntimeException("name cannot be null");
        }
        if (name.trim().isEmpty()) {
            throw new RuntimeException("name cannot be empty");
        }

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