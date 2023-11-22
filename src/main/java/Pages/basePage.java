package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class basePage {
WebDriver driver;
    public void acceptPopUp()
    {
        driver.switchTo().alert().accept();

    }
    public void setAlertText(String text)
    {
        driver.switchTo().alert().sendKeys(text);
    }
    public void waitForElement(By locator)
    {
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
public void hoverOverElement(By locator)
{
    WebElement element=driver.findElement(locator);
    JavascriptExecutor excuter=(JavascriptExecutor) driver;
    excuter.executeScript("arguments[0].scrollIntoView()",element);
}
}
