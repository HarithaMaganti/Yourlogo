package com.maven.planit.pageobjects;

import com.maven.planit.driver.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

//1-Send a message to Customer Service in the 'Contact us' section.

public class ContactUs extends DriverFactory {

    public String homePageAssertion(){

        return driver.getCurrentUrl();
    }
    @FindBy(linkText = "Contact us")
    private WebElement customerService;

    public void customerServiceContact() {
        customerService.click();
    }

    @FindBy(css = "#id_contact")
    private WebElement subjectHeading;

    public void subjectHeadingDropDown(String dropDownSelection) {
        subjectHeading.click();
        Select select = new Select(subjectHeading);
        select.selectByVisibleText(dropDownSelection);
    }

    @FindBy(css = "#email")
    private WebElement emailAddress;

    public void enterEmailAddress(String email) {
        emailAddress.sendKeys(email);

    }

    @FindBy(css = "#id_order")
    private WebElement orderNumber;

    public void enterOrderNumber(String orderId) {
        orderNumber.sendKeys(orderId);
    }

    @FindBy(css = "#message")
    private WebElement messaging;

    public void messageTextBox(String text) {
        messaging.sendKeys(text);
    }

    @FindBy(css = "#submitMessage")
    private WebElement sendButton;

    public void send() {
        sendButton.click();
    }

    @FindBy(css = ".alert-success")
    private WebElement alertSuccess;

    public String successAlert() {
        return alertSuccess.getText();
    }


}


