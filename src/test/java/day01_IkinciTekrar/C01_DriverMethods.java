package day01_IkinciTekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_DriverMethods {
    public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver", "src/resourcus/drivers/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();//browseri tam sayfa yapar
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    driver.get("https://loreal.com");
        System.out.println(driver.getTitle());//basligi getirir
        System.out.println(driver.getCurrentUrl());//url adresini getirir

        driver.close();//sayfayi kapatir

    }
}
