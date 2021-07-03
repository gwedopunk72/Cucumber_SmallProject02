package LoginFeatureSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.LoginPage;

public class Login {
    WebDriver driver;

    {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
    }

    LoginPage login = new LoginPage(driver);
    HomePage home = new HomePage(driver);
    CreateAccountPage create = new CreateAccountPage(driver);

//  [TC01] Create Account With Empty Email
    @Given("user open the web page")
    public void user_open_the_web_page() throws InterruptedException {

        driver.get("http://103.226.139.66:8080/en/");
        driver.manage().window().maximize();
    }

    @When("User click Sign In")
    public void User_click_Sign_In() throws InterruptedException {
        home.clickSignin();
        Thread.sleep(2000);
    }

    @Then("User click create account")
    public void User_click_create_account() throws InterruptedException {
        login.clickCreateAccount();
        Thread.sleep(2000);
        driver.close();
    }

//  [TC02] Create Account With Valid Email
    @Given("User input valid email")
    public void User_input_valid_email() throws InterruptedException {
        driver.get("http://103.226.139.66:8080/en/");
        driver.manage().window().maximize();
        home.clickSignin();
        Thread.sleep(2000);
        login.mailCreate("Tosan11@yahoo.com");
    }

    @Then("User click login btn")
    public void User_click_login_btn() throws InterruptedException {
        login.clickCreateAccount();
        Thread.sleep(2000);
        driver.close();
    }

//  [TC03] Create Account With Valid Personal Information
    @Given("User input all personal data")
    public void User_input_all_personal_data() throws InterruptedException {
        driver.get("http://103.226.139.66:8080/en/");
        driver.manage().window().maximize();
        home.clickSignin();
        Thread.sleep(2000);
        login.mailCreate("Tosan11@yahoo.com");
        login.clickCreateAccount();
        Thread.sleep(2000);

        create.clickRadio1();
        create.inputFirstName("Tosan");
        create.inputLastName("Aji");
        login.inputPassword("Cilsy2021");

        WebElement dateBirt = driver.findElement(By.xpath("//select[@id='days']"));
        Select select = new Select(dateBirt);
        select.selectByValue("8");
        Thread.sleep(1000);

        WebElement mothBirt = driver.findElement(By.xpath("//select[@id='months']"));
        Select selectMonth = new Select(mothBirt);
        selectMonth.selectByValue("12");
        Thread.sleep(1000);

        WebElement yearBirt = driver.findElement(By.xpath("//select[@id='years']"));
        Select selectYear = new Select(yearBirt);
        selectYear.selectByValue("2000");
        Thread.sleep(1000);

        create.selectNewsLetter();
        create.selectOffer();
    }

    @Then("User click register button")
    public void User_click_register_button() throws InterruptedException {
        create.clickRegister();
        Thread.sleep(3000);
        driver.close();
    }

//  [TC04] Test Sign In Account With Empty Email
    @Given("User input password")
    public void User_input_password() throws InterruptedException {
        driver.get("http://103.226.139.66:8080/en/");
        driver.manage().window().maximize();
        home.clickSignin();
        login.inputPassword("Gameloft2020");
        Thread.sleep(1000);
    }
    @Then("User login")
    public void User_login() throws InterruptedException {
        login.clickLogin();
        Thread.sleep(3000);
        driver.close();
    }

//  [TC05] Sign In Account With Empty Password
    @Given("User input email for login")
    public void User_input_email_for_login() throws InterruptedException {
        driver.get("http://103.226.139.66:8080/en/");
        driver.manage().window().maximize();
        home.clickSignin();
        Thread.sleep(2000);
        login.inputEmail("Tosan.aji@yahoo.com");
    }
    @When("User input empty pass")
    public void User_input_empty_pass() {
        login.inputPassword(" ");
    }
    @Then("User select login")
    public void User_select_login() throws InterruptedException {
        login.clickLogin();
        Thread.sleep(3000);
        driver.close();
    }

//  [TC06] Sign In Account With Valid Data
    @Given("I input valid password")
    public void I_input_valid_password() throws InterruptedException {
        driver.get("http://103.226.139.66:8080/en/");
        driver.manage().window().maximize();
        home.clickSignin();
        Thread.sleep(2000);
        login.inputEmail("Tosan.aji@yahoo.com");
        login.inputPassword("Gameloft2020");
    }
    @When("I Select login")
    public void I_Select_login() throws InterruptedException {
        login.clickLogin();
        Thread.sleep(3000);
    }
    @Then("I close browser")
    public void I_close_browser() {
        driver.close();
    }

}