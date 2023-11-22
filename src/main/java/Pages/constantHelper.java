package Pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class constantHelper {


         public static WebDriver driver;

    public constantHelper(WebDriver driver) {
        this.driver = driver;

    }


    private final By registerationButton = By.xpath("//a[contains(text(),'Register')]");

    private final By ClickOnLogin = By.xpath("//a[contains(text(),'Log in')]");
    private final By ClickOnforgetPassword = By.xpath("//a[contains(text(),'Forgot Password?')]");

    private final By cousesTab = By.xpath("//a[contains(text(),'Courses')]");
    private final By bookTab= By.xpath("//a[contains(text(),'Books')]");
    private final By recommendedBook=By.xpath("//span[contains(text(),'Recommended')]");
    private final By newBook=By.xpath("//span[@class='ng-star-inserted']");
    private final By newBookdetails=By.xpath("//h3[text()='amira e']");
    private final By recommendedBookdetails=By.xpath("//h3[text()='amira 2']");
    private final By category = By.xpath("//span[contains(text(),'amira english')]");

    private final By course = By.xpath("//a[contains(text(),'amira english')]");
    private final By moduleTab=By.xpath("//a[contains(text(),'Moduls')]");
    private final By moduleCategory=By.xpath("//span[contains(text(),'amira english')]");
    private final By redirectionTologinfromwishlistbtn=By.cssSelector("p.sub-title");
    private final By openProfile=By.xpath("//a[contains(text(),'Amira Mahmoud')]");
    private final By WishListTabAtProfile=By.xpath("//span[contains(text(),'Wish List')]");
    private final By openCart =By.cssSelector("svg[data-prefix='fas'][data-icon='cart-shopping']");
    private final By loginTitleWhenOppeningCartAsguest=By.className("title");
    private final By buyButton=By.linkText("Buy now");
    private final By addToWoshListBtn=By.linkText("Save on your wishlist");
    public constantHelper UserClickOnRegister() {
        driver.findElement(this.registerationButton).click();
        return this;
    }
    public constantHelper clickOnBUyBtn( ){
        driver.findElement(this.buyButton).click();
        return this;
    }
    public constantHelper clickOnaddToWishListBtn( ){
        driver.findElement(this.addToWoshListBtn).click();
        return this;
    }
    public constantHelper UserClickOnLogin() {
        driver.findElement(this.ClickOnLogin).click();
        return this;
    }
    public constantHelper UserClickOnChangePassword() {
        driver.findElement(this.ClickOnforgetPassword).click();
        return this;
    }

    public constantHelper openCart() {
        driver.findElement(this.openCart).click();

        return this;
    }


    public constantHelper openCousesTab() {

        driver.findElement(this.cousesTab).click();
        return this;
    }
    public constantHelper openModuleTab() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(16));
        WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(this.moduleTab));
        we.click();
        return this;

    }
    public constantHelper  openBooksTab()
    {
        driver.findElement(this.bookTab).click();
        return this;
    }
    public constantHelper UserClickOnModulecategory()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(16));
        WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(this.moduleCategory));
        we.click();
        return this;


    }
    public boolean forwardToLogin()
    {
        try {
            return driver.findElement(this.loginTitleWhenOppeningCartAsguest).isEnabled();
        }
        catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public constantHelper UserClickOncategory()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        while (true) {

            jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight);");

            try {
                // Check if the element is present
                WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(category));
                // If the element is found, break out of the loop
                if (element.isDisplayed()) {
                    element.click();
                    break;
                }
            } catch (org.openqa.selenium.TimeoutException e) {

            }


        }

        return this;
    }
    public constantHelper openProfile()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(this.openProfile));

        we.click();

        return this;

    }
    public constantHelper openWishListTabFromProfilePage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        while (true) {

            jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight);");

            try {
                // Check if the element is present
                WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(WishListTabAtProfile));
                // If the element is found, break out of the loop
                if (element.isDisplayed()) {
                    element.click();
                    break;
                }
            } catch (org.openqa.selenium.TimeoutException e) {

            }

        }
        return this;
    }
    public constantHelper UserSelectCourse() {
        driver.findElement(this.course).click();
        return this;

    }
    public boolean isforwardtologin() {
        try {
            WebElement element = driver.findElement(redirectionTologinfromwishlistbtn);
            return element.isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
    public constantHelper  clickRecommendedBookTab()
    {
        driver.findElement(this.recommendedBook).click();
        return this;
    }
    public constantHelper clickNewBookTab()
    {
        driver.findElement(this.newBook).click();
        return this;
    }
    public  constantHelper openNewDetailsBook(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        while (true) {

            jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight);");

            try {
                // Check if the element is present
                WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(newBookdetails));
                // If the element is found, break out of the loop
                if (element.isDisplayed()) {
                    element.click();
                    break;
                }
            } catch (org.openqa.selenium.TimeoutException e) {

            }

        }

        return this;
    }
    public  constantHelper openrecommendedBookDetailsBook(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        while (true) {

            jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight);");

            try {
                // Check if the element is present
                WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(recommendedBookdetails));
                // If the element is found, break out of the loop
                if (element.isDisplayed()) {
                    element.click();
                    break;
                }
            } catch (org.openqa.selenium.TimeoutException e) {

            }

        }

        return this;
    }


    public boolean checkLanguageIsEn(String message)
  {
      String englishPattern = "^[a-zA-Z\\s.,!?]*$";

      return message.matches(englishPattern);
  }

}


