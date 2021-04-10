package dz5.TestClass;

import dz5.Driver.BaseClass;
import dz5.Pages.Category;
import io.cucumber.java.en.Then;

import static junit.framework.TestCase.assertEquals;

public class EventsCategory extends BaseClass{

    private Category category = new Category();

    @Then("I should see page calendar of courses with title {string}")
    public void iShouldSeePageCalendarOfCourse(String title) {
        title=title.replace("\\n","\n");
            assertEquals(title, category.getTitleOfEventTab1());
    }
    @Then("I should see page calendar of event with title {string}")
    public void iShouldSeePageCalendarOfEvent(String title) {
        assertEquals(title, category.getTitleOfEvenTab2());
    }
}
