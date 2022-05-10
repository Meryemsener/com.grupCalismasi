package day01_Tekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriveMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resourcus/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://facebook.com");
        System.out.println(driver.getTitle());//basligi
        System.out.println(driver.getCurrentUrl());//mevcut url yi getir
        driver.close();
    }
}
