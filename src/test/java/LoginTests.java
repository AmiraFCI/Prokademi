import Pages.LoginPage;
import Pages.constantHelper;
import Pages.loginFromRegisterationPage;
import Utilities.utiliy;


import com.github.javafaker.Faker;
import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import java.io.IOException;
import java.text.ParseException;

public class LoginTests extends testBase {

   //static String Username = utiliy.getExcelData(1, 0, "Sheet1");
    //static String Password = utiliy.getExcelData(1, 1, "Sheet1");
    static String Username ="amira.fci.1997@gmail.com";
    static String Password ="asd123";

    public LoginTests() throws IOException, ParseException {
    }

    //Login with valid mail and valid password
    @Test //(priority = 1, description = "Check login with valid username and password")
    public void loginWithValidEmailAndValidPassword_P() {
        new constantHelper(driver).UserClickOnLogin();
        new LoginPage(driver).enterEmail(Username).enterPassword(Password).clickLoginButton();

        Assert.assertTrue(new LoginPage(driver).AfterLogin(),"user can't log in ");
        ExtentTest test=extent.createTest("log in ","log in with valid credentials ");
        test.info("open browser 2- log in with valid credentials ");

        utiliy.Capturescreenshots(driver, "ValidLoginImage");
    }

    //Negative test cases
    @Test (priority = 2, description = "Check login with valid username and Invalid password")
    public void loginWithValidEmailAndInvalidPassword_N() {
        Password = "dsfsd";
        new constantHelper(driver).UserClickOnLogin();
        new LoginPage(driver).enterEmail(Username).enterPassword(Password).clickLoginButton();
        Assert.assertTrue(new LoginPage(driver).checkErrorMailorpasswordMessage());
        utiliy.Capturescreenshots(driver, "InvalidPasswordImage");
    }

    @Test(priority = 3, description = "Check login with invalid username and valid password")
    public void loginWithInvalidEmailAndValidPassword_N() {
        Username = "djdd@asd.com";
        //Login with invalid mail and invalid password
        new constantHelper(driver).UserClickOnLogin();
        new LoginPage(driver).enterEmail(Username).enterPassword(Password).clickLoginButton();
        Assert.assertTrue(new LoginPage(driver).checkErrorMailorpasswordMessage());

        ExtentTest test = extent.createTest("log in ", "log in with invalid email ");
        test.info("open browser 2- log in with invalid email");
    }

    @Test (priority = 4, description = "Check login with invalid username and invalid password")
    public void loginWithInvalidEmailAndInvalidPassword_N() {
        Username = "djdd@asd.com";
        Password = "dsfsd";
        new constantHelper(driver).UserClickOnLogin();
        new LoginPage(driver).enterEmail(Username).enterPassword(Password).clickLoginButton();
        Assert.assertTrue(new LoginPage(driver).checkErrorMailorpasswordMessage());

        ExtentTest test=extent.createTest("log in ","log in with invalid email &invalid password ");
        test.info("open browser 2- log in with invalid email invalid password");
}




    }