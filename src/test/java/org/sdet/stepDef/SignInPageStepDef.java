package org.sdet.stepDef;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.sdet.PageObjectManager;
import org.sdet.pages.SignInPage;
import org.sdet.util.MyDriver;

public class SignInPageStepDef {
    private PageObjectManager context;


    public SignInPageStepDef() {
        WebDriver driver = new MyDriver().getDriver();
        this.context = new PageObjectManager(driver);
        this.context.setSignInPage(new SignInPage(driver));
    }

    @Given("user navigates to SignIn page")
    public void user_navigates_to_sign_in_page() {
        // Write code here that turns the phrase above into concrete actions
        context
                .getDriver()
                .get("https://dsportalapp.herokuapp.com/login");
        System.out.println();
    }
    @Then("User should see login username and password fields")
    public void user_should_see_login_username_and_password_fields() {
        // Write code here that turns the phrase above into concrete actions
        context.getSignInPage().textFieldVisibility();

    }
    @When("User enters {string} and {string}")
    public void user_enters_and(String name, String pass) {
        // Write code here that turns the phrase above into concrete actions
        context
                .getSignInPage().login(name,pass);
        System.out.println();
    }
    @Then("User clicks on Login")
    public void user_clicks_on_login() {
        // Write code here that turns the phrase above into concrete actions
        context
                .getSignInPage().loginBtnFunction();
        System.out.println();
    }
    @Then("Login failure message is displayed")
    public void login_failure_message_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @After()
    public void closeBrowser()
    {
        context.getDriver().quit();
        System.out.println("quit");
    }

}
