package hillelTest;

import configuration.BaseClass;
import configuration.WEBDRIVERS;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class TeacherNames extends BaseClass {
    By coursesMenu = By.xpath("//*[@id=\"body\"]/div[1]/div[1]/div[2]/div/div/nav/ul/li[2]/button");
    By courseProgramming = By.xpath("//*[@id=\"coursesMenuControlPanel\"]/ul/li[2]/button");
    By courseFrontEndBasic = By.xpath("//*[@id=\"block-202987\"]/div/ul/li[1]/a/div/p");
    By listBlock = By.xpath("//*[@id=\"coachesSection\"]/div/div/ul");

    @BeforeClass
    public static void startSite() {
        driver.get("https://ithillel.ua/");
    }


    @Test
    public void openListCourses() {
        WebElement dropdownCourses = driver.findElement(coursesMenu);
        dropdownCourses.click();
    }

    @Test
    public void selectionProgramming() {
        WebElement course = driver.findElement(courseProgramming);
        course.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(courseFrontEndBasic));

    }

    @Test
    public void selectionFrontEndBasic() {
        WebElement frontEnd = driver.findElement(courseFrontEndBasic);
        frontEnd.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(listBlock));



    List<WebElement> teacherElements = driver.findElements(By.className("coach-photo_img"));
    for (WebElement teacherElement : teacherElements) {
    String teacherName = teacherElement.getAttribute("alt");
    System.out.println(teacherName);

}
        }

    }



