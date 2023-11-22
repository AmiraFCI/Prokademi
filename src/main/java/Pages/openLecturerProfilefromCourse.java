package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class openLecturerProfilefromCourse {
    private final By lecturerLink= By.xpath("//a[@href='lecturer/27']");
    private final By anycourse= By.xpath("//a[contains(text(),'amira english')]");
private WebDriver driver;
    private    JavascriptExecutor javascriptExecutor;


    public  openLecturerProfilefromCourse(WebDriver driver)
    {
      this.driver=driver;
    }

public openLecturerProfilefromCourse openlecturerLink()
{
    driver.findElement(this.lecturerLink).click();
    return this;

}
public boolean checkFterOpeninglecturerPageCoursesExist()
{
    try {
        WebElement element = driver.findElement(anycourse);
        return element.isEnabled();
    } catch (org.openqa.selenium.NoSuchElementException e) {
        return false;
    }
}




}


