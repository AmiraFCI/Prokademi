import Pages.constantHelper;
import Pages.navigationOfmoduleSection;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.text.ParseException;

public class navigationofmosuleSectionTests extends testBase{
private  WebDriver driver;
    @Test(dependsOnMethods = "loginWithValidEmailAndValidPassword_P")
    public void performForwardNavigation () {

        navigationOfmoduleSection navigationOfmoduleSection=new navigationOfmoduleSection(driver);
        while (navigationOfmoduleSection.isNavigationforwardArrowEnabled()){

            navigationOfmoduleSection.clickNavigationArrowforward();
        }
        Assert.assertTrue(navigationOfmoduleSection.isNavigationforwardArrowEnabled(),"nav was not successfull");

    }
    @Test
    public void performBackNavigation (){

        navigationOfmoduleSection navigationOfmoduleSection=new navigationOfmoduleSection(driver);
        while (navigationOfmoduleSection.isNavigationbackArrowEnabled()){

            navigationOfmoduleSection.clickNavigationArrowback();
        }
        Assert.assertTrue(navigationOfmoduleSection.isNavigationbackArrowEnabled(),"nav was not successfull");

    }
}
