package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

//Constructor that will be automatically called as soon as the object of the class is created
    public LoginPage(WebDriver driver) { this.driver = driver; }

//Locator for Email field create account
    By EmailCreate = By.id("email_create");

//Locator for Create an Account button
    By CreateAccount = By.id("SubmitCreate");

//Locator for Email login field
    By EmailLogin = By.id("email");

//Locator for login button
    By PassLogin = By.id("passwd");

//locator for Sign In button
    By LoginBtn = By.id("SubmitLogin");

//Method to enter username
    public void mailCreate (String email) {
        driver.findElement(EmailCreate).sendKeys(email);
    }

//Method to click on Create a Account button
    public  void clickCreateAccount() {
        driver.findElement(CreateAccount).click();
    }

//Method to enter email login
    public void inputEmail (String email) {
        driver.findElement(EmailLogin).sendKeys(email);
    }

//Method to enter password login
    public void inputPassword (String pass) { driver.findElement(PassLogin).sendKeys(pass); }

//Method to click on signin button
    public void clickLogin () {
        driver.findElement(LoginBtn).click();
    }
}
