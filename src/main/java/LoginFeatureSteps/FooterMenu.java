package LoginFeatureSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.LoginPage;

public class FooterMenu {
    WebDriver driver;

    {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
    }

    LoginPage login = new LoginPage(driver);
    HomePage home = new HomePage(driver);
    CreateAccountPage create = new CreateAccountPage(driver);

//  [TC17] Check Menu Policies and Legal Notice
    @Given("Tester login to website")
    public void Tester_login_to_website() throws InterruptedException {
        driver.get("http://103.226.139.66:8080/en/");
        driver.manage().window().maximize();
        home.clickSignin();
        Thread.sleep(1500);
        login.inputEmail("bakul.areng04@yahoo.com");
        login.inputPassword("Cilsy2020");
        login.clickLogin();
        Thread.sleep(2000);
    }
    @When ("Tester click Policies menu")
    public void Tester_click_Policies_menu() throws InterruptedException {
        home.policiesBtn();
        Thread.sleep(2000);
        home.selHomePage();
    }
    @Then ("Tester click Legal Notice menu")
    public void Tester_click_Legal_Notice_menu() throws InterruptedException {
        home.legalNoticeBtn();
        Thread.sleep(2000);
        home.selHomePage();
        driver.close();
    }

//  [TC18] Check Menu Terms And Conditions and About Us
    @Given ("Tester click Terms and Condition menu")
    public void Tester_click_Terms_and_Condition_menu() throws InterruptedException {
        driver.get("http://103.226.139.66:8080/en/");
        driver.manage().window().maximize();
        home.termAndCond();
        Thread.sleep(2000);
        home.selHomePage();
    }
    @When ("Tester click about us menu")
    public void Tester_click_about_us_menu() throws InterruptedException {
        home.aboutUsBtn();
        Thread.sleep(2000);
        home.selHomePage();
    }
    @Then ("Tester click secure payment menu")
    public void Tester_click_secure_payment_menu() throws InterruptedException {
        home.securePaymentBtn();
        Thread.sleep(2000);
        home.selHomePage();
        driver.close();
    }

//  [TC19] Check Feature to Change Language
    @Given ("Tester select language menu")
    public void Tester_select_language_menu() throws InterruptedException {
        driver.get("http://103.226.139.66:8080/en/");
        driver.manage().window().maximize();
        home.languageSelec();
        Thread.sleep(2000);
    }

    @Then ("Tester Select language Indonesia")
    public void Tester_Select_language_Indonesia() throws InterruptedException {
        home.languageIndoSelect();
        Thread.sleep(2000);
        driver.close();
   }

//  [TC20] Test Logout Feature
    @Given ("Tester select account menu btn")
    public void Tester_select_account_menu_btn() throws InterruptedException {
        driver.get("http://103.226.139.66:8080/en/");
        driver.manage().window().maximize();
        home.clickSignin();
        Thread.sleep(1500);
        login.inputEmail("bakul.areng04@yahoo.com");
        login.inputPassword("Cilsy2020");
        login.clickLogin();
        Thread.sleep(2000);
        home.accountBtn();
        Thread.sleep(3000);
    }
    @Then  ("Tester select logout button")
    public void Tester_select_logout_button() throws InterruptedException {
        home.logoutBtn();
        Thread.sleep(2000);
        driver.close();
    }
}
