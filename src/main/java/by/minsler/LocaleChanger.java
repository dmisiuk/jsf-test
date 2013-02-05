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

    public String englishAction() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.getViewRoot().setLocale(Locale.ENGLISH);
        return null;
    }

    public String belorussianAction() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.getViewRoot().setLocale(new Locale("be"));
        return null;
    }
}