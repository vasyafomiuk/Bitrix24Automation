package com.bitrix24.step_definitions;

import com.bitrix24.pages.ActivityStreamPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class ActivityStepDefinitions {

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();


    @When("user clicks on send message button")
    public void user_clicks_on_send_message_button() {
        activityStreamPage.clickOnSendMessageInput();
    }


    /**
     *     And uploads following file:
     *          key             value
     *       | File path | src/test/resources/testData/testImage.png |
     *
     * @param dataTable -> represents cucumber data table attached to the test step
     */
    @When("uploads following file:")
    public void uploads_following_file(Map<String,String> dataTable) {
        activityStreamPage.uploadFile(dataTable.get("File path"));
    }


    @Then("user click on send button")
    public void user_click_on_send_button() {
        activityStreamPage.clickOnSendButton();
    }

}
