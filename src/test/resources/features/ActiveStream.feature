Feature: As a user, I should be able to send messages by clicking on Message tab under Active Stream.

  Scenario: 1. User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.
    Given user is on the landing page
    And user logs in as "hr"
    And user navigates to "Activity Stream"