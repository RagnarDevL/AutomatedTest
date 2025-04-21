package com.sqasa.steps;

import com.sqasa.pages.FloristeriaHomePage;

import net.thucydides.core.annotations.Step;

public class FloristeriaUserSteps {

    FloristeriaHomePage floristeriaHomePage;

    @Step("Open Floristeria home page")
    public void openFloristeriaHomePage() {
        floristeriaHomePage.openHomePage();
    }

    @Step("Search for {0}")
    public void searchFor(String term) {
        floristeriaHomePage.enterSearchTerm(term);
    }

    @Step("Click element by XPath - {1}")
    public void clickByXPath(String xpath, String Descripcion) {
        floristeriaHomePage.clickByXPath(xpath);
    }

    @Step("Click element by XPath text AMOR")
    public void clickByXPathTextAMOR(String text) {
        floristeriaHomePage.clickByXPathText(text);
    }

    @Step("Select option {1} from select element by XPath")
    public void selectOptionByXPath(String selectXPath, String optionText) {
        floristeriaHomePage.selectOptionByXPath(selectXPath, optionText);
    }

    @Step("move to element by XPath ")
    public void moveToElementByXPath(String selectXPath) {
        floristeriaHomePage.moveToElementByXPath(selectXPath);
    }

    @Step("Click element visible by XPath text AMOR")
    public void clickVisibleByXPath(String selectXPath) {
        floristeriaHomePage.clickVisibleByXPath(selectXPath);
    }
}
