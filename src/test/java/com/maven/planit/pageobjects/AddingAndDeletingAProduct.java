package com.maven.planit.pageobjects;

import com.maven.planit.driver.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

//3-Add an item to the cart and remove the same

public class AddingAndDeletingAProduct extends DriverFactory {
    @FindBy(css = "#search_query_top")
    private WebElement searchBox;
    @FindBy(css = ".button-search")
    private WebElement magnifying;

    public void searchProductBox(String item) {
        searchBox.sendKeys(item);
        magnifying.click();
    }

    @FindBy(css = ".product-name")
    private List<WebElement> productName;

    public void productSelection(String product) {
        for (WebElement productNames : productName) {
            if (productNames.getText().equalsIgnoreCase(product)) {
                productNames.click();
                break;
            }

        }

    }

    @FindBy(css = "#add_to_cart")
    private WebElement addingProductToCart;

    public void cart() {
        addingProductToCart.click();
    }

    @FindBy(linkText = "Proceed to checkout")
    private WebElement proceedToCheckOut;

    public void checkOut() {
        proceedToCheckOut.click();
    }

    @FindBy(css = "#cart_title")
    private WebElement cartTitle;

    public String summaryPageCartTitle() { //for assertion
        return cartTitle.getText();
    }

    @FindBy(css = ".cart_quantity_delete")
    private WebElement delete;

    public void deleteProduct() {
        delete.click();
    }

    @FindBy(css = ".ajax_cart_no_product")
    private WebElement alertWarning;

    public String cartEmptyMessage() throws InterruptedException {
        Thread.sleep(3000);
    return alertWarning.getText();

}

}








