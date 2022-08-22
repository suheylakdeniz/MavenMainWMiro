package testautomation.interfaces;

public interface IIMDBSearch2 {
    void navigatedToThePage(String url) throws Throwable;
    void clickButtonId(String btnId) throws  Throwable;
    void clickButtonText(String btnText) throws  Throwable;
    void clickButtonXpath(String btnXpath) throws Throwable;
    void assertPageTitle(String title) throws Throwable;
    void clickButtonCssSelector(String btnCss) throws  Throwable;
    void clickObjectWithXpath(String xpath) throws Throwable;
    void sendKeys(String id) throws Throwable;

}
