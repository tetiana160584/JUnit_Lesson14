package configuration;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseClass {
    public static WebDriver driver;

    @BeforeClass
    public static void create(){
        driver= DriverFactory.createDriver(WEBDRIVERS.CHROMECLEAN);
    }
    @AfterClass
    public static void end() throws InterruptedException{
        Thread.sleep(3000);
        driver.quit();
    }


    }

