package com.bitrix24.step_definitions;

import com.bitrix24.pages.LoginPage;
import com.bitrix24.utilities.ConfigurationReader;
import com.bitrix24.utilities.Driver;
import io.cucumber.java.en.Given;

public class LoginStepDefinitions {
    public LoginPage loginPage = new LoginPage();

    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        String URL = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(URL);
    }
    //And   user logs in as "hr"
    @Given("user logs in as {string}")
    public void user_logs_in_as(String role) {
        loginPage.login(role);
    }
}
