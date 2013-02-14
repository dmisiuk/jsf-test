package by.minsler;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.Locale;

/**
 * User: dzmitry.misiuk
 * Date: 2/5/13
 * Time: 4:11 PM
 */
@ManagedBean(name = "localeChanger")
@SessionScoped
public class LocaleChanger implements Serializable {

    private static final long serialVersionUID = -4332223792831494742L;

    private Locale currentLocale;

    public LocaleChanger() {
        currentLocale = Locale.getDefault();
    }

    public String setLocale(String localeName) {
        FacesContext context = FacesContext.getCurrentInstance();
        currentLocale = new Locale(localeName);
        context.getViewRoot().setLocale(currentLocale);
        return null;
    }

    public Locale getCurrentLocale() {
        return currentLocale;
    }

    public void setCurrentLocale(Locale currentLocale) {
        this.currentLocale = currentLocale;
    }
}