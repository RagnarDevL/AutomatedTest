package com.sqasa.tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.sqasa.steps.FloristeriaUserSteps;

@RunWith(SerenityRunner.class)
public class FloristeriaTest {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Steps
    FloristeriaUserSteps user;

    @Test
    public void HU1_Floristeria() throws java.sql.SQLException {
        try {
            user.openFloristeriaHomePage();
            user.clickByXPath("//*[@id='primary-menu']/li[2]", "Click en la categoria AMOR");
            user.selectOptionByXPath("//select[@name='orderby']", "popularity");
            user.moveToElementByXPath("//div[contains(@class,'products products-grid')]/div/div[4]");
            user.clickByXPath(
                    "//div[contains(@class,'products products-grid')]/div/div[4]//span[contains(@class,'title-cart')]",
                    "Click en añadir ak carrito");
            user.clickByXPath("//*[@id=\"main\"]/div/div/div/div/div[2]/div/div/div/div[1]/div/a",
                    "Click en Seguir comprando");
            user.selectOptionByXPath("//select[@name='orderby']", "price-desc");
            user.moveToElementByXPath("//div[contains(@class,'products products-grid')]/div/div[1]");
            user.clickByXPath(
                    "//div[contains(@class,'products products-grid')]/div/div[1]//span[contains(@class,'title-cart')]",
                    "Click en Añadir al carrito");

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } catch (AssertionError | Exception e) {

            throw e;
        }
    }

    @Test
    public void HU2_Floristeria() throws java.sql.SQLException {
        try {
            user.openFloristeriaHomePage();
            user.clickByXPath("//*[@id='primary-menu']/li[3]", "Click en la categoria AMOR");
            user.selectOptionByXPath("//select[@name='orderby']", "popularity");
            user.moveToElementByXPath("//div[contains(@class,'products products-grid')]/div/div[4]");
            user.clickByXPath(
                    "//div[contains(@class,'products products-grid')]/div/div[4]//span[contains(@class,'title-cart')]",
                    "click en añadir al carrito");
            user.clickByXPath(
                    "//*[@id=\"main\"]/div/div/div/div/div[2]/div/div/div/div[2]/form/div/table/tbody/tr[1]/td[6]/a/i",
                    "Click en eliminar item del carrito");

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } catch (AssertionError | Exception e) {

            throw e;
        }
    }
}
