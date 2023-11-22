import Pages.constantHelper;
import Pages.forgetPassword;
import org.testng.annotations.Test;

import static Pages.constantHelper.driver;

public class forgetPasswordTests {

    @Test
    public void withcorrectMail(){
        new constantHelper(driver).UserClickOnLogin();
        new forgetPassword(driver).enterEmail("amira.fci.1997@gmail.com").UserClickOnrequestPassword();

}
    @Test
    public void withwrongMail(){

    }
}
