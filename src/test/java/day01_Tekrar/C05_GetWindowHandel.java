package day01_Tekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_GetWindowHandel {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resourcus/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        System.out.println(driver.getWindowHandle());


    }
}
