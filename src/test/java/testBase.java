
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;


public class testBase {
    static Properties prop;
    static FileInputStream readProperty;
    //   private static String PROJECT_NAME = null;
//private static String PROJECT_URL ;
    protected WebDriver driver;

    public ExtentReports extent;
    private ExtentTest test;




    /*@BeforeTest()
    @Parameters("browser")
    public void setupChromeDriver(String browser) throws InterruptedException {

        driver = driverFactory.getNewInstance(browser);
        setDriver(driver);
        driver.manage().window().maximize();

        driver.get(PROJECT_URL);
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
*/


    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();
        driver.get("http://207.127.97.148:9004/en/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();


        //List<WebElement> links=d.findElements(By.tagName("a"));
        // System.out.println(links.size());


    }

    @BeforeTest
    public void report() {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("Test-report.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        htmlReporter.config().setDocumentTitle("Prokademi Reports");
        htmlReporter.config().setReportName("Automation Report for tests");
    }



 /*private void setProjectDetails() throws IOException {

        readProperty = new FileInputStream(
                System.getProperty("user.dir") + "/src/test/resources/properties/environment.properties");
        prop = new Properties();
        prop.load(readProperty);

        // define project name from properties file
        PROJECT_NAME = prop.getProperty("projectName");
        PROJECT_URL = prop.getProperty("url");
    }
*/


    @AfterTest
    public void afterTest() {
        // Flush the extent reports to generate the final report
        extent.flush();
    }

}