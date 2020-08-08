package com.bitrix24.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;

public class ActivityStreamPage extends BasePage{
    private final static Logger logger = Logger.getLogger(ActivityStreamPage.class);

    @FindBy(id = "microoPostFormLHE_blogPostForm_inner")
    private WebElement sendMessageInputBox;

    @FindBy(css = "[title='Upload files']")
    private WebElement uploadFilesIcon;

    @FindBy(name = "bxu_files[]")
    private WebElement uploadFilesAndImages;


    public void clickOnSendMessageInput(){
        wait.until(ExpectedConditions.visibilityOf(sendMessageInputBox)).click();
    }

    /**
     * File path will be provided as a parameter. Should start with src.
     * @param filePath like src/test/resources/testData/image.jpeg
     */
    public void uploadFile(String filePath){
        filePath = System.getProperty("user.dir")+"/"+filePath.replace("/", File.separator);
        logger.info("File path: "+filePath);
        uploadFilesIcon.click();
        uploadFilesAndImages.sendKeys(filePath);

    }
}
