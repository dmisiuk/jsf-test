package by.minsler;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.validation.constraints.Min;
import java.io.Serializable;

/**
 * User: dzmitry.misiuk
 * Date: 2/12/13
 * Time: 11:49 AM
 */
@ManagedBean(name = "contact")
@ViewScoped
public class Contact implements Serializable {
    private static final long serialVersionUID = 2391657445415194620L;


    @NotEmpty
    @Min(value = 3)
    private String firstName;

    @NotBlank
    private String lastName;

    public Contact() {
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
}