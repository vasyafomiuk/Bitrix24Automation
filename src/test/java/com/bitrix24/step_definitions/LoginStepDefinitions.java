package com.bitrix24.step_definitions;

import com.bitrix24.pages.LoginPage;
import com.bitrix24.utilities.ConfigurationReader;
import com.bitrix24.utilities.Driver;
import io.cucumber.java.en.Given;

public class LoginStepDefinitions {
<<<<<<< HEAD

    LoginPage loginPage = new LoginPage();

    @Given("User is on the landing page")
    public void user_is_on_the_landing_page() {

        String URL = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(URL);
    }

    @Given("User logs in as {string}")
=======
    public LoginPage loginPage = new LoginPage();

    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        String URL = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(URL);
    }
    //And   user logs in as "hr"
    @Given("user logs in as {string}")
>>>>>>> b007029d5b837d9b6458e5eae38cda6f4ccb8dba
    public void user_logs_in_as(String role) {
        loginPage.login(role);
    }

    @Given("user navigates to {string}")
    public void user_navigates_to(String module) {
        loginPage.navigateTo(module);
    }
<<<<<<< HEAD



















=======
>>>>>>> b007029d5b837d9b6458e5eae38cda6f4ccb8dba
}
