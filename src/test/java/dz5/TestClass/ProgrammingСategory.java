package dz5.TestClass;

import dz5.Driver.BaseClass;
import dz5.Pages.Category;
import io.cucumber.java.en.Then;


import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class ProgrammingСategory  extends BaseClass {


    private Category category = new Category();

    @Then("I should see {int} courses in list of section")
    public void checkCountOfCourseOfSection(int count) {
        assertEquals(count, category.getCountOfCourseList());
    }
    @Then("I should see {int} courses in title of section")
    public void checkCountOfCourseOfLabel(int count) {
        Integer count1=(Integer)count;
        assertTrue(category.getCountOfCourse().contains(count1.toString()));
    }
}
