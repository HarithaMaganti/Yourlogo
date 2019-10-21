package com.maven.planit.stepdefinitions;
import static org.hamcrest.MatcherAssert.assertThat;
import com.maven.planit.pageobjects.ContactUs;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;

public class ContactUsStepdefinition {
    ContactUs contactUs = new ContactUs();


    @Given("^I am on automationPractice Homepage$")
    public void iAmOnAutomationPracticeHomepage() {
        String actual= contactUs.homePageAssertion();
        assertThat("Homepage Url might end with something or user on different page",actual, Matchers.endsWith("php"));
    }

    @When("^I click on \"([^\"]*)\"$")
    public void iClickOn(String arg0) throws Throwable {
        contactUs.customerServiceContact();
    }

    @And("^page navigates to \"([^\"]*)\"$")
    public void pageNavigatesTo(String arg0) throws Throwable {

    }

    @And("^I select \"([^\"]*)\" from Subject Heading dropdown$")
    public void iSelectFromSubjectHeadingDropdown(String dropDownSelection) throws Throwable {
        contactUs.subjectHeadingDropDown(dropDownSelection);

    }

    @And("^I enter Email address \"([^\"]*)\"$")
    public void iEnterEmailAddress(String email) throws Throwable {
        contactUs.enterEmailAddress(email);
    }

    @And("^I enter Order reference \"([^\"]*)\"$")
    public void iEnterOrderReference(String orderId) throws Throwable {
        contactUs.enterOrderNumber(orderId);
    }

    @And("^I enter text in Message box \"([^\"]*)\"$")
    public void iEnterTextInMessageBox(String text) throws Throwable {
        contactUs.messageTextBox(text);
    }

    @And("^I click on \"([^\"]*)\" button$")
    public void iClickOnButton(String arg0) throws Throwable {
        contactUs.send();
    }

    @Then("^I should be able to view confirmation message \"([^\"]*)\"$")
    public void iShouldBeAbleToViewConfirmationMessage(String arg0) throws Throwable {

        String actual= contactUs.successAlert();
        assertThat("Homepage Url might end with something or user on different page",actual, Matchers.equalToIgnoringWhiteSpace(("Your message has been successfully sent to our team.")));

    }

}


