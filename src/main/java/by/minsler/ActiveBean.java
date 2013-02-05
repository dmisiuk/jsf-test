package by.minsler;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * User: dzmitry.misiuk
 * Date: 2/5/13
 * Time: 4:57 PM
 */
@ManagedBean(name = "activeBean")
@ViewScoped
public class ActiveBean implements Serializable {

    private static final long serialVersionUID = 8048118553425461098L;


    private boolean active;
    private Map<String, String> colors;
    private List<String> selectedColors;
    private String selectedPhone;
    private List<String> phones;

    public ActiveBean() {
        colors = new TreeMap<String, String>();
        colors.put("black", "black");
        colors.put("white", "white");
        colors.put("red", "red");
        phones = new ArrayList<String>();
        phones.add("Samsung");
        phones.add("Apple");
        phones.add("Sony");
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Map<String, String> getColors() {
        return colors;
    }

    public List<String> getSelectedColors() {
        return selectedColors;
    }

    public void setSelectedColors(List<String> selectedColors) {
        this.selectedColors = selectedColors;
    }

    public String getSelectedPhone() {
        return selectedPhone;
    }

    public void setSelectedPhone(String selectedPhone) {
        this.selectedPhone = selectedPhone;
    }

    public List<String> getPhones() {
        return phones;
    }

}