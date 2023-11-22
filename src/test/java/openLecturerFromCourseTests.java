import Pages.constantHelper;
import Pages.openLecturerProfilefromCourse;
import org.testng.Assert;
import org.testng.annotations.Test;

public class openLecturerFromCourseTests extends testBase{


    @Test
    public void openlecturerPageAndCheckifcoursesexist()
    {
        new constantHelper(driver).openCousesTab().UserClickOncategory();
        new openLecturerProfilefromCourse(driver).openlecturerLink();
        Assert.assertTrue(new openLecturerProfilefromCourse(driver).checkFterOpeninglecturerPageCoursesExist(),"courses isn't exist at lecturer ");
    }


}
