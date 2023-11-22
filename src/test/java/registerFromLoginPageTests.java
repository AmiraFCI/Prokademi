import Pages.RegisterationPage;
import Pages.constantHelper;
import Pages.registerFromLoginPage;
import Utilities.utiliy;

import com.aventstack.extentreports.ExtentTest;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class registerFromLoginPageTests extends testBase{


    static Faker faker = new Faker();

    static final String fullNAME = faker.name().fullName();
    static String EMAIL = faker.internet().emailAddress();
    static String PASSWORD = faker.internet().password();
    private static final String ConPass = PASSWORD;
    @Test
    public void RegisterTest_P() {

        new constantHelper(driver).UserClickOnLogin();
        new registerFromLoginPage(driver).clickonregisterlink().enterfullName(fullNAME)
                .enterEmail(EMAIL).enterPassword(PASSWORD).enterConfPassword(PASSWORD).acceptionOfterms().clickregisterationafterfilldataButton();

        String expectedHomePageTitle = "Prokademi";
        String actualHomePageTitle = driver.getTitle();
        System.out.println(actualHomePageTitle);
        Assert.assertEquals(actualHomePageTitle,expectedHomePageTitle,"Registration did not forward to the home page.");
        ExtentTest test=extent.createTest("Registeration  ","Registeration with valid data  ");
        test.info("open browser 2- Register  with valid data");

    }

    @Test(priority = 2)
    public void RegisterTest_withDuplicatedData_N() {
        new constantHelper(driver).UserClickOnLogin();
       new registerFromLoginPage(driver).clickonregisterlink().enterfullName(fullNAME)
                .enterEmail("amira.fci.1997@gmail.com").enterPassword(PASSWORD).enterConfPassword(PASSWORD).acceptionOfterms().clickregisterationafterfilldataButton();
      System.out.println(new RegisterationPage(driver).ErrorMessage());
        Assert.assertFalse(new RegisterationPage(driver).ErrorMessage());


    }


}
