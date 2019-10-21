package com.maven.planit.stepdefinitions;

import com.maven.planit.pageobjects.AddingAndDeletingAProduct;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;

public class AddingAndDeletingAProductStepdefinition {
    AddingAndDeletingAProduct addingAndDeletingAProduct = new AddingAndDeletingAProduct();

    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I search for a Product \"([^\"]*)\" and click on magnifier$")
    public void iSearchForAProductAndClickOnMagnifier(String item) throws Throwable {
    addingAndDeletingAProduct.searchProductBox(item);
    }

    @And("^I see all the related Products$")
    public void iSeeAllTheRelatedProducts() {

    }

    @And("^I click on product \"([^\"]*)\"$")
    public void iClickOnProduct(String product) throws Throwable {
        addingAndDeletingAProduct.productSelection(product);
    }

    @And("^I click on add to cart$")
    public void iClickOnAddToCart() {
        addingAndDeletingAProduct.cart();
    }

    @And("^I click on Proceed to checkout$")
    public void iClickOnProceedToCheckout() {
        addingAndDeletingAProduct.checkOut();
    }

    @And("^I can view \"([^\"]*)\" page header$")
    public void iCanViewPageHeader(String arg0) throws Throwable {
       String actual = addingAndDeletingAProduct.summaryPageCartTitle();
       assertThat("Summary page doesn't match",actual, Matchers.containsString("SHOPPING-CART SUMMARY"));
    }

    @And("^I click on \"([^\"]*)\" icon$")
    public void iClickOnIcon(String arg0) throws Throwable {
    addingAndDeletingAProduct.deleteProduct();
    }

    @Then("^I can view \"([^\"]*)\" message$")
    public void iCanViewMessage(String arg0) throws Throwable {


 //String actual=addingAndDeletingAProduct.cartEmptyMessage();
 //assertThat("Summary page message doesn't match",actual,Matchers.equalToIgnoringWhiteSpace("Your shopping cart is empty."));
    String actual=addingAndDeletingAProduct.cartEmptyMessage();
   assertThat("Summary page message doesn't match",actual,Matchers.equalToIgnoringWhiteSpace("(empty)"));
    }
}


