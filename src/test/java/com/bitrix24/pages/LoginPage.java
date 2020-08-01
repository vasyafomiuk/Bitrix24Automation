package com.bitrix24.pages;

import com.bitrix24.utilities.ConfigurationReader;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {
    private final static Logger logger = Logger.getLogger(LoginPage.class);

    @FindBy(name = "USER_LOGIN")
    private WebElement email;

    @FindBy(name = "USER_PASSWORD")
    private WebElement password;

    public void login() {
        String usernameString = ConfigurationReader.getProperty("username");
        String passwordString = ConfigurationReader.getProperty("password");
        email.sendKeys(usernameString);
        password.sendKeys(passwordString, Keys.ENTER);
        logger.info("Login with "+usernameString+" username and "+passwordString+" password");
//        System.out.println("Login with "+usernameString+" username and "+passwordString+" password");
    }
}
