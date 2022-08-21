package testautomation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import testautomation.pages.IMDBHomePageObject;


public class OBSSSearchStepdefs {
    //Elements
    String obssHomepageUrl = "https://obss.com.tr/";
    IMDBHomePageObject imdbHomePage;
    String searchBtnId = "search-icon";
    String searchBox = "search-box";
    String defenceIndustryXpath = "//div/article/h2/a[text()='Defense Industry']";
    String obssFooterLogo = "//div/img[@alt='obss-footer-logo']";
    String cookieAcceptanceId = "cookieAcceptance";

    public OBSSSearchStepdefs() {
        imdbHomePage = new IMDBHomePageObject();
    }




    @Given("navigate to the OBSS homepage")
    public void navigateToTheOBSSHomepage() throws Throwable {
        imdbHomePage.driver.get(obssHomepageUrl);
        imdbHomePage.clickButtonId(cookieAcceptanceId);
            }

    @And("click searchbutton and search as automation")
    public void clickSearchbuttonAndSearchAsAutomation()throws Throwable {
        imdbHomePage.clickButtonId(searchBtnId);
        imdbHomePage.driver.findElement(By.id(searchBox)).sendKeys("automation", Keys.ENTER);
    }

    @When("click defence industry and scrolldown")
    public void clickDefenceIndustryAndScrolldown() throws Throwable{
        imdbHomePage.clickObjectWithXpath(defenceIndustryXpath);
        JavascriptExecutor js = (JavascriptExecutor) imdbHomePage.driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }


    @Then("I should see obss thumbnail is seen")
    public void iShouldSeeObssThumbnailIsSeen() throws Throwable {
        imdbHomePage.clickButtonCssSelector(obssFooterLogo);
        Assert.assertEquals(obssFooterLogo,"//div/img[@alt='obss-footer-logo']");
    }
}



