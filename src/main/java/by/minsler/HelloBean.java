package by.minsler;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

/**
 * User: dzmitry.misiuk
 * Date: 1/29/13
 * Time: 5:18 PM
 */
@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {
    private static final long serialVersionUID = 4302096783216759807L;

    private String name;

    public HelloBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}