package by.minsler;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * User: dzmitry.misiuk
 * Date: 2/14/13
 * Time: 11:30 AM
 */
@ManagedBean(name = "company")
@ViewScoped
public class Company implements Serializable {

    @ManagedProperty("#{msgs}")
    private ResourceBundle bundle;

    @ManagedProperty("#{localeChanger}")
    private LocaleChanger localeChanger;

    private String selectedCountry;
    private List<Locale> countries;

    private boolean active;
    private String description;

    public Company() {
    }

    @PostConstruct
    public void init() {
        active = true;
        countries = Arrays.asList(new Locale[]{
                Locale.ENGLISH,
                new Locale("be")
        });
        selectedCountry = localeChanger.getCurrentLocale().getLanguage();
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void changed() {
        System.out.println(this.bundle.getString("changed"));
    }

    public ResourceBundle getBundle() {
        return bundle;
    }

    public void setBundle(ResourceBundle bundle) {
        this.bundle = bundle;
    }

    public LocaleChanger getLocaleChanger() {
        return localeChanger;
    }

    public void setLocaleChanger(LocaleChanger localeChanger) {
        this.localeChanger = localeChanger;
    }

    public String getSelectedCountry() {
        return selectedCountry;
    }

    public void setSelectedCountry(String selectedCountry) {
        this.selectedCountry = selectedCountry;
        localeChanger.setCurrentLocale(new Locale(selectedCountry));
    }

    public List<Locale> getCountries() {
        return countries;
    }

    public void setCountries(List<Locale> countries) {
        this.countries = countries;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}