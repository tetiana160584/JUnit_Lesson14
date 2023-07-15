package configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {
    static WebDriver createDriver(WEBDRIVERS webdrivers){

        WebDriver driver = null;
        String chromedriverPath="C:\\Users\\Asus\\Drivers\\chromedriver.exe";

        switch (webdrivers){
            case CHROMECLEAN:
            System.setProperty("webdriver.chrome.driver", chromedriverPath);
            driver = createCleanChrome();
            break;
            case EDGEDRIVER:
                driver = createEdge();
                break;
        }
        return driver;
    }


    private static WebDriver createEdge() {

        return new EdgeDriver();
    }


    private static WebDriver createCleanChrome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        return new ChromeDriver(options);
    }

}
