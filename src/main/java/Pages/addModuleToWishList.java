package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class addModuleToWishList {
    private final By wishListBtn= By.linkText("Save on your wishlist");


    private final By ifModuleExistAtWishList=By.xpath("//span[contains(text(),'amira english')]");
    private final WebDriver driver;
    public addModuleToWishList(WebDriver driver)
    {
        this.driver=driver;
    }
    public addModuleToWishList addWishListBtn()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        while (true) {

            jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight);");

            try {
                // Check if the element is present
                WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(wishListBtn));
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
    public boolean checkModuleexistAtWishlist() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(this.ifModuleExistAtWishList));

            return element.isEnabled();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
}
