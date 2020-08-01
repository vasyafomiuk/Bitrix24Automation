package com.bitrix24.pages;

import com.bitrix24.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(name = "USER_LOGIN")
    private WebElement email;

    @FindBy(name = "USER_PASSWORD")
    private WebElement password;

    public void login() {
        String usernameString = ConfigurationReader.getProperty("username");
        String passwordString = ConfigurationReader.getProperty("password");
        email.sendKeys(usernameString);
        password.sendKeys(passwordString, Keys.ENTER);
    }
}
