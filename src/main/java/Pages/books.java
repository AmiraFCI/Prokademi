package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class books {
    private final WebDriver driver;
    private final By bookTab= By.xpath("//a[contains(text(),'Books')]");
    private final By recommendedBook=By.xpath("//span[contains(text(),'Recommended')]");
    private final By newBook=By.xpath("//span[@class='ng-star-inserted']");
    private final By newBookdetails=By.xpath("//h3[text()='amira e']");
    private final By allBookdetails=By.xpath("//h3[text()='amira e']");
    private final By recommendedBookdetails=By.xpath("//h3[text()='amira e']");
    private final By cartMark=By.xpath("//img[@src='assets/images/shporta_grey.svg']");
    private final By wishListMark=By.xpath("//img[@src='assets/images/lista_e_deshirave_grey.svg']");
    private final By giftMark=By.xpath("");
    public books(WebDriver driver)
    {
        this.driver=driver;
    }
    public books  openBooksTab()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement we=wait.until(ExpectedConditions.presenceOfElementLocated(this.bookTab));
        we.click();
        return this;
    }
    public books  clickRecommendedBookTab ()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement we=wait.until(ExpectedConditions.presenceOfElementLocated(this.recommendedBook));
        we.click();
        return this;
    }
    public books clickNewBookTab()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement we=wait.until(ExpectedConditions.presenceOfElementLocated(this.newBook));
        we.click();
        return this;
    }
    public  books openNewDetailsBook(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(17));

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        while (true) {

            jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight/4);");

            try {
                // Check if the element is present
                WebElement element = wait.until(ExpectedConditions.elementToBeClickable(newBookdetails));
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
    public  books openrecommendedBookDetailsBook(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(17));

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        while (true) {

            jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight/4);");

            try {
                // Check if the element is present
                WebElement element = wait.until(ExpectedConditions.elementToBeClickable(recommendedBookdetails));
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
    public  books openAllBookDetailsBook(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(17));

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        while (true) {

            jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight/4);");

            try {
                // Check if the element is present
                WebElement element = wait.until(ExpectedConditions.elementToBeClickable(allBookdetails));
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
    public  books clickOnCartMarkBook(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(17));

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        while (true) {

            jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight/4);");

            try {
                // Check if the element is present
                WebElement element = wait.until(ExpectedConditions.elementToBeClickable(cartMark));
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
    public  books clickOnWishListMarkBook(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(17));

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        while (true) {

            jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight/4);");

            try {
                // Check if the element is present
                WebElement element = wait.until(ExpectedConditions.elementToBeClickable(wishListMark));
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

}
