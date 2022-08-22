package testautomation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import testautomation.pages.IMDBHomePageObject2;

import java.util.List;


public class IMDBSearchStepdefs2 {
    //Elements
    String imdbHomepageUrl = "https://www.imdb.com/";
    String menuBtnCss = "ipc-icon ipc-icon--menu ipc-button__icon ipc-button__icon--pre";
    String menuBtnId = "imdbHeader-navDrawerOpen--desktop";
    String top250MoviesBtnText = "Top 250 Movies";
    IMDBHomePageObject2 imdbHomePage2;
    String eventHistoryxPath = "//div/span/a[text()='1929']";
    //WebElement eEventHistoryxPath = imdbHomePage.driver.findElement(By.xpath(eventHistoryxPath));
    String circusXpath = "//div/a[text()='The Circus']";

    public IMDBSearchStepdefs2() {
        imdbHomePage2 = new IMDBHomePageObject2();
    }


    //@Test(priority = 1)

    @Given("^navigate to the IMDB homepage$")
    public void navigatedToTheIMDBHomepage() throws Throwable {
        imdbHomePage2.navigatedToThePage(imdbHomepageUrl);
    }


    @And("click menu for movies list")
    public void clickMenuForMoviesList() throws Throwable {
    imdbHomePage2.clickButtonId(menuBtnId);

    }

    @When("click top 250 movies")
    public void clickTopMovies() throws Throwable {
        imdbHomePage2.clickButtonText(top250MoviesBtnText);
    }

    @Then("I should see {string} page is loaded successfully")
    public void iShouldSee(String title) throws Throwable {
        imdbHomePage2.assertPageTitle(title);
        System.out.println(title);
        System.out.println("Approved");

    }

    @And("click Award & Events --> Oscars")
    public void clickAwardEventsOscars() throws Throwable{
        imdbHomePage2.clickButtonText("Oscars");
    }

    @And("select {string} as Event History")
    public void selectAsEventHistoryAsHonoraryAward(String str) throws Throwable{
        imdbHomePage2.clickObjectWithXpath(eventHistoryxPath);
    }

    @And("select {string} as Honorary Award")
    public void selectAsHonoraryAward(String arg0) throws Throwable {
        JavascriptExecutor js = (JavascriptExecutor) imdbHomePage2.driver;
        //js.executeScript("window.scrollBy(0,250)", "");
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        imdbHomePage2.clickButtonText("The Circus");
    }

    @Then("I should see and keep director, writer and stars information")
    public void iShouldSeeAndKeepDirectorWriterAndStarsInformation() throws Throwable{

    }
}



