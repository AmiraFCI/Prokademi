package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.swing.*;

public class navigationOfmoduleSection {

    WebDriver driver;
    JavascriptExecutor Scroll=(JavascriptExecutor) driver;
    private final By navArrowfforward = By.xpath("//body/app-root[1]/nb-layout[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nb-layout-column[1]/app-main[1]/app-home[1]/div[2]/owl-carousel[1]/owl-carousel-child[1]/div[2]/button[2]/div[1]");
    private final By navArrowback = By.xpath("//body/app-root[1]/nb-layout[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nb-layout-column[1]/app-main[1]/app-home[1]/div[2]/owl-carousel[1]/owl-carousel-child[1]/div[2]/button[1]/div[1]");
WebElement scrolltoforward=driver.findElement(this.navArrowfforward);
    WebElement scrolltoback=driver.findElement(this.navArrowback);
    public navigationOfmoduleSection(WebDriver driver) {
        this.driver = driver;
        this.Scroll = (JavascriptExecutor) driver;
    }

    public void clickNavigationArrowforward() {

        Scroll.executeScript("arguments[0].scrollIntoView();", scrolltoforward);
        Scroll.executeScript("arguments[0].click();",scrolltoforward);
    }

    public void clickNavigationArrowback() {
        JavascriptExecutor Scroll=(JavascriptExecutor) driver;
        Scroll.executeScript("arguments[0].scrollIntoView();", scrolltoback);
        Scroll.executeScript("arguments[0].click();",scrolltoback);

    }

    public boolean isNavigationforwardArrowEnabled() {

        try {
            WebElement navArrow = driver.findElement(this.navArrowfforward);
            return navArrow.isEnabled();

        } catch (org.openqa.selenium.NoSuchElementException e) {
            // If the arrow element is not found, assume it's disabled
            return false;
        }
    }

    public boolean isNavigationbackArrowEnabled() {

        try {
            WebElement navArrow = driver.findElement(this.navArrowback);
            return navArrow.isEnabled();

        } catch (org.openqa.selenium.NoSuchElementException e) {
            // If the arrow element is not found, assume it's disabled
            return false;
        }
    }



}

