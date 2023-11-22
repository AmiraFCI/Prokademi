import Pages.RegisterationPage;
import Pages.constantHelper;
import Utilities.utiliy;

import com.aventstack.extentreports.ExtentTest;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class registerationTests extends testBase{

private RegisterationPage registeration ;
    static Faker faker = new Faker();

    static final String fullNAME = faker.name().fullName();
    static String EMAIL = faker.internet().emailAddress();
    static String PASSWORD = faker.internet().password();
    private static final String ConPass = PASSWORD;
    @Test
    public void RegisterTest_P() {

        new constantHelper(driver).UserClickOnRegister();
        new RegisterationPage(driver).enterfullName(fullNAME)
        .enterEmail(EMAIL).enterPassword(PASSWORD).enterConfPassword(PASSWORD).acceptionOfterms().clickregisterationafterfilldataButton();
        String expectedHomePageTitle = "Prokademi";
        String actualHomePageTitle = driver.getTitle();
        System.out.println(actualHomePageTitle);
Assert.assertEquals(actualHomePageTitle,expectedHomePageTitle,"Registration did not forward to the home page.");

        ExtentTest test=extent.createTest("Registeration  ","Registeration with valid data  ");
        test.info("open browser 2- Register  with valid data");

        utiliy.Capturescreenshots(driver, "register");

    }

    @Test(priority = 2)
    public void RegisterTest_withDuplicatedData_N() {
        new constantHelper(driver).UserClickOnRegister();
        new RegisterationPage(driver).enterfullName(fullNAME)
                .enterEmail("amira.fci.1997@gmail.com").enterPassword(PASSWORD).enterConfPassword(PASSWORD).acceptionOfterms().clickregisterationafterfilldataButton();
        Assert.assertFalse(new RegisterationPage(driver).ErrorMessage());
        ExtentTest test=extent.createTest("Registeration  ","Registeration with repeated mail   ");
        test.info("open browser 2- Register  with repeated mail");
         utiliy.Capturescreenshots(driver, "duplicated_register");


    }

}
