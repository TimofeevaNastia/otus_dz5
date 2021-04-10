package dz5.TestClass;

import dz5.Driver.BaseClass;
import dz5.Pages.Category;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class TeacherСategory extends BaseClass {

    private Category category = new Category();

    @Then("I should see page became of teacher with title {string}")
    public void iShouldSeePageCalendarOfCourse(String title) {
        assertEquals(title, category.getTitleBecameTeacher());
    }

    @And("Must be button with name {string}")
    public void iShouldSeePageCalendarOfEvent(String buttonName) {
        assertEquals(buttonName, category.getBtnBecameTeacher());
        }
    @Then("I should see block")
    public void iShouldSeePageCalendarOfCourse(DataTable table1) {
        List<List<String>> table = table1.cells();
        for (int i=0;i<table.size();i++) {
            System.out.println(table.get(i).get(0) + " ");
            assertEquals(table.get(i).get(0), category.getNameTabKnowledgeBase(i));
        }
    }
}
