package com.sqasa.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

public class FloristeriaHomePage extends PageObject {

    private static final String URL = "https://www.floristeriamundoflor.com/";

    @FindBy(name = "q")
    private WebElement searchBox;

    public void openHomePage() {
        openUrl(URL);
        getDriver().manage().window().maximize();
    }

    public void enterSearchTerm(String term) {
        searchBox.clear();
        searchBox.sendKeys(term);
        searchBox.submit();
    }

    public void clickByXPathText(String text) {
        String xpathExpression = "//*[text()='" + text + "']";
        WebElement element = getDriver().findElement(By.xpath(xpathExpression));
        element.click();
    }

    public void clickByXPath(String xpath) {
        WebElement element = getDriver().findElement(By.xpath(xpath));
        element.click();
    }

    public void selectOptionByXPath(String selectXPath, String optionValue) {
        WebElement selectElement = getDriver().findElement(By.xpath(selectXPath));
        Select select = new Select(selectElement);
        select.selectByValue(optionValue);
    }

    public void moveToElementByXPath(String xpath) {
        WebElement element = getDriver().findElement(By.xpath(xpath));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(element).perform();
    }

    public void clickVisibleByXPath(String xpath) {
        WebElement element = getDriver().findElement(By.xpath(xpath));
        if (!element.isDisplayed()) {
            moveToElementByXPath(xpath);
        }
        element.click();
    }
}
