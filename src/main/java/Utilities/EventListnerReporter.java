package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import static Utilities.utiliy.Capturescreenshots;

public class EventListnerReporter implements ITestListener {
    private ExtentReports extent;
    private ExtentTest test;


    public EventListnerReporter()
    {
        extent = new ExtentReports();
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("Test-report.html");
        extent.attachReporter(htmlReporter);
    }
    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS, "Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.log(Status.FAIL, "Test Failed: " );


    }
    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }
    public void afterTest(ITestContext context) {

    }

}
