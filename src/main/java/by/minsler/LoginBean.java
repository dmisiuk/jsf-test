package by.minsler;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * User: dzmitry.misiuk
 * Date: 2/14/13
 * Time: 5:48 PM
 */
@ManagedBean(name = "loginBean")
@SessionScoped
public class LoginBean implements Serializable {

    @NotBlank
    @Size(min = 2)
    private String username;

    @NotBlank
    @Email
    private String email;

    public LoginBean() {
    }

    @PostConstruct
    public void init() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String login() {
        return null;
    }
}