package testautomation.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testautomation.interfaces.IIMDBSearch;
import testautomation.utils.Driver;

import java.awt.*;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class IMDBHomePageObject extends Driver implements IIMDBSearch {
    //Elements

    String allBtnId = "iconContext-arrow-drop-down";
    String searchBoxId = "suggestion-search";
    String searchBtnId = "iconContext-magnify";
    String top250PageTitle = "IMDb Top 250 Movies";


    public IMDBHomePageObject() {

    }

    @Override
    public void navigatedToThePage(String url) throws Throwable {
        driver.get(url);
    }

    @Override
    public void sendKeys(String id) throws Throwable {

    }

    @Override
    public void clickButtonId(String btnId) throws Throwable {
        new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable(By.id(btnId))).click();
    }

    @Override
    public void clickObjectWithXpath(String xpath) throws Throwable {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath(xpath))).click();
    }

    @Override
    public void clickButtonText(String text) throws Throwable {
       // WebDriverWait(driver, 20).until(EC.element_to_be_clickable((By.XPATH, "//button[text()='button_text']"))).click()
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.linkText(text))).click();
    }

    @Override
    public void clickButtonXpath(String btnXpath) throws Throwable {
        driver.findElement(By.xpath(btnXpath)).click();
    }

    @Override
    public void clickButtonCssSelector(String btnCss) throws Throwable {
        driver.findElement(By.cssSelector(btnCss)).click();
    }

    @Override
    public void assertPageTitle(String title) throws Throwable {
        Assert.assertEquals(top250PageTitle,title);
    }
    /*
    protected List<String> getDates() {

        List<WebElement> DateElements = driver.findElements(By.xpath("//div[@class='dates']"));
        List<String> DateList = new ArrayList<String>();

        for (WebElement element : DateElements ) {
            String dateParsed[] = element.getText().split(",");
            if(dateParsed.length == 3){
                DateList.add(dateParsed[2].trim());
            }
        }

        return DateList;
    }
    */

}




