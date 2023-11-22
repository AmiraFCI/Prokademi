package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class addModuleToCart {

    private final WebDriver driver;
    private final By addToCartBtn= By.xpath("");
    public addModuleToCart(WebDriver driver)
    {
        this.driver=driver;

    }

    public addModuleToCart addToCartBtn()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        while (true) {

            jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight);");

            try {
                // Check if the element is present
                WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(addToCartBtn));
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
