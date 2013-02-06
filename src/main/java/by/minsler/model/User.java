package by.minsler.model;

import java.io.Serializable;

/**
 * User: dzmitry.misiuk
 * Date: 2/6/13
 * Time: 2:54 PM
 */
public class User implements Serializable {

    private static final long serialVersionUID = -8389650431831563025L;

    private String firstName;
    private String lastName;
    private Integer age;
    private String sex;
    private boolean active;

    public User() {
    }


    public User(String firstName, String lastName, Integer age, String sex, boolean active) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.active = active;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}

