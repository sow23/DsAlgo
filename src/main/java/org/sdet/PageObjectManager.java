package org.sdet;

import org.openqa.selenium.WebDriver;
import org.sdet.pages.RegisterPage;
import org.sdet.pages.SignInPage;
import org.sdet.util.MyDriver;

public class PageObjectManager {
    private WebDriver driver;
    private SignInPage signInPage;
    private RegisterPage registerPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public PageObjectManager() {
    }

    public SignInPage getSignInPage() {
        return signInPage;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setSignInPage(SignInPage signInPage) {
        this.signInPage = signInPage;
    }

    public RegisterPage getRegisterPage() {
        return registerPage;
    }

    public void setRegisterPage(RegisterPage registerPage) {
        this.registerPage = registerPage;
    }
}
