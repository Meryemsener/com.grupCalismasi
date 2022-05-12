package day01_IkinciTekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_ManageMEthods {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "src/resourcus/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//browseri tam sayfa yapar
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//max 15 saniye bekler ama daha kisa da surer
        Thread.sleep(15000);//bu java dan gelir. 15 saniye bekler. Daha kisa surmez

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //


    }
}
