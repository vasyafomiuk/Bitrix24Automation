@smoke
Feature: As a user, I should be able to create a
  poll by clicking on Poll tab under Active Stream.

  Scenario: 1. User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.
    Given User is on the landing page
    And User logs in as "hr"
    And user navigates to "Activity Stream"
    When user clicks on send message button
    And uploads following file:
    | File path | src/test/resources/testData/testimage.jpg |
    Then user click on send button

