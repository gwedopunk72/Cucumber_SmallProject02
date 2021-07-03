package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //Locator for login button
    By SigninBtn = By.xpath("//span[contains(text(),'Sign in')]");

    //Locator book Delux Room
    By roomDelux = By.xpath("//body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/a[1]/span[1]");

    //Locator for select hotel field
    By seltHotel = By.id("id_hotel_button");
    By hotelPrim = By.xpath("//li[contains(text(),'The Hotel Prime')]");

    //Locator check in date
    By cekIn = By.id("check_in_time");
    By dat29 = By.xpath("//a[contains(text(),'29')]");
    By date30 = By.xpath("//a[contains(text(),'30')]");

    //locator date picker check out
    By dat30 = By.id("check_out_time");
    public void cekOutDate(){
        driver.findElement(dat30).sendKeys(Keys.ENTER);
    }

    //Locator search Search Now
    By SearchBut = By.id("search_room_submit");
    public void SearchBtn () { driver.findElement(SearchBut).click(); }

    //Locator for Home page button
    By homPag = By.cssSelector("img[alt='Sekolah QA']");
    public void selHomePage() { driver.findElement(homPag).click(); }



    //Method to click signin button
    public void clickSignin() { driver.findElement(SigninBtn).click(); }

    //Method to click Delux Room
    public void bookDelux() { driver.findElement(roomDelux).click(); }

    //Method to click field select hotel
    public void selectHotel() {
        driver.findElement(seltHotel).click();
    }
    public void hotelPrime() {
        driver.findElement(hotelPrim).click();
    }

    //Method check in date picker
    public void cekInDate() { driver.findElement(cekIn).click(); }
    public void date29() { driver.findElement(dat29).click(); }
    public void date30() { driver.findElement(date30).click(); }

//  Locator select Policies button
    By policiBtn = By.linkText("Policies");
    public void policiesBtn() { driver.findElement(policiBtn).click(); }

//  Locator select Legal notice button
    By legalNot = By.linkText("Legal Notice");
    public void legalNoticeBtn() { driver.findElement(legalNot).click(); }

//  Locator to select Terms and conditions of use
    By termCon = By.partialLinkText("Terms");
    public void termAndCond() { driver.findElement(termCon).click(); }

//  Locator to select About Us
    By abotU = By.partialLinkText("About");
    public void aboutUsBtn() { driver.findElement(abotU).click(); }

//  Locator to select Secure payment
    By secPay = By.partialLinkText("Secure");
    public void securePaymentBtn() { driver.findElement(secPay).click(); }

//  Locator language click
    By langSele = By.xpath("//div[@id='languages-block-top']");
    public void languageSelec() { driver.findElement(langSele).click(); }

//  Locator select Indonesia language
    By indoLang = By.xpath("//*[@id=\"first-languages\"]/li[2]/a");
    public void languageIndoSelect() { driver.findElement(indoLang).click(); }

//  Locator select account button
    By accButt = By.id("user_info_acc");
    public void accountBtn() { driver.findElement(accButt).click(); }

//  Locator select logout button
    By LogOutbut = By.partialLinkText("Log");
    public void logoutBtn() { driver.findElement(LogOutbut).click(); }





}
