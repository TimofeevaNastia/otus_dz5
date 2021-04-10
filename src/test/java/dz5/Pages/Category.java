package dz5.Pages;

import dz5.Driver.BaseClass;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

public class Category extends BaseClass {
    private By byListCourses=By.cssSelector(".lessons>a");
    private By byLabelCountCourses=By.cssSelector(".title-new__info-item");
    private By becameTeacherTitle=By.cssSelector(".Header__Title-sc-1lka48j-2.etFYHE");
    private By byBtnBecameTeacher=By.cssSelector(".Header__ButtonContainer-sc-1lka48j-5 button[class='styles__OldContainer-lfz3vn-0 fZgqAz']");
    private By byListTabBaseKnowledge=By.cssSelector("[class='nav nav_blue nav_mobile-fix'] a");
    private By byEventTitle1=By.cssSelector(".styles__Title-sc-1rp3iyu-8.hbMoDZ");
    private By byEventTitle2=By.cssSelector(".dod_new-header__title");

    //подсчет количества курсов в разделе
    public int getCountOfCourseList(){
        return driver.findElements(byListCourses).size();
    }
    //получение количества курсов в разделе из заголовка
    public String getCountOfCourse(){
        return getText(byLabelCountCourses);
    }
    //получение заголовка в разделе Преподавателям/Стать преподавателем
    public String getTitleBecameTeacher(){
        return driver.findElement(becameTeacherTitle).getText();
    }
    //получение названия кнопки в разделе Преподавателям/Стать преподавателем
    public String getBtnBecameTeacher(){
        return driver.findElement(byBtnBecameTeacher).getText();
    }
    //получение названия вкладки в разделе Преподавателям/База знаний по номеру
    public String getNameTabKnowledgeBase(int number){
        return driver.findElements(byListTabBaseKnowledge).get(number).getText();
    }
    //получение заголовка подвкладки 1 вкладки События
    public String getTitleOfEventTab1(){
        return driver.findElement(byEventTitle1).getText();
    }
    //получение заголовка подвкладки 2 вкладки События
    public String getTitleOfEvenTab2(){
        return driver.findElement(byEventTitle2).getText();
    }
}
