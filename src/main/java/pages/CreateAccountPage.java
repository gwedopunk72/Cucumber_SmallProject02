package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage {
    WebDriver driver;

    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locator for Radio gender Mr.
    By RadioGender = By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[1]/div[1]");

    //Locator firstname field
    By firstName = By.id("customer_firstname");

    //Locator lastname field
    By lastName = By.id("customer_lastname");

    //Locator checkbox newsletter
    By newsLetter = By.xpath("//label[contains(text(),'Sign up for our newsletter!')]");

    //Locator checkbox special offer
    By specialOffer = By.xpath("//label[contains(text(),'Receive special offers from our partners!')]");

    //Locator Register button
    By RegisterBtn = By.id("submitAccount");



    //Method to click radio gender Mr.
    public void clickRadio1 () {
        driver.findElement(RadioGender).click();
    }

    //Method to input first name
    public void inputFirstName (String name) {
        driver.findElement(firstName).sendKeys(name);
    }

    //Method to input last name
    public void inputLastName (String name) { driver.findElement(lastName).sendKeys(name); }

    //Method to select newsletter
    public void selectNewsLetter () {
        driver.findElement(newsLetter).click();
    }

    //Method to select special offer
    public void selectOffer () {
        driver.findElement(specialOffer).click();
    }

    //Method to select Register button
    public void clickRegister () {
        driver.findElement(RegisterBtn).click();
    }

}
