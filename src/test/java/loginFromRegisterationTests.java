import Pages.LoginPage;
import Pages.constantHelper;
import Pages.loginFromRegisterationPage;
import Utilities.utiliy;

import com.aventstack.extentreports.ExtentTest;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class loginFromRegisterationTests extends testBase{
    static String Username ="amira.fci.1997@gmail.com";
    static String Password ="asd123";


   @Test
    public void loginWithValidEmailAndValidPassword_P()
    {
    new loginFromRegisterationPage(driver).clickonregisterBtn().UserClickOnLoginfromReg().
    enterEmail("amira.fci.1997@gmail.com").
    enterPassword("asd123").clickLoginButton();

        String expectedHomePageTitle = "Prokademi";
        String actualHomePageTitle = driver.getTitle();
        System.out.println(actualHomePageTitle);
        Assert.assertEquals(actualHomePageTitle,expectedHomePageTitle,"log in  did not forward to the home page.");
        ExtentTest test=extent.createTest("log in ","log in with valid credentials ");
        test.info("open browser 2- log in with valid credentials ");
        utiliy.Capturescreenshots(driver, "ValidLoginImage");


}

    @Test  (priority = 2, description = "Check login with valid username and Invalid password")
    public void loginWithValidEmailAndInvalidPassword_N() {
        Password = "dsfsd";

        new loginFromRegisterationPage(driver).clickonregisterBtn().UserClickOnLoginfromReg().
enterEmail("amira.fci.1997@gmail.com").enterPassword(Password).clickLoginButton();
        Assert.assertTrue(new loginFromRegisterationPage(driver).checkErrorMailorpasswordMessage());

        ExtentTest test=extent.createTest("log in ","log in with invalid password ");
        test.info("open browser 2- log in with invalid password");


        utiliy.Capturescreenshots(driver, "InvalidPasswordImage");
    }

    @Test(priority = 3, description = "Check login with invalid username and valid password")
    public void loginWithInvalidEmailAndValidPassword_N() {

        Username = "dj@d.com";
        //Login with invalid mail and invalid password
        new loginFromRegisterationPage(driver).clickonregisterBtn().UserClickOnLoginfromReg().enterEmail(Username).enterPassword(Password).clickLoginButton();
        Assert.assertTrue(new loginFromRegisterationPage(driver).checkErrorMailorpasswordMessage());
    }

    @Test (priority = 4, description = "Check login with invalid username and invalid password")
    public void loginWithInvalidEmailAndInvalidPassword_N() {
        Username = "djd@d.com";
        Password = "dsfsd";

        new loginFromRegisterationPage(driver).clickonregisterBtn().UserClickOnLoginfromReg().enterEmail(Username).enterPassword(Password).clickLoginButton();
        Assert.assertTrue(new loginFromRegisterationPage(driver).checkErrorMailorpasswordMessage());




    }}
